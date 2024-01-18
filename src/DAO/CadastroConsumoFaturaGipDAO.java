
package DAO;

import DTO.CadastroConsumoFaturaGipDTO;
import com.mysql.cj.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
//import necessario para a realização de uma função/retorno especifico 

public class CadastroConsumoFaturaGipDAO {
    
    Connection conn;  //define conn Connection
    PreparedStatement pstm;   //define pstm como preparedstatement
    ResultSet rs; //define rs como ResultSet
  
    public void cadastrarConFatura(CadastroConsumoFaturaGipDTO objcadastroconsumofaturagipdto) {
        String sqlRepet = "SELECT * FROM cadastroConsumoFatura WHERE CodigoBarrasCon_cadastroConsumoFatura = ? AND MesReferente_cadastroConsumoFatura = ? AND Ano_cadastroConsumoFatura = ?";
        //select com codições
        String sqlVerificarCodigo = "SELECT Tipos_faturanova FROM faturanova WHERE CodBarrasRed_faturanova = ?";
        //select após as condições para confirmar se existe a fatura 
        
        try {
            conn = new ConexaoGipDAO().conectaBD(); //aqui faz a conexão com bd
            
            
            pstm = conn.prepareStatement(sqlRepet);
            pstm.setString(1, objcadastroconsumofaturagipdto.getCodigoBarrasCon_cadastroConsumoFatura());
            pstm.setString(2, objcadastroconsumofaturagipdto.getMesReferente_cadastroConsumoFatura());
            pstm.setString(3, objcadastroconsumofaturagipdto.getAno_cadastroConsumoFatura());
            rs = pstm.executeQuery();
            
            //ELE VERIFICA SE NÃO TEM UM CONSUMO IGUAL JÁ CADASTRADO
            if(rs.next()){
                
                JOptionPane.showMessageDialog(null, "FATURA REPETIDA!!!!");
                
            } else {
           
            // Verificar se o código reduzido do novo consumo está presente na outra tabela
            pstm = conn.prepareStatement(sqlVerificarCodigo);
            pstm.setString(1, objcadastroconsumofaturagipdto.getCodBarrasRed_cadastroConsumoFatura());
            rs = pstm.executeQuery();
            
            // Se o código reduzido do novo consumo foi encontrado, exibir o tipo em um JOptionPane
            if (rs.next()) {
                // Continue com o cadastro
                String sqlInserirDados = "INSERT INTO cadastroConsumoFatura (CodigoBarrasCon_cadastroConsumoFatura, Valor_cadastroConsumoFatura, Kw_cadastroConsumoFatura, MesVencimento_cadastroConsumoFatura, MesReferente_cadastroConsumoFatura, Ano_cadastroConsumoFatura, DataCadastro_cadastroConsumoFatura, CodBarrasRed_cadastroConsumoFatura) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                 String tipoFatura = rs.getString("Tipos_faturanova");
                
                pstm = conn.prepareStatement(sqlInserirDados);
                pstm.setString(1, objcadastroconsumofaturagipdto.getCodigoBarrasCon_cadastroConsumoFatura());
                pstm.setString(2, objcadastroconsumofaturagipdto.getValor_cadastroConsumoFatura()); 
                pstm.setString(3, objcadastroconsumofaturagipdto.getKw_cadastroConsumoFatura());
                pstm.setString(4, objcadastroconsumofaturagipdto.getMesVencimento_cadastroConsumoFatura());
                pstm.setString(5, objcadastroconsumofaturagipdto.getMesReferente_cadastroConsumoFatura());
                pstm.setString(6, objcadastroconsumofaturagipdto.getAno_cadastroConsumoFatura());
                pstm.setString(7, objcadastroconsumofaturagipdto.getDataCadastro_cadastroConsumoFatura());
                pstm.setString(8, objcadastroconsumofaturagipdto.getCodBarrasRed_cadastroConsumoFatura());
                
                pstm.execute();
                pstm.close();
                
                JOptionPane.showMessageDialog(null, "Cadastro Efetuado:             " + tipoFatura);
              
            } else {
                // Código reduzido não encontrado na outra tabela, mostrar mensagem de erro
                JOptionPane.showMessageDialog(null, "Código reduzido não encontrado na outra tabela. Cadastro não permitido.");
            }
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar fatura: " + erro.getMessage());
        } finally {
            // Fechar conexões e recursos
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar recursos: " + e.getMessage());
            }
        }
    }
    

    //esse código chama a procedure feita no banco de dados 
    public void chamarProcedure() throws SQLException {
        Connection conn = null;
        CallableStatement callableStatement = null;

        try {
            conn = new ConexaoGipDAO().conectaBD();
            // Assume que você tem uma classe de conexão separada
            
            // Chama a procedure usando CallableStatement
            String sqlProcedure = "{CALL AtualizarConsumoFatura}";
            callableStatement = (CallableStatement) conn.prepareCall(sqlProcedure);
            callableStatement.execute();
        } finally {
            // Fecha o CallableStatement e a conexão
            if (callableStatement != null) {
                callableStatement.close();
            }
            if (conn != null && !conn.isClosed()) {
                conn.close();
                //esse código é para fazer o calculo automático do kw 
            }
        }
    }
}

    // Restante do seu código...
