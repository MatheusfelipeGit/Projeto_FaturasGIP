package DAO;

import DTO.CadastroNovaFaturaGipDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CadastroNovaFaturaGipDAO {

    Connection conn;
    PreparedStatement pstm;

    public void cadastrarFatura(CadastroNovaFaturaGipDTO objfaturasgipdto) {

        conn = new ConexaoGipDAO().conectaBD();

        String sql = "insert into faturanova (CodigoBarras_faturanova, Instalacao_faturanova, CargaLevantada_faturanova, MedidorInstalacao_faturanova, Rua_faturanova, Numero_faturanova, Bairro_faturanova, Tipos_faturanova, CodBarrasRed_faturanova, Unidade_faturanova, Avenca_faturanova) values (?,?,?,?,?,?,?,?,?,?,?)";

        try {

            pstm = conn.prepareStatement(sql);

            pstm.setString(1, objfaturasgipdto.getCodigoBarras_faturanova());
            pstm.setString(2, objfaturasgipdto.getInstalacao_faturanova());
            pstm.setString(3, objfaturasgipdto.getCargaLevantada_faturanova());
            pstm.setString(4, objfaturasgipdto.getMedidorInstalacao_faturanova());
            pstm.setString(5, objfaturasgipdto.getRua_faturanova());
            pstm.setString(6, objfaturasgipdto.getNumero_faturanova());
            pstm.setString(7, objfaturasgipdto.getBairro_faturanova());
            pstm.setString(8, objfaturasgipdto.getTipos_faturanova());
            pstm.setString(9, objfaturasgipdto.getCodBarrasRed_faturanova());
            pstm.setString(10, objfaturasgipdto.getUnidade_faturanova());
            pstm.setString(11, objfaturasgipdto.getAvenca_faturanova());

            pstm.execute();
            pstm.close();

            JOptionPane.showMessageDialog(null, "CADASTRO REALIZADO COM SUSCESSO!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ERRO!!" + "FaturasGipDAO" + erro + JOptionPane.ERROR_MESSAGE);

        }
    }

}
    