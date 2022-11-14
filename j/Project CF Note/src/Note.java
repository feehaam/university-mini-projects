
import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


/**
 *
 * @author MD.Feeham
 */
public class Note extends javax.swing.JFrame {
      
      int xm,ym,xx,yy;
      
      public Note() {
            initComponents();
      }
      
      //nessessary variables
      int menuStatus=0;
      
      
      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jSeparator3 = new javax.swing.JSeparator();
            jPanel1 = new javax.swing.JPanel();
            sna = new javax.swing.JLabel();
            snb = new javax.swing.JLabel();
            ht1 = new javax.swing.JLabel();
            ht2 = new javax.swing.JLabel();
            addn = new javax.swing.JLabel();
            addp = new javax.swing.JLabel();
            addc = new javax.swing.JLabel();
            dif1 = new javax.swing.JLabel();
            dif2 = new javax.swing.JLabel();
            dif3 = new javax.swing.JLabel();
            dif4 = new javax.swing.JLabel();
            dif5 = new javax.swing.JLabel();
            dif6 = new javax.swing.JLabel();
            menuBg = new javax.swing.JPanel();
            jScrollPane1 = new javax.swing.JScrollPane();
            menu = new javax.swing.JList();
            menuIcon = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jSeparator2 = new javax.swing.JSeparator();
            jSeparator1 = new javax.swing.JSeparator();
            bg = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setUndecorated(true);
            getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        jPanel1MouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        jPanel1MouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        jPanel1MouseExited(evt);
                  }
            });

            sna.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
            sna.setForeground(new java.awt.Color(153, 0, 0));
            sna.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            sna.setText("SPECIAL");

            snb.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
            snb.setForeground(new java.awt.Color(0, 51, 102));
            snb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            snb.setText("NOTES");

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(sna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(snb, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                        .addContainerGap())
            );
            jPanel1Layout.setVerticalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sna, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(snb, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(14, Short.MAX_VALUE))
            );

            getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 600, 200, 100));

            ht1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
            ht1.setForeground(new java.awt.Color(153, 0, 0));
            ht1.setText("Codeforces");
            ht1.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        ht1MouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        ht1MouseExited(evt);
                  }
            });
            getContentPane().add(ht1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 270, 60));

            ht2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
            ht2.setForeground(new java.awt.Color(0, 51, 102));
            ht2.setText("Notes");
            ht2.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        ht2MouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        ht2MouseExited(evt);
                  }
            });
            getContentPane().add(ht2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 140, 60));

            addn.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
            addn.setForeground(new java.awt.Color(0, 102, 0));
            addn.setText("          Add special Note");
            addn.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        addnMouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        addnMouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        addnMouseExited(evt);
                  }
            });
            getContentPane().add(addn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 460, 90));

            addp.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
            addp.setForeground(new java.awt.Color(0, 51, 102));
            addp.setText("          Add a new Problem");
            addp.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        addpMouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        addpMouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        addpMouseExited(evt);
                  }
            });
            getContentPane().add(addp, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 460, 90));

            addc.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
            addc.setForeground(new java.awt.Color(102, 0, 0));
            addc.setText("          Add a new Contest");
            addc.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        addcMouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        addcMouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        addcMouseExited(evt);
                  }
            });
            getContentPane().add(addc, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 470, 100));

            dif1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
            dif1.setForeground(new java.awt.Color(51, 51, 51));
            dif1.setText("        500-800");
            dif1.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        dif1MouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        dif1MouseExited(evt);
                  }
            });
            getContentPane().add(dif1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 160, 200, 60));

            dif2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
            dif2.setForeground(new java.awt.Color(51, 51, 51));
            dif2.setText("        900-1100");
            dif2.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        dif2MouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        dif2MouseExited(evt);
                  }
            });
            getContentPane().add(dif2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 230, 200, 60));

            dif3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
            dif3.setForeground(new java.awt.Color(51, 51, 51));
            dif3.setText("        1200-1500");
            dif3.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        dif3MouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        dif3MouseExited(evt);
                  }
            });
            getContentPane().add(dif3, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 300, 200, 60));

            dif4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
            dif4.setForeground(new java.awt.Color(51, 51, 51));
            dif4.setText("        1600-2000");
            dif4.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        dif4MouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        dif4MouseExited(evt);
                  }
            });
            getContentPane().add(dif4, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 370, 200, 60));

            dif5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
            dif5.setForeground(new java.awt.Color(51, 51, 51));
            dif5.setText("        2100-3000");
            dif5.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        dif5MouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        dif5MouseExited(evt);
                  }
            });
            getContentPane().add(dif5, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 450, 190, 50));

            dif6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
            dif6.setForeground(new java.awt.Color(51, 51, 51));
            dif6.setText("        3000++");
            dif6.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        dif6MouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        dif6MouseExited(evt);
                  }
            });
            getContentPane().add(dif6, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 520, 200, 50));

            menuBg.setBackground(new java.awt.Color(51, 51, 51));

            menu.setBackground(new java.awt.Color(51, 51, 51));
            menu.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            menu.setForeground(new java.awt.Color(255, 255, 255));
            menu.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            menu.setSelectionBackground(new java.awt.Color(255, 255, 255));
            menu.setSelectionForeground(new java.awt.Color(0, 0, 0));
            menu.setVisibleRowCount(12);
            menu.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        menuMouseClicked(evt);
                  }
            });
            jScrollPane1.setViewportView(menu);

            javax.swing.GroupLayout menuBgLayout = new javax.swing.GroupLayout(menuBg);
            menuBg.setLayout(menuBgLayout);
            menuBgLayout.setHorizontalGroup(
                  menuBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(menuBgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                        .addContainerGap())
            );
            menuBgLayout.setVerticalGroup(
                  menuBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(menuBgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                        .addContainerGap())
            );

            getContentPane().add(menuBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 300, -1));

            menuIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Internal Files/menu.jpg"))); // NOI18N
            menuIcon.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        menuIconMouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        menuIconMouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        menuIconMouseExited(evt);
                  }
            });
            getContentPane().add(menuIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 70));

            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Internal Files/close1.jpg"))); // NOI18N
            jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        jLabel2MouseClicked(evt);
                  }
            });
            getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 20, -1, 40));

            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Internal Files/min1.jpg"))); // NOI18N
            jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        jLabel3MouseClicked(evt);
                  }
            });
            getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 20, 50, 40));
            getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1180, 20));
            getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1180, 20));

            bg.setBackground(new java.awt.Color(102, 102, 255));
            bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Internal Files/a bg3.jpg"))); // NOI18N
            bg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
            bg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                  public void mouseDragged(java.awt.event.MouseEvent evt) {
                        bgMouseDragged(evt);
                  }
            });
            bg.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mousePressed(java.awt.event.MouseEvent evt) {
                        bgMousePressed(evt);
                  }
            });
            getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 768));

            pack();
            setLocationRelativeTo(null);
      }// </editor-fold>//GEN-END:initComponents

      private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
            System.exit(0);
      }//GEN-LAST:event_jLabel2MouseClicked

      private void menuIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuIconMouseClicked
            if(menuStatus==0){
                  menuBg.setVisible(true);
                  menuStatus=1;
                  menuIcon.setSize(64, 64);
            }
            else{
                  menuBg.setVisible(false);
                  menuStatus=0;
                  menuIcon.setSize(64, 64);
            }
      }//GEN-LAST:event_menuIconMouseClicked

      private void addpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addpMouseClicked
            Createb obj = new Createb();
            obj.setVisible(true);
            setVisible(false);
            obj.setconlist();
      }//GEN-LAST:event_addpMouseClicked

      private void addpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addpMouseExited
            addp.setForeground(Color.decode("#003366"));
      }//GEN-LAST:event_addpMouseExited

      private void addpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addpMouseEntered
            addp.setForeground(Color.black);
      }//GEN-LAST:event_addpMouseEntered

      private void addcMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addcMouseEntered
            addc.setForeground(Color.black);
      }//GEN-LAST:event_addcMouseEntered

      private void addcMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addcMouseExited
           addc.setForeground(Color.decode("#660000"));
      }//GEN-LAST:event_addcMouseExited

      private void addnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addnMouseEntered
            addn.setForeground(Color.black);
      }//GEN-LAST:event_addnMouseEntered

      private void addnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addnMouseExited
            addn.setForeground(Color.decode("#006600"));
      }//GEN-LAST:event_addnMouseExited

      private void dif1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dif1MouseEntered
            dif1.setForeground(Color.black);
      }//GEN-LAST:event_dif1MouseEntered

      private void dif2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dif2MouseEntered
            dif2.setForeground(Color.black);
      }//GEN-LAST:event_dif2MouseEntered

      private void dif3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dif3MouseEntered
            dif3.setForeground(Color.black);
      }//GEN-LAST:event_dif3MouseEntered

      private void dif4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dif4MouseEntered
            dif4.setForeground(Color.black);
      }//GEN-LAST:event_dif4MouseEntered

      private void dif5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dif5MouseEntered
            dif5.setForeground(Color.black);
      }//GEN-LAST:event_dif5MouseEntered

      private void dif6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dif6MouseEntered
            dif6.setForeground(Color.black);
      }//GEN-LAST:event_dif6MouseEntered

      private void dif1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dif1MouseExited
            dif1.setForeground(Color.darkGray);
      }//GEN-LAST:event_dif1MouseExited

      private void dif2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dif2MouseExited
            dif2.setForeground(Color.darkGray);
      }//GEN-LAST:event_dif2MouseExited

      private void dif3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dif3MouseExited
            dif3.setForeground(Color.darkGray);
      }//GEN-LAST:event_dif3MouseExited

      private void dif4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dif4MouseExited
            dif4.setForeground(Color.darkGray);
      }//GEN-LAST:event_dif4MouseExited

      private void dif5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dif5MouseExited
            dif5.setForeground(Color.darkGray);
      }//GEN-LAST:event_dif5MouseExited

      private void dif6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dif6MouseExited
           dif6.setForeground(Color.darkGray);
      }//GEN-LAST:event_dif6MouseExited

      private void menuIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuIconMouseEntered
            menuIcon.setSize(80, 80);
      }//GEN-LAST:event_menuIconMouseEntered

      private void menuIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuIconMouseExited
            menuIcon.setSize(64, 64);
      }//GEN-LAST:event_menuIconMouseExited

      private void ht1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ht1MouseEntered
            ht1.setForeground(Color.decode("#003366"));
      }//GEN-LAST:event_ht1MouseEntered

      private void ht2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ht2MouseExited
            ht2.setForeground(Color.decode("#003366"));
      }//GEN-LAST:event_ht2MouseExited

      private void ht1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ht1MouseExited
           ht1.setForeground(Color.decode("#990000"));
      }//GEN-LAST:event_ht1MouseExited

      private void ht2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ht2MouseEntered
            ht2.setForeground(Color.decode("#990000"));
      }//GEN-LAST:event_ht2MouseEntered

      private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
            setState(ICONIFIED);
      }//GEN-LAST:event_jLabel3MouseClicked

      private void addcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addcMouseClicked
            
            new Createa().setVisible(true);
            setVisible(false);
            
      }//GEN-LAST:event_addcMouseClicked

      private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
            if(menu.getSelectedValue().toString().length()>5){
                  Data.cscon=menu.getSelectedValue().toString();
                  Problems obj = new Problems();
                  obj.set(menu.getSelectedValue().toString());
                  obj.setVisible(true);
                  setVisible(false);
            }
      }//GEN-LAST:event_menuMouseClicked

      private void addnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addnMouseClicked
            new Createc().setVisible(true);
            setVisible(false);
      }//GEN-LAST:event_addnMouseClicked

      private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
            jPanel1.setBackground(Color.gray);
      }//GEN-LAST:event_jPanel1MouseEntered

      private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
            jPanel1.setBackground(Color.white);
      }//GEN-LAST:event_jPanel1MouseExited

      private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
            jPanel1.setBackground(Color.black);
            new SNList().setVisible(true);
            setVisible(false);
      }//GEN-LAST:event_jPanel1MouseClicked

      private void bgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMousePressed
            xm=evt.getX();
            ym=evt.getY();
      }//GEN-LAST:event_bgMousePressed

      private void bgMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMouseDragged
            xx= evt.getXOnScreen();
            yy= evt.getYOnScreen();
            
            this.setLocation(xx-xm, yy-ym);
      }//GEN-LAST:event_bgMouseDragged

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
                  java.util.logging.Logger.getLogger(Note.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                  java.util.logging.Logger.getLogger(Note.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                  java.util.logging.Logger.getLogger(Note.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                  java.util.logging.Logger.getLogger(Note.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
                        Note start = new Note();
                        start.setVisible(true);
                        start.menuBg.setVisible(false);
                  }
            });
      }

      void setmenu(){
            int listindex=0;
            DefaultListModel listop = new DefaultListModel();
            menu.setModel(listop);
            for(int i=0; i<=Data.conptr; i++){
                  listop.add(listindex, Data.con[i][0]);
                              listindex++;
                  listop.add(listindex, " ");
                              listindex++;
            }
            menuBg.setVisible(false);
      }
      
      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JLabel addc;
      private javax.swing.JLabel addn;
      private javax.swing.JLabel addp;
      private javax.swing.JLabel bg;
      private javax.swing.JLabel dif1;
      private javax.swing.JLabel dif2;
      private javax.swing.JLabel dif3;
      private javax.swing.JLabel dif4;
      private javax.swing.JLabel dif5;
      private javax.swing.JLabel dif6;
      private javax.swing.JLabel ht1;
      private javax.swing.JLabel ht2;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JPanel jPanel1;
      private javax.swing.JScrollPane jScrollPane1;
      private javax.swing.JSeparator jSeparator1;
      private javax.swing.JSeparator jSeparator2;
      private javax.swing.JSeparator jSeparator3;
      private javax.swing.JList menu;
      private javax.swing.JPanel menuBg;
      private javax.swing.JLabel menuIcon;
      private javax.swing.JLabel sna;
      private javax.swing.JLabel snb;
      // End of variables declaration//GEN-END:variables
}
