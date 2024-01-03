
package DAO;

import DTO.LoginGipDTO;
import java.sql.Connection;
import java.sql.ResultSet;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;


public class LoginGipDAO {
    
    Connection conn;
 
    public ResultSet autenticacaoUsuario(LoginGipDTO objlogingipdto){
        conn = new ConexaoGipDAO().conectaBD();
        
        try{
           String sql = "SELECT *, NomeCompleto_usuario FROM usuario WHERE If_usuario = ? AND Senha_usuario = ?"; 
           
            PreparedStatement pstm = conn.prepareStatement(sql);
           
           
           pstm.setString(1, objlogingipdto.getIf_login());
           
           pstm.setString(2, objlogingipdto.getSenha_login());
           
           
           ResultSet rs = pstm.executeQuery();
          
           return rs;
           
           
            
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"LoginGipDAO: " + erro);
            return null;
        }
        
        
        
    }
 
}
/*
CÓDIGO PENSADO POR: JEFF 
E DESENVOLVIDO POR: MATHEUS FELIPE lEITE JANUÁRIO
*/ 