package DAO;

import DTO.ConsultarConsumoGipDTO;
import DTO.RelatorioInformativoDTO;
import com.mysql.cj.jdbc.CallableStatement;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RelatorioInformativoDAO {
    Connection conn; //define Connection como 'conn'
    PreparedStatement pstm; //define prepared como 'pstm'
    ResultSet rs; //define ResultSet como 'rs' 
    
    List<RelatorioInformativoDTO> lista = new ArrayList<>();
   
    public List<RelatorioInformativoDTO> RelatorioInfo (String BarrasRed) {
        
        conn = new ConexaoGipDAO().conectaBD(); //chama a conexão com a String conn para conecta bd
        
        try{
            String sql = "SELECT * FROM medias " +
                    "INNER JOIN cadastroConsumoFatura ON CodBarrasRed_medias = cadastroConsumoFatura.CodBarrasRed_cadastroConsumoFatura " +
                    "WHERE cadastroConsumoFatura.CodBarrasRed_cadastroConsumoFatura = ?";
            
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, BarrasRed);
            
            rs = pstm.executeQuery();
            
            while (rs.next()) {
                
                RelatorioInformativoDTO objrelatoriogipdto = new RelatorioInformativoDTO();
                
                objrelatoriogipdto.setCodBarrasRed_cadastroConsumoFatura(rs.getString("CodBarrasRed_cadastroConsumoFatura"));
                objrelatoriogipdto.setCodBarrasRed_medias(rs.getString("CodBarrasRed_medias"));
                
                lista.add(objrelatoriogipdto);
            }
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "falha ao consultar" + ex);
        }finally{
            
        }
        
        return lista;
    }
    
}