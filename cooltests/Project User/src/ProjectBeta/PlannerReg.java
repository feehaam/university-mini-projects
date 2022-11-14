package ProjectBeta; 

import javax.swing.JOptionPane;

/**
 *
 * @author MD.Feeham
 */
public class PlannerReg extends javax.swing.JFrame { 
      public PlannerReg() {
            initComponents();
      } 
      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jPanel2 = new javax.swing.JPanel();
            jButton4 = new javax.swing.JButton();
            jButton5 = new javax.swing.JButton();
            jButton6 = new javax.swing.JButton();
            jButton3 = new javax.swing.JButton();
            rid = new javax.swing.JTextField();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            rname = new javax.swing.JTextField();
            jLabel4 = new javax.swing.JLabel();
            rpas = new javax.swing.JPasswordField();
            jButton1 = new javax.swing.JButton();
            rpas2 = new javax.swing.JPasswordField();
            jLabel5 = new javax.swing.JLabel();
            jLabel1 = new javax.swing.JLabel();
            jLabel7 = new javax.swing.JLabel();
            jLabel8 = new javax.swing.JLabel();
            jLabel9 = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setPreferredSize(new java.awt.Dimension(873, 616));

            jPanel2.setBackground(new java.awt.Color(0, 153, 0));

            jButton4.setBackground(new java.awt.Color(0, 204, 0));
            jButton4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
            jButton4.setForeground(new java.awt.Color(255, 255, 255));
            jButton4.setText("CGPA Planner");

            jButton5.setBackground(new java.awt.Color(0, 204, 0));
            jButton5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            jButton5.setForeground(new java.awt.Color(255, 255, 255));
            jButton5.setText("Have an eye on where your cgpa is going.");

            jButton6.setBackground(new java.awt.Color(0, 204, 0));
            jButton6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            jButton6.setForeground(new java.awt.Color(255, 255, 255));
            jButton6.setText("Plan a result and predict the outcome!");

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                  jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButton4)
                        .addGap(235, 235, 235)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jButton5)
                              .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jButton6)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel2Layout.setVerticalGroup(
                  jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jButton4)
                              .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(jButton5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton6)))
                        .addContainerGap(20, Short.MAX_VALUE))
            );

            jButton3.setBackground(new java.awt.Color(51, 204, 0));
            jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jButton3.setText("Cancel");
            jButton3.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton3ActionPerformed(evt);
                  }
            });

            rid.setBackground(new java.awt.Color(204, 255, 255));
            rid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            rid.setForeground(new java.awt.Color(255, 0, 0));
            rid.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        ridActionPerformed(evt);
                  }
            });

            jLabel2.setBackground(new java.awt.Color(204, 204, 255));
            jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel2.setText("Student ID");

            jLabel3.setBackground(new java.awt.Color(204, 204, 255));
            jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel3.setText("Full name");

            rname.setBackground(new java.awt.Color(204, 255, 255));
            rname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            rname.setForeground(new java.awt.Color(255, 0, 0));
            rname.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        rnameActionPerformed(evt);
                  }
            });

            jLabel4.setBackground(new java.awt.Color(204, 204, 255));
            jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel4.setText("Password");

            rpas.setBackground(new java.awt.Color(204, 255, 255));
            rpas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            rpas.setForeground(new java.awt.Color(255, 0, 0));

            jButton1.setBackground(new java.awt.Color(0, 204, 0));
            jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jButton1.setText("Sign up");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                  }
            });

            rpas2.setBackground(new java.awt.Color(204, 255, 255));
            rpas2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            rpas2.setForeground(new java.awt.Color(255, 0, 0));
            rpas2.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        rpas2ActionPerformed(evt);
                  }
            });

            jLabel5.setBackground(new java.awt.Color(204, 204, 255));
            jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel5.setText("Retype Password");

            jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(102, 102, 255));
            jLabel1.setText("Enter Full name");

            jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jLabel7.setForeground(new java.awt.Color(255, 51, 255));
            jLabel7.setText("Must be at least 4 digit");

            jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jLabel8.setForeground(new java.awt.Color(0, 204, 0));
            jLabel8.setText("Type password again");

            jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jLabel9.setForeground(new java.awt.Color(255, 102, 102));
            jLabel9.setText("Use your original ID");

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 845, Short.MAX_VALUE))
                  .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                              .addComponent(rname, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                          .addGap(112, 112, 112)
                                          .addComponent(rid, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                          .addGap(47, 47, 47)
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel5))))
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rpas, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rpas2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                          .addComponent(jButton1)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                          .addComponent(jButton3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28))
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(rid, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(rname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(rpas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(rpas2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jButton1)
                              .addComponent(jButton3))
                        .addContainerGap(81, Short.MAX_VALUE))
            );

            pack();
            setLocationRelativeTo(null);
      }// </editor-fold>//GEN-END:initComponents

      private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            new PlannerLogin().setVisible(true);
      }//GEN-LAST:event_jButton3ActionPerformed

      private void ridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ridActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_ridActionPerformed

      private void rnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rnameActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_rnameActionPerformed

      private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            if((((String)rid.getText()).length()<8)||(((String)rname.getText()).length()<3)||(((String)rpas.getText()).length()<3))
                  JOptionPane.showMessageDialog(this, "You must fill of the the fields correctly!");
            else{
            if(((String)rpas.getText()).equals((String)rpas2.getText())){
                  int Status = new Fileop().Create("F:\\cgpa\\"+rid.getText()+".txt");
                  if(Status==1){
                        new Details().Reg((String)rid.getText(), (String)rname.getText(), (String)rpas.getText());

                        JOptionPane.showMessageDialog(this, "Registration succeessfull!\nNow login to your account.");
                        setVisible(false);
                        new PlannerLogin().setVisible(true);
            }
            else
                  JOptionPane.showMessageDialog(this, "Unable to create account or\nAccoount with same name may already exists", "Error occured!", WIDTH);
      }
      else
                  JOptionPane.showMessageDialog(this, "Password in both field must match!");
            }
      }//GEN-LAST:event_jButton1ActionPerformed

      private void rpas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rpas2ActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_rpas2ActionPerformed

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
                  java.util.logging.Logger.getLogger(PlannerReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                  java.util.logging.Logger.getLogger(PlannerReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                  java.util.logging.Logger.getLogger(PlannerReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                  java.util.logging.Logger.getLogger(PlannerReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
                        new PlannerReg().setVisible(true);
                  }
            });
      }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JButton jButton1;
      private javax.swing.JButton jButton3;
      private javax.swing.JButton jButton4;
      private javax.swing.JButton jButton5;
      private javax.swing.JButton jButton6;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JLabel jLabel7;
      private javax.swing.JLabel jLabel8;
      private javax.swing.JLabel jLabel9;
      private javax.swing.JPanel jPanel2;
      private javax.swing.JTextField rid;
      private javax.swing.JTextField rname;
      private javax.swing.JPasswordField rpas;
      private javax.swing.JPasswordField rpas2;
      // End of variables declaration//GEN-END:variables
}
