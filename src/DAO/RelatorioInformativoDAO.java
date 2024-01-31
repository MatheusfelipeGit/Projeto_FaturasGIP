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
   
    public List<RelatorioInformativoDTO> RelatorioInfo (String Ano) {
        
        conn = new ConexaoGipDAO().conectaBD(); //chama a conexão com a String conn para conecta bd
        
        try{
            String sql = "SELECT * FROM ResultadosTemporarios " ;
            
            pstm = conn.prepareStatement(sql);
            
            
            rs = pstm.executeQuery();
            
            while (rs.next()) {
                
                RelatorioInformativoDTO objrelatoriogipdto = new RelatorioInformativoDTO();
                
                objrelatoriogipdto.setCodigoBarrasCon_cadastroConsumoFatura(rs.getString("CodigoBarrasCon_cadastroConsumoFatura")); 
                objrelatoriogipdto.setCodBarrasRed_cadastroConsumoFatura(rs.getString("CodBarrasRed_cadastroConsumoFatura")); 
                objrelatoriogipdto.setJan(rs.getString("Jan")); 
                objrelatoriogipdto.setFev(rs.getString("Fev")); 
                objrelatoriogipdto.setMar(rs.getString("Mar")); 
                objrelatoriogipdto.setAbril(rs.getString("Abril")); 
                objrelatoriogipdto.setMaio(rs.getString("Maio")); 
                objrelatoriogipdto.setJun(rs.getString("Jun")); 
                objrelatoriogipdto.setJul(rs.getString("Jul")); 
                objrelatoriogipdto.setAgo(rs.getString("Ago")); 
                objrelatoriogipdto.setSetem(rs.getString("Setem")); 
                objrelatoriogipdto.setOutb(rs.getString("Outb")); 
                objrelatoriogipdto.setNov(rs.getString("Nov")); 
                objrelatoriogipdto.setDez(rs.getString("Dez")); 
                objrelatoriogipdto.setMediaFinal(rs.getString("MediaFinal")); 
                
                
                
                lista.add(objrelatoriogipdto);
            }
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "falha ao consultar" + ex);
        }finally{
            
        }
        
        return lista;
    }
    public void chamarProcedure(String AnoRefs) throws SQLException {
        java.sql.Connection conn = null;
        CallableStatement callableStatement = null;

        try { 
            conn = new ConexaoGipDAO().conectaBD();
            // Assume que você tem uma classe de conexão separada
            
            // Chama a procedure usando CallableStatement
            String sqlProcedure = "{call TesteInformativo(?)}";
            
            callableStatement = (CallableStatement) conn.prepareCall(sqlProcedure);
            callableStatement.setString(1, AnoRefs);
            
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