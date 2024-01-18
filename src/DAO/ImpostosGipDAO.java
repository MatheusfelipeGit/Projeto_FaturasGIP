
package DAO;


import DTO.ImpostosGipDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
//import necessario para a realização de uma função/retorno especifico

public class ImpostosGipDAO {
    Connection conn; //define conn Connection
    PreparedStatement pstm; //define pstm como preparedstatement
    
    public void cadastrarImposto(ImpostosGipDTO objimpostosgipdto) {

        conn = new ConexaoGipDAO().conectaBD();//realiza conexao
        
        try{
            
            String sql = "insert into impostos (Im_TUSD_impostos,Im_TE_impostos,Resultado_impostos,Pis_impostos,Cofins_impostos, Ajuste_impostos, Icms_impostos, MesReferente_impostos, Ano_impostos) values (?,?,?,?,?,?,?,?,?)";
            //codigo de conversação com o banco de dados na linguagem do banco de dados 
             pstm = conn.prepareStatement(sql);
             
             pstm.setString(1, objimpostosgipdto.getIm_TUSD_impostos());
          
             pstm.setString(2, objimpostosgipdto.getIm_TE_impostos());
             
             pstm.setString(3, objimpostosgipdto.getResultado_impostos());
             
             pstm.setString(4, objimpostosgipdto.getPis_impostos());
             
             pstm.setString(5, objimpostosgipdto.getCofins_impostos());
             
             pstm.setString(6, objimpostosgipdto.getAjuste_impostos());
            
             pstm.setString(7, objimpostosgipdto.getAjuste_impostos());
             
             pstm.setString(8, objimpostosgipdto.getMesReferente_impostos());
             
             pstm.setString(9, objimpostosgipdto.getAno_impostos());
             
             pstm.execute();
             pstm.close();
             
             JOptionPane.showMessageDialog(null, "CADASTRO DE IMPOSTO REALIZADO!!");
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"impostosdao" + erro);
        }
    
    
    
    }
    
    }
/*
CÓDIGO PENSADO POR: JEFF 
E DESENVOLVIDO POR: MATHEUS FELIPE lEITE JANUÁRIO
*/ 