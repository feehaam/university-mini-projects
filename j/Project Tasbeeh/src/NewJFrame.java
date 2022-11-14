import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
public class NewJFrame extends javax.swing.JFrame {

      /**
       * Creates new form NewJFrame
       */
      public NewJFrame() {
            initComponents();
            File f = new File("D://Program Files//Tasbeeh");
            f.mkdir();
            Fileop.Create("D://Program Files//Tasbeeh//List.txt");
            setmenu();
            count.setText("00");
            selected.setText("  No item is selected");
      }
      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            jScrollPane1 = new javax.swing.JScrollPane();
            menu = new javax.swing.JList();
            jButton1 = new javax.swing.JButton();
            selected = new javax.swing.JLabel();
            jPanel2 = new javax.swing.JPanel();
            count = new javax.swing.JLabel();
            plus = new javax.swing.JButton();
            minus = new javax.swing.JButton();
            plus1 = new javax.swing.JButton();
            plus2 = new javax.swing.JButton();
            plus3 = new javax.swing.JButton();
            plus8 = new javax.swing.JButton();
            plus5 = new javax.swing.JButton();
            plus10 = new javax.swing.JButton();
            plus1000 = new javax.swing.JButton();
            plus100 = new javax.swing.JButton();
            jButton2 = new javax.swing.JButton();
            jButton3 = new javax.swing.JButton();
            jButton4 = new javax.swing.JButton();
            rmode = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jPanel1.setBackground(new java.awt.Color(51, 51, 51));

