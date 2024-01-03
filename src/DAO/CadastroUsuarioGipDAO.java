
package DAO;

import DTO.CadastroUsuarioGipDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CadastroUsuarioGipDAO {
     
    Connection conn;
    PreparedStatement pstm;
    
    
    public void cadastrarUsuario(CadastroUsuarioGipDTO objcadastrarusuariogipdto) {
        String sql = "insert into usuario (If_usuario,NomeCompleto_usuario, Senha_usuario) values (?,?,?)"  ;
        conn = new ConexaoGipDAO().conectaBD();
        
        
        try {
            
            pstm = conn.prepareStatement(sql);
    
            pstm.setString(1, objcadastrarusuariogipdto.getIf_usuario());          
            pstm.setString(2, objcadastrarusuariogipdto.getNomeCompleto_usuario());   
            pstm.setString(3, objcadastrarusuariogipdto.getSenha_usuario());  
            
           
            pstm.execute();
           
            JOptionPane.showMessageDialog(null, "CADASTRO DE USUARIO REALIZADO COM SUCESSO!");
            
            
            
        } 
        catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "CadastroUsuarioGipDAO" + erro);
            
        }
        
    
    }
}
/*
CÓDIGO PENSADO POR: JEFF 
E DESENVOLVIDO POR: MATHEUS FELIPE lEITE JANUÁRIO
*/ 