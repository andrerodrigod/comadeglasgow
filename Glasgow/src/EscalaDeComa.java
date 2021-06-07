/**
 *
 * @author RODRIGO
 */
import javax.swing.JOptionPane;
public class EscalaDeComa extends javax.swing.JFrame {


    public EscalaDeComa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTNverificar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        OCaixa1 = new javax.swing.JCheckBox();
        OCaixa2 = new javax.swing.JCheckBox();
        OcularLB = new javax.swing.JLabel();
        VerbalLB = new javax.swing.JLabel();
        MotorLB = new javax.swing.JLabel();
        OCaixa3 = new javax.swing.JCheckBox();
        OCaixa4 = new javax.swing.JCheckBox();
        VCaixa1 = new javax.swing.JCheckBox();
        VCaixa2 = new javax.swing.JCheckBox();
        VCaixa3 = new javax.swing.JCheckBox();
        VCaixa4 = new javax.swing.JCheckBox();
        VCaixa5 = new javax.swing.JCheckBox();
        BTNverificar2 = new javax.swing.JButton();
        MCaixa1 = new javax.swing.JCheckBox();
        MCaixa2 = new javax.swing.JCheckBox();
        MCaixa3 = new javax.swing.JCheckBox();
        MCaixa4 = new javax.swing.JCheckBox();
        MCaixa5 = new javax.swing.JCheckBox();
        MCaixa6 = new javax.swing.JCheckBox();
        BTNverificar1 = new javax.swing.JButton();
        BTNverificar3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        num1 = new javax.swing.JTextField();
        num2 = new javax.swing.JTextField();
        num3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        labelstatus = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        BTNverificar.setText("Verificar");
        BTNverificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNverificarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Escala de Coma de Glasgow "));

