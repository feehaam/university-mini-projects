
import java.awt.Color;

/**
 *
 * @author MD.Feeham
 */
public class SNList extends javax.swing.JFrame {

      /**
       * Creates new form SNList
       */
      int xm,ym,xx,yy;
            String list[]=new String [1000];
            int ptr=0;
            int page=0;
            
      public SNList() {
            initComponents();
            String s = Fileop.Read(Data.dir+"CFNotes\\SpecialNotes\\List.txt");
            //System.out.println(list);
            for(int i=0; i<s.length(); i++){
                  if(s.charAt(i)=='@'){
                        for(int j=i+1; j<s.length(); j++){
                              if(s.charAt(j)==';'&&s.charAt(j+1)==';'){
                                    list[ptr]=s.substring(i+1, j);
                                    ptr++;
                                    i=j++;
                                    break;
                              }
                        }
                  }
            }
            ptr=0;
            while(list[ptr]!=null){
                  ptr++;
            }
            int ptr2=ptr-1;
            String rev[]=new String[1000];
            for(int xx=0; xx<ptr; xx++){
                  rev[xx]=list[ptr2];
                  ptr2--;
            }
            for(int xx=0; xx<ptr; xx++){
                  list[xx]=rev[xx];
            }
            
            int item;
            item=page*5;
            sn1.setText(list[item++]);
            sn2.setText(list[item++]);
            sn3.setText(list[item++]);
            sn4.setText(list[item++]);
            sn5.setText(list[item++]);
            
            if(ptr>5){
                  next.setEnabled(true);
                  next.setForeground(Color.decode("#3366FF"));
            }
      }
      
      static void set(){
            
      }

      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            jLabel1 = new javax.swing.JLabel();
            ht1 = new javax.swing.JLabel();
            ht2 = new javax.swing.JLabel();
            jSeparator1 = new javax.swing.JSeparator();
            jSeparator2 = new javax.swing.JSeparator();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            next = new javax.swing.JButton();
            prev = new javax.swing.JButton();
            sn1 = new javax.swing.JLabel();
            sn3 = new javax.swing.JLabel();
            sn2 = new javax.swing.JLabel();
            sn4 = new javax.swing.JLabel();
            sn5 = new javax.swing.JLabel();
            jSeparator3 = new javax.swing.JSeparator();
            jSeparator4 = new javax.swing.JSeparator();
            jSeparator5 = new javax.swing.JSeparator();
            jSeparator6 = new javax.swing.JSeparator();
            jSeparator7 = new javax.swing.JSeparator();
            jLabel6 = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setUndecorated(true);

