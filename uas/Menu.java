/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uas;

public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public Menu() {
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        daftarUser = new javax.swing.JButton();
        daftarFilm = new javax.swing.JButton();
        btnPesan = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setText("SELAMAT DATANG");

        daftarUser.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        daftarUser.setText("Daftar User");
        daftarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarUserActionPerformed(evt);
            }
        });

        daftarFilm.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        daftarFilm.setText("Daftar Film");
        daftarFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarFilmActionPerformed(evt);
            }
        });

        btnPesan.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        btnPesan.setText("Pesan Tiket");
        btnPesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(daftarUser)
                        .addGap(18, 18, 18)
                        .addComponent(daftarFilm)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesan))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel1)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(daftarUser)
                    .addComponent(daftarFilm)
                    .addComponent(btnPesan))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void daftarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarUserActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new DaftarUser().setVisible(true);
    }//GEN-LAST:event_daftarUserActionPerformed

    private void btnPesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesanActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new pemesanan().setVisible(true);
    }//GEN-LAST:event_btnPesanActionPerformed

    private void daftarFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarFilmActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new DaftarFilm().setVisible(true);
    }//GEN-LAST:event_daftarFilmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesan;
    private javax.swing.JButton daftarFilm;
    private javax.swing.JButton daftarUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
