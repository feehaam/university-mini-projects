package ProjectBeta;

import javax.swing.JOptionPane;

/**
 *
 * @author MD.Feeham
 */
public class PlannerLogin extends javax.swing.JFrame {
      public PlannerLogin() {
            initComponents();
      }
      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            lid = new javax.swing.JTextField();
            lpas = new javax.swing.JPasswordField();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jButton1 = new javax.swing.JButton();
            jButton2 = new javax.swing.JButton();
            jButton3 = new javax.swing.JButton();
            jPanel2 = new javax.swing.JPanel();
            jButton4 = new javax.swing.JButton();
            jButton5 = new javax.swing.JButton();
            jButton6 = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setBackground(new java.awt.Color(255, 255, 255));

            lid.setBackground(new java.awt.Color(204, 255, 255));
            lid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            lid.setForeground(new java.awt.Color(255, 0, 0));
            lid.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        lidActionPerformed(evt);
                  }
            });

            lpas.setBackground(new java.awt.Color(204, 255, 255));
            lpas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            lpas.setForeground(new java.awt.Color(255, 0, 0));

            jLabel2.setBackground(new java.awt.Color(204, 204, 255));
            jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel2.setText("Student ID");

            jLabel3.setBackground(new java.awt.Color(204, 204, 255));
            jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel3.setText("Password");

            jButton1.setBackground(new java.awt.Color(0, 204, 0));
            jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jButton1.setText("Login");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                  }
            });

            jButton2.setBackground(new java.awt.Color(0, 204, 0));
            jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jButton2.setText("Create Account");
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton2ActionPerformed(evt);
                  }
            });

            jButton3.setBackground(new java.awt.Color(51, 204, 0));
            jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jButton3.setText("Exit");
            jButton3.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton3ActionPerformed(evt);
                  }
            });

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

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jLabel3)
                              .addComponent(jLabel2)
                              .addGroup(layout.createSequentialGroup()
                                    .addGap(85, 85, 85)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                          .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton2))
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lpas, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lid, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                  .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(81, 81, 81))
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lid, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lpas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jButton1)
                              .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(57, 57, 57))
            );

            pack();
            setLocationRelativeTo(null);
      }// </editor-fold>//GEN-END:initComponents

      private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            String x = new Details().exploreMain((String)lid.getText());
            if(x.equals((String)lpas.getText()))
            {
                  x = "Welcome "+StuData.name;
                  
                  setVisible(false);
                  Home obj = new Home();
                        obj.setVisible(true);
                        obj.loginSetUp();
            }
            else
                  JOptionPane.showMessageDialog(this, "Unable to log in. \nPlease check your password!");
            
      }//GEN-LAST:event_jButton1ActionPerformed

      private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      System.exit(0);
      }//GEN-LAST:event_jButton3ActionPerformed

      private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            PlannerReg reg = new PlannerReg();
            setVisible(false);
            reg.setVisible(true);
            
      }//GEN-LAST:event_jButton2ActionPerformed

      private void lidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lidActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_lidActionPerformed
 public static void main(String args[]) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
                        new PlannerLogin().setVisible(true);
                  }
            });
      }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JButton jButton1;
      private javax.swing.JButton jButton2;
      private javax.swing.JButton jButton3;
      private javax.swing.JButton jButton4;
      private javax.swing.JButton jButton5;
      private javax.swing.JButton jButton6;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JPanel jPanel2;
      private javax.swing.JTextField lid;
      private javax.swing.JPasswordField lpas;
      // End of variables declaration//GEN-END:variables
}
