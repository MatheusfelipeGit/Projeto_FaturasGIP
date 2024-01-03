package VIEW;

import DAO.CadastroConsumoFaturaGipDAO;
import DTO.CadastroConsumoFaturaGipDTO;
import java.awt.event.KeyEvent;
import static java.awt.image.ImageObserver.WIDTH;
import java.util.Scanner;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import java.sql.SQLException;

public class TelaCadastroConsumoFatura extends javax.swing.JFrame {

    public TelaCadastroConsumoFatura() {
        initComponents();
        AutoCompleteDecorator.decorate(MesVenComboBox);
        AutoCompleteDecorator.decorate(MesRefComboBox);
        MesVenComboBox.setSelectedIndex(-1);
        MesRefComboBox.setSelectedIndex(-1);
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CodigoBarraConTextField = new javax.swing.JTextField();
        ValorTextField = new javax.swing.JTextField();
        AnoConTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        MesVenComboBox = new javax.swing.JComboBox<>();
        MesRefComboBox = new javax.swing.JComboBox<>();
        LimparConBtn = new javax.swing.JButton();
        CadastrarConBtn = new javax.swing.JButton();
        CodBarrasRedTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        VoltarBtn = new javax.swing.JButton();
        DataCadTextField = new javax.swing.JFormattedTextField();
        KwConsumo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        CodigoBarraConTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CodigoBarraConTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoBarraConTextFieldActionPerformed(evt);
            }
        });
        CodigoBarraConTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CodigoBarraConTextFieldKeyPressed(evt);
            }
        });

        ValorTextField.setEditable(false);
        ValorTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        AnoConTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AnoConTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnoConTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Cadastro de Consumo da Fatura");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Código de Barras:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Valor:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Mês de Vencimento");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Mês Referente:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Data De Cadastro:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Ano:");

        MesVenComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro", "Diversas Atrasadas" }));
        MesVenComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MesVenComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        MesVenComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MesVenComboBoxActionPerformed(evt);
            }
        });

        MesRefComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro", "Diversas Atrasadas", "Teste" }));
        MesRefComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MesRefComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        LimparConBtn.setText("LIMPAR");
        LimparConBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LimparConBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LimparConBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparConBtnActionPerformed(evt);
            }
        });

        CadastrarConBtn.setText("CADASTRAR");
        CadastrarConBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CadastrarConBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CadastrarConBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarConBtnActionPerformed(evt);
            }
        });

        CodBarrasRedTextField.setEditable(false);
        CodBarrasRedTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CodBarrasRedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodBarrasRedTextFieldActionPerformed(evt);
            }
        });
        CodBarrasRedTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CodBarrasRedTextFieldKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Código Barras red:");

        VoltarBtn.setText("VOLTAR");
        VoltarBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        VoltarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VoltarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarBtnActionPerformed(evt);
            }
        });

        DataCadTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            DataCadTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        DataCadTextField.setToolTipText("");
        DataCadTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataCadTextFieldActionPerformed(evt);
            }
        });
        DataCadTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DataCadTextFieldKeyPressed(evt);
            }
        });

        KwConsumo.setText("0");
        KwConsumo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        KwConsumo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                KwConsumoKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setText("kw:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(LimparConBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ValorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CodigoBarraConTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(KwConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DataCadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AnoConTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CodBarrasRedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MesRefComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MesVenComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(VoltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(CadastrarConBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel1)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CodigoBarraConTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ValorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(KwConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MesVenComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MesRefComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AnoConTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DataCadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CodBarrasRedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LimparConBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VoltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CadastrarConBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
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
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CodigoBarraConTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoBarraConTextFieldActionPerformed

    }//GEN-LAST:event_CodigoBarraConTextFieldActionPerformed

    private void LimparConBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparConBtnActionPerformed

        CodigoBarraConTextField.setText("");
        ValorTextField.setText("");
        MesVenComboBox.setSelectedIndex(-1);
        MesRefComboBox.setSelectedIndex(-1);
        DataCadTextField.setText("");
        AnoConTextField.setText("");
        CodBarrasRedTextField.setText("");

    }//GEN-LAST:event_LimparConBtnActionPerformed

    private void CadastrarConBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarConBtnActionPerformed

        String codigoBarras = CodigoBarraConTextField.getText();

        if (codigoBarras.length() == 48) {
            //essa é a condição para que aceite apenas 48 dígitos, nada a mais, nada a menos     
        } else {
            JOptionPane.showMessageDialog(null, "CÓDDIGO DE BARRAS INVÁLIDO!!!" + JOptionPane.ERROR_MESSAGE);
        }

        // esse código pega o últimos 6 dígitos
        String text = CodigoBarraConTextField.getText();

        int length = text.length();
        String lastSixChars = "";

        if (length >= 6) {
            lastSixChars = text.substring(length - 6);
        } else {
            lastSixChars = text;
        }

        CodBarrasRedTextField.setText(lastSixChars);

        // esse código pega 8° até o 16° digito, pulando um.
        String textoOriginal = CodigoBarraConTextField.getText();
        int tamanhoTexto = textoOriginal.length();

        if (tamanhoTexto >= 16) {
            String caracteresOitavoaoDecimoSexto = textoOriginal.substring(7, 11).concat(textoOriginal.substring(12, 16));
            //o concat ai encima serviu para pular o digito que queriamos pular p aparecer o valor da fatura usando só o código de barras
            String ultimosDoisDigitos = caracteresOitavoaoDecimoSexto.substring(caracteresOitavoaoDecimoSexto.length() - 2);
            String parteSemUltimosDoisDigitos = caracteresOitavoaoDecimoSexto.substring(0, caracteresOitavoaoDecimoSexto.length() - 2);
            String resultadoComVirgula = parteSemUltimosDoisDigitos + "." + ultimosDoisDigitos;

            ValorTextField.setText(resultadoComVirgula);

        } else {
            ValorTextField.setText("");
        }

        /*String firstSixChars = "";
                if (length >= 48){
                    firstSixChars = text.substring( 8);
                } else {
                    firstSixChars = text;
                }

                ValorTextField.setText(firstSixChars);*/
        String CodigoBarras, Valor, Kw, MesVencimento, MesReferente, DataCadastro, Ano, CodigoBarrasRed;

        CodigoBarras = CodigoBarraConTextField.getText();
        Valor = ValorTextField.getText();
        Kw = KwConsumo.getText();
        MesVencimento = (String) MesVenComboBox.getSelectedItem();
        MesReferente = (String) MesRefComboBox.getSelectedItem();
        DataCadastro = DataCadTextField.getText();
        Ano = AnoConTextField.getText();
        CodigoBarrasRed = CodBarrasRedTextField.getText();

        CadastroConsumoFaturaGipDTO objcadastroconsumofaturagipdto = new CadastroConsumoFaturaGipDTO();

        objcadastroconsumofaturagipdto.setCodigoBarrasCon_cadastroConsumoFatura(CodigoBarras);
        objcadastroconsumofaturagipdto.setValor_cadastroConsumoFatura(Valor);
        objcadastroconsumofaturagipdto.setKw_cadastroConsumoFatura(Kw);
        objcadastroconsumofaturagipdto.setMesVencimento_cadastroConsumoFatura(MesVencimento);
        objcadastroconsumofaturagipdto.setMesReferente_cadastroConsumoFatura(MesReferente);
        objcadastroconsumofaturagipdto.setAno_cadastroConsumoFatura(Ano);
        objcadastroconsumofaturagipdto.setDataCadastro_cadastroConsumoFatura(DataCadastro);
        objcadastroconsumofaturagipdto.setCodBarrasRed_cadastroConsumoFatura(CodigoBarrasRed);

        CadastroConsumoFaturaGipDAO objcadastroconsumofaturagipdao = new CadastroConsumoFaturaGipDAO();
        objcadastroconsumofaturagipdao.cadastrarConFatura(objcadastroconsumofaturagipdto);

        CadastroConsumoFaturaGipDAO seuDAO = new CadastroConsumoFaturaGipDAO();

        try {
            seuDAO.chamarProcedure(); // Chama a procedure no DAO
            // Lógica para a inserção de dados na sua tabela, se necessário
        } catch (SQLException e) {
            // Trate exceções aqui
            e.printStackTrace();
        }

        // ambos os comandos servem para limpar os campos chamados (CodigoBarraTextField e Kw)
        CodigoBarraConTextField.setText("");
        ValorTextField.setText("");
        KwConsumo.setText("0");
        CodBarrasRedTextField.setText("");


    }//GEN-LAST:event_CadastrarConBtnActionPerformed

    private void VoltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarBtnActionPerformed
        TelaMenu telaMenu = new TelaMenu();
        telaMenu.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_VoltarBtnActionPerformed

    private void CodBarrasRedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodBarrasRedTextFieldActionPerformed

    }//GEN-LAST:event_CodBarrasRedTextFieldActionPerformed

    private void AnoConTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnoConTextFieldActionPerformed

    }//GEN-LAST:event_AnoConTextFieldActionPerformed

    private void MesVenComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MesVenComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MesVenComboBoxActionPerformed

    private void DataCadTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataCadTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataCadTextFieldActionPerformed

    private void CodBarrasRedTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CodBarrasRedTextFieldKeyPressed

    }//GEN-LAST:event_CodBarrasRedTextFieldKeyPressed

    private void DataCadTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DataCadTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            String codigoBarras = CodigoBarraConTextField.getText();

            if (codigoBarras.length() == 48) {
                //essa é a condição para que aceite apenas 48 dígitos, nada a mais, nada a menos     
            } else {
                JOptionPane.showMessageDialog(null, "CÓDDIGO DE BARRAS INVÁLIDO!!!" + JOptionPane.ERROR_MESSAGE);
            }

            String text = CodigoBarraConTextField.getText();
            int length = text.length();
            String lastSixChars = "";

            if (length >= 6) {
                lastSixChars = text.substring(length - 6);
            } else {
                lastSixChars = text;
            }

            CodBarrasRedTextField.setText(lastSixChars);

            // esse código pega 8° até o 16° digito, pulando um.
            String textoOriginal = CodigoBarraConTextField.getText();
            int tamanhoTexto = textoOriginal.length();

            if (tamanhoTexto >= 16) {
                String caracteresOitavoaoDecimoSexto = textoOriginal.substring(7, 11).concat(textoOriginal.substring(12, 16));
                //o concat ai encima serviu para pular o digito que queriamos pular p aparecer o valor da fatura usando só o código de barras
                String ultimosDoisDigitos = caracteresOitavoaoDecimoSexto.substring(caracteresOitavoaoDecimoSexto.length() - 2);
                String parteSemUltimosDoisDigitos = caracteresOitavoaoDecimoSexto.substring(0, caracteresOitavoaoDecimoSexto.length() - 2);
                String resultadoComVirgula = parteSemUltimosDoisDigitos + "." + ultimosDoisDigitos;

                ValorTextField.setText(resultadoComVirgula);

            } else {
                ValorTextField.setText("");
            }

            /*String firstSixChars = "";
                if (length >= 48){
                    firstSixChars = text.substring( 8);
                } else {
                    firstSixChars = text;
                }

                ValorTextField.setText(firstSixChars);*/
            String CodigoBarras, Valor, Kw, MesVencimento, MesReferente, DataCadastro, Ano, CodigoBarrasRed;

            CodigoBarras = CodigoBarraConTextField.getText();
            Valor = ValorTextField.getText();
            Kw = KwConsumo.getText();
            MesVencimento = (String) MesVenComboBox.getSelectedItem();
            MesReferente = (String) MesRefComboBox.getSelectedItem();
            DataCadastro = DataCadTextField.getText();
            Ano = AnoConTextField.getText();
            CodigoBarrasRed = CodBarrasRedTextField.getText();

            CadastroConsumoFaturaGipDTO objcadastroconsumofaturagipdto = new CadastroConsumoFaturaGipDTO();

            objcadastroconsumofaturagipdto.setCodigoBarrasCon_cadastroConsumoFatura(CodigoBarras);
            objcadastroconsumofaturagipdto.setValor_cadastroConsumoFatura(Valor);
            objcadastroconsumofaturagipdto.setKw_cadastroConsumoFatura(Kw);
            objcadastroconsumofaturagipdto.setMesVencimento_cadastroConsumoFatura(MesVencimento);
            objcadastroconsumofaturagipdto.setMesReferente_cadastroConsumoFatura(MesReferente);
            objcadastroconsumofaturagipdto.setAno_cadastroConsumoFatura(Ano);
            objcadastroconsumofaturagipdto.setDataCadastro_cadastroConsumoFatura(DataCadastro);
            objcadastroconsumofaturagipdto.setCodBarrasRed_cadastroConsumoFatura(CodigoBarrasRed);

            CadastroConsumoFaturaGipDAO objcadastroconsumofaturagipdao = new CadastroConsumoFaturaGipDAO();
            objcadastroconsumofaturagipdao.cadastrarConFatura(objcadastroconsumofaturagipdto);

            CadastroConsumoFaturaGipDAO seuDAO = new CadastroConsumoFaturaGipDAO();

            try {
                seuDAO.chamarProcedure(); // Chama a procedure no DAO
                // Lógica para a inserção de dados na sua tabela, se necessário
            } catch (SQLException e) {
                // Trate exceções aqui
                e.printStackTrace();
            }

            // ambos os comandos servem para limpar os campos chamados (CodigoBarraTextField e Kw)
            CodigoBarraConTextField.setText("");
            ValorTextField.setText("");
            KwConsumo.setText("0");
            CodBarrasRedTextField.setText("");

        }
    }//GEN-LAST:event_DataCadTextFieldKeyPressed

    private void KwConsumoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KwConsumoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            String codigoBarras = CodigoBarraConTextField.getText();

            if (codigoBarras.length() == 48) {
                //essa é a condição para que aceite apenas 48 dígitos, nada a mais, nada a menos     
            } else {
                JOptionPane.showMessageDialog(null, "CÓDDIGO DE BARRAS INVÁLIDO!!!" + JOptionPane.ERROR_MESSAGE);
            }

            String text = CodigoBarraConTextField.getText();
            int length = text.length();
            String lastSixChars = "";

            if (length >= 6) {
                lastSixChars = text.substring(length - 6);
            } else {
                lastSixChars = text;
            }

            CodBarrasRedTextField.setText(lastSixChars);

            // esse código pega 8° até o 16° digito, pulando um.
            String textoOriginal = CodigoBarraConTextField.getText();
            int tamanhoTexto = textoOriginal.length();

            if (tamanhoTexto >= 16) {
                String caracteresOitavoaoDecimoSexto = textoOriginal.substring(7, 11).concat(textoOriginal.substring(12, 16));
                //o concat ai encima serviu para pular o digito que queriamos pular p aparecer o valor da fatura usando só o código de barras
                String ultimosDoisDigitos = caracteresOitavoaoDecimoSexto.substring(caracteresOitavoaoDecimoSexto.length() - 2);
                String parteSemUltimosDoisDigitos = caracteresOitavoaoDecimoSexto.substring(0, caracteresOitavoaoDecimoSexto.length() - 2);
                String resultadoComVirgula = parteSemUltimosDoisDigitos + "." + ultimosDoisDigitos;

                ValorTextField.setText(resultadoComVirgula);

            } else {
                ValorTextField.setText("");
            }

            /*String firstSixChars = "";
                if (length >= 48){
                    firstSixChars = text.substring( 8);
                } else {
                    firstSixChars = text;
                }

                ValorTextField.setText(firstSixChars);*/
            String CodigoBarras, Valor, Kw, MesVencimento, MesReferente, DataCadastro, Ano, CodigoBarrasRed;

            CodigoBarras = CodigoBarraConTextField.getText();
            Valor = ValorTextField.getText();
            Kw = KwConsumo.getText();
            MesVencimento = (String) MesVenComboBox.getSelectedItem();
            MesReferente = (String) MesRefComboBox.getSelectedItem();
            DataCadastro = DataCadTextField.getText();
            Ano = AnoConTextField.getText();
            CodigoBarrasRed = CodBarrasRedTextField.getText();

            CadastroConsumoFaturaGipDTO objcadastroconsumofaturagipdto = new CadastroConsumoFaturaGipDTO();

            objcadastroconsumofaturagipdto.setCodigoBarrasCon_cadastroConsumoFatura(CodigoBarras);
            objcadastroconsumofaturagipdto.setValor_cadastroConsumoFatura(Valor);
            objcadastroconsumofaturagipdto.setKw_cadastroConsumoFatura(Kw);
            objcadastroconsumofaturagipdto.setMesVencimento_cadastroConsumoFatura(MesVencimento);
            objcadastroconsumofaturagipdto.setMesReferente_cadastroConsumoFatura(MesReferente);
            objcadastroconsumofaturagipdto.setAno_cadastroConsumoFatura(Ano);
            objcadastroconsumofaturagipdto.setDataCadastro_cadastroConsumoFatura(DataCadastro);
            objcadastroconsumofaturagipdto.setCodBarrasRed_cadastroConsumoFatura(CodigoBarrasRed);

            CadastroConsumoFaturaGipDAO objcadastroconsumofaturagipdao = new CadastroConsumoFaturaGipDAO();
            objcadastroconsumofaturagipdao.cadastrarConFatura(objcadastroconsumofaturagipdto);

            CadastroConsumoFaturaGipDAO seuDAO = new CadastroConsumoFaturaGipDAO();

            try {
                seuDAO.chamarProcedure(); // Chama a procedure no DAO
                // Lógica para a inserção de dados na sua tabela, se necessário
            } catch (SQLException e) {
                // Trate exceções aqui
                e.printStackTrace();
            }

            // ambos os comandos servem para limpar os campos chamados (CodigoBarraTextField e Kw)
            CodigoBarraConTextField.setText("");
            ValorTextField.setText("");
            KwConsumo.setText("0");
            CodBarrasRedTextField.setText("");

        }
    }//GEN-LAST:event_KwConsumoKeyPressed

    private void CodigoBarraConTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CodigoBarraConTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            String codigoBarras = CodigoBarraConTextField.getText();

            if (codigoBarras.length() == 48) {
                //essa é a condição para que aceite apenas 48 dígitos, nada a mais, nada a menos     
            } else {
                JOptionPane.showMessageDialog(null, "CÓDDIGO DE BARRAS INVÁLIDO!!!" + JOptionPane.ERROR_MESSAGE);
            }

            String text = CodigoBarraConTextField.getText();
            int length = text.length();
            String lastSixChars = "";

            if (length >= 6) {
                lastSixChars = text.substring(length - 6);
            } else {
                lastSixChars = text;
            }

            CodBarrasRedTextField.setText(lastSixChars);

            // esse código pega 8° até o 16° digito, pulando um.
            String textoOriginal = CodigoBarraConTextField.getText();
            int tamanhoTexto = textoOriginal.length();

            if (tamanhoTexto >= 16) {
                String caracteresOitavoaoDecimoSexto = textoOriginal.substring(7, 11).concat(textoOriginal.substring(12, 16));
                //o concat ai encima serviu para pular o digito que queriamos pular p aparecer o valor da fatura usando só o código de barras
                String ultimosDoisDigitos = caracteresOitavoaoDecimoSexto.substring(caracteresOitavoaoDecimoSexto.length() - 2);
                String parteSemUltimosDoisDigitos = caracteresOitavoaoDecimoSexto.substring(0, caracteresOitavoaoDecimoSexto.length() - 2);
                String resultadoComVirgula = parteSemUltimosDoisDigitos + "." + ultimosDoisDigitos;

                ValorTextField.setText(resultadoComVirgula);

            } else {
                ValorTextField.setText("");
            }

            /*String firstSixChars = "";
                if (length >= 48){
                    firstSixChars = text.substring( 8);
                } else {
                    firstSixChars = text;
                }

                ValorTextField.setText(firstSixChars);*/
            String CodigoBarras, Valor, Kw, MesVencimento, MesReferente, DataCadastro, Ano, CodigoBarrasRed;

            CodigoBarras = CodigoBarraConTextField.getText();
            Valor = ValorTextField.getText();
            Kw = KwConsumo.getText();
            MesVencimento = (String) MesVenComboBox.getSelectedItem();
            MesReferente = (String) MesRefComboBox.getSelectedItem();
            DataCadastro = DataCadTextField.getText();
            Ano = AnoConTextField.getText();
            CodigoBarrasRed = CodBarrasRedTextField.getText();

            CadastroConsumoFaturaGipDTO objcadastroconsumofaturagipdto = new CadastroConsumoFaturaGipDTO();

            objcadastroconsumofaturagipdto.setCodigoBarrasCon_cadastroConsumoFatura(CodigoBarras);
            objcadastroconsumofaturagipdto.setValor_cadastroConsumoFatura(Valor);
            objcadastroconsumofaturagipdto.setKw_cadastroConsumoFatura(Kw);
            objcadastroconsumofaturagipdto.setMesVencimento_cadastroConsumoFatura(MesVencimento);
            objcadastroconsumofaturagipdto.setMesReferente_cadastroConsumoFatura(MesReferente);
            objcadastroconsumofaturagipdto.setAno_cadastroConsumoFatura(Ano);
            objcadastroconsumofaturagipdto.setDataCadastro_cadastroConsumoFatura(DataCadastro);
            objcadastroconsumofaturagipdto.setCodBarrasRed_cadastroConsumoFatura(CodigoBarrasRed);

            CadastroConsumoFaturaGipDAO objcadastroconsumofaturagipdao = new CadastroConsumoFaturaGipDAO();
            objcadastroconsumofaturagipdao.cadastrarConFatura(objcadastroconsumofaturagipdto);

            CadastroConsumoFaturaGipDAO seuDAO = new CadastroConsumoFaturaGipDAO();

            try {
                seuDAO.chamarProcedure(); // Chama a procedure no DAO
                // Lógica para a inserção de dados na sua tabela, se necessário
            } catch (SQLException e) {
                // Trate exceções aqui
                e.printStackTrace();
            }

            // ambos os comandos servem para limpar os campos chamados (CodigoBarraTextField e Kw)
            CodigoBarraConTextField.setText("");
            ValorTextField.setText("");
            KwConsumo.setText("0");
            CodBarrasRedTextField.setText("");

        }
    }//GEN-LAST:event_CodigoBarraConTextFieldKeyPressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroConsumoFatura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AnoConTextField;
    private javax.swing.JButton CadastrarConBtn;
    private javax.swing.JTextField CodBarrasRedTextField;
    private javax.swing.JTextField CodigoBarraConTextField;
    private javax.swing.JFormattedTextField DataCadTextField;
    private javax.swing.JTextField KwConsumo;
    private javax.swing.JButton LimparConBtn;
    private javax.swing.JComboBox<String> MesRefComboBox;
    private javax.swing.JComboBox<String> MesVenComboBox;
    private javax.swing.JTextField ValorTextField;
    private javax.swing.JButton VoltarBtn;
    private javax.swing.JLabel jLabel1;
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

    //código de recuperaçãoo, segurança.
    /*String text = CodigoBarraConTextField.getText();
                int length = text.length();
                String lastSixChars = "";

                if (length >= 6) {
                    lastSixChars = text.substring(length - 6);
                } else {
                    lastSixChars = text;
                }

                CodBarrasRedTextField.setText(lastSixChars); 
                
                String textoOriginal = CodigoBarraConTextField.getText();
                int tamanhoTexto = textoOriginal.length();
                
                if(tamanhoTexto >= 16) {
                String caracteresOitavoaoDecimoSexto = textoOriginal.substring(7,11).concat(textoOriginal.substring(12,16));
                String ultimosDoisDigitos = caracteresOitavoaoDecimoSexto.substring(caracteresOitavoaoDecimoSexto.length() - 2);
                   String parteSemUltimosDoisDigitos = caracteresOitavoaoDecimoSexto.substring(0, caracteresOitavoaoDecimoSexto.length() - 2);
                   String resultadoComVirgula = parteSemUltimosDoisDigitos + "." + ultimosDoisDigitos;
                   
                  
                ValorTextField.setText(resultadoComVirgula);
                
                }else{
                    ValorTextField.setText("");
                }
                
                String firstSixChars = "";
                if (length >= 48){
                    firstSixChars = text.substring( 8);
                } else {
                    firstSixChars = text;
                }

                ValorTextField.setText(firstSixChars);
                
                
               
                
        
        String CodigoBarras, Valor, MesVencimento, MesReferente, DataCadastro, Ano, CodigoBarrasRed;
        
        CodigoBarras = CodigoBarraConTextField.getText();
        Valor = ValorTextField.getText();
        MesVencimento = (String) MesVenComboBox.getSelectedItem();
        MesReferente = (String) MesRefComboBox.getSelectedItem();
        DataCadastro = DataCadTextField.getText();
        Ano = AnoConTextField.getText();
        CodigoBarrasRed = CodBarrasRedTextField.getText();
        
        
        CadastroConsumoFaturaGipDTO objcadastroconsumofaturagipdto = new CadastroConsumoFaturaGipDTO();
        
        objcadastroconsumofaturagipdto.setCodigoBarrasCon_cadastroConsumoFatura(CodigoBarras);
        objcadastroconsumofaturagipdto.setValor_cadastroConsumoFatura(Valor);
        objcadastroconsumofaturagipdto.setMesVencimento_cadastroConsumoFatura(MesVencimento);
        objcadastroconsumofaturagipdto.setMesReferente_cadastroConsumoFatura(MesReferente);
        objcadastroconsumofaturagipdto.setDataCadastro_cadastroConsumoFatura(DataCadastro);
        objcadastroconsumofaturagipdto.setAno_cadastroConsumoFatura(Ano);
        objcadastroconsumofaturagipdto.setCodBarrasRed_cadastroConsumoFatura(CodigoBarrasRed);
        
        
        
        CadastroConsumoFaturaGipDAO objcadastroconsumofaturagipdao = new CadastroConsumoFaturaGipDAO();
        objcadastroconsumofaturagipdao.cadastrarConFatura(objcadastroconsumofaturagipdto);
        
        

       //esse código serve para exibir essa mensagem 
       CodigoBarraConTextField.setText("");
       ValorTextField.setText("");
       // ambos os comandos servem para limpar os campos chamados (CodigoBarraTextField e Kw)
       CodBarrasRedTextField.setText("");
       
       
       
     */
}
/*
CÓDIGO PENSADO POR: JEFF 
E DESENVOLVIDO POR: MATHEUS FELIPE lEITE JANUÁRIO
*/
