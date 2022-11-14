import com.sun.swing.internal.plaf.basic.resources.basic;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author MD.Feeham
 */
public class Timer extends javax.swing.JFrame {
      int timeD, timeH, timeM, timeS, c, autoStart=-1;
      String list[]=new String [1000];
      int ptr=0;
      int page=0;
      String selectedTimer=null;
      boolean selected = false;
      public Timer() {
            initComponents();
            basicSetups();
            
            //TimerClock.start();
      }
      
            
      private void basicSetups(){
            ptr = 0; 
            page = 0;
            add.setEnabled(true);
            add.setForeground(Color.decode("#3366FF"));
            remove.setEnabled(true);
            remove.setForeground(Color.decode("#3366FF"));
            
            String s = FFiles.read("D:\\Program Files\\FTimer\\List.txt");
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
            //24 char is here.
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
            
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jScrollPane1 = new javax.swing.JScrollPane();
            jEditorPane1 = new javax.swing.JEditorPane();
            jPanel1 = new javax.swing.JPanel();
            jPanel2 = new javax.swing.JPanel();
            jLabel1 = new javax.swing.JLabel();
            jPanel3 = new javax.swing.JPanel();
            jPanel4 = new javax.swing.JPanel();
            jLabel2 = new javax.swing.JLabel();
            jSeparator3 = new javax.swing.JSeparator();
            sn1 = new javax.swing.JLabel();
            jPanel5 = new javax.swing.JPanel();
            jLabel3 = new javax.swing.JLabel();
            jSeparator4 = new javax.swing.JSeparator();
            sn2 = new javax.swing.JLabel();
            jPanel6 = new javax.swing.JPanel();
            jLabel4 = new javax.swing.JLabel();
            jSeparator5 = new javax.swing.JSeparator();
            sn3 = new javax.swing.JLabel();
            jPanel7 = new javax.swing.JPanel();
            jLabel5 = new javax.swing.JLabel();
            jSeparator6 = new javax.swing.JSeparator();
            sn4 = new javax.swing.JLabel();
            jPanel8 = new javax.swing.JPanel();
            jLabel6 = new javax.swing.JLabel();
            jSeparator7 = new javax.swing.JSeparator();
            sn5 = new javax.swing.JLabel();
            prev = new javax.swing.JButton();
            next = new javax.swing.JButton();
            add = new javax.swing.JButton();
            remove = new javax.swing.JButton();
            jPanel9 = new javax.swing.JPanel();
            ht1 = new javax.swing.JLabel();
            ht2 = new javax.swing.JLabel();
            timerbg = new javax.swing.JPanel();
            timer = new javax.swing.JLabel();
            start = new javax.swing.JButton();
            stop = new javax.swing.JButton();
            jPanel10 = new javax.swing.JPanel();
            jLabel7 = new javax.swing.JLabel();
            timersec = new javax.swing.JLabel();
            ms = new javax.swing.JLabel();
            ps = new javax.swing.JLabel();
            jPanel11 = new javax.swing.JPanel();
            jLabel10 = new javax.swing.JLabel();
            timermin = new javax.swing.JLabel();
            mm2 = new javax.swing.JLabel();
            pm = new javax.swing.JLabel();
            jPanel12 = new javax.swing.JPanel();
            jLabel13 = new javax.swing.JLabel();
            timerhou = new javax.swing.JLabel();
            mh = new javax.swing.JLabel();
            ph = new javax.swing.JLabel();
            jPanel13 = new javax.swing.JPanel();
            jLabel16 = new javax.swing.JLabel();
            timerday = new javax.swing.JLabel();
            md = new javax.swing.JLabel();
            pd = new javax.swing.JLabel();
            auto = new javax.swing.JButton();
            jButton4 = new javax.swing.JButton();

            jScrollPane1.setViewportView(jEditorPane1);

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jPanel1.setBackground(new java.awt.Color(204, 204, 204));

            jPanel2.setBackground(new java.awt.Color(255, 255, 255));
            jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            jLabel1.setFont(new java.awt.Font("Engravers MT", 1, 48)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(51, 51, 51));
            jLabel1.setText(" F TIMER");

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                  jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel2Layout.setVerticalGroup(
                  jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                        .addContainerGap())
            );

