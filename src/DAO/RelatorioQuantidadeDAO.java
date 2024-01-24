
package DAO;

import DTO.RelatorioQuantidadeDTO;
import com.mysql.cj.jdbc.CallableStatement;
import java.io.FileOutputStream;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;

import java.util.List;



public class RelatorioQuantidadeDAO {

Connection conn; //declara connection como conn
PreparedStatement pstm; // declara Prepared como pstm
ResultSet rs; // declara ResultSet como rs

List<RelatorioQuantidadeDTO> lista = new ArrayList<>(); //declara uma nova Lista chamando DTO, ou um tipo de lista

public List<RelatorioQuantidadeDTO> RelatorioQuantidade() {
    
    conn = (Connection) new ConexaoGipDAO().conectaBD(); //puxa a conexão da classe de conexão
    
    try{
        //função de buscar
        String sql = "SELECT * FROM Armaz";
        
        
          /*  + "LEFT JOIN "
            + "cadastroconsumofatura "
            + "ON "
            + "faturanova.CodBarrasRed_faturanova = cadastroconsumofatura.CodBarrasRed_cadastroConsumoFatura "
            + "WHERE "
            + "cadastroconsumofatura.MesReferente_cadastroConsumoFatura = ? "
            + "GROUP BY faturanova.Tipos_faturanova"*/                   //função para ver quantidade total
        
        pstm = conn.prepareStatement(sql);

       // pstm.setString(1,BarrasRedConsumo);
       // pstm.setString(2,BarrasRedFatura);
       // pstm.setString(1,MesReferente);
     //   pstm.setString(2,Tipos);
        
        rs = pstm.executeQuery();
        
        while(rs.next()) {
            RelatorioQuantidadeDTO objrelatorioquantidadedto = new RelatorioQuantidadeDTO();
            
            objrelatorioquantidadedto.setQuantidadeTotal_Armaz(rs.getString("QuantidadeTotal_Armaz"));
            objrelatorioquantidadedto.setTipo_Armaz(rs.getString("Tipo_Armaz"));
            
           
            
          //  objrelatorioquantidadedto.setCodBarrasRed_cadastroConsumoFatura(rs.getString("CodBarrasRed_cadastroConsumoFatura"));
         //   objrelatorioquantidadedto.setMesReferente_cadastroConsumoFatura(rs.getString("MesReferente_cadastroConsumoFatura"));
         //   objrelatorioquantidadedto.setTipos_faturanova(rs.getString("Tipos_faturanova"));
           // objrelatorioquantidadedto.setCodBarrasRed_faturanova(rs.getString("CodBarrasRed_faturanova"));
            
            lista.add(objrelatorioquantidadedto);
     
    
    }
        
    } catch (SQLException Erro) {
        JOptionPane.showMessageDialog(null,"falha ao consultar" + Erro);
    }finally{
        
    }
    return lista;
}

}
