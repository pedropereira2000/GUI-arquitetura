/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.utfpr.pedro.gui.arquitetura.views;

<<<<<<< HEAD
import java.util.ArrayList;

=======
>>>>>>> f729e9855fc1179da717f3edf31d5cc13715371c
/**
 *
 * @author pedropereira
 */
public class EquilibrioCorrecaoCTC extends javax.swing.JFrame {
<<<<<<< HEAD
    
    public static int texturaSolo = 1;
    private ControleOutrasFontes controleOutrasFontes = new ControleOutrasFontes();
    private ArrayList tipoSolo=new ArrayList();
=======

>>>>>>> f729e9855fc1179da717f3edf31d5cc13715371c
    /**
     * Creates new form EquilibrioCorrecaoCTC
     */
    public EquilibrioCorrecaoCTC() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
<<<<<<< HEAD
        lblTipoPlantio = new javax.swing.JLabel();
        lblTipoSolo = new javax.swing.JLabel();
        txtProdutor = new javax.swing.JTextField();
        txtMunicipio = new javax.swing.JTextField();
        txtTalhao = new javax.swing.JTextField();
=======
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtProdutor = new javax.swing.JTextField();
        txtMunicipio = new javax.swing.JTextField();
        txtTalhao = new javax.swing.JTextField();
        txtTexturaS = new javax.swing.JTextField();
>>>>>>> f729e9855fc1179da717f3edf31d5cc13715371c
        txtRespTecnico = new javax.swing.JTextField();
        txtResultSolo = new javax.swing.JTextField();
        txtLote = new javax.swing.JTextField();
        txtAreaTalhao = new javax.swing.JTextField();
<<<<<<< HEAD
=======
        txtSistCultivo = new javax.swing.JTextField();
>>>>>>> f729e9855fc1179da717f3edf31d5cc13715371c
        txtProfSolos = new javax.swing.JTextField();
        txtAreaTotal = new javax.swing.JTextField();
        ftxtData = new javax.swing.JFormattedTextField();
        txtMatLote = new javax.swing.JTextField();
        lblArgiloso = new javax.swing.JLabel();
<<<<<<< HEAD
        cbxTexturaSolo = new javax.swing.JComboBox<>();
        cbxSistemaCultivo = new javax.swing.JComboBox<>();
=======
>>>>>>> f729e9855fc1179da717f3edf31d5cc13715371c
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mntTeor = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel1.setText("SISTEMA PARA EQUILÍBRIO E CORREÇÃO DE SOLO - CADASTRO");

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel2.setText("Produtor:");

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel3.setText("Município:");

        jLabel4.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel4.setText("Talhão:");

        jLabel5.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel5.setText("Textura Solo:");

        jLabel6.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel6.setText("Responsável Técnico:");

        jLabel7.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel7.setText("Resultado da análise de solos N°:");

        jLabel8.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel8.setText("Data:");

        jLabel9.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel9.setText("Lote:");

        jLabel10.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel10.setText("Área do talhão (ha):");

        jLabel11.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel11.setText("Sistema de Cultivo:");

        jLabel12.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel12.setText("Profundidade da amostra de solos:");

        jLabel13.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel13.setText("Área Total (ha):");

        jLabel14.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel14.setText("Matrícula do lote:");

<<<<<<< HEAD
        lblTipoPlantio.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lblTipoPlantio.setText("Plantio Direto");

        lblTipoSolo.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lblTipoSolo.setText("Argiloso");
=======
        jLabel15.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel15.setText("Plantio Direto");

        jLabel16.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel16.setText("Argiloso");
>>>>>>> f729e9855fc1179da717f3edf31d5cc13715371c

        txtProdutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdutorActionPerformed(evt);
            }
        });

        try {
            ftxtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtData.setToolTipText("");

        lblArgiloso.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblArgiloso.setForeground(new java.awt.Color(51, 153, 255));
        lblArgiloso.setText("+ 40 de argila");
        lblArgiloso.setToolTipText("");

<<<<<<< HEAD
        cbxTexturaSolo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        cbxTexturaSolo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxTexturaSoloItemStateChanged(evt);
            }
        });
        cbxTexturaSolo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTexturaSoloActionPerformed(evt);
            }
        });

        cbxSistemaCultivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        cbxSistemaCultivo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxSistemaCultivoItemStateChanged(evt);
            }
        });

=======
>>>>>>> f729e9855fc1179da717f3edf31d5cc13715371c
        jMenu1.setText("Teores");

        mntTeor.setText("Gerenciar Teor");
        mntTeor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntTeorActionPerformed(evt);
            }
        });
        jMenu1.add(mntTeor);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Correção e Fonte");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
