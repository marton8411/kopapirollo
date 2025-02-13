/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.util.Random;

public class KoPapirOlloGui extends javax.swing.JFrame {

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KoPapirOlloGui().setVisible(true);
            }
        });
    }
    /**
     * Creates new form KoPapirOlloGui
     */
    public KoPapirOlloGui() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaResult = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        radioKo = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        radioPapir = new javax.swing.JRadioButton();
        radioOllo = new javax.swing.JRadioButton();
        btnStart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Kő-Papír-Olló játék"));

        txtAreaResult.setEditable(false);
        txtAreaResult.setColumns(20);
        txtAreaResult.setRows(5);
        jScrollPane1.setViewportView(txtAreaResult);

        jLabel1.setText("Eredmény:");

        btnClose.setText("Bezárás");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioKo);
        radioKo.setText("Kő");
        radioKo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioKoActionPerformed(evt);
            }
        });

        jLabel2.setText("Mi a választásod?");

        buttonGroup1.add(radioPapir);
        radioPapir.setText("Papír");
        radioPapir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPapirActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioOllo);
        radioOllo.setText("Olló");
        radioOllo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioOlloActionPerformed(evt);
            }
        });

        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(radioKo)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addComponent(radioPapir)
                                .addGap(18, 18, 18)
                                .addComponent(radioOllo))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(btnStart)))
                .addGap(0, 66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClose)
                .addGap(135, 135, 135))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioKo)
                    .addComponent(radioPapir)
                    .addComponent(radioOllo))
                .addGap(18, 18, 18)
                .addComponent(btnStart)
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClose)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioKoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioKoActionPerformed

    }//GEN-LAST:event_radioKoActionPerformed

    private void radioPapirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPapirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioPapirActionPerformed

    private void radioOlloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioOlloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioOlloActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        Random random = new Random();
        boolean koValasztas = radioKo.isSelected();
        boolean papirValasztas = radioPapir.isSelected();
        boolean olloValasztas = radioOllo.isSelected();
        
        String[] valaszthatok = {"kő", "papír", "olló"};
        
        int felhasznSzam = 0;
        if (koValasztas) {
            felhasznSzam = 1;
        } else if (papirValasztas) {
            felhasznSzam = 2;
        } else if (olloValasztas) {
            felhasznSzam = 3;
        } else {
            txtAreaResult.setText("Kérlek válassz ki valamit!");
        }
        String felhasznValasztas = valaszthatok[felhasznSzam - 1];
        int gepSzam = random.nextInt(3) + 1;
        String gepValasztas = valaszthatok[gepSzam - 1];
        
        txtAreaResult.setText("A választásod: " + felhasznValasztas + "\n"
                              + "A gép válaszása: " + gepValasztas);
        String meglevoSzoveg = txtAreaResult.getText();
        
        if (felhasznSzam == gepSzam) {
            txtAreaResult.setText(meglevoSzoveg + "\n" + "Döntetlen!");
        } else if (felhasznSzam == 1 && gepSzam == 3 || 
                   felhasznSzam == 2 && gepSzam == 1 ||
                   felhasznSzam == 3 && gepSzam == 2) {
            txtAreaResult.setText(meglevoSzoveg + "\n" + "Nyertél!");
        } else if (felhasznSzam == 1 && gepSzam == 2 ||
                   felhasznSzam == 2 && gepSzam == 3 ||
                   felhasznSzam == 3 && gepSzam == 1) {
            txtAreaResult.setText(meglevoSzoveg + "\n" + "Vesztettél!");
        }
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        final int HIBA_KOD = 0;
        System.exit(HIBA_KOD);
    }//GEN-LAST:event_btnCloseActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnStart;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioKo;
    private javax.swing.JRadioButton radioOllo;
    private javax.swing.JRadioButton radioPapir;
    private javax.swing.JTextArea txtAreaResult;
    // End of variables declaration//GEN-END:variables
}
