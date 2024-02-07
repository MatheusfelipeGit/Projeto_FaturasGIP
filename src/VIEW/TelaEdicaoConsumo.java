
package VIEW;

import DAO.EdicaoConsumoGipDAO;
import DTO.EdicaoConsumoGipDTO;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author jateixeira
 */
public class TelaEdicaoConsumo extends javax.swing.JFrame {

 
    /**
     * Creates new form TelaEdicaoConsumo
     */
    public TelaEdicaoConsumo() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        InstalacaoTxt = new javax.swing.JTextField();
        BuscarTxt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EditarTable = new javax.swing.JTable();
        EditarTxt = new javax.swing.JButton();
        VoltarBtn = new javax.swing.JButton();
        ApagarBtn = new javax.swing.JButton();
        AnoTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        MesRefTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("EDIÇÃO CONSUMO");

        BuscarTxt.setText("BUSCAR");
        BuscarTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarTxtActionPerformed(evt);
            }
        });

        jLabel2.setText("Instalação:");

        EditarTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Instalação", "Barras", "Valor", "Kw", "Mes Vencimento", "Mes Referente", "Data cadastro", "Ano", "Reduzido"
            }
        ));
        jScrollPane1.setViewportView(EditarTable);

        EditarTxt.setText("EDITAR");
        EditarTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarTxtActionPerformed(evt);
            }
        });

        VoltarBtn.setText("VOLTAR");
        VoltarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VoltarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarBtnActionPerformed(evt);
            }
        });

        ApagarBtn.setText("APAGAR");

        jLabel3.setText("Ano:");

        jLabel4.setText("Mês referente:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InstalacaoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MesRefTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(AnoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(159, 159, 159)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VoltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(278, 278, 278)
                .addComponent(EditarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ApagarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(365, 365, 365))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BuscarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InstalacaoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AnoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MesRefTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(BuscarTxt)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VoltarBtn)
                    .addComponent(EditarTxt)
                    .addComponent(ApagarBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarTxtActionPerformed
        try{
            listarValores();
        }
        catch (Exception erro){
            JOptionPane.showMessageDialog(null, "não há registros identificados" + erro);
        }
    }//GEN-LAST:event_BuscarTxtActionPerformed

    private void EditarTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarTxtActionPerformed
        try{
            Atualizar();
        }
        catch(Exception erro){
            JOptionPane.showMessageDialog(null, "deu erro");
        }
    }//GEN-LAST:event_EditarTxtActionPerformed

    private void VoltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarBtnActionPerformed
        TelaConsultaConsumo telaConsultaConsumo = new TelaConsultaConsumo();
        //esse código chama a tela selecionada pelo clique do botão selecionado
        telaConsultaConsumo.setVisible(true);
        //esse código faz a tela selecionada aparecer

        this.dispose();
    }//GEN-LAST:event_VoltarBtnActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaEdicaoConsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEdicaoConsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEdicaoConsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEdicaoConsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEdicaoConsumo().setVisible(true);
            }
        });
    }
   // ... (restante do código)


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AnoTxt;
    private javax.swing.JButton ApagarBtn;
    private javax.swing.JButton BuscarTxt;
    private javax.swing.JTable EditarTable;
    private javax.swing.JButton EditarTxt;
    private javax.swing.JTextField InstalacaoTxt;
    private javax.swing.JTextField MesRefTxt;
    private javax.swing.JButton VoltarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

   private void listarValores() {
        try {
            EdicaoConsumoGipDAO oedicaogipdao = new EdicaoConsumoGipDAO();
             
            DefaultTableModel model = (DefaultTableModel) EditarTable.getModel();
            model.setNumRows(0);
            
            String inst = InstalacaoTxt.getText();
            String MesRef = MesRefTxt.getText();
            String Ano = AnoTxt.getText();
            
            
            List<EdicaoConsumoGipDTO> lista = oedicaogipdao.EdicaoFatura(inst,MesRef, Ano);
                    
                 
                for(int i = 0; i < lista.size(); i ++){
                    model.addRow(new Object[]{
                        
                        lista.get(i).getInstalacao_faturanova(),
                        lista.get(i).getCodigoBarrasCon_cadastroConsumoFatura(),
                        lista.get(i).getValor_cadastroConsumoFatura(),
                        lista.get(i).getKw_cadastroConsumoFatura(),
                        lista.get(i).getMesVencimento_cadastroConsumoFatura(),
                        lista.get(i).getMesReferente_cadastroConsumoFatura(),
                        lista.get(i).getDataCadastro_cadastroConsumoFatura(),
                        lista.get(i).getAno_cadastroConsumoFatura(),
                        lista.get(i).getCodBarrasRed_cadastroConsumoFatura(),
                    });
                }
            
            
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"listarValores" + erro);
        }
    }
 

    private List<EdicaoConsumoGipDTO> getValoresOriginais() {
        List<EdicaoConsumoGipDTO> valoresOriginais = new ArrayList<>();

        try {
            DefaultTableModel model = (DefaultTableModel) EditarTable.getModel();
            int numRows = model.getRowCount();

            for (int i = 0; i < numRows; i++) {
                EdicaoConsumoGipDTO edicaoGipDTO = new EdicaoConsumoGipDTO();

                edicaoGipDTO.setInstalacao_faturanova(model.getValueAt(i, 0).toString());
                edicaoGipDTO.setCodigoBarrasCon_cadastroConsumoFatura(model.getValueAt(i, 1).toString());
                edicaoGipDTO.setValor_cadastroConsumoFatura(model.getValueAt(i, 2).toString());
                edicaoGipDTO.setKw_cadastroConsumoFatura(model.getValueAt(i, 3).toString());
                edicaoGipDTO.setMesVencimento_cadastroConsumoFatura(model.getValueAt(i, 4).toString());
                edicaoGipDTO.setMesReferente_cadastroConsumoFatura(model.getValueAt(i, 5).toString());
                edicaoGipDTO.setDataCadastro_cadastroConsumoFatura(model.getValueAt(i, 6).toString());
                edicaoGipDTO.setAno_cadastroConsumoFatura(model.getValueAt(i, 7).toString());
                edicaoGipDTO.setCodBarrasRed_cadastroConsumoFatura(model.getValueAt(i, 8).toString());
                

                valoresOriginais.add(edicaoGipDTO);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao obter valores originais: " + e.getMessage());
        }

        return valoresOriginais;
    }

    private boolean houveAlteracoes(List<EdicaoConsumoGipDTO> valoresOriginais) {
        DefaultTableModel model = (DefaultTableModel) EditarTable.getModel();
        int numRows = model.getRowCount();

        for (int i = 0; i < numRows; i++) {
           EdicaoConsumoGipDTO edicaoGipDTO = new EdicaoConsumoGipDTO();

            
                edicaoGipDTO.setInstalacao_faturanova(model.getValueAt(i, 0).toString());
                edicaoGipDTO.setCodigoBarrasCon_cadastroConsumoFatura(model.getValueAt(i, 1).toString());
                edicaoGipDTO.setValor_cadastroConsumoFatura(model.getValueAt(i, 2).toString());
                edicaoGipDTO.setKw_cadastroConsumoFatura(model.getValueAt(i, 3).toString());
                edicaoGipDTO.setMesVencimento_cadastroConsumoFatura(model.getValueAt(i, 4).toString());
                edicaoGipDTO.setMesReferente_cadastroConsumoFatura(model.getValueAt(i, 5).toString());
                edicaoGipDTO.setDataCadastro_cadastroConsumoFatura(model.getValueAt(i, 6).toString());
                edicaoGipDTO.setAno_cadastroConsumoFatura(model.getValueAt(i, 7).toString());
                edicaoGipDTO.setCodBarrasRed_cadastroConsumoFatura(model.getValueAt(i, 8).toString());


            if (!edicaoGipDTO.equals(valoresOriginais.get(i))) {
                return true; // Houve alteração
            }
        }

        return false; // Não houve alteração
    }

    private void Atualizar() {
        try {
            List<EdicaoConsumoGipDTO> valoresOriginais = getValoresOriginais();

            if (houveAlteracoes(valoresOriginais)) {
                
                EdicaoConsumoGipDAO edicaoGipDAO = new EdicaoConsumoGipDAO();
                
                for (EdicaoConsumoGipDTO edicaoGipDTO : valoresOriginais) {
                    edicaoGipDAO.atualizarCampos(edicaoGipDTO);
                }

                JOptionPane.showMessageDialog(this, "Dados editados com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Não houve alterações para salvar.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao editar dados: " + e.getMessage());
        }
    }
    
    // ... (restante do código)
    
    
    
}