<<<<<<< HEAD
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxTexturaSolo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
=======
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtTexturaS, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
>>>>>>> f729e9855fc1179da717f3edf31d5cc13715371c
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRespTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTalhao, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50)
<<<<<<< HEAD
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProfSolos, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
=======
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSistCultivo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProfSolos, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
>>>>>>> f729e9855fc1179da717f3edf31d5cc13715371c
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtResultSolo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMatLote))
                            .addGroup(layout.createSequentialGroup()
<<<<<<< HEAD
                                .addComponent(lblTipoSolo)
=======
                                .addComponent(jLabel16)
>>>>>>> f729e9855fc1179da717f3edf31d5cc13715371c
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblArgiloso, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
                            .addComponent(lblTipoPlantio)
=======
                            .addComponent(jLabel15)
>>>>>>> f729e9855fc1179da717f3edf31d5cc13715371c
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAreaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMunicipio, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                                    .addComponent(txtProdutor))
                                .addGap(50, 50, 50)
<<<<<<< HEAD
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbxSistemaCultivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtAreaTalhao))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtLote, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(ftxtData))))))))
=======
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAreaTalhao))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtLote, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ftxtData)))))))
>>>>>>> f729e9855fc1179da717f3edf31d5cc13715371c
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(txtProdutor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftxtData, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(txtMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLote, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(txtTalhao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAreaTalhao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
<<<<<<< HEAD
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel11)
                    .addComponent(cbxTexturaSolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxSistemaCultivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
=======
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel11)
                    .addComponent(txtTexturaS, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSistCultivo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
>>>>>>> f729e9855fc1179da717f3edf31d5cc13715371c
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12)
                    .addComponent(txtRespTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProfSolos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtResultSolo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtAreaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
<<<<<<< HEAD
                    .addComponent(lblTipoPlantio)
                    .addComponent(txtMatLote, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoSolo)
=======
                    .addComponent(jLabel15)
                    .addComponent(txtMatLote, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
>>>>>>> f729e9855fc1179da717f3edf31d5cc13715371c
                    .addComponent(lblArgiloso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtProdutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdutorActionPerformed

    private void mntTeorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntTeorActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciarTeor().setVisible(true);
            }
        });
    }//GEN-LAST:event_mntTeorActionPerformed

<<<<<<< HEAD
    private void cbxTexturaSoloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTexturaSoloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTexturaSoloActionPerformed

    private void cbxTexturaSoloItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxTexturaSoloItemStateChanged
        texturaSolo=Integer.parseInt(cbxTexturaSolo.getSelectedItem().toString());
        tipoSolo = controleOutrasFontes.tipoSolo(texturaSolo);
        lblTipoSolo.setText(String.valueOf(tipoSolo.get(0)));
        lblArgiloso.setText(String.valueOf(tipoSolo.get(1)));
    }//GEN-LAST:event_cbxTexturaSoloItemStateChanged

    private void cbxSistemaCultivoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxSistemaCultivoItemStateChanged
        lblTipoPlantio.setText(controleOutrasFontes.tipoPlantio(Integer.parseInt(cbxSistemaCultivo.getSelectedItem().toString())));
    }//GEN-LAST:event_cbxSistemaCultivoItemStateChanged

=======
>>>>>>> f729e9855fc1179da717f3edf31d5cc13715371c
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
            java.util.logging.Logger.getLogger(EquilibrioCorrecaoCTC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EquilibrioCorrecaoCTC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EquilibrioCorrecaoCTC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EquilibrioCorrecaoCTC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EquilibrioCorrecaoCTC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
<<<<<<< HEAD
    private javax.swing.JComboBox<String> cbxSistemaCultivo;
    private javax.swing.JComboBox<String> cbxTexturaSolo;
=======
>>>>>>> f729e9855fc1179da717f3edf31d5cc13715371c
    private javax.swing.JFormattedTextField ftxtData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
<<<<<<< HEAD
=======
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
>>>>>>> f729e9855fc1179da717f3edf31d5cc13715371c
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblArgiloso;
<<<<<<< HEAD
    private javax.swing.JLabel lblTipoPlantio;
    private javax.swing.JLabel lblTipoSolo;
=======
>>>>>>> f729e9855fc1179da717f3edf31d5cc13715371c
    private javax.swing.JMenuItem mntTeor;
    private javax.swing.JTextField txtAreaTalhao;
    private javax.swing.JTextField txtAreaTotal;
    private javax.swing.JTextField txtLote;
    private javax.swing.JTextField txtMatLote;
    private javax.swing.JTextField txtMunicipio;
    private javax.swing.JTextField txtProdutor;
    private javax.swing.JTextField txtProfSolos;
    private javax.swing.JTextField txtRespTecnico;
    private javax.swing.JTextField txtResultSolo;
<<<<<<< HEAD
    private javax.swing.JTextField txtTalhao;
=======
    private javax.swing.JTextField txtSistCultivo;
    private javax.swing.JTextField txtTalhao;
    private javax.swing.JTextField txtTexturaS;
>>>>>>> f729e9855fc1179da717f3edf31d5cc13715371c
    // End of variables declaration//GEN-END:variables
}
