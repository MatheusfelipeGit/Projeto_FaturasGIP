
package DAO;


import DTO.RelatorioInformativoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RelatorioInformativoDAO {
     
    Connection conn; //atribui valor de conn
    PreparedStatement pstm;//atribui valor de pstm
    ResultSet rs;//atribui valor de rs
    
    List<RelatorioInformativoDTO> lista = new ArrayList<>(); //declara uma nova Lista, ou um tipo de lista 
}
