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
   
    public List<RelatorioInformativoDTO> RelatorioInfo (String Ano,String Auditoria) {
        
        conn = new ConexaoGipDAO().conectaBD(); //chama a conexão com a String conn para conecta bd
        
        try{
            String sql = "SELECT * FROM ResultadosTemporarios " ;
            
            pstm = conn.prepareStatement(sql);
            
            
            rs = pstm.executeQuery();
            
            while (rs.next()) {
                
                RelatorioInformativoDTO objrelatoriogipdto = new RelatorioInformativoDTO();
                
               // objrelatoriogipdto.setCodigoBarrasCon_cadastroConsumoFatura(rs.getString("CodigoBarrasCon_cadastroConsumoFatura")); 
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
                objrelatoriogipdto.setAuditoria_cadastroConsumoFatura(rs.getString("Auditoria_cadastroConsumoFatura")); 
                
                
                
                lista.add(objrelatoriogipdto);
            }
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "falha ao consultar" + ex);
        }finally{
            
        }
        
        return lista;
    }
    public void chamarProcedure(String AnoRefs, String Auditoria) throws SQLException {
        java.sql.Connection conn = null;
        CallableStatement callableStatement = null;

        try { 
            conn = new ConexaoGipDAO().conectaBD();
            // Assume que você tem uma classe de conexão separada
            
            // Chama a procedure usando CallableStatement
            String sqlProcedure = "{call TesteInformativo(?, ?)}";
            
            callableStatement = (CallableStatement) conn.prepareCall(sqlProcedure);
            callableStatement.setString(1, AnoRefs);
            callableStatement.setString(2, Auditoria);
            
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
    }public void exportarParaPlanilha1(List<RelatorioInformativoDTO> listar, String filePath) {
    
        try (Workbook workbook = new XSSFWorkbook()) {
        Sheet sheet = workbook.createSheet("Dados"); // Cria uma nova planilha com o nome "Dados"

        int rowIndex = 0;
        Row headerRow = sheet.createRow(rowIndex++);

        // Define o cabeçalho das colunas da planilha
            headerRow.createCell(0).setCellValue("Red");
            headerRow.createCell(1).setCellValue("Jan");
            headerRow.createCell(2).setCellValue("Fev");
            headerRow.createCell(3).setCellValue("Mar");
            headerRow.createCell(4).setCellValue("Abr");
            headerRow.createCell(5).setCellValue("Maio");
            headerRow.createCell(6).setCellValue("Jun");
            headerRow.createCell(7).setCellValue("Jul");
            headerRow.createCell(8).setCellValue("Ago");
            headerRow.createCell(9).setCellValue("Set");
            headerRow.createCell(10).setCellValue("Out");
            headerRow.createCell(11).setCellValue("Nov");
            headerRow.createCell(12).setCellValue("Dez");
            headerRow.createCell(13).setCellValue("mediaFinal");
            headerRow.createCell(14).setCellValue("Auditoria");

            // Preenche os dados na planilha a partir da lista de DTOs
            for (RelatorioInformativoDTO dto : listar) {
                Row dataRow = sheet.createRow(rowIndex++);
                dataRow.createCell(0).setCellValue(dto.getCodBarrasRed_cadastroConsumoFatura());
                dataRow.createCell(1).setCellValue(dto.getJan());
                dataRow.createCell(2).setCellValue(dto.getFev());
                dataRow.createCell(3).setCellValue(dto.getMar());
                dataRow.createCell(4).setCellValue(dto.getAbril());
                dataRow.createCell(5).setCellValue(dto.getMaio());
                dataRow.createCell(6).setCellValue(dto.getJun());
                dataRow.createCell(7).setCellValue(dto.getJul());
                dataRow.createCell(8).setCellValue(dto.getAgo());
                dataRow.createCell(9).setCellValue(dto.getSetem());
                dataRow.createCell(10).setCellValue(dto.getOutb());
                dataRow.createCell(11).setCellValue(dto.getNov());
                dataRow.createCell(12).setCellValue(dto.getDez());
                dataRow.createCell(13).setCellValue(dto.getMediaFinal());
                dataRow.createCell(14).setCellValue(dto.getAuditoria_cadastroConsumoFatura());
            }

        // mensagem que avisa oonde a planilha está/ Salva a mesma
        try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
            workbook.write(outputStream);
            
            System.out.println("Planilha exportada com sucesso para: " + filePath);
        }
        
         
    } catch (Exception e) {
        e.printStackTrace();
    }
}  
}