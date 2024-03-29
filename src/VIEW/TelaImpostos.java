
package VIEW;

import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import DAO.ImpostosGipDAO;
import DTO.ImpostosGipDTO; 
public class TelaImpostos extends javax.swing.JFrame {

    /**
     * Creates new form TelaImpostos
     */
    public TelaImpostos() {
        initComponents();
        
        //funções da combobox
        AutoCompleteDecorator.decorate(MesRef1ComboBox);//permite que você pesquise dentro da combobox
        MesRef1ComboBox.setSelectedIndex(-1);//faz com que a combobox fique "limpa" assim que rodar a aplicação
        
        setLocationRelativeTo(null);
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
        VoltarBtn = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        ResultTxt = new javax.swing.JTextField();
        MesRef1ComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CadastroBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PisTxt = new javax.swing.JFormattedTextField();
        CofinsTxt = new javax.swing.JFormattedTextField();
        AjusteTxt = new javax.swing.JFormattedTextField();
        Imposto1Txt = new javax.swing.JFormattedTextField();
        Imposto2Txt = new javax.swing.JFormattedTextField();
        AnoTxt = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        icmsTxt = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Impostos:");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        VoltarBtn.setBackground(new java.awt.Color(204, 204, 204));
        VoltarBtn.setForeground(new java.awt.Color(0, 0, 0));
        VoltarBtn.setText("VOLTAR");
        VoltarBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        VoltarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VoltarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarBtnActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("IMPOSTOS");

        ResultTxt.setEditable(false);

        MesRef1ComboBox.setBackground(new java.awt.Color(204, 204, 204));
        MesRef1ComboBox.setForeground(new java.awt.Color(153, 153, 153));
        MesRef1ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        MesRef1ComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Imposto TUSD:");

        jLabel3.setText("Imposto TE:");

        jLabel4.setText("Resultado:");

        jLabel5.setText("Mês Referente:");

        CadastroBtn.setBackground(new java.awt.Color(204, 204, 204));
        CadastroBtn.setForeground(new java.awt.Color(0, 0, 0));
        CadastroBtn.setText("CADASTRAR");
        CadastroBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CadastroBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CadastroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroBtnActionPerformed(evt);
            }
        });

        jLabel6.setText("Pis:");

        jLabel7.setText("Cofins:");

        jLabel8.setText("Ajuste %:");

        try {
            PisTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        PisTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PisTxtActionPerformed(evt);
            }
        });

        try {
            CofinsTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CofinsTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CofinsTxtActionPerformed(evt);
            }
        });

        try {
            AjusteTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            Imposto1Txt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            Imposto2Txt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        AnoTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####"))));

        jLabel9.setText("Ano:");

        jLabel10.setText("ICMS %:");

        try {
            icmsTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(VoltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                        .addComponent(CadastroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(AnoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(MesRef1ComboBox, 0, 177, Short.MAX_VALUE)
                                    .addComponent(ResultTxt)
                                    .addComponent(PisTxt)
                                    .addComponent(CofinsTxt)
                                    .addComponent(AjusteTxt)
                                    .addComponent(Imposto1Txt)
                                    .addComponent(Imposto2Txt)
                                    .addComponent(icmsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(269, 269, 269))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Imposto1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Imposto2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ResultTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PisTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CofinsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AjusteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(icmsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(MesRef1ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(AnoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(VoltarBtn)
                            .addComponent(CadastroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5))
                .addGap(29, 29, 29))
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

    private void VoltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarBtnActionPerformed
        //esse código abre a janela ordenada
        TelaMenu telaMenu = new TelaMenu();
            telaMenu.setVisible(true);
            
            this.dispose();
        

    }//GEN-LAST:event_VoltarBtnActionPerformed

    private void CadastroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroBtnActionPerformed
        
        //ESSE CÓDIGO QUE REALIZA A CONTA
        double num1 = Double.parseDouble(Imposto1Txt.getText());//aqui você declara o valor x
        double num2 = Double.parseDouble(Imposto2Txt.getText());//aqui você declara o valor y     
        
        double resultado = num1 + num2;//aqui é onde soma ambos os valores
        ResultTxt.setText("" + resultado);//aqui é onde da o resultado
        
        /////////////////////////////////////////////////////////////////
        
        String Imposto01, Imposto02, Resultado, Pis, Cofins, Ajuste, Icms, MesReferente, Ano;
        
        Imposto01 = Imposto1Txt.getText();
        Imposto02 = Imposto2Txt.getText();
        Resultado = ResultTxt.getText();
        Pis = PisTxt.getText();
        Cofins = CofinsTxt.getText();
        Ajuste = AjusteTxt.getText();
        Icms = icmsTxt.getText();
        MesReferente = (String) MesRef1ComboBox.getSelectedItem();//uso esse código na combobox para cair no bd o item selecionado da combx.
        Ano = AnoTxt.getText();
        
        ImpostosGipDTO objimpostosgipdto = new ImpostosGipDTO();
        
        objimpostosgipdto.setIm_TUSD_impostos(Imposto01);
        objimpostosgipdto.setIm_TE_impostos(Imposto02);
        objimpostosgipdto.setResultado_impostos(Resultado);
        objimpostosgipdto.setPis_impostos(Pis);
        objimpostosgipdto.setCofins_impostos(Cofins);
        objimpostosgipdto.setAjuste_impostos(Ajuste);
        objimpostosgipdto.setIcms_impostos(Icms);
        objimpostosgipdto.setMesReferente_impostos(MesReferente);
        objimpostosgipdto.setAno_impostos(Ano);
        
        ImpostosGipDAO objimpostosgipdao = new ImpostosGipDAO();
        objimpostosgipdao.cadastrarImposto(objimpostosgipdto);
        
        //////////////////////////////////////////////////////////////////
        
        //esse código limpa os campos depois das funções ordenadas antes 
        Imposto1Txt.setText("");
        Imposto2Txt.setText("");
        ResultTxt.setText("");
        PisTxt.setText("");
        CofinsTxt.setText("");
        AjusteTxt.setText("");
        icmsTxt.setText("");
        MesRef1ComboBox.setSelectedIndex(-1);
        AnoTxt.setText("");
        
    }//GEN-LAST:event_CadastroBtnActionPerformed

    private void CofinsTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CofinsTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CofinsTxtActionPerformed

    private void PisTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PisTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PisTxtActionPerformed

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
            java.util.logging.Logger.getLogger(TelaImpostos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaImpostos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaImpostos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaImpostos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaImpostos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField AjusteTxt;
    private javax.swing.JFormattedTextField AnoTxt;
    private javax.swing.JButton CadastroBtn;
    private javax.swing.JFormattedTextField CofinsTxt;
    private javax.swing.JFormattedTextField Imposto1Txt;
    private javax.swing.JFormattedTextField Imposto2Txt;
    private javax.swing.JComboBox<String> MesRef1ComboBox;
    private javax.swing.JFormattedTextField PisTxt;
    private javax.swing.JTextField ResultTxt;
    private javax.swing.JToggleButton VoltarBtn;
    private javax.swing.JFormattedTextField icmsTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

     //////////USO PARA SALVAR!!!!!!///////////
        
       /* //ESSE CÓDIGO QUE REALIZA A CONTA
        double num1 = Double.parseDouble(Imposto1Txt.getText());//aqui você declara o valor x
        double num2 = Double.parseDouble(Imposto2Txt.getText());//aqui você declara o valor y     
        
        double resultado = num1 + num2;//aqui é onde soma ambos os valores
        ResultTxt.setText("" + resultado);//aqui é onde da o resultado
        
        /////////////////////////////////////////////////////////////////
        
        String Imposto01, Imposto02, Resultado, MesReferente;
        
        Imposto01 = Imposto1Txt.getText();
        Imposto02 = Imposto2Txt.getText();
        Resultado = ResultTxt.getText();
        MesReferente = (String) MesRef1ComboBox.getSelectedItem();
        
        ImpostosGipDTO objimpostosgipdto = new ImpostosGipDTO();
        
        objimpostosgipdto.setImposto01_impostos(Imposto01);
        objimpostosgipdto.setImposto02_impostos(Imposto02);
        objimpostosgipdto.setResultado_impostos(Resultado);
        objimpostosgipdto.setMesReferente_impostos(MesReferente);
        
        ImpostosGipDAO objimpostosgipdao = new ImpostosGipDAO();
        objimpostosgipdao.cadastrarImposto(objimpostosgipdto);
        
        //////////////////////////////////////////////////////////////////
        
        //esse código limpa os campos depois das funções ordenadas antes 
        Imposto1Txt.setText("");
        Imposto2Txt.setText("");
        ResultTxt.setText("");
        MesRef1ComboBox.setSelectedIndex(-1);*/
       
}
/*
CÓDIGO PENSADO POR: JEFF 
E DESENVOLVIDO POR: MATHEUS FELIPE lEITE JANUÁRIO
*/