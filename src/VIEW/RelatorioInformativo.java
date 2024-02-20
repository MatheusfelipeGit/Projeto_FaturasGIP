
package VIEW;

import DAO.ConexaoGipDAO;
import DAO.RelatorioInformativoDAO;
import DTO.RelatorioInformativoDTO;
import com.mysql.cj.jdbc.CallableStatement;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class RelatorioInformativo extends javax.swing.JFrame {

    
    public RelatorioInformativo() {
       
        initComponents();
         this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        VoltarBtn = new javax.swing.JButton();
        BuscarBtn = new javax.swing.JButton();
        AnoTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaInformativo = new javax.swing.JTable();
        AuditoriaSimNao = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        VoltarBtn.setText("VOLTAR");
        VoltarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarBtnActionPerformed(evt);
            }
        });

        BuscarBtn.setText("BUSCAR");
        BuscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarBtnActionPerformed(evt);
            }
        });

        AnoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnoTxtActionPerformed(evt);
            }
        });

        jLabel1.setText("ANO:");

        TabelaInformativo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Barras Red", "Jan", "Fev", "Mar", "Abril", "Maio", "Jun", "Jul", "Ago", "Setem", "Out", "Nov", "Dez", "Diversas", "Media Final", "Auditoria"
            }
        ));
        jScrollPane1.setViewportView(TabelaInformativo);

        AuditoriaSimNao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Sim", "Não" }));

        jLabel2.setText("AUDITORIA:");

        jButton1.setText("EXPORTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AnoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(264, 264, 264)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(AuditoriaSimNao, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 534, Short.MAX_VALUE)
                                        .addComponent(BuscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(VoltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AnoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AuditoriaSimNao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarBtn))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VoltarBtn)
                    .addComponent(jButton1))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarBtnActionPerformed
        
        try{ 
             chamarProcedure(AnoTxt.getText(), (String)AuditoriaSimNao.getSelectedItem());
         }catch(Exception erro){
             JOptionPane.showMessageDialog(null, "erro listagem1" + erro);
             }    
               
        try{ 
             listarValores();
         }catch(Exception erro){
             JOptionPane.showMessageDialog(null, "erro listagem2" + erro);
             }    
    }//GEN-LAST:event_BuscarBtnActionPerformed

    private void VoltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarBtnActionPerformed
     TelaRelatorio telaRelatorio = new TelaRelatorio();
     telaRelatorio.setVisible(true);
      
      this.dispose();
    }//GEN-LAST:event_VoltarBtnActionPerformed

    private void AnoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnoTxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        exportarParaPlanilha1(AnoTxt.getText(),(String)AuditoriaSimNao.getSelectedItem());
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RelatorioInformativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioInformativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioInformativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioInformativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioInformativo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AnoTxt;
    private javax.swing.JComboBox<String> AuditoriaSimNao;
    private javax.swing.JButton BuscarBtn;
    private javax.swing.JTable TabelaInformativo;
    private javax.swing.JButton VoltarBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
private void listarValores() {
    
        try {
            RelatorioInformativoDAO relatorioInformativodao = new RelatorioInformativoDAO();

            DefaultTableModel model = (DefaultTableModel) TabelaInformativo.getModel();
            model.setNumRows(0);

            String Ano = AnoTxt.getText();
            String Auditoria = (String)AuditoriaSimNao.getSelectedItem();

            List<RelatorioInformativoDTO> lista = relatorioInformativodao.RelatorioInfo(Ano, Auditoria);

            for (int i = 0; i < lista.size(); i++) {
                model.addRow(new Object[]{
               //  lista.get(i).getCodigoBarrasCon_cadastroConsumoFatura(),
                 lista.get(i).getCodBarrasRed_cadastroConsumoFatura(),
                 lista.get(i).getJan(),
                 lista.get(i).getFev(),
                 lista.get(i).getMar(),
                 lista.get(i).getAbril(),
                 lista.get(i).getMaio(),
                 lista.get(i).getJun(),
                 lista.get(i).getJul(),
                 lista.get(i).getAgo(),
                 lista.get(i).getSetem(),
                 lista.get(i).getOutb(),
                 lista.get(i).getNov(),
                 lista.get(i).getDez(),
                 lista.get(i).getDivatrasadas(),
                 lista.get(i).getMediaFinal(),
                 lista.get(i).getAuditoria_cadastroConsumoFatura(),
                });
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "listarValores3" + erro);
        }
        
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
    }
private void exportarParaPlanilha1 (String Ano, String Auditoria) {
        RelatorioInformativoDAO dao = new RelatorioInformativoDAO();
        List<RelatorioInformativoDTO> listaConsultas = dao.RelatorioInfo(Ano, Auditoria); // Chamada correta
        String DocumentsTeste = "C:\\Users\\jateixeira\\Desktop\\planilhas exportadas\\relatórioInformativoAuditoria.xlsx"; //ajusta o caminho p achar a planilha

        dao.exportarParaPlanilha1(listaConsultas, DocumentsTeste);

        JOptionPane.showMessageDialog(null, "EXPORTADO COM SUCESSO!!");
    }
}
