/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package client_gc;

import client_gc.VerifyGUI;
import javax.swing.JOptionPane;

/**
 *
 * @author Hilmy
 */
public class VerifyGUI extends javax.swing.JFrame {

    public static String[] verif;
    public static String emailInput;

    public VerifyGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        buttonKeluar = new javax.swing.JButton();
        buttonSend = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        textVerifyCode = new javax.swing.JTextField();
        buttonVerifyCode = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enter Email ");

        buttonKeluar.setText("Keluar");
        buttonKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonKeluarMouseClicked(evt);
            }
        });
        buttonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKeluarActionPerformed(evt);
            }
        });

        buttonSend.setText("Send");
        buttonSend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonSendMouseClicked(evt);
            }
        });
        buttonSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSendActionPerformed(evt);
            }
        });

        jLabel2.setText("Verify Code");

        buttonVerifyCode.setText("Verify Code");
        buttonVerifyCode.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonVerifyCode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonVerifyCodeMouseClicked(evt);
            }
        });
        buttonVerifyCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVerifyCodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonVerifyCode)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonKeluar)
                                .addGap(48, 48, 48)
                                .addComponent(buttonSend))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(27, 27, 27)
                                .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(27, 27, 27)
                            .addComponent(textVerifyCode, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSend)
                    .addComponent(buttonKeluar))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textVerifyCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonVerifyCode)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonKeluarMouseClicked
        LoginGUI lg = new LoginGUI();
        lg.setVisible(true);
        lg.pack();
        lg.setLocationRelativeTo(null);
        lg.setDefaultCloseOperation(LoginGUI.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_buttonKeluarMouseClicked

    private void buttonSendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSendMouseClicked
        try {
            String emailKolom = textEmail.getText();
            System.out.println(emailKolom); // ada

            if (emailKolom.equals("")) {

                JOptionPane.showMessageDialog(null, "Please Input Email First", "Error", JOptionPane.INFORMATION_MESSAGE);

            } else {
                String verif = verifyEmail(emailKolom);
                if (verif.equals("berhasil")) {
                    JOptionPane.showMessageDialog(null, "Verify Code succesfully sent! check your email", "Succes", JOptionPane.INFORMATION_MESSAGE);
                    emailInput = emailKolom;
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Email! input another", "Error", JOptionPane.INFORMATION_MESSAGE);

                }
            }
        } catch (Exception e) {
            System.out.println("errornya saat kirim verif: " + e);
        }

    }//GEN-LAST:event_buttonSendMouseClicked

    private void buttonSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSendActionPerformed

    private void buttonVerifyCodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonVerifyCodeMouseClicked

        
        String checkVerif = textVerifyCode.getText();
        String kodeEmail = checkCodeVerif(emailInput, Integer.parseInt(checkVerif));
        if (kodeEmail.equals("berhasil")) {
            ResetPasswordGUI lg = new ResetPasswordGUI();
//            String encrypteNoHP = AES.encrypt(textNoHP.getText());
//            ubahPIN.noHP = encrypteNoHP;
            ResetPasswordGUI.email = emailInput;
            lg.setVisible(true);
            lg.pack();
            lg.setLocationRelativeTo(null);
            lg.setDefaultCloseOperation(ResetPasswordGUI.EXIT_ON_CLOSE);
            this.dispose();
        } else{
            JOptionPane.showMessageDialog(null, "Kode Verifikasi tidak sesuai !!", "Pesan", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_buttonVerifyCodeMouseClicked

    private void buttonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKeluarActionPerformed
        LoginGUI lg = new LoginGUI();
        lg.setVisible(true);
        lg.pack();
        lg.setLocationRelativeTo(null);
        lg.setDefaultCloseOperation(LoginGUI.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_buttonKeluarActionPerformed

    private void buttonVerifyCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVerifyCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonVerifyCodeActionPerformed

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
            java.util.logging.Logger.getLogger(VerifyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerifyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerifyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerifyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerifyGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonKeluar;
    private javax.swing.JButton buttonSend;
    private javax.swing.JButton buttonVerifyCode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textVerifyCode;
    // End of variables declaration//GEN-END:variables

    private static String verifyEmail(java.lang.String newEmail) {
        com.project.service.ProjectWebService_Service service = new com.project.service.ProjectWebService_Service();
        com.project.service.ProjectWebService port = service.getProjectWebServicePort();
        return port.verifyEmail(newEmail);
    }

    private static String checkCodeVerif(java.lang.String email, int kode) {
        com.project.service.ProjectWebService_Service service = new com.project.service.ProjectWebService_Service();
        com.project.service.ProjectWebService port = service.getProjectWebServicePort();
        return port.checkCodeVerif(email, kode);
    }
}
