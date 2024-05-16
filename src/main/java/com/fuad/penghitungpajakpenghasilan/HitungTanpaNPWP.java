/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.fuad.penghitungpajakpenghasilan;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import static java.util.Collections.replaceAll;
import javax.swing.JOptionPane;
/**
 *
 * @author fuadz
 */
public class HitungTanpaNPWP extends javax.swing.JFrame {

    /**
     * 
     */
    public HitungTanpaNPWP() {
        initComponents();
        getContentPane().setBackground(new Color (242,216,216));
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;
        this.setLocation(x, y);
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
        jLabel2 = new javax.swing.JLabel();
        penghasilan = new javax.swing.JTextField();
        penghasilan1 = new javax.swing.JTextField();
        hitung = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        hasilHitung = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        hasilHitung1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        sebulan = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("APLIKASI PENGHITUNG PAJAK PENGHASILAN");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(242, 216, 216));

        jLabel1.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(55, 66, 89));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("APLIKASI PENGHITUNG PAJAK PENGHASILAN");

        jLabel2.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(55, 66, 89));
        jLabel2.setText("Masukkan penghasilan bersih kamu dalam setahun");

        penghasilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penghasilanActionPerformed(evt);
            }
        });
        penghasilan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                penghasilanKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                penghasilanKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                penghasilanKeyTyped(evt);
            }
        });

        penghasilan1.setBackground(new java.awt.Color(242, 216, 216));
        penghasilan1.setForeground(new java.awt.Color(242, 242, 242));
        penghasilan1.setBorder(null);
        penghasilan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penghasilan1ActionPerformed(evt);
            }
        });
        penghasilan1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                penghasilan1KeyReleased(evt);
            }
        });

        hitung.setBackground(new java.awt.Color(55, 66, 89));
        hitung.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        hitung.setForeground(new java.awt.Color(242, 216, 216));
        hitung.setText("Hitung");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(55, 66, 89));
        jLabel3.setText("Pajak terutang (setahun) :");

        hasilHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilHitungActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(55, 66, 89));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("*hanya angka dan tanpa titik koma");

        hasilHitung1.setEditable(false);
        hasilHitung1.setBackground(new java.awt.Color(242, 216, 216));
        hasilHitung1.setForeground(new java.awt.Color(242, 242, 242));
        hasilHitung1.setBorder(null);
        hasilHitung1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilHitung1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(55, 66, 89));
        jLabel5.setText("Pajak terutang (sebulan) :");

        sebulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sebulanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(penghasilan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(295, 295, 295))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(hitung))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(hasilHitung, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                    .addComponent(sebulan)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4))
                            .addComponent(penghasilan, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(112, 112, 112))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(419, 419, 419)
                    .addComponent(hasilHitung1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(penghasilan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hitung)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(hasilHitung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(sebulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(penghasilan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(267, 267, 267)
                    .addComponent(hasilHitung1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void penghasilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penghasilanActionPerformed
        
    }//GEN-LAST:event_penghasilanActionPerformed

    private void hasilHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilHitungActionPerformed
        
    }//GEN-LAST:event_hasilHitungActionPerformed

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed

        double ptkp = 54000000;
        double hitungan;
        double persenSatu = 0.05;
        double persenDua = 0.15;
        double persenTiga = 0.25;
        double persenEmpat = 0.30;
        double persenLima = 0.35;
        double tanpa = 1.2;
        String nilai_ribuan = penghasilan.getText(); // Hasil Normal
        String nilai_angka = nilai_ribuan.replace(",", ""); // Hasil Normal
        penghasilan1.setText(nilai_angka); // Hasil Normal
        long bersih = Long.parseLong(penghasilan1.getText());
        
        
        if (bersih > 54000000 && bersih <= 114000000){
            hitungan = bersih - ptkp;
            double wajibPajakSatu = hitungan * persenSatu * tanpa;
            String bayarPajakSatu = String.valueOf(wajibPajakSatu);
            hasilHitung1.setText(bayarPajakSatu);
            double bulan1 = wajibPajakSatu/12;
            String bayarBulan1 = String.valueOf(bulan1);
            sebulan.setText(bayarBulan1);
        }
        if (bersih > 114000000 && bersih <= 304000000){
            hitungan = bersih - ptkp;
            double wajibPajakDua = hitungan * persenDua * tanpa;
            String bayarPajakDua = String.valueOf(wajibPajakDua);
            hasilHitung1.setText(bayarPajakDua);
            double bulan2 = wajibPajakDua/12;
            String bayarBulan2 = String.valueOf(bulan2);
            sebulan.setText(bayarBulan2);
        }
        if (bersih > 304000000 && bersih <= 554000000){
            hitungan = bersih - ptkp;
            double wajibPajakTiga = hitungan * persenTiga * tanpa;
            String bayarPajakTiga = String.valueOf(wajibPajakTiga);
            hasilHitung1.setText(bayarPajakTiga);
            double bulan3 = wajibPajakTiga/12;
            String bayarBulan3 = String.valueOf(bulan3);
            sebulan.setText(bayarBulan3);
        }
        if (bersih > 554000000 && bersih <= 5054000000L){
            hitungan = bersih - ptkp;
            double wajibPajakEmpat = hitungan * persenEmpat * tanpa;
            String bayarPajakEmpat = String.valueOf(wajibPajakEmpat);
            hasilHitung1.setText(bayarPajakEmpat);
            double bulan4 = wajibPajakEmpat/12;
            String bayarBulan4 = String.valueOf(bulan4);
            sebulan.setText(bayarBulan4);
        }
        if (bersih > 5054000000L){
            hitungan = bersih - ptkp;
            double wajibPajakLima = hitungan * persenLima * tanpa;
            String bayarPajakLima = String.valueOf(wajibPajakLima);
            hasilHitung1.setText(bayarPajakLima);
            double bulan5 = wajibPajakLima/12;
            String bayarBulan5 = String.valueOf(bulan5);
            sebulan.setText(bayarBulan5);
        }
        if (bersih < 5400000){
            hasilHitung.setText("Tidak Wajib Bayar Pajak");
            sebulan.setText("Tidak Wajib Bayar Pajak");
        }
        
        
        String S_angka_normal = hasilHitung1.getText().replaceAll("\\,", "");
        double D_angka_Normal = Double.parseDouble(S_angka_normal);
        DecimalFormat DF = new DecimalFormat("#,###,###");        
        hasilHitung.setText(DF.format(D_angka_Normal));
        String S_angka_norma = sebulan.getText().replaceAll("\\,", "");
        double D_angka_Norma = Double.parseDouble(S_angka_norma);
        DecimalFormat DFM = new DecimalFormat("#,###,###");        
        sebulan.setText(DFM.format(D_angka_Norma));
        
        
        
        
    }//GEN-LAST:event_hitungActionPerformed

    private void penghasilanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_penghasilanKeyReleased
        String S_angka_normal = penghasilan.getText().replaceAll("\\,", "");
        double D_angka_Normal = Double.parseDouble(S_angka_normal);
        DecimalFormat DF = new DecimalFormat("#,###,###");        
        penghasilan.setText(DF.format(D_angka_Normal));
        
    }//GEN-LAST:event_penghasilanKeyReleased

    private void hasilHitung1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilHitung1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasilHitung1ActionPerformed

    private void penghasilan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penghasilan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_penghasilan1ActionPerformed

    private void penghasilan1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_penghasilan1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_penghasilan1KeyReleased

    private void sebulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sebulanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sebulanActionPerformed

    private void penghasilanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_penghasilanKeyTyped
        char enter = evt.getKeyChar();
        if (!(Character.isDigit(enter) || enter == '.')) {
            evt.consume();
        }
        
    }//GEN-LAST:event_penghasilanKeyTyped

    private void penghasilanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_penghasilanKeyPressed
        
    }//GEN-LAST:event_penghasilanKeyPressed

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
            java.util.logging.Logger.getLogger(HitungTanpaNPWP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HitungTanpaNPWP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HitungTanpaNPWP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HitungTanpaNPWP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HitungTanpaNPWP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField hasilHitung;
    private javax.swing.JTextField hasilHitung1;
    private javax.swing.JButton hitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField penghasilan;
    private javax.swing.JTextField penghasilan1;
    private javax.swing.JTextField sebulan;
    // End of variables declaration//GEN-END:variables
}