        OCaixa1.setText("Espontânea");
        OCaixa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OCaixa1ActionPerformed(evt);
            }
        });

        OCaixa2.setText("À voz");
        OCaixa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OCaixa2ActionPerformed(evt);
            }
        });

        OcularLB.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        OcularLB.setText("ABERTURA OCULAR");
        OcularLB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        VerbalLB.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        VerbalLB.setText("RESPOSTA VERBAL");
        VerbalLB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        MotorLB.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        MotorLB.setText("RESPOSTA MOTORA");
        MotorLB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        OCaixa3.setText("À dor");
        OCaixa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OCaixa3ActionPerformed(evt);
            }
        });

        OCaixa4.setText("Nenhuma");
        OCaixa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OCaixa4ActionPerformed(evt);
            }
        });

        VCaixa1.setText("Orientado");
        VCaixa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VCaixa1ActionPerformed(evt);
            }
        });

        VCaixa2.setText("Confuso");
        VCaixa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VCaixa2ActionPerformed(evt);
            }
        });

        VCaixa3.setText("Palavras Inapropriadas");
        VCaixa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VCaixa3ActionPerformed(evt);
            }
        });

        VCaixa4.setText("Palavras incompreensivas");
        VCaixa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VCaixa4ActionPerformed(evt);
            }
        });

        VCaixa5.setText("Nenhuma");
        VCaixa5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VCaixa5ActionPerformed(evt);
            }
        });

        BTNverificar2.setText("Verificar");
        BTNverificar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNverificar2ActionPerformed(evt);
            }
        });

        MCaixa1.setText("Obedece comandos");
        MCaixa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCaixa1ActionPerformed(evt);
            }
        });

        MCaixa2.setText("Localiza dor");
        MCaixa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCaixa2ActionPerformed(evt);
            }
        });

        MCaixa3.setText("Movimento de retirada");
        MCaixa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCaixa3ActionPerformed(evt);
            }
        });

        MCaixa4.setText("Flexão anormal");
        MCaixa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCaixa4ActionPerformed(evt);
            }
        });

        MCaixa5.setText("Extensão anormal");
        MCaixa5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCaixa5ActionPerformed(evt);
            }
        });

        MCaixa6.setText("Nenhuma");
        MCaixa6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCaixa6ActionPerformed(evt);
            }
        });

        BTNverificar1.setText("Verificar");
        BTNverificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNverificar1ActionPerformed(evt);
            }
        });

        BTNverificar3.setText("Verificar");
        BTNverificar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNverificar3ActionPerformed(evt);
            }
        });

        jTextPane1.setEditable(false);
        jTextPane1.setText("        Somador de Glasgow");
        jScrollPane1.setViewportView(jTextPane1);

        jLabel1.setText("Salvar valor ocular:");

        jLabel2.setText("Salvar valor verbal:");

        jLabel3.setText("Salvar valor motora:");

        num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel4.setText("  Resultado");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelstatus.setText("null");

        jButton3.setText("Somar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Sair");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Limpar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(OCaixa2)
                                    .addComponent(BTNverificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OcularLB))
                                .addGap(105, 105, 105)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BTNverificar2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(VCaixa1)
                                    .addComponent(VCaixa2)
                                    .addComponent(VCaixa3)
                                    .addComponent(VCaixa4)
                                    .addComponent(VCaixa5)
                                    .addComponent(VerbalLB)))
                            .addComponent(OCaixa1)
                            .addComponent(OCaixa4)
                            .addComponent(OCaixa3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(207, 207, 207)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BTNverificar3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MCaixa1)
                            .addComponent(MCaixa2)
                            .addComponent(MCaixa3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MCaixa4)
                            .addComponent(MCaixa5)
                            .addComponent(MCaixa6)
                            .addComponent(MotorLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(23, 23, 23))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(labelstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OcularLB, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VerbalLB, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MotorLB, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OCaixa1)
                    .addComponent(VCaixa1)
                    .addComponent(MCaixa1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OCaixa2)
                    .addComponent(VCaixa2)
                    .addComponent(MCaixa2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OCaixa3)
                    .addComponent(VCaixa3)
                    .addComponent(MCaixa3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OCaixa4)
                    .addComponent(VCaixa4)
                    .addComponent(MCaixa4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VCaixa5)
                    .addComponent(MCaixa5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MCaixa6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTNverificar3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BTNverificar2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BTNverificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12)
                        .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(7, 7, 7)
                        .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNverificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNverificarActionPerformed

        
       
    }//GEN-LAST:event_BTNverificarActionPerformed

    private void BTNverificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNverificar1ActionPerformed
        if(OCaixa1.isSelected()){
            JOptionPane.showMessageDialog(null ,"Valor Ocular = 4","ABERTURA OCULAR",JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null ,"Salve esse valor.","ABERTURA OCULAR",JOptionPane.WARNING_MESSAGE);}
        if(OCaixa2.isSelected()){
            JOptionPane.showMessageDialog(null ,"Valor Ocular = 3","ABERTURA OCULAR",JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null ,"Salve esse valor.","ABERTURA OCULAR",JOptionPane.WARNING_MESSAGE);}
        if(OCaixa3.isSelected()){
            JOptionPane.showMessageDialog(null ,"Valor Ocular = 2","ABERTURA OCULAR",JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null ,"Salve esse valor.","ABERTURA OCULAR",JOptionPane.WARNING_MESSAGE);}
        if(OCaixa4.isSelected()){
            JOptionPane.showMessageDialog(null ,"Valor Ocular = 1","ABERTURA OCULAR",JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null ,"Salve esse valor.","ABERTURA OCULAR",JOptionPane.WARNING_MESSAGE);}
    }//GEN-LAST:event_BTNverificar1ActionPerformed

    private void BTNverificar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNverificar2ActionPerformed
        if(VCaixa1.isSelected()){
            JOptionPane.showMessageDialog(null ,"Resposta verbal = 5","RESPOSTA VERBAL",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null ,"Salve esse valor.","RESPOSTA VERBAL",JOptionPane.WARNING_MESSAGE);}
        if(VCaixa2.isSelected()){
            JOptionPane.showMessageDialog(null ,"Resposta verbal = 4","RESPOSTA VERBAL",JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null ,"Salve esse valor.","RESPOSTA VERBAL",JOptionPane.WARNING_MESSAGE);}
        if(VCaixa3.isSelected()){
            JOptionPane.showMessageDialog(null ,"Resposta verbal = 3","RESPOSTA VERBAL",JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null ,"Salve esse valor.","RESPOSTA VERBAL",JOptionPane.WARNING_MESSAGE);}
        if(VCaixa4.isSelected()){
            JOptionPane.showMessageDialog(null ,"Resposta verbal = 2","RESPOSTA VERBAL",JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null ,"Salve esse valor.","RESPOSTA VERBAL",JOptionPane.WARNING_MESSAGE);}
        if(VCaixa5.isSelected()){
            JOptionPane.showMessageDialog(null ,"Resposta verbal = 1","RESPOSTA VERBAL",JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null ,"Salve esse valor.","RESPOSTA VERBAL",JOptionPane.WARNING_MESSAGE);}
    }//GEN-LAST:event_BTNverificar2ActionPerformed

    private void VCaixa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VCaixa5ActionPerformed
        VCaixa1.setSelected(false);
        VCaixa2.setSelected(false);
        VCaixa3.setSelected(false);
        VCaixa4.setSelected(false);
    }//GEN-LAST:event_VCaixa5ActionPerformed

    private void VCaixa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VCaixa4ActionPerformed
        VCaixa1.setSelected(false);
        VCaixa2.setSelected(false);
        VCaixa3.setSelected(false);
        VCaixa5.setSelected(false);
    }//GEN-LAST:event_VCaixa4ActionPerformed

    private void VCaixa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VCaixa3ActionPerformed
        VCaixa1.setSelected(false);
        VCaixa2.setSelected(false);
        VCaixa4.setSelected(false);
        VCaixa5.setSelected(false);
    }//GEN-LAST:event_VCaixa3ActionPerformed

    private void VCaixa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VCaixa2ActionPerformed
        VCaixa1.setSelected(false);
        VCaixa3.setSelected(false);
        VCaixa4.setSelected(false);
        VCaixa5.setSelected(false);
    }//GEN-LAST:event_VCaixa2ActionPerformed

    private void VCaixa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VCaixa1ActionPerformed
        VCaixa2.setSelected(false);
        VCaixa3.setSelected(false);
        VCaixa4.setSelected(false);
        VCaixa5.setSelected(false);
    }//GEN-LAST:event_VCaixa1ActionPerformed

    private void OCaixa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OCaixa4ActionPerformed
        OCaixa3.setSelected(false);
        OCaixa1.setSelected(false);
        OCaixa2.setSelected(false);
    }//GEN-LAST:event_OCaixa4ActionPerformed

    private void OCaixa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OCaixa3ActionPerformed
        OCaixa4.setSelected(false);
        OCaixa1.setSelected(false);
        OCaixa2.setSelected(false);
    }//GEN-LAST:event_OCaixa3ActionPerformed

    private void OCaixa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OCaixa2ActionPerformed
        OCaixa1.setSelected(false);
        OCaixa3.setSelected(false);
        OCaixa4.setSelected(false);
    }//GEN-LAST:event_OCaixa2ActionPerformed

    private void OCaixa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OCaixa1ActionPerformed

        OCaixa2.setSelected(false);
        OCaixa3.setSelected(false);
        OCaixa4.setSelected(false);

    }//GEN-LAST:event_OCaixa1ActionPerformed

    private void MCaixa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCaixa1ActionPerformed
    MCaixa2.setSelected(false);
    MCaixa3.setSelected(false);
    MCaixa4.setSelected(false);
    MCaixa5.setSelected(false);
    MCaixa6.setSelected(false);
    }//GEN-LAST:event_MCaixa1ActionPerformed

    private void MCaixa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCaixa2ActionPerformed
    MCaixa1.setSelected(false);
    MCaixa3.setSelected(false);
    MCaixa4.setSelected(false);
    MCaixa5.setSelected(false);
    MCaixa6.setSelected(false);
    }//GEN-LAST:event_MCaixa2ActionPerformed

    private void MCaixa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCaixa3ActionPerformed
    MCaixa1.setSelected(false);
    MCaixa2.setSelected(false);
    MCaixa4.setSelected(false);
    MCaixa5.setSelected(false);
    MCaixa6.setSelected(false);
    }//GEN-LAST:event_MCaixa3ActionPerformed

    private void MCaixa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCaixa4ActionPerformed
    MCaixa1.setSelected(false);
    MCaixa2.setSelected(false);
    MCaixa3.setSelected(false);
    MCaixa5.setSelected(false);
    MCaixa6.setSelected(false);
    }//GEN-LAST:event_MCaixa4ActionPerformed

    private void MCaixa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCaixa5ActionPerformed
    MCaixa1.setSelected(false);
    MCaixa2.setSelected(false);
    MCaixa3.setSelected(false);
    MCaixa4.setSelected(false);
    MCaixa6.setSelected(false);
    }//GEN-LAST:event_MCaixa5ActionPerformed

    private void MCaixa6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCaixa6ActionPerformed
    MCaixa1.setSelected(false);
    MCaixa3.setSelected(false);
    MCaixa4.setSelected(false);
    MCaixa5.setSelected(false); 
    MCaixa2.setSelected(false);
    }//GEN-LAST:event_MCaixa6ActionPerformed

    private void BTNverificar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNverificar3ActionPerformed
    if(MCaixa1.isSelected()){
            JOptionPane.showMessageDialog(null ,"Resposta motora = 6","RESPOSTA MOTORA",JOptionPane.WARNING_MESSAGE);
    JOptionPane.showMessageDialog(null ,"Salve esse valor.","RESPOSTA MOTORA",JOptionPane.WARNING_MESSAGE);}
    if(MCaixa2.isSelected()){
            JOptionPane.showMessageDialog(null ,"Resposta motora = 5","RESPOSTA MOTORA",JOptionPane.WARNING_MESSAGE);
    JOptionPane.showMessageDialog(null ,"Salve esse valor.","RESPOSTA MOTORA",JOptionPane.WARNING_MESSAGE);}
    if(MCaixa3.isSelected()){
            JOptionPane.showMessageDialog(null ,"Resposta motora = 4","RESPOSTA MOTORA",JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null ,"Salve esse valor.","RESPOSTA MOTORA",JOptionPane.WARNING_MESSAGE);}
    if(MCaixa4.isSelected()){
            JOptionPane.showMessageDialog(null ,"Resposta motora = 3","RESPOSTA MOTORA",JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null ,"Salve esse valor.","RESPOSTA MOTORA",JOptionPane.WARNING_MESSAGE);}
    if(MCaixa5.isSelected()){
            JOptionPane.showMessageDialog(null ,"Resposta motora = 2","RESPOSTA MOTORA",JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null ,"Salve esse valor.","RESPOSTA MOTORA",JOptionPane.WARNING_MESSAGE);}
    if(MCaixa6.isSelected()){
            JOptionPane.showMessageDialog(null ,"Resposta motora = 1","RESPOSTA MOTORA",JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null ,"Salve esse valor.","RESPOSTA MOTORA",JOptionPane.WARNING_MESSAGE);}
    
    }//GEN-LAST:event_BTNverificar3ActionPerformed

    private void num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    num1.setText("");
    num2.setText("");
    num3.setText("");
    num1.requestFocus();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    int n1 = Integer.parseInt(num1.getText());
    int n2 = Integer.parseInt(num2.getText());
    int n3 = Integer.parseInt(num3.getText());
    int resultado = n1+n2+n3;
    labelstatus.setText(String.valueOf(resultado));
    if(resultado>15){
     JOptionPane.showMessageDialog(null ,"Resultado não existente","Somador de Glasgow",JOptionPane.WARNING_MESSAGE);   
    }
    
    }//GEN-LAST:event_jButton3ActionPerformed


    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EscalaDeComa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EscalaDeComa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EscalaDeComa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EscalaDeComa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EscalaDeComa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNverificar;
    private javax.swing.JButton BTNverificar1;
    private javax.swing.JButton BTNverificar2;
    private javax.swing.JButton BTNverificar3;
    private javax.swing.JCheckBox MCaixa1;
    private javax.swing.JCheckBox MCaixa2;
    private javax.swing.JCheckBox MCaixa3;
    private javax.swing.JCheckBox MCaixa4;
    private javax.swing.JCheckBox MCaixa5;
    private javax.swing.JCheckBox MCaixa6;
    private javax.swing.JLabel MotorLB;
    private javax.swing.JCheckBox OCaixa1;
    private javax.swing.JCheckBox OCaixa2;
    private javax.swing.JCheckBox OCaixa3;
    private javax.swing.JCheckBox OCaixa4;
    private javax.swing.JLabel OcularLB;
    private javax.swing.JCheckBox VCaixa1;
    private javax.swing.JCheckBox VCaixa2;
    private javax.swing.JCheckBox VCaixa3;
    private javax.swing.JCheckBox VCaixa4;
    private javax.swing.JCheckBox VCaixa5;
    private javax.swing.JLabel VerbalLB;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel labelstatus;
    private javax.swing.JTextField num1;
    private javax.swing.JTextField num2;
    private javax.swing.JTextField num3;
    // End of variables declaration//GEN-END:variables
}