//faz no meu código. Eu quero que ele verifique se tem repetida antes de verificar se existe uma fatura nova. Vou te mandar o codigo

        
        /*  
    String sqlInserirDados = "INSERT INTO cadastroConsumoFatura (CodigoBarrasCon_cadastroConsumoFatura, Valor_cadastroConsumoFatura, Kw_cadastroConsumoFatura, MesVencimento_cadastroConsumoFatura, MesReferente_cadastroConsumoFatura, Ano_cadastroConsumoFatura, DataCadastro_cadastroConsumoFatura, CodBarrasRed_cadastroConsumoFatura) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    
    try {
        conn = new ConexaoGipDAO().conectaBD();
        
        
        pstm = conn.prepareStatement(sqlInserirDados);
        pstm.setString(1, objcadastroconsumofaturagipdto.getCodigoBarrasCon_cadastroConsumoFatura());
        pstm.setString(2, objcadastroconsumofaturagipdto.getValor_cadastroConsumoFatura()); 
        pstm.setString(3, objcadastroconsumofaturagipdto.getKw_cadastroConsumoFatura());
        pstm.setString(4, objcadastroconsumofaturagipdto.getMesVencimento_cadastroConsumoFatura());
        pstm.setString(5, objcadastroconsumofaturagipdto.getMesReferente_cadastroConsumoFatura());
        pstm.setString(6, objcadastroconsumofaturagipdto.getAno_cadastroConsumoFatura());
        pstm.setString(7, objcadastroconsumofaturagipdto.getDataCadastro_cadastroConsumoFatura());
        pstm.setString(8, objcadastroconsumofaturagipdto.getCodBarrasRed_cadastroConsumoFatura());
        
        pstm.execute();
        pstm.close();
        
        // Verificar se o código reduzido do novo consumo está presente na outra tabela
            String sqlVerificarCodigo = "SELECT Tipos_faturanova FROM faturanova WHERE CodBarrasRed_faturanova = ?";
            pstm = conn.prepareStatement(sqlVerificarCodigo);
            pstm.setString(1, objcadastroconsumofaturagipdto.getCodBarrasRed_cadastroConsumoFatura());
            rs = pstm.executeQuery();
            
            
            if (!rs.next()) {
                throw new SQLException("Código reduzido não encontrado na outra tabela. Cadastro não permitido.");
            }
            // Se o código reduzido do novo consumo foi encontrado, exibir o tipo em um JOptionPane
            if (rs.next()) {
                String tipo = rs.getString("Tipos_faturanova");
                JOptionPane.showMessageDialog(null, "Tipo:  " + tipo);
            }
    } catch (SQLException erro){
        JOptionPane.showMessageDialog(null, "CONFIRA SE TODOS OS CAMPOS ESTÃO CORRETAMENTE PREENCHIDOS!");
        JOptionPane.showMessageDialog(null, "FaturasGipDAO" + erro);
    }

}*/
/*public void cadastrarConFatura(CadastroConsumoFaturaGipDTO objcadastroconsumofaturagipdto) {
        String sqlAtualizarConsumo = "insert into cadastroConsumoFatura (CodigoBarrasCon_cadastroConsumoFatura,Valor_cadastroConsumoFatura,Kw_cadastroConsumoFatura,MesVencimento_cadastroConsumoFatura, MesReferente_cadastroConsumoFatura, "
                + "Ano_cadastroConsumoFatura, DataCadastro_cadastroConsumoFatura, CodBarrasRed_cadastroConsumoFatura) values (?,?,?,?,?,?,?,?)"
                + "SELECT AtualizarConsumoFatura() AS Resultado";
                
            conn = new ConexaoGipDAO().conectaBD();
        
        try {
            
            pstm = conn.prepareStatement(sqlAtualizarConsumo);
    
            pstm.setString(1, objcadastroconsumofaturagipdto.getCodigoBarrasCon_cadastroConsumoFatura());          
            pstm.setString(2, objcadastroconsumofaturagipdto.getValor_cadastroConsumoFatura()); 
            pstm.setString(3, objcadastroconsumofaturagipdto.getKw_cadastroConsumoFatura()); 
            pstm.setString(4, objcadastroconsumofaturagipdto.getMesVencimento_cadastroConsumoFatura());  
            pstm.setString(5, objcadastroconsumofaturagipdto.getMesReferente_cadastroConsumoFatura());  
            pstm.setString(6, objcadastroconsumofaturagipdto.getAno_cadastroConsumoFatura()); 
            pstm.setString(7, objcadastroconsumofaturagipdto.getDataCadastro_cadastroConsumoFatura());     
            pstm.setString(8, objcadastroconsumofaturagipdto.getCodBarrasRed_cadastroConsumoFatura());
            
            pstm.execute();
            pstm.close();
            
            JOptionPane.showMessageDialog(null, "CADASTRO DE CONSUMO REALIZADO COM SUCESSO!!" );
            
        } 
        catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "CONFIRA SE TODOS OS CAMPOS ESTÃO CORRETAMENTE PREENCHIDOS!");
            JOptionPane.showMessageDialog(null, "FaturasGipDAO" + erro);
            
        }
    }*/
/*
CÓDIGO PENSADO POR: JEFF 
E DESENVOLVIDO POR: MATHEUS FELIPE lEITE JANUÁRIO
*/ 