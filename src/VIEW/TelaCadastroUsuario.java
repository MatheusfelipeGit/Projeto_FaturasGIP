
package VIEW;

import DAO.CadastroUsuarioGipDAO;
import DTO.CadastroUsuarioGipDTO;
import VIEW.TelaMenu;

public class TelaCadastroUsuario extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaCadastroUsuario() {
        initComponents();
        setExtendedState((int) CENTER_ALIGNMENT);
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
        jLabel2 = new javax.swing.JLabel();
        IfTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        NomeCompletoTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SairBtn = new javax.swing.JButton();
        CadastrarBtn = new javax.swing.JButton();
        SenhaPassword = new javax.swing.JPasswordField();
        ExibirSenhaCheckBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de cadastro de Usuário");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Cadastro de Usuário:");

        IfTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        IfTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IfTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("If:");

        NomeCompletoTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Nome Completo:");

        jLabel5.setText("Senha para acesso:");

        SairBtn.setText("VOLTAR");
        SairBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SairBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SairBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairBtnActionPerformed(evt);
            }
        });

        CadastrarBtn.setText("CADASTRAR");
        CadastrarBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CadastrarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CadastrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarBtnActionPerformed(evt);
            }
        });

        SenhaPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ExibirSenhaCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        ExibirSenhaCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ExibirSenhaCheckBox.setText("Exibir Senha");
        ExibirSenhaCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExibirSenhaCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExibirSenhaCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(213, 213, 213))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NomeCompletoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(SenhaPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(SairBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CadastrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ExibirSenhaCheckBox))))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel2)
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeCompletoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SenhaPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExibirSenhaCheckBox)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SairBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CadastrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(122, 122, 122))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IfTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IfTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IfTextFieldActionPerformed

    private void SairBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairBtnActionPerformed
       TelaMenu telaMenu = new TelaMenu();
       telaMenu.setVisible(true);
       
       this.dispose();
    }//GEN-LAST:event_SairBtnActionPerformed

    private void CadastrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarBtnActionPerformed
        String If, NomeCompleto, Senha;
        
        If = IfTextField.getText();
       NomeCompleto = NomeCompletoTextField.getText();

        Senha = String.valueOf (SenhaPassword.getPassword()); 
        //serve para falar pro sistema que ele é uma senha 
        
        CadastroUsuarioGipDTO objcadastrousuariogipdto = new CadastroUsuarioGipDTO();
        objcadastrousuariogipdto.setIf_usuario(If);
        objcadastrousuariogipdto.setNomeCompleto_usuario(NomeCompleto);
        objcadastrousuariogipdto.setSenha_usuario(Senha);
        
        CadastroUsuarioGipDAO objcadastrousuariogipdao = new CadastroUsuarioGipDAO();
        objcadastrousuariogipdao.cadastrarUsuario(objcadastrousuariogipdto);
           
        
            System.setProperty("Login", NomeCompletoTextField.getText());
            
            //pega o nome e joga para o campo de "bem vindo" + NomeCompletoTextField
            
        
            TelaMenu telaMenu = new TelaMenu();
            //esse código chama a tela selecionada pelo clique do botão selecionado                 
            telaMenu.setVisible(true);
            //esse código faz a tela selecionada aparecer
          
            this.dispose();
    }//GEN-LAST:event_CadastrarBtnActionPerformed

    private void ExibirSenhaCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExibirSenhaCheckBoxActionPerformed
        if (ExibirSenhaCheckBox.isSelected()) {
            SenhaPassword.setEchoChar((char)0);
        }
        else {
            SenhaPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_ExibirSenhaCheckBoxActionPerformed

   
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
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastrarBtn;
    private javax.swing.JCheckBox ExibirSenhaCheckBox;
    private javax.swing.JTextField IfTextField;
    private javax.swing.JTextField NomeCompletoTextField;
    private javax.swing.JButton SairBtn;
    private javax.swing.JPasswordField SenhaPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
/*
CÓDIGO PENSADO POR: JEFF 
E DESENVOLVIDO POR: MATHEUS FELIPE lEITE JANUÁRIO
*/