            jPanel3.setBackground(new java.awt.Color(255, 255, 255));

            jPanel4.setBackground(new java.awt.Color(255, 255, 255));
            jPanel4.setForeground(new java.awt.Color(51, 51, 51));

            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sn48.jpg"))); // NOI18N

            sn1.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
            sn1.setText("Game Development counter");
            sn1.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        sn1MouseClicked(evt);
                  }
            });

            javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
            jPanel4.setLayout(jPanel4Layout);
            jPanel4Layout.setHorizontalGroup(
                  jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(sn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                              .addComponent(jSeparator3))
                        .addContainerGap())
            );
            jPanel4Layout.setVerticalGroup(
                  jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(sn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
            );

            jPanel5.setBackground(new java.awt.Color(255, 255, 255));
            jPanel5.setForeground(new java.awt.Color(51, 51, 51));

            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sn48.jpg"))); // NOI18N

            sn2.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
            sn2.setText("Game Development counter");
            sn2.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        sn2MouseClicked(evt);
                  }
            });

            javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
            jPanel5.setLayout(jPanel5Layout);
            jPanel5Layout.setHorizontalGroup(
                  jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(sn2, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))
                              .addComponent(jSeparator4))
                        .addContainerGap())
            );
            jPanel5Layout.setVerticalGroup(
                  jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(sn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
            );

            jPanel6.setBackground(new java.awt.Color(255, 255, 255));
            jPanel6.setForeground(new java.awt.Color(51, 51, 51));

            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sn48.jpg"))); // NOI18N

            sn3.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
            sn3.setText("Game Development counter");
            sn3.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        sn3MouseClicked(evt);
                  }
            });

            javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
            jPanel6.setLayout(jPanel6Layout);
            jPanel6Layout.setHorizontalGroup(
                  jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(sn3, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))
                              .addComponent(jSeparator5))
                        .addContainerGap())
            );
            jPanel6Layout.setVerticalGroup(
                  jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(sn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
            );

            jPanel7.setBackground(new java.awt.Color(255, 255, 255));
            jPanel7.setForeground(new java.awt.Color(51, 51, 51));

            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sn48.jpg"))); // NOI18N

            sn4.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
            sn4.setText("Game Development counter");
            sn4.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        sn4MouseClicked(evt);
                  }
            });

            javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
            jPanel7.setLayout(jPanel7Layout);
            jPanel7Layout.setHorizontalGroup(
                  jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(sn4, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))
                              .addComponent(jSeparator6))
                        .addContainerGap())
            );
            jPanel7Layout.setVerticalGroup(
                  jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(sn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
            );

            jPanel8.setBackground(new java.awt.Color(255, 255, 255));
            jPanel8.setForeground(new java.awt.Color(51, 51, 51));

            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sn48.jpg"))); // NOI18N

            sn5.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
            sn5.setText("Game Development counter");
            sn5.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        sn5MouseClicked(evt);
                  }
            });

            javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
            jPanel8.setLayout(jPanel8Layout);
            jPanel8Layout.setHorizontalGroup(
                  jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(sn5, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))
                              .addComponent(jSeparator7))
                        .addContainerGap())
            );
            jPanel8Layout.setVerticalGroup(
                  jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(sn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
            );

            prev.setBackground(new java.awt.Color(204, 204, 204));
            prev.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            prev.setForeground(new java.awt.Color(153, 153, 153));
            prev.setText("<<");
            prev.setEnabled(false);
            prev.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        prevMouseEntered(evt);
                  }
            });
            prev.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        prevActionPerformed(evt);
                  }
            });

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

            add.setBackground(new java.awt.Color(204, 204, 204));
            add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            add.setForeground(new java.awt.Color(153, 153, 153));
            add.setText("Add a new timer");
            add.setEnabled(false);
            add.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        addActionPerformed(evt);
                  }
            });

            remove.setBackground(new java.awt.Color(204, 204, 204));
            remove.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            remove.setForeground(new java.awt.Color(153, 153, 153));
            remove.setText("Remove a timer");
            remove.setEnabled(false);
            remove.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        removeActionPerformed(evt);
                  }
            });

            jPanel9.setBackground(new java.awt.Color(255, 255, 255));
            jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            ht1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
            ht1.setForeground(new java.awt.Color(153, 0, 0));
            ht1.setText("Timer");
            ht1.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        ht1MouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        ht1MouseExited(evt);
                  }
            });

            ht2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
            ht2.setForeground(new java.awt.Color(0, 51, 102));
            ht2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            ht2.setText("List");
            ht2.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        ht2MouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        ht2MouseExited(evt);
                  }
            });

            javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
            jPanel9.setLayout(jPanel9Layout);
            jPanel9Layout.setHorizontalGroup(
                  jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ht1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ht2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel9Layout.setVerticalGroup(
                  jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(ht1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(ht2, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)))
            );

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                  jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                              .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(remove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(prev)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(next))
                              .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
            );
            jPanel3Layout.setVerticalGroup(
                  jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(prev)
                              .addComponent(next))
                        .addGap(18, 18, 18)
                        .addComponent(add)
                        .addGap(12, 12, 12)
                        .addComponent(remove)
                        .addContainerGap(12, Short.MAX_VALUE))
            );

            timerbg.setBackground(new java.awt.Color(255, 255, 255));

            timer.setBackground(new java.awt.Color(255, 255, 255));
            timer.setFont(new java.awt.Font("ROG Fonts", 1, 48)); // NOI18N
            timer.setForeground(new java.awt.Color(51, 51, 51));
            timer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            timer.setText("00: 00 : 00 : 00");
            timer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            timer.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        timerMouseClicked(evt);
                  }
            });

            start.setBackground(new java.awt.Color(51, 51, 51));
            start.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
            start.setForeground(new java.awt.Color(255, 255, 255));
            start.setText("START");
            start.setEnabled(false);
            start.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        startActionPerformed(evt);
                  }
            });

            stop.setBackground(new java.awt.Color(51, 51, 51));
            stop.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
            stop.setForeground(new java.awt.Color(255, 255, 255));
            stop.setText("STOP");
            stop.setEnabled(false);
            stop.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        stopActionPerformed(evt);
                  }
            });

            jPanel10.setBackground(new java.awt.Color(153, 255, 102));
            jPanel10.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
            jPanel10.setForeground(new java.awt.Color(51, 51, 51));

            jLabel7.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
            jLabel7.setForeground(new java.awt.Color(51, 51, 51));
            jLabel7.setText("SECONDS");

            timersec.setFont(new java.awt.Font("ROG Fonts", 1, 36)); // NOI18N
            timersec.setForeground(new java.awt.Color(51, 51, 51));
            timersec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            timersec.setText("0000");

            ms.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
            ms.setForeground(new java.awt.Color(51, 51, 51));
            ms.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            ms.setText("-1");
            ms.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            ms.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        msMouseClicked(evt);
                  }
            });

            ps.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
            ps.setForeground(new java.awt.Color(51, 51, 51));
            ps.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            ps.setText("+1");
            ps.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            ps.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        psMouseClicked(evt);
                  }
            });

            javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
            jPanel10.setLayout(jPanel10Layout);
            jPanel10Layout.setHorizontalGroup(
                  jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(timersec, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ps)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ms)
                        .addContainerGap())
            );
            jPanel10Layout.setVerticalGroup(
                  jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(timersec, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ms, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                              .addComponent(ps, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
            );

            jPanel11.setBackground(new java.awt.Color(255, 153, 102));
            jPanel11.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
            jPanel11.setForeground(new java.awt.Color(51, 51, 51));

            jLabel10.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
            jLabel10.setForeground(new java.awt.Color(51, 51, 51));
            jLabel10.setText("MINUTES");

            timermin.setFont(new java.awt.Font("ROG Fonts", 1, 36)); // NOI18N
            timermin.setForeground(new java.awt.Color(51, 51, 51));
            timermin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            timermin.setText("000");

            mm2.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
            mm2.setForeground(new java.awt.Color(51, 51, 51));
            mm2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            mm2.setText("-1");
            mm2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            mm2.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        mm2MouseClicked(evt);
                  }
            });

            pm.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
            pm.setForeground(new java.awt.Color(51, 51, 51));
            pm.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            pm.setText("+1");
            pm.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            pm.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        pmMouseClicked(evt);
                  }
            });

            javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
            jPanel11.setLayout(jPanel11Layout);
            jPanel11Layout.setHorizontalGroup(
                  jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(timermin, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                        .addGap(88, 88, 88)
                        .addComponent(pm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mm2)
                        .addContainerGap())
            );
            jPanel11Layout.setVerticalGroup(
                  jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(timermin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jLabel10)
                              .addComponent(mm2, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                              .addComponent(pm, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                        .addContainerGap())
            );

            jPanel12.setBackground(new java.awt.Color(153, 153, 255));
            jPanel12.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
            jPanel12.setForeground(new java.awt.Color(51, 51, 51));

            jLabel13.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
            jLabel13.setForeground(new java.awt.Color(51, 51, 51));
            jLabel13.setText("HOURS");

            timerhou.setFont(new java.awt.Font("ROG Fonts", 1, 36)); // NOI18N
            timerhou.setForeground(new java.awt.Color(51, 51, 51));
            timerhou.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            timerhou.setText("00");

            mh.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
            mh.setForeground(new java.awt.Color(51, 51, 51));
            mh.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            mh.setText("-1");
            mh.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            mh.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        mhMouseClicked(evt);
                  }
            });

            ph.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
            ph.setForeground(new java.awt.Color(51, 51, 51));
            ph.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            ph.setText("+1");
            ph.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            ph.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        phMouseClicked(evt);
                  }
            });

            javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
            jPanel12.setLayout(jPanel12Layout);
            jPanel12Layout.setHorizontalGroup(
                  jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(timerhou, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                        .addGap(88, 88, 88)
                        .addComponent(ph)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mh)
                        .addContainerGap())
            );
            jPanel12Layout.setVerticalGroup(
                  jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(timerhou, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(mh, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                              .addComponent(jLabel13)
                              .addComponent(ph, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                        .addContainerGap())
            );

            jPanel13.setBackground(new java.awt.Color(204, 102, 255));
            jPanel13.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
            jPanel13.setForeground(new java.awt.Color(51, 51, 51));

            jLabel16.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
            jLabel16.setForeground(new java.awt.Color(51, 51, 51));
            jLabel16.setText("DAYS");

            timerday.setFont(new java.awt.Font("ROG Fonts", 1, 36)); // NOI18N
            timerday.setForeground(new java.awt.Color(51, 51, 51));
            timerday.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            timerday.setText("0");

            md.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
            md.setForeground(new java.awt.Color(51, 51, 51));
            md.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            md.setText("-1");
            md.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            md.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        mdMouseClicked(evt);
                  }
            });

            pd.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
            pd.setForeground(new java.awt.Color(51, 51, 51));
            pd.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            pd.setText("+1");
            pd.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            pd.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        pdMouseClicked(evt);
                  }
            });

            javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
            jPanel13.setLayout(jPanel13Layout);
            jPanel13Layout.setHorizontalGroup(
                  jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(timerday, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                        .addGap(88, 88, 88)
                        .addComponent(pd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(md)
                        .addContainerGap())
            );
            jPanel13Layout.setVerticalGroup(
                  jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(timerday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(md, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                              .addComponent(jLabel16)
                              .addComponent(pd, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                        .addContainerGap())
            );

            auto.setBackground(new java.awt.Color(51, 51, 51));
            auto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
            auto.setForeground(new java.awt.Color(255, 255, 255));
            auto.setText("SELECT A TIMER FROM RIGHT SIDE");
            auto.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        autoActionPerformed(evt);
                  }
            });

            jButton4.setBackground(new java.awt.Color(51, 51, 51));
            jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
            jButton4.setForeground(new java.awt.Color(255, 255, 255));
            jButton4.setText("SAVE AND EXIT");
            jButton4.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton4ActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout timerbgLayout = new javax.swing.GroupLayout(timerbg);
            timerbg.setLayout(timerbgLayout);
            timerbgLayout.setHorizontalGroup(
                  timerbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(timerbgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(timerbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(timer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addGroup(timerbgLayout.createSequentialGroup()
                                    .addComponent(start)
                                    .addGap(18, 18, 18)
                                    .addComponent(auto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(stop))
                              .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
            );
            timerbgLayout.setVerticalGroup(
                  timerbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(timerbgLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(timer, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(timerbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(start)
                              .addComponent(stop)
                              .addComponent(auto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(timerbg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
            );
            jPanel1Layout.setVerticalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                              .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(timerbg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            );

            pack();
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

      private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
            String s = JOptionPane.showInputDialog(this, "Please enter a name for timer.");
            if(s!= null){
                  if(s.length()>3 && s.length()<24){
                        FFiles.addTo("D:\\Program Files\\FTimer\\List.txt", "@"+s+";; ");
                        FFiles.createFolder("D:\\Program Files\\FTimer\\"+s);
                        FFiles.create("D:\\Program Files\\FTimer\\"+s+"\\autostart.txt");
                        FFiles.create("D:\\Program Files\\FTimer\\"+s+"\\counter.txt");
                        FFiles.addTo("D:\\Program Files\\FTimer\\"+s+"\\autostart.txt", "0");
                        FFiles.addTo("D:\\Program Files\\FTimer\\"+s+"\\counter.txt", "0");
                        basicSetups();
                  }
                  else{
                        JOptionPane.showMessageDialog(this, "Name must be between 4 to 23 charecters long.");
                  }
            }
      }//GEN-LAST:event_addActionPerformed

      
      
      private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
            String s = JOptionPane.showInputDialog("Type the timer name you want to delete.");
            s = s.toLowerCase();
            String l = FFiles.read("D:\\Program Files\\FTimer\\List.txt");
            l = l.toLowerCase();
            if(l.length()<4){
                  JOptionPane.showMessageDialog(this, "Please type the name meaningfully.");
                  return ;
            }
            if(l.contains(s)){
                  int n = l.indexOf(s);
                  for(int i=n; i>=0; i--)
                        if(l.charAt(i)=='@'){
                              n=i;
                              break;
                        }
                  int m=0;
                  for(int i=n; i<l.length(); i++)
                        if(l.charAt(i)==';'){
                              m=i;
                              break;
                        }
                  if(n==0)
                        n++;
                  l = FFiles.read("D:\\Program Files\\FTimer\\List.txt");
                  l = l.substring(0,n-1) + l.substring(m+1,l.length());
                  FFiles.changeData("D:\\Program Files\\FTimer\\List.txt", l);
                  basicSetups();
                  JOptionPane.showMessageDialog(this, "Timer item deleted successfully!");
            }
            else{
                  JOptionPane.showMessageDialog(this,"No matches found, please type the name correctly!");
            }
      }//GEN-LAST:event_removeActionPerformed

      private void prevMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prevMouseEntered
            // TODO add your handling code here:
      }//GEN-LAST:event_prevMouseEntered

      private void timerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timerMouseClicked
            
            TimerClock.start();
      }//GEN-LAST:event_timerMouseClicked

      private void setTimers(String s){
            int counter;
            autoStart = Integer.valueOf(FFiles.read("D:\\Program Files\\FTimer\\"+s+"\\autostart.txt"));
            if(autoStart == 1) {
                  auto.setText("AUTO START/STOP : ENABLED");
                  start.setEnabled(false);
                  stop.setEnabled(false);
            }
            else {
                  auto.setText("AUTO START/STOP : DISABLED");
                  start.setEnabled(true);
                  stop.setEnabled(true);
            }
            c = Integer.parseInt(FFiles.read("D:\\Program Files\\FTimer\\"+s+"\\counter.txt"));
            counter = c;
            timersec.setText(""+counter);
            timermin.setText(""+counter/60);
            timerhou.setText(""+counter/3600);
            timerday.setText(""+counter/3600/24);
            timeS = counter;
            timeM = counter/60;
            timeH = counter/3600;
            timeD = counter/3600/24;
            counter -= timeD*24*3600;
            timeH = counter/3600;
            counter -= timeH*3600;
            timeM = counter/60;
            counter -= timeM*60;
            timeS = counter;
            
            s="";
            if(timeD<10) s+= "0" + String.valueOf(timeD);
            else s+= String.valueOf(timeD);
            s+= " : " ;
            if(timeH<10) s+= "0" + String.valueOf(timeH);
            else s+= String.valueOf(timeH);
            s+= " : " ;
            if(timeM<10) s+= "0" + String.valueOf(timeM);
            else s+= String.valueOf(timeM);
            s+= " : " ;
            if(timeS<10) s+= "0" + String.valueOf(timeS);
            else s+= String.valueOf(timeS);
            
            timer.setText(s);
            
            ss = timeS;
            mm = timeM;
            hh = timeH;
            dd = timeD;
            
            
            timeS = c;
            timeM = c/60;
            timeH = c/3600;
            timeD = c/3600/24;
            
            
            if(autoStart==1)
                  TimerClock.start();
      }
      private void sel(String s){
            if(s==null)
                  return;
            if(timeS<0)
                  timeS=0;
            if(selected)
                  saveIt();
            selected = true;
            selectedTimer = s;
            TimerClock.stop();
            setTimers(s);
      }
      private void sn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn1MouseClicked
            sel(sn1.getText());
      }//GEN-LAST:event_sn1MouseClicked

      private void sn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn2MouseClicked
            sel(sn2.getText());
      }//GEN-LAST:event_sn2MouseClicked

      private void sn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn3MouseClicked
            sel(sn3.getText());
      }//GEN-LAST:event_sn3MouseClicked

      private void sn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn4MouseClicked
            sel(sn4.getText());
      }//GEN-LAST:event_sn4MouseClicked

      private void sn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn5MouseClicked
            sel(sn5.getText());
      }//GEN-LAST:event_sn5MouseClicked

      private void autoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoActionPerformed
            if(autoStart == 1){
                  auto.setText("AUTO START/STOP: DISABLED");
                  TimerClock.stop();
                  autoStart = 0;
                  start.setEnabled(true);
                  stop.setEnabled(true);
            }
            else if(autoStart == 0){
                  auto.setText("AUTO START/STOP: ENABLED");
                  TimerClock.start();
                  autoStart = 1;
                  start.setEnabled(false);
                  stop.setEnabled(false);
            }
            else{}
      }//GEN-LAST:event_autoActionPerformed

      private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
            TimerClock.start();
      }//GEN-LAST:event_startActionPerformed

      private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
            TimerClock.stop();
      }//GEN-LAST:event_stopActionPerformed

      private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            if(selected){
                  saveIt();
                  System.exit(0);
            }
            else System.exit(0);
      }//GEN-LAST:event_jButton4ActionPerformed

      private void psMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_psMouseClicked
            if(selected){
                  timeS+=1;
                  saveIt();
                  sel(selectedTimer);
            }
      }//GEN-LAST:event_psMouseClicked

      private void msMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_msMouseClicked
            if(selected){
                  timeS-=1;
                  saveIt();
                  sel(selectedTimer);
            }
      }//GEN-LAST:event_msMouseClicked

      private void pmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pmMouseClicked
            if(selected){
                  timeS+=60;
                  saveIt();
                  sel(selectedTimer);
            }
      }//GEN-LAST:event_pmMouseClicked

      private void mm2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mm2MouseClicked
            if(selected){
                  timeS-=60;
                  saveIt();
                  sel(selectedTimer);
            }
      }//GEN-LAST:event_mm2MouseClicked

      private void phMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phMouseClicked
            if(selected){
                  timeS+=3600;
                  saveIt();
                  sel(selectedTimer);
            }
      }//GEN-LAST:event_phMouseClicked

      private void mhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mhMouseClicked
            if(selected){
                  timeS-=3600;
                  saveIt();
                  sel(selectedTimer);
            }
      }//GEN-LAST:event_mhMouseClicked

      private void pdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pdMouseClicked
            if(selected){
                  timeS+=3600*24;
                  saveIt();
                  sel(selectedTimer);
            }
      }//GEN-LAST:event_pdMouseClicked

      private void mdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mdMouseClicked
            if(selected){
                  timeS-=3600*24;
                  saveIt();
                  sel(selectedTimer);
            }
      }//GEN-LAST:event_mdMouseClicked

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
                  java.util.logging.Logger.getLogger(Timer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                  java.util.logging.Logger.getLogger(Timer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                  java.util.logging.Logger.getLogger(Timer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                  java.util.logging.Logger.getLogger(Timer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
                        new Timer().setVisible(true);
                  }
            });
      }


                  javax.swing.Timer TimerClock = new javax.swing.Timer(1000,new ActionListener() {
            public void actionPerformed(ActionEvent e){  
                  timeS ++ ;
                  if(timeS%60==0){
                        timeM++;
                        timermin.setText(""+timeM);
                        saveIt();
                        if(timeM%60==0){
                              timeH++;
                              timerhou.setText(""+timeH);
                              if(timeH%24==0){
                                    timeD++;
                                    timerday.setText(""+timeD);
                              }
                        }
                  }
                  timersec.setText(timeS+"");
                  ss++;
                  setMain();
            }
});

        int ss, mm, hh, dd;
        private void setMain(){
              if(ss==60){
                    ss=0;
                    mm++;
                    if(mm==60){
                          mm=0;
                          hh++;
                          if(hh==24){
                                hh=0;
                                dd++;
                          }
                    }
              }
            String s="";
            if(dd<10) s+= "0" + String.valueOf(dd);
            else s+= String.valueOf(dd);
            s+= " : " ;
            if(hh<10) s+= "0" + String.valueOf(hh);
            else s+= String.valueOf(hh);
            s+= " : " ;
            if(mm<10) s+= "0" + String.valueOf(mm);
            else s+= String.valueOf(mm);
            s+= " : " ;
            if(ss<10) s+= "0" + String.valueOf(ss);
            else s+= String.valueOf(ss);
            
            timer.setText(s);
        }
        private void saveIt(){
              FFiles.changeData("D:\\Program Files\\FTimer\\"+selectedTimer+"\\counter.txt", timeS+"");
              FFiles.changeData("D:\\Program Files\\FTimer\\"+selectedTimer+"\\autostart.txt", autoStart+"");
        }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JButton add;
      private javax.swing.JButton auto;
      private javax.swing.JLabel ht1;
      private javax.swing.JLabel ht2;
      private javax.swing.JButton jButton4;
      private javax.swing.JEditorPane jEditorPane1;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel10;
      private javax.swing.JLabel jLabel13;
      private javax.swing.JLabel jLabel16;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JLabel jLabel6;
      private javax.swing.JLabel jLabel7;
      private javax.swing.JPanel jPanel1;
      private javax.swing.JPanel jPanel10;
      private javax.swing.JPanel jPanel11;
      private javax.swing.JPanel jPanel12;
      private javax.swing.JPanel jPanel13;
      private javax.swing.JPanel jPanel2;
      private javax.swing.JPanel jPanel3;
      private javax.swing.JPanel jPanel4;
      private javax.swing.JPanel jPanel5;
      private javax.swing.JPanel jPanel6;
      private javax.swing.JPanel jPanel7;
      private javax.swing.JPanel jPanel8;
      private javax.swing.JPanel jPanel9;
      private javax.swing.JScrollPane jScrollPane1;
      private javax.swing.JSeparator jSeparator3;
      private javax.swing.JSeparator jSeparator4;
      private javax.swing.JSeparator jSeparator5;
      private javax.swing.JSeparator jSeparator6;
      private javax.swing.JSeparator jSeparator7;
      private javax.swing.JLabel md;
      private javax.swing.JLabel mh;
      private javax.swing.JLabel mm2;
      private javax.swing.JLabel ms;
      private javax.swing.JButton next;
      private javax.swing.JLabel pd;
      private javax.swing.JLabel ph;
      private javax.swing.JLabel pm;
      private javax.swing.JButton prev;
      private javax.swing.JLabel ps;
      private javax.swing.JButton remove;
      private javax.swing.JLabel sn1;
      private javax.swing.JLabel sn2;
      private javax.swing.JLabel sn3;
      private javax.swing.JLabel sn4;
      private javax.swing.JLabel sn5;
      private javax.swing.JButton start;
      private javax.swing.JButton stop;
      private javax.swing.JLabel timer;
      private javax.swing.JPanel timerbg;
      private javax.swing.JLabel timerday;
      private javax.swing.JLabel timerhou;
      private javax.swing.JLabel timermin;
      private javax.swing.JLabel timersec;
      // End of variables declaration//GEN-END:variables
}
