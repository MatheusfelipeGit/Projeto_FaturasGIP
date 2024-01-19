
package DAO;


import DTO.RelatorioInformativoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class RelatorioInformativoDAO {
     
    Connection conn; //atribui valor de conn
    PreparedStatement pstm;//atribui valor de pstm
    ResultSet rs;//atribui valor de rs
    
    List<RelatorioInformativoDTO> lista = new ArrayList<>(); //declara uma nova Lista, ou um tipo de lista 
    
    public List<RelatorioInformativoDTO> RelatorioInfo (String Barras) {
        
        conn = new ConexaoGipDAO().conectaBD();
        
        //código resposavél por criar a tabela temporária
        try{
            String SQL1 = "CREATE TEMPORARY TABLE IF NOT EXISTS ResultadosTemporarios01 ( " +
    " CodigoBarrasCon_cadastroConsumoFatura VARCHAR(255), " +
    " jan DECIMAL(10, 2), " +
    " fev DECIMAL(10, 2), " +
    " mar DECIMAL(10, 2), " +
    " abril DECIMAL(10, 2), " +
    " maio DECIMAL(10, 2), " +
    " jun DECIMAL(10, 2), " +
    " jul DECIMAL(10, 2), " +
    " ago DECIMAL(10, 2), " +
    " setem DECIMAL(10, 2), " +
    " outb DECIMAL(10, 2), " +
    " nov DECIMAL(10, 2), " +
    " dez DECIMAL(10, 2), " +
    " mediafinal DECIMAL(10, 2) ) ";
            pstm = conn.prepareStatement(SQL1);
    pstm.execute();
    
    System.out.println("Linhas afetadas ao inserir dados na tabela temporária: " + pstm.getUpdateCount()); //exibe a quantidade de itens que foram exibidos na consulta

 String insertSelectSQL = "INSERT INTO ResultadosTemporarios01 ( " +//insert junto com select condicional
        " CodigoBarrasCon_cadastroConsumoFatura, " +
        " jan, fev, mar, abril, maio, jun, jul, ago, setem, outb, nov, dez, mediafinal) " +
        " SELECT " +
        " CodigoBarrasCon_cadastroConsumoFatura, " +
        " SUM(CASE WHEN MesReferente_cadastroConsumoFatura = 'Janeiro' THEN Valor_cadastroConsumoFatura ELSE 0 END) AS jan, " +
        " SUM(CASE WHEN MesReferente_cadastroConsumoFatura = 'Fevereiro' THEN Valor_cadastroConsumoFatura ELSE 0 END) AS fev, " +
        " SUM(CASE WHEN MesReferente_cadastroConsumoFatura = 'Março' THEN Valor_cadastroConsumoFatura ELSE 0 END) AS mar, " +
        " SUM(CASE WHEN MesReferente_cadastroConsumoFatura = 'Abril' THEN Valor_cadastroConsumoFatura ELSE 0 END) AS abril, " +
        " SUM(CASE WHEN MesReferente_cadastroConsumoFatura = 'Maio' THEN Valor_cadastroConsumoFatura ELSE 0 END) AS maio, " +
        " SUM(CASE WHEN MesReferente_cadastroConsumoFatura = 'Junho' THEN Valor_cadastroConsumoFatura ELSE 0 END) AS jun, " +
        " SUM(CASE WHEN MesReferente_cadastroConsumoFatura = 'Julho' THEN Valor_cadastroConsumoFatura ELSE 0 END) AS jul, " +
        " SUM(CASE WHEN MesReferente_cadastroConsumoFatura = 'Agosto' THEN Valor_cadastroConsumoFatura ELSE 0 END) AS ago, " +
        " SUM(CASE WHEN MesReferente_cadastroConsumoFatura = 'Setembro' THEN Valor_cadastroConsumoFatura ELSE 0 END) AS setem, " +
        " SUM(CASE WHEN MesReferente_cadastroConsumoFatura = 'Outubro' THEN Valor_cadastroConsumoFatura ELSE 0 END) AS outb, " +
        " SUM(CASE WHEN MesReferente_cadastroConsumoFatura = 'Novembro' THEN Valor_cadastroConsumoFatura ELSE 0 END) AS nov, " +
        " SUM(CASE WHEN MesReferente_cadastroConsumoFatura = 'Dezembro' THEN Valor_cadastroConsumoFatura ELSE 0 END) AS dez, " +
        " AVG(Valor_cadastroConsumoFatura) AS mediafinal " +
        "FROM cadastroconsumofatura " +
        "INNER JOIN faturanova ON cadastroConsumoFatura.CodigoBarrasCon_cadastroConsumoFatura = faturanova.CodigoBarras_faturanova " +
        "WHERE cadastroconsumofatura.CodigoBarrasCon_cadastroConsumoFatura = ? " +
        //"AND faturanova.Tipos_faturanova = ? " +
        //"AND cadastroconsumofatura.Ano_cadastroConsumoFatura = ? " +
        "GROUP BY CodigoBarrasCon_cadastroConsumoFatura";

pstm = conn.prepareStatement(insertSelectSQL);
pstm.setString(1, Barras);

pstm.execute();

System.out.println("Barras: " + Barras); //exibe o que eu digitei no campo de barras e se está certo mesmo



System.out.println("Linhas afetadas ao inserir dados na tabela temporária: " + pstm.getUpdateCount()); //exibe a quantidade de itens que foram exibidos na consulta

String selectSQL = "SELECT * FROM ResultadosTemporarios01";

            pstm = conn.prepareStatement(selectSQL);
            rs = pstm.executeQuery();
            
            System.out.println("Linhas afetadas ao inserir dados na tabela temporária: " + pstm.getUpdateCount()); //exibe a quantidade de itens que foram exibidos na consulta
            
            while (rs.next()) {
                
                RelatorioInformativoDTO objrelatorioinformativodto = new RelatorioInformativoDTO();
                
                objrelatorioinformativodto.setCodigoBarrasCon_cadastroConsumoFatura(rs.getString("CodigoBarrasCon_cadastroConsumoFatura"));
                objrelatorioinformativodto.setJan(rs.getString("jan"));
                objrelatorioinformativodto.setFev(rs.getString("fev"));
                objrelatorioinformativodto.setMar(rs.getString("mar"));
                objrelatorioinformativodto.setAbril(rs.getString("abril"));
                objrelatorioinformativodto.setMaio(rs.getString("maio"));
                objrelatorioinformativodto.setJun(rs.getString("jun"));
                objrelatorioinformativodto.setJul(rs.getString("jul"));
                objrelatorioinformativodto.setAgo(rs.getString("ago"));
                objrelatorioinformativodto.setSetem(rs.getString("setem"));
                objrelatorioinformativodto.setOutb(rs.getString("outb"));
                objrelatorioinformativodto.setNov(rs.getString("nov"));
                objrelatorioinformativodto.setDez(rs.getString("dez"));
                objrelatorioinformativodto.setMediafinal(rs.getString("mediafinal"));
                lista.add(objrelatorioinformativodto);
                
                lista.add(objrelatorioinformativodto);
            }
        
        
        
        
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"falha ao consultar" + ex);
        }finally{
            
        }
        return lista;
    }
}