            jPanel1.setBackground(new java.awt.Color(255, 255, 255));
            jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                  public void mouseDragged(java.awt.event.MouseEvent evt) {
                        jPanel1MouseDragged(evt);
                  }
            });
            jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mousePressed(java.awt.event.MouseEvent evt) {
                        jPanel1MousePressed(evt);
                  }
            });

            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Internal Files/sn64.jpg"))); // NOI18N

            ht1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
            ht1.setForeground(new java.awt.Color(153, 0, 0));
            ht1.setText("Special");
            ht1.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        ht1MouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        ht1MouseExited(evt);
                  }
            });

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

            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Internal Files/sn64.jpg"))); // NOI18N

            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Internal Files/sn64.jpg"))); // NOI18N

            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Internal Files/sn64.jpg"))); // NOI18N

            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Internal Files/sn64.jpg"))); // NOI18N

            next.setBackground(new java.awt.Color(204, 204, 204));
            next.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            next.setForeground(new java.awt.Color(153, 153, 153));
            next.setText(">>");
            next.setEnabled(false);
            next.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        nextActionPerformed(evt);
                  }
            });

            prev.setBackground(new java.awt.Color(204, 204, 204));
            prev.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            prev.setForeground(new java.awt.Color(153, 153, 153));
            prev.setText("<<");
            prev.setEnabled(false);
            prev.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        prevActionPerformed(evt);
                  }
            });

            sn1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
            sn1.setText("Codeforces educational round 10 best submissions problrm D");
            sn1.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        sn1MouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        sn1MouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        sn1MouseExited(evt);
                  }
            });

            sn3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
            sn3.setText("Codeforces educational round 10 best submissions problrm D");
            sn3.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        sn3MouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        sn3MouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        sn3MouseExited(evt);
                  }
            });

            sn2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
            sn2.setText("Codeforces educational round 10 best submissions problrm D");
            sn2.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        sn2MouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        sn2MouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        sn2MouseExited(evt);
                  }
            });

            sn4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
            sn4.setText("Codeforces educational round 10 best submissions problrm D");
            sn4.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        sn4MouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        sn4MouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        sn4MouseExited(evt);
                  }
            });

            sn5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
            sn5.setText("Codeforces educational round 10 best submissions problrm D");
            sn5.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        sn5MouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        sn5MouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        sn5MouseExited(evt);
                  }
            });

            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Internal Files/close1.jpg"))); // NOI18N
            jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        jLabel6MouseClicked(evt);
                  }
            });

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                      .addContainerGap()
                                                      .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                      .addGap(30, 30, 30)
                                                      .addComponent(jLabel1)))
                                          .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                      .addComponent(jLabel5)
                                                      .addComponent(jLabel4)
                                                      .addComponent(jLabel3))))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(sn1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(sn3, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(sn2, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(sn4, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(sn5, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)))
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                      .addComponent(prev)
                                                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                      .addComponent(next))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                          .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(ht1)
                                                .addGap(7, 7, 7)
                                                .addComponent(ht2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel6)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel1Layout.setVerticalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(ht1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(ht2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(sn1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(sn2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(sn3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                              .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(sn4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                              .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(sn5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(next)
                              .addComponent(prev))
                        .addContainerGap())
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            pack();
            setLocationRelativeTo(null);
      }// </editor-fold>//GEN-END:initComponents

      private void ht1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ht1MouseEntered
            ht1.setForeground(Color.decode("#003366"));
      }//GEN-LAST:event_ht1MouseEntered

      private void ht1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ht1MouseExited
            ht1.setForeground(Color.decode("#990000"));
      }//GEN-LAST:event_ht1MouseExited

      private void ht2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ht2MouseEntered
            ht2.setForeground(Color.decode("#990000"));
      }//GEN-LAST:event_ht2MouseEntered

      private void ht2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ht2MouseExited
            ht2.setForeground(Color.decode("#003366"));
      }//GEN-LAST:event_ht2MouseExited

      private void sn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn1MouseEntered
            sn1.setForeground(Color.decode("#3366FF"));
      }//GEN-LAST:event_sn1MouseEntered

      private void sn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn2MouseEntered
            sn2.setForeground(Color.decode("#3366FF"));
      }//GEN-LAST:event_sn2MouseEntered

      private void sn3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn3MouseEntered
             sn3.setForeground(Color.decode("#3366FF"));
      }//GEN-LAST:event_sn3MouseEntered

      private void sn4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn4MouseEntered
            sn4.setForeground(Color.decode("#3366FF"));
      }//GEN-LAST:event_sn4MouseEntered

      private void sn5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn5MouseEntered
            sn5.setForeground(Color.decode("#3366FF"));
      }//GEN-LAST:event_sn5MouseEntered

      private void sn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn1MouseExited
            sn1.setForeground(Color.decode("#000000"));
      }//GEN-LAST:event_sn1MouseExited

      private void sn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn2MouseExited
            sn2.setForeground(Color.decode("#000000"));
      }//GEN-LAST:event_sn2MouseExited

      private void sn3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn3MouseExited
            sn3.setForeground(Color.decode("#000000"));
      }//GEN-LAST:event_sn3MouseExited

      private void sn4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn4MouseExited
            sn4.setForeground(Color.decode("#000000"));
      }//GEN-LAST:event_sn4MouseExited

      private void sn5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn5MouseExited
            sn5.setForeground(Color.decode("#000000"));
      }//GEN-LAST:event_sn5MouseExited

      private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
            Note obj = new Note();
            obj.setmenu();
            obj.setVisible(true);
            setVisible(false);
      }//GEN-LAST:event_jLabel6MouseClicked

      private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
            
            page++;
            prev.setEnabled(true);
            prev.setForeground(Color.decode("#3366FF"));
            int item;
            item=page*5;
            sn1.setText(list[item++]);
            sn2.setText(list[item++]);
            sn3.setText(list[item++]);
            sn4.setText(list[item++]);
            sn5.setText(list[item++]);
            
            if(ptr>page*5+5){
                  next.setEnabled(true);
                  next.setForeground(Color.decode("#3366FF"));
            }
            else{
                  next.setEnabled(false);
                  next.setForeground(Color.decode("#999999"));
            }
            
            
      }//GEN-LAST:event_nextActionPerformed

      private void prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevActionPerformed
            page--;
            next.setEnabled(true);
            next.setForeground(Color.decode("#3366FF"));
            int item;
            item=page*5;
            sn1.setText(list[item++]);
            sn2.setText(list[item++]);
            sn3.setText(list[item++]);
            sn4.setText(list[item++]);
            sn5.setText(list[item++]);
            
            if(page==0){
                  prev.setEnabled(false);
                  prev.setForeground(Color.decode("#999999"));
            }
            
      }//GEN-LAST:event_prevActionPerformed

      private void sn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn3MouseClicked
            new View(sn3.getText()).setVisible(true);
      }//GEN-LAST:event_sn3MouseClicked

      private void sn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn1MouseClicked
            new View(sn1.getText()).setVisible(true);
      }//GEN-LAST:event_sn1MouseClicked

      private void sn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn2MouseClicked
            new View(sn2.getText()).setVisible(true);
      }//GEN-LAST:event_sn2MouseClicked

      private void sn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn4MouseClicked
           new View(sn4.getText()).setVisible(true);
      }//GEN-LAST:event_sn4MouseClicked

      private void sn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn5MouseClicked
            new View(sn5.getText()).setVisible(true);
      }//GEN-LAST:event_sn5MouseClicked

      private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
            xm=evt.getX();
            ym=evt.getY();
      }//GEN-LAST:event_jPanel1MousePressed

      private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
            xx= evt.getXOnScreen();
            yy= evt.getYOnScreen();
            
            this.setLocation(xx-xm, yy-ym);
      }//GEN-LAST:event_jPanel1MouseDragged

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
                  java.util.logging.Logger.getLogger(SNList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                  java.util.logging.Logger.getLogger(SNList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                  java.util.logging.Logger.getLogger(SNList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                  java.util.logging.Logger.getLogger(SNList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
                        new SNList().setVisible(true);
                  }
            });
      }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JLabel ht1;
      private javax.swing.JLabel ht2;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JLabel jLabel6;
      private javax.swing.JPanel jPanel1;
      private javax.swing.JSeparator jSeparator1;
      private javax.swing.JSeparator jSeparator2;
      private javax.swing.JSeparator jSeparator3;
      private javax.swing.JSeparator jSeparator4;
      private javax.swing.JSeparator jSeparator5;
      private javax.swing.JSeparator jSeparator6;
      private javax.swing.JSeparator jSeparator7;
      private javax.swing.JButton next;
      private javax.swing.JButton prev;
      private javax.swing.JLabel sn1;
      private javax.swing.JLabel sn2;
      private javax.swing.JLabel sn3;
      private javax.swing.JLabel sn4;
      private javax.swing.JLabel sn5;
      // End of variables declaration//GEN-END:variables
}
