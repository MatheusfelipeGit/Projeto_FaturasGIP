
package DAO;

import DTO.BandeirasGipDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

//import necessario para a realização de uma função/retorno especifico 

public class BandeirasGipDAO {
    Connection conn; //conection é conn
    PreparedStatement pstm; //prepared é pstm
    
    
    //aqui é a função de inserir dados no banco de dados, com a tabela e colunas definidas/ chamando tb a conexao
    public void cadastrarBandeira(BandeirasGipDTO objbandeirasgipdto) {
        String sql = "insert into bandeiras (CorBandeiras_bandeiras, Valor_bandeiras, MesReferente_bandeiras, Ano_bandeiras) values (?,?,?,?)";
        conn = new ConexaoGipDAO().conectaBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
    
            pstm.setString(1, objbandeirasgipdto.getCorBandeiras_bandeiras());          
            pstm.setString(2, objbandeirasgipdto.getValor_bandeiras());          
            pstm.setString(3, objbandeirasgipdto.getMesReferente_bandeiras());          
            pstm.setString(4, objbandeirasgipdto.getAno_bandeiras());    
            
            pstm.execute();
            pstm.close();
            
            JOptionPane.showMessageDialog(null, "CADASTRO DE BANDEIRA REALIZADO COM SUCESSO!!");
            
        }catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "CONFIRA SE TODOS OS CAMPOS ESTÃO CORRETAMENTE PREENCHIDOS!");
            JOptionPane.showMessageDialog(null, "BandeirasGipDAO" + erro);
            
        }
            
 }
}   
/*
CÓDIGO PENSADO POR: JEFF 
E DESENVOLVIDO POR: MATHEUS FELIPE lEITE JANUÁRIO
*/ 