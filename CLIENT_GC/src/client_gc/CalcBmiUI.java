/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package client_gc;
import javax.swing.JOptionPane;

/**
 *
 * @author ansa
 */

public class CalcBmiUI extends javax.swing.JFrame {

    String[] user;
    
    public CalcBmiUI() {
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupUnit = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        calcBtn = new javax.swing.JButton();
        labelWeight = new javax.swing.JLabel();
        labelHeight = new javax.swing.JLabel();
        bmiTxt = new javax.swing.JTextField();
        heightTxt = new javax.swing.JTextField();
        weightTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtClass = new javax.swing.JLabel();
        metricRdo = new javax.swing.JRadioButton();
        imperialRdo = new javax.swing.JRadioButton();
        inchHeightTxt = new javax.swing.JTextField();
        labelHeight1 = new javax.swing.JLabel();
        homeBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Weight :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Height :");

        calcBtn.setBackground(new java.awt.Color(0, 102, 51));
        calcBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        calcBtn.setForeground(new java.awt.Color(255, 255, 255));
        calcBtn.setText("CALCULATE");
        calcBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcBtnActionPerformed(evt);
            }
        });

        labelWeight.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelWeight.setText("kg");

        labelHeight.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelHeight.setText("cm");

        bmiTxt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bmiTxt.setEnabled(false);

        heightTxt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        weightTxt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("BMI :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Classification :");

        txtClass.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtClass.setText("    ");
        txtClass.setToolTipText("");

        buttonGroupUnit.add(metricRdo);
        metricRdo.setSelected(true);
        metricRdo.setText("Metric");
        metricRdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metricRdoActionPerformed(evt);
            }
        });

        buttonGroupUnit.add(imperialRdo);
        imperialRdo.setText("Imperial");
        imperialRdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imperialRdoActionPerformed(evt);
            }
        });

        inchHeightTxt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        labelHeight1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelHeight1.setText("inches");

        homeBtn.setBackground(new java.awt.Color(255, 51, 51));
        homeBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        homeBtn.setForeground(new java.awt.Color(255, 255, 255));
        homeBtn.setText("BACK");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CALCULATE BMI");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bmiTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(heightTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(weightTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtClass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inchHeightTxt))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelHeight1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(metricRdo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(imperialRdo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(calcBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(metricRdo)
                    .addComponent(imperialRdo))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelWeight)
                            .addComponent(weightTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelHeight)
                            .addComponent(heightTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inchHeightTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelHeight1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bmiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtClass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(calcBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(homeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void getUser(String[] u) {
        user = u;
    }
    
    
    private void calcBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcBtnActionPerformed
        double height = 0;
        double weight = Double.parseDouble(weightTxt.getText());
        double bmi = 0;
        
        if(metricRdo.isSelected()){
            height = Double.parseDouble(heightTxt.getText());
            bmi = Math.ceil(weight/Math.pow (height/100,2));
        }
        else{
            height = Double.parseDouble(heightTxt.getText()) * 12 + Double.parseDouble(inchHeightTxt.getText());
            // Rumus imperial adalah lbs/(inches^2)*703 jadi konv 
            bmi = Math.ceil(weight/Math.pow(height, 2)*703);
            
            // Height dan Weight hanya disimpan dalam satuan metrik btw (meter / kg)
            // BTW ini height dan weight ga bisa diround ke decimal kecil? Kalo ceiling/floor ga akurat. 
            // Batasi decimalnya 2 aja di DB
            
           height = height*0.0254;
           weight = weight*0.453592;
        }
        
        String classification = calculateClassification(bmi);
        bmiTxt.setText(Double.toString(bmi));
        txtClass.setText(classification);

        // kirim ke database
        // metode insert ke database String classification, double bmi, double height, double weight, double user_id
       String status = insertBMI(classification, bmi, height, weight, user[0]);
        if (status.equals("gagal")) {
            JOptionPane.showMessageDialog(this, "Penambahan data gagal!");
        }
        else{
            JOptionPane.showMessageDialog(this, "Penambahan data berhasil!");
        }
    }//GEN-LAST:event_calcBtnActionPerformed

    private void imperialRdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imperialRdoActionPerformed
 try {
            double weightKg = 0;
            double heightFeet = 0;
            double heightInch = 0;
            if (!weightTxt.getText().equals("")) {
                weightKg = Double.parseDouble(weightTxt.getText());
                weightKg = weightKg * 2.205;
            }

            if (!heightTxt.getText().equals("")) {
                double heightCm = Double.parseDouble(heightTxt.getText());
                heightFeet = (heightCm / 30);
                heightInch = ((heightCm - (heightFeet * 30)) / 2.54);
            }
            weightTxt.setText(Double.toString(weightKg));
            heightTxt.setText(Double.toString(heightFeet));
            inchHeightTxt.setText(Double.toString(heightInch));
            labelWeight.setText("Lbs");
            labelHeight.setText("Feet");
            inchHeightTxt.setVisible(true);
            labelHeight1.setVisible(true);
        } catch (Exception e) {
            System.out.println("Error in Imperial Conversion: " + e);
        }

    }//GEN-LAST:event_imperialRdoActionPerformed

    private void metricRdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metricRdoActionPerformed
       try {
            double heightCm = 0;
            double weightKg = 0;

            if (!weightTxt.getText().equals("")) {
                double oldWeight = Double.parseDouble(weightTxt.getText());
                weightKg = oldWeight / 2.205;
            }
            if (!heightTxt.getText().equals("")) {
                double oldHeightFeet = Double.parseDouble(heightTxt.getText());
                heightCm = (heightCm + (oldHeightFeet * 30));
            }
            if (!inchHeightTxt.getText().equals("")) {
                double oldHeightInch = Double.parseDouble(inchHeightTxt.getText());
                heightCm = (heightCm + (oldHeightInch * 2.54));
            }
            weightTxt.setText(Double.toString(weightKg));
            heightTxt.setText(Double.toString(heightCm));
            inchHeightTxt.setText("0");
            labelWeight.setText("Kg");
            labelHeight.setText("Cm");
            inchHeightTxt.setVisible(false);
            labelHeight1.setVisible(false);
        } catch (Exception e) {
            System.out.println("Error in Metric Conversion: " + e);
        }
    }//GEN-LAST:event_metricRdoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        inchHeightTxt.setVisible(false);
        labelHeight1.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        this.setVisible(false);
        HomeGUI home = new HomeGUI();
        home.getUser(user);
        home.setVisible(true);       
    }//GEN-LAST:event_homeBtnActionPerformed

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
            java.util.logging.Logger.getLogger(CalcBmiUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalcBmiUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalcBmiUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalcBmiUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalcBmiUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bmiTxt;
    private javax.swing.ButtonGroup buttonGroupUnit;
    private javax.swing.JButton calcBtn;
    private javax.swing.JTextField heightTxt;
    private javax.swing.JButton homeBtn;
    private javax.swing.JRadioButton imperialRdo;
    private javax.swing.JTextField inchHeightTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelHeight;
    private javax.swing.JLabel labelHeight1;
    private javax.swing.JLabel labelWeight;
    private javax.swing.JRadioButton metricRdo;
    private javax.swing.JLabel txtClass;
    private javax.swing.JTextField weightTxt;
    // End of variables declaration//GEN-END:variables

    private static String insertBMI(java.lang.String classification, double bmi, double height, double weight, java.lang.String id) {
        com.project.service.ProjectWebService_Service service = new com.project.service.ProjectWebService_Service();
        com.project.service.ProjectWebService port = service.getProjectWebServicePort();
        return port.insertBMI(classification, bmi, height, weight, id);
    }

    private static String calculateClassification(double bmi) {
        com.project.service.ProjectWebService_Service service = new com.project.service.ProjectWebService_Service();
        com.project.service.ProjectWebService port = service.getProjectWebServicePort();
        return port.calculateClassification(bmi);
    }
    
    

}