            menu.setBackground(new java.awt.Color(51, 51, 51));
            menu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            menu.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
            menu.setForeground(new java.awt.Color(204, 204, 255));
            menu.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        menuMouseClicked(evt);
                  }
            });
            jScrollPane1.setViewportView(menu);

            jButton1.setFont(new java.awt.Font("Dialog", 1, 60)); // NOI18N
            jButton1.setText("+");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                  }
            });

            selected.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
            selected.setForeground(new java.awt.Color(204, 204, 255));
            selected.setText("  Selected Nonames Type x with name sp");
            selected.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            selected.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                  public void propertyChange(java.beans.PropertyChangeEvent evt) {
                        selectedPropertyChange(evt);
                  }
            });

            jPanel2.setBackground(new java.awt.Color(51, 51, 51));
            jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

            count.setFont(new java.awt.Font("Dialog", 1, 100)); // NOI18N
            count.setForeground(new java.awt.Color(204, 204, 204));
            count.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            count.setText("100");

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                  jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(count, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
            );
            jPanel2Layout.setVerticalGroup(
                  jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(count, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                        .addContainerGap())
            );

            plus.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
            plus.setText("+");
            plus.setEnabled(false);
            plus.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        plusActionPerformed(evt);
                  }
            });

            minus.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
            minus.setText("-");
            minus.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        minusActionPerformed(evt);
                  }
            });

            plus1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
            plus1.setText("+ 1");
            plus1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        plus1ActionPerformed(evt);
                  }
            });

            plus2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
            plus2.setText("+ 2");
            plus2.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        plus2ActionPerformed(evt);
                  }
            });

            plus3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
            plus3.setText("+ 3");
            plus3.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        plus3ActionPerformed(evt);
                  }
            });

            plus8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
            plus8.setText("+ 8");
            plus8.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        plus8ActionPerformed(evt);
                  }
            });

            plus5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
            plus5.setText("+ 5");
            plus5.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        plus5ActionPerformed(evt);
                  }
            });

            plus10.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
            plus10.setText("+10");
            plus10.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        plus10ActionPerformed(evt);
                  }
            });

            plus1000.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
            plus1000.setText("+1000");
            plus1000.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        plus1000ActionPerformed(evt);
                  }
            });

            plus100.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
            plus100.setText("+100");
            plus100.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        plus100ActionPerformed(evt);
                  }
            });

            jButton2.setBackground(new java.awt.Color(0, 0, 0));
            jButton2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
            jButton2.setForeground(new java.awt.Color(255, 255, 255));
            jButton2.setText("TASBEEH");

            jButton3.setBackground(new java.awt.Color(153, 0, 0));
            jButton3.setForeground(new java.awt.Color(255, 255, 255));
            jButton3.setText("Save changes");
            jButton3.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton3ActionPerformed(evt);
                  }
            });

            jButton4.setBackground(new java.awt.Color(153, 0, 0));
            jButton4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
            jButton4.setForeground(new java.awt.Color(255, 255, 255));
            jButton4.setText("SPEED TEST");
            jButton4.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton4ActionPerformed(evt);
                  }
            });

            rmode.setBackground(new java.awt.Color(153, 0, 0));
            rmode.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
            rmode.setForeground(new java.awt.Color(255, 255, 255));
            rmode.setText("R-Mode: OFF");
            rmode.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        rmodeActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                          .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                          .addComponent(selected, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
                                          .addComponent(jScrollPane1)))
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                          .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                          .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(minus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                          .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(plus1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(plus2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(plus3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(plus5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addComponent(plus8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(plus100, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(54, 54, 54)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addComponent(plus1000, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(plus10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                          .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(rmode, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(39, Short.MAX_VALUE))
            );
            jPanel1Layout.setVerticalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27))
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(jButton4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rmode)
                                    .addGap(2, 2, 2)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                              .addComponent(minus, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                              .addComponent(plus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(selected, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                          .addComponent(plus1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(plus2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                          .addComponent(plus3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(plus5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                          .addComponent(plus10, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(plus8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                          .addComponent(plus100, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(plus1000, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(14, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            pack();
      }// </editor-fold>//GEN-END:initComponents
int menuptr=0;
int min=0;
boolean rm=false;
      private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
            minus.setEnabled(false);
            plus.setEnabled(true);
            plus1.setText("- 1");
            plus2.setText("- 2");
            plus3.setText("- 3");
            plus5.setText("- 5");
            plus8.setText("- 8");
            plus10.setText("-10");
            plus100.setText("-100");
            plus1000.setText("-1000");
            min=1;
      }//GEN-LAST:event_minusActionPerformed

      private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
            minus.setEnabled(true);
            plus.setEnabled(false);
            plus1.setText("+ 1");
            plus2.setText("+ 2");
            plus3.setText("+ 3");
            plus5.setText("+ 5");
            plus8.setText("+ 8");
            plus10.setText("+10");
            plus100.setText("+100");
            plus1000.setText("+1000");
            min=0;
      }//GEN-LAST:event_plusActionPerformed

      private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            String s=JOptionPane.showInputDialog("Type the name of new Tasbeeh.");
            if(s!=null){
                  
            Fileop.Add("D:\\Program Files\\Tasbeeh\\List.txt", "@");
            Fileop.Add("D:\\Program Files\\Tasbeeh\\List.txt", s);
            Fileop.Add("D:\\Program Files\\Tasbeeh\\List.txt", "#        ");
            Fileop.Create("D:\\Program Files\\Tasbeeh\\"+s+".txt");
            Fileop.Add("D:\\Program Files\\Tasbeeh\\"+s+".txt", "0");
            setmenu();
            }
      }//GEN-LAST:event_jButton1ActionPerformed

      private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
            selected.setText("  Selected: "+menu.getSelectedValue().toString());
            String s=Fileop.Read("D:\\Program Files\\Tasbeeh\\"+menu.getSelectedValue().toString()+".txt");
            count.setText(s);
            count.setVisible(true);
            selected.setVisible(true);
      }//GEN-LAST:event_menuMouseClicked

      private void selectedPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_selectedPropertyChange
            
      }//GEN-LAST:event_selectedPropertyChange

      private void plus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plus1ActionPerformed
            mod(1);
      }//GEN-LAST:event_plus1ActionPerformed

      private void plus2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plus2ActionPerformed
            mod(2);
      }//GEN-LAST:event_plus2ActionPerformed

      private void plus3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plus3ActionPerformed
            mod(3);
      }//GEN-LAST:event_plus3ActionPerformed

      private void plus5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plus5ActionPerformed
            mod(5);
      }//GEN-LAST:event_plus5ActionPerformed

      private void plus8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plus8ActionPerformed
            mod(8);
      }//GEN-LAST:event_plus8ActionPerformed

      private void plus10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plus10ActionPerformed
            mod(10);
      }//GEN-LAST:event_plus10ActionPerformed

      private void plus100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plus100ActionPerformed
           mod(100);
      }//GEN-LAST:event_plus100ActionPerformed

      private void plus1000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plus1000ActionPerformed
            mod(1000);
      }//GEN-LAST:event_plus1000ActionPerformed

      private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            Fileop.Write("D:\\Program Files\\Tasbeeh\\"+menu.getSelectedValue()+".txt", count.getText());
            JOptionPane.showMessageDialog(this, "Successfully saved!");
      }//GEN-LAST:event_jButton3ActionPerformed

      private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            new SpeedTest().setVisible(true);
            setVisible(false);
      }//GEN-LAST:event_jButton4ActionPerformed

      private void rmodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmodeActionPerformed
            if(rm){
                  rmode.setText("R-Mode: OFF");
                  rm=false;
            }
            else{
                  rmode.setText("R-Mode: ON");
                  rm=true;
            }
      }//GEN-LAST:event_rmodeActionPerformed

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
                  java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                  java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                  java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                  java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
                        new NewJFrame().setVisible(true);
                  }
            });
      }
      
            void setmenu(){
            DefaultListModel listop = new DefaultListModel();
            menu.setModel(listop);
            
            String list[]=new String[100];
            int lptr=0;
            String s=Fileop.Read("D://Program Files//Tasbeeh//List.txt");
                  int beg=-1, end=0;
            for(int i=0; i<s.length(); i++){
                  if(s.charAt(i)=='@')
                        beg=i+1;
                  if(s.charAt(i)=='#'){
                        String x=s.substring(beg, i);
                        listop.add(lptr, x);
                        lptr++;
                  }
            }
      }
            void mod(int x){
                  if(rm)
                        x*=70;
                  if(min==0)
                        add(x);
                  else rem(x);
            }
            
            void add(int x){
                  Integer n=Integer.parseInt(count.getText().toString());
                  n+=x;
                  count.setText(n.toString());
            }
            
            void rem(int x){
                  Integer n=Integer.parseInt(count.getText().toString());
                  if(n<=0)
                        JOptionPane.showMessageDialog(this, "Tasbeeh count is already 0!");
                  else
                  n-=x;
                  count.setText(n.toString());
            }
      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JLabel count;
      private javax.swing.JButton jButton1;
      private javax.swing.JButton jButton2;
      private javax.swing.JButton jButton3;
      private javax.swing.JButton jButton4;
      private javax.swing.JPanel jPanel1;
      private javax.swing.JPanel jPanel2;
      private javax.swing.JScrollPane jScrollPane1;
      private javax.swing.JList menu;
      private javax.swing.JButton minus;
      private javax.swing.JButton plus;
      private javax.swing.JButton plus1;
      private javax.swing.JButton plus10;
      private javax.swing.JButton plus100;
      private javax.swing.JButton plus1000;
      private javax.swing.JButton plus2;
      private javax.swing.JButton plus3;
      private javax.swing.JButton plus5;
      private javax.swing.JButton plus8;
      private javax.swing.JButton rmode;
      private javax.swing.JLabel selected;
      // End of variables declaration//GEN-END:variables
}
