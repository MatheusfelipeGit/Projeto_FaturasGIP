
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
    
    public List<RelatorioInformativoDTO> RelatorioInfo (String Barras, String Tipo, String Ano) {
        
        conn = new ConexaoGipDAO().conectaBD();
        
        try{
            String SQL = "SELECT " +
            " SUBSTRING(CodigoBarrasCon_cadastroConsumoFatura, 43, 48) AS CodBarrasRed_cadastroConsumoFatura, " +
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
            " SUM(CASE WHEN MesReferente_cadastroConsumoFatura = 'Dezembro' THEN Valor_cadastroConsumoFatura ELSE 0 END) AS dez " +
            " FROM cadastroConsumoFatura " +
            " INNER JOIN faturanova ON cadastroConsumoFatura.CodigoBarrasCon_cadastroConsumoFatura = faturanova.Instalacao_faturanova " +
            " WHERE cadastroConsumoFatura.CodigoBarrasCon_cadastroConsumoFatura = ? " +
            " AND faturanova.Tipos_faturanova = ? " +
            " AND cadastroConsumoFatura.Ano_cadastroConsumoFatura = ? " +
            " GROUP BY CodBarrasRed_cadastroConsumoFatura"; // Adicionei o GROUP BY para agrupar os resultados por fatura.

        
            pstm = conn.prepareStatement(SQL);
            
            pstm.setString(1, Barras);
            
            pstm.setString(2, Tipo);
            
            pstm.setString(3, Ano);
            
            rs = pstm.executeQuery();
            
            while (rs.next()) {
                RelatorioInformativoDTO objrelatorioinformativodto = new RelatorioInformativoDTO();
                
                objrelatorioinformativodto.setCodigoBarrasCon_cadastroConsumoFatura(rs.getString("CodigoBarrasCon_cadastroConsumoFatura"));
                objrelatorioinformativodto.setTipos_faturanova(rs.getString("Tipos_faturanova"));
                objrelatorioinformativodto.setMesReferente_cadastroConsumoFatura(rs.getString("MesReferente_cadastroConsumoFatura"));
                objrelatorioinformativodto.setAno_cadastroConsumoFatura(rs.getString("Ano_cadastroConsumoFatura"));
                objrelatorioinformativodto.setValor_cadastroConsumoFatura(rs.getString("Valor_cadastroConsumoFatura"));
                objrelatorioinformativodto.setKw_cadastroConsumoFatura(rs.getString("Kw_cadastroConsumoFatura"));
                objrelatorioinformativodto.setCodBarrasRed_cadastroConsumoFatura(rs.getString("CodBarrasRed_cadastroConsumoFatura"));
                
                lista.add(objrelatorioinformativodto);
            }
        
        
        
        
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"falha ao consultar" + ex);
        }finally{
            
        }
        return lista;
    }
}
