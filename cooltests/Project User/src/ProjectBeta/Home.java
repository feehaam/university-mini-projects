package ProjectBeta;
import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
/**
 *
 * @author MD.Feeham
 */
public class Home extends javax.swing.JFrame {
      int X,Y, isitlab=0;
      public Home() {
            initComponents();
      }
      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jButton5 = new javax.swing.JButton();
            jLabel9 = new javax.swing.JLabel();
            jScrollPane2 = new javax.swing.JScrollPane();
            jEditorPane1 = new javax.swing.JEditorPane();
            jPanel1 = new javax.swing.JPanel();
            jPanel4 = new javax.swing.JPanel();
            jSeparator1 = new javax.swing.JSeparator();
            tabg = new javax.swing.JPanel();
            jPanel17 = new javax.swing.JPanel();
            jPanel21 = new javax.swing.JPanel();
            jButton10 = new javax.swing.JButton();
            jButton9 = new javax.swing.JButton();
            jButton8 = new javax.swing.JButton();
            jPanel2 = new javax.swing.JPanel();
            headname = new javax.swing.JTextField();
            headcc = new javax.swing.JTextField();
            jLabel2 = new javax.swing.JLabel();
            jLabel1 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jSeparator4 = new javax.swing.JSeparator();
            headpc1 = new javax.swing.JTextField();
            headpc = new javax.swing.JTextField();
            Table = new javax.swing.JTabbedPane();
            jPanel7 = new javax.swing.JPanel();
            jPanel5 = new javax.swing.JPanel();
            jPanel12 = new javax.swing.JPanel();
            retakenmsg1 = new javax.swing.JTextField();
            retakenmsg2 = new javax.swing.JTextField();
            retakenmsg3 = new javax.swing.JTextField();
            retakenmsg4 = new javax.swing.JTextField();
            jPanel13 = new javax.swing.JPanel();
            jLabel6 = new javax.swing.JLabel();
            jPanel15 = new javax.swing.JPanel();
            jLabel7 = new javax.swing.JLabel();
            jScrollPane1 = new javax.swing.JScrollPane();
            retakeList = new javax.swing.JList();
            jPanel16 = new javax.swing.JPanel();
            gpaList = new javax.swing.JComboBox();
            modify = new javax.swing.JButton();
            jLabel30 = new javax.swing.JLabel();
            retakemsg2 = new javax.swing.JLabel();
            retakemsg3 = new javax.swing.JLabel();
            retakemsg = new javax.swing.JLabel();
            retakeselected = new javax.swing.JLabel();
            jPanel14 = new javax.swing.JPanel();
            jPanel31 = new javax.swing.JPanel();
            jButton39 = new javax.swing.JButton();
            rps1c1 = new javax.swing.JLabel();
            rps1c2 = new javax.swing.JLabel();
            rps1c3 = new javax.swing.JLabel();
            rps1c4 = new javax.swing.JLabel();
            rpg1 = new javax.swing.JButton();
            rps1c8 = new javax.swing.JLabel();
            rps1c7 = new javax.swing.JLabel();
            rps1c6 = new javax.swing.JLabel();
            rps1c5 = new javax.swing.JLabel();
            rpc1 = new javax.swing.JButton();
            jPanel32 = new javax.swing.JPanel();
            jButton41 = new javax.swing.JButton();
            rps2c1 = new javax.swing.JLabel();
            rps2c2 = new javax.swing.JLabel();
            rps2c3 = new javax.swing.JLabel();
            rps2c4 = new javax.swing.JLabel();
            rpg2 = new javax.swing.JButton();
            rps2c8 = new javax.swing.JLabel();
            rps2c7 = new javax.swing.JLabel();
            rps2c6 = new javax.swing.JLabel();
            rps2c5 = new javax.swing.JLabel();
            rpc2 = new javax.swing.JButton();
            jPanel34 = new javax.swing.JPanel();
            rps3c1 = new javax.swing.JLabel();
            rps3c2 = new javax.swing.JLabel();
            rps3c3 = new javax.swing.JLabel();
            rps3c4 = new javax.swing.JLabel();
            rpg3 = new javax.swing.JButton();
            rps3c8 = new javax.swing.JLabel();
            rps3c7 = new javax.swing.JLabel();
            rps3c6 = new javax.swing.JLabel();
            rps3c5 = new javax.swing.JLabel();
            jButton44 = new javax.swing.JButton();
            rpc3 = new javax.swing.JButton();
            jPanel33 = new javax.swing.JPanel();
            jButton42 = new javax.swing.JButton();
            rps4c1 = new javax.swing.JLabel();
            rps4c2 = new javax.swing.JLabel();
            rps4c3 = new javax.swing.JLabel();
            rps4c4 = new javax.swing.JLabel();
            rpg4 = new javax.swing.JButton();
            rps4c8 = new javax.swing.JLabel();
            rps4c7 = new javax.swing.JLabel();
            rps4c6 = new javax.swing.JLabel();
            rps4c5 = new javax.swing.JLabel();
            rpc4 = new javax.swing.JButton();
            jPanel37 = new javax.swing.JPanel();
            jButton51 = new javax.swing.JButton();
            rps7c1 = new javax.swing.JLabel();
            rps7c2 = new javax.swing.JLabel();
            rps7c3 = new javax.swing.JLabel();
            rps7c4 = new javax.swing.JLabel();
            rpg7 = new javax.swing.JButton();
            rps7c8 = new javax.swing.JLabel();
            rps7c7 = new javax.swing.JLabel();
            rps7c6 = new javax.swing.JLabel();
            rps7c5 = new javax.swing.JLabel();
            rpc7 = new javax.swing.JButton();
            jPanel39 = new javax.swing.JPanel();
            jButton55 = new javax.swing.JButton();
            rps5c1 = new javax.swing.JLabel();
            rps5c2 = new javax.swing.JLabel();
            rps5c3 = new javax.swing.JLabel();
            rps5c4 = new javax.swing.JLabel();
            rpg5 = new javax.swing.JButton();
            rps5c8 = new javax.swing.JLabel();
            rps5c7 = new javax.swing.JLabel();
            rps5c6 = new javax.swing.JLabel();
            rps5c5 = new javax.swing.JLabel();
            rpc5 = new javax.swing.JButton();
            jPanel40 = new javax.swing.JPanel();
            jButton57 = new javax.swing.JButton();
            rps8c1 = new javax.swing.JLabel();
            rps8c2 = new javax.swing.JLabel();
            rps8c3 = new javax.swing.JLabel();
            rps8c4 = new javax.swing.JLabel();
            rpg8 = new javax.swing.JButton();
            rps8c8 = new javax.swing.JLabel();
            rps8c7 = new javax.swing.JLabel();
            rps8c6 = new javax.swing.JLabel();
            rps8c5 = new javax.swing.JLabel();
            rpc8 = new javax.swing.JButton();
            jPanel41 = new javax.swing.JPanel();
            jButton59 = new javax.swing.JButton();
            rps10c1 = new javax.swing.JLabel();
            rps10c2 = new javax.swing.JLabel();
            rps10c3 = new javax.swing.JLabel();
            rps10c4 = new javax.swing.JLabel();
            rpg10 = new javax.swing.JButton();
            rps10c8 = new javax.swing.JLabel();
            rps10c7 = new javax.swing.JLabel();
            rps10c6 = new javax.swing.JLabel();
            rps10c5 = new javax.swing.JLabel();
            rpc10 = new javax.swing.JButton();
            jPanel42 = new javax.swing.JPanel();
            jButton61 = new javax.swing.JButton();
            rps11c1 = new javax.swing.JLabel();
            rps11c2 = new javax.swing.JLabel();
            rps11c3 = new javax.swing.JLabel();
            rps11c4 = new javax.swing.JLabel();
            rpg11 = new javax.swing.JButton();
            rps11c8 = new javax.swing.JLabel();
            rps11c7 = new javax.swing.JLabel();
            rps11c6 = new javax.swing.JLabel();
            rps11c5 = new javax.swing.JLabel();
            rpc11 = new javax.swing.JButton();
            jPanel43 = new javax.swing.JPanel();
            jButton63 = new javax.swing.JButton();
            rps6c1 = new javax.swing.JLabel();
            rps6c2 = new javax.swing.JLabel();
            rps6c3 = new javax.swing.JLabel();
            rps6c4 = new javax.swing.JLabel();
            rpg6 = new javax.swing.JButton();
            rps6c8 = new javax.swing.JLabel();
            rps6c7 = new javax.swing.JLabel();
            rps6c6 = new javax.swing.JLabel();
            rps6c5 = new javax.swing.JLabel();
            rpc6 = new javax.swing.JButton();
            jPanel44 = new javax.swing.JPanel();
            jButton65 = new javax.swing.JButton();
            rps9c1 = new javax.swing.JLabel();
            rps9c2 = new javax.swing.JLabel();
            rps9c3 = new javax.swing.JLabel();
            rps9c4 = new javax.swing.JLabel();
            rpg9 = new javax.swing.JButton();
            rps9c8 = new javax.swing.JLabel();
            rps9c7 = new javax.swing.JLabel();
            rps9c6 = new javax.swing.JLabel();
            rps9c5 = new javax.swing.JLabel();
            rpc9 = new javax.swing.JButton();
            jPanel45 = new javax.swing.JPanel();
            jButton67 = new javax.swing.JButton();
            rps12c1 = new javax.swing.JLabel();
            rps12c2 = new javax.swing.JLabel();
            rps12c3 = new javax.swing.JLabel();
            rps12c4 = new javax.swing.JLabel();
            rpg12 = new javax.swing.JButton();
            rps12c8 = new javax.swing.JLabel();
            rps12c7 = new javax.swing.JLabel();
            rps12c6 = new javax.swing.JLabel();
            rps12c5 = new javax.swing.JLabel();
            rpc12 = new javax.swing.JButton();
            selectcourse1 = new javax.swing.JLabel();
            retakenlist = new javax.swing.JTextField();
            footcc = new javax.swing.JTextField();
            footpc = new javax.swing.JTextField();
            freezerp = new javax.swing.JButton();
            jSeparator2 = new javax.swing.JSeparator();
            retakecost = new javax.swing.JTextField();
            jPanel8 = new javax.swing.JPanel();
            jPanel3 = new javax.swing.JPanel();
            ebsem1 = new javax.swing.JButton();
            ebsem2 = new javax.swing.JButton();
            ebsem3 = new javax.swing.JButton();
            ebsem4 = new javax.swing.JButton();
            ebsem5 = new javax.swing.JButton();
            ebsem6 = new javax.swing.JButton();
            ebsem7 = new javax.swing.JButton();
            ebsem8 = new javax.swing.JButton();
            ebsem9 = new javax.swing.JButton();
            ebsem10 = new javax.swing.JButton();
            ebsem11 = new javax.swing.JButton();
            ebsem12 = new javax.swing.JButton();
            jPanel11 = new javax.swing.JPanel();
            Edittitle = new javax.swing.JLabel();
            CSE101 = new javax.swing.JCheckBox();
            MAT101 = new javax.swing.JCheckBox();
            PHY101 = new javax.swing.JCheckBox();
            EAP101 = new javax.swing.JCheckBox();
            CSE103 = new javax.swing.JCheckBox();
            CSE104 = new javax.swing.JCheckBox();
            MAT103 = new javax.swing.JCheckBox();
            PHY103 = new javax.swing.JCheckBox();
            PHY104 = new javax.swing.JCheckBox();
            EAP103 = new javax.swing.JCheckBox();
            CSE105 = new javax.swing.JCheckBox();
            CSE106 = new javax.swing.JCheckBox();
            MAT105 = new javax.swing.JCheckBox();
            CHE101 = new javax.swing.JCheckBox();
            CHE102 = new javax.swing.JCheckBox();
            jButton1 = new javax.swing.JButton();
            CSE201 = new javax.swing.JCheckBox();
            CSE202 = new javax.swing.JCheckBox();
            CSE203 = new javax.swing.JCheckBox();
            CSE204 = new javax.swing.JCheckBox();
            EEE201 = new javax.swing.JCheckBox();
            EEE202 = new javax.swing.JCheckBox();
            jLabel4 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            GED201 = new javax.swing.JCheckBox();
            CSE205 = new javax.swing.JCheckBox();
            CSE206 = new javax.swing.JCheckBox();
            CSE208 = new javax.swing.JCheckBox();
            EEE203 = new javax.swing.JCheckBox();
            EEE204 = new javax.swing.JCheckBox();
            CSE301 = new javax.swing.JCheckBox();
            CSE209 = new javax.swing.JCheckBox();
            CSE210 = new javax.swing.JCheckBox();
            CSE211 = new javax.swing.JCheckBox();
            EEE205 = new javax.swing.JCheckBox();
            MAT201 = new javax.swing.JCheckBox();
            CSE302 = new javax.swing.JCheckBox();
            CSE303 = new javax.swing.JCheckBox();
            CSE304 = new javax.swing.JCheckBox();
            CSE305 = new javax.swing.JCheckBox();
            CSE306 = new javax.swing.JCheckBox();
            CSE307 = new javax.swing.JCheckBox();
            CSE308 = new javax.swing.JCheckBox();
            CSE309 = new javax.swing.JCheckBox();
            CSE310 = new javax.swing.JCheckBox();
            CSE311 = new javax.swing.JCheckBox();
            CSE312 = new javax.swing.JCheckBox();
            CSE313 = new javax.swing.JCheckBox();
            CSE314 = new javax.swing.JCheckBox();
            GED303 = new javax.swing.JCheckBox();
            CSE315 = new javax.swing.JCheckBox();
            GED301 = new javax.swing.JCheckBox();
            GED305 = new javax.swing.JCheckBox();
            CSE317 = new javax.swing.JCheckBox();
            CSE319 = new javax.swing.JCheckBox();
            GED401 = new javax.swing.JCheckBox();
            CSE321 = new javax.swing.JCheckBox();
            GED307 = new javax.swing.JCheckBox();
            GED403 = new javax.swing.JCheckBox();
            CSE401 = new javax.swing.JCheckBox();
            GED405 = new javax.swing.JCheckBox();
            CSE402 = new javax.swing.JCheckBox();
            CSE403 = new javax.swing.JCheckBox();
            CSE404 = new javax.swing.JCheckBox();
            CSE405 = new javax.swing.JCheckBox();
            CSE406 = new javax.swing.JCheckBox();
            CSE407 = new javax.swing.JCheckBox();
            CSE408 = new javax.swing.JCheckBox();
            CSE409 = new javax.swing.JCheckBox();
            CSE410 = new javax.swing.JCheckBox();
            CSE411 = new javax.swing.JCheckBox();
            GED407 = new javax.swing.JCheckBox();
            CSE413 = new javax.swing.JCheckBox();
            CSE400 = new javax.swing.JCheckBox();
            CSE437 = new javax.swing.JCheckBox();
            CSE800 = new javax.swing.JCheckBox();
            CSE438 = new javax.swing.JCheckBox();
            jPanel9 = new javax.swing.JPanel();
            jPanel6 = new javax.swing.JPanel();
            csCourse1 = new javax.swing.JTextField();
            csCourse2 = new javax.swing.JTextField();
            csCourse3 = new javax.swing.JTextField();
            csCourse4 = new javax.swing.JTextField();
            csCourse5 = new javax.swing.JTextField();
            csCourse6 = new javax.swing.JTextField();
            csCourse7 = new javax.swing.JTextField();
            csCourse8 = new javax.swing.JTextField();
            jPanel19 = new javax.swing.JPanel();
            jLabel8 = new javax.swing.JLabel();
            jPanel18 = new javax.swing.JPanel();
            jPanel25 = new javax.swing.JPanel();
            csnumct1 = new javax.swing.JTextField();
            csct1num = new javax.swing.JTextField();
            csnumct2 = new javax.swing.JTextField();
            csct2num = new javax.swing.JTextField();
            csnumct3 = new javax.swing.JTextField();
            csct3num = new javax.swing.JTextField();
            csasign = new javax.swing.JTextField();
            csassignnum = new javax.swing.JTextField();
            cspresen = new javax.swing.JTextField();
            cspresennum = new javax.swing.JTextField();
            csatten = new javax.swing.JTextField();
            csattennum = new javax.swing.JTextField();
            csmid = new javax.swing.JTextField();
            csmidnum = new javax.swing.JTextField();
            csfinal = new javax.swing.JTextField();
            csfinalnum = new javax.swing.JTextField();
            jPanel20 = new javax.swing.JPanel();
            cshead = new javax.swing.JLabel();
            jPanel24 = new javax.swing.JPanel();
            jPanel22 = new javax.swing.JPanel();
            jTextField14 = new javax.swing.JTextField();
            jSeparator3 = new javax.swing.JSeparator();
            cstCourse1 = new javax.swing.JTextField();
            cstCourse2 = new javax.swing.JTextField();
            cstCourse3 = new javax.swing.JTextField();
            cstCourse4 = new javax.swing.JTextField();
            cstCourse5 = new javax.swing.JTextField();
            cstCourse6 = new javax.swing.JTextField();
            cstCourse7 = new javax.swing.JTextField();
            cstCourse8 = new javax.swing.JTextField();
            jTextField19 = new javax.swing.JTextField();
            jPanel26 = new javax.swing.JPanel();
            jTextField15 = new javax.swing.JTextField();
            jSeparator6 = new javax.swing.JSeparator();
            cstCredit1 = new javax.swing.JTextField();
            cstCredit2 = new javax.swing.JTextField();
            cstCredit3 = new javax.swing.JTextField();
            cstCredit4 = new javax.swing.JTextField();
            cstCredit5 = new javax.swing.JTextField();
            cstCredit6 = new javax.swing.JTextField();
            cstCredit7 = new javax.swing.JTextField();
            cstCredit8 = new javax.swing.JTextField();
            csCredit = new javax.swing.JTextField();
            jPanel27 = new javax.swing.JPanel();
            jTextField17 = new javax.swing.JTextField();
            jSeparator5 = new javax.swing.JSeparator();
            cstGpa1 = new javax.swing.JTextField();
            cstGpa2 = new javax.swing.JTextField();
            cstGpa3 = new javax.swing.JTextField();
            cstGpa4 = new javax.swing.JTextField();
            cstGpa5 = new javax.swing.JTextField();
            cstGpa6 = new javax.swing.JTextField();
            cstGpa7 = new javax.swing.JTextField();
            cstGpa8 = new javax.swing.JTextField();
            csGpa = new javax.swing.JTextField();
            jLabel11 = new javax.swing.JLabel();
            jPanel28 = new javax.swing.JPanel();
            jLabel10 = new javax.swing.JLabel();
            jLabel12 = new javax.swing.JLabel();
            selectedCourse = new javax.swing.JLabel();
            jButton2 = new javax.swing.JButton();
            csnum1 = new javax.swing.JTextField();
            csnum2 = new javax.swing.JTextField();
            csnum3 = new javax.swing.JTextField();
            csAdd = new javax.swing.JButton();
            jPanel29 = new javax.swing.JPanel();
            jLabel13 = new javax.swing.JLabel();
            jLabel14 = new javax.swing.JLabel();
            jLabel15 = new javax.swing.JLabel();
            csGoalNum = new javax.swing.JTextField();
            csAdd1 = new javax.swing.JButton();
            jButton4 = new javax.swing.JButton();
            jButton6 = new javax.swing.JButton();
            jPanel10 = new javax.swing.JPanel();
            Notice = new javax.swing.JButton();
            jPanel23 = new javax.swing.JPanel();
            jPanel49 = new javax.swing.JPanel();
            jSeparator7 = new javax.swing.JSeparator();
            jSeparator8 = new javax.swing.JSeparator();
            jPanel50 = new javax.swing.JPanel();
            jPanel51 = new javax.swing.JPanel();
            jPanel52 = new javax.swing.JPanel();
            jButton3 = new javax.swing.JButton();

            jButton5.setText("jButton5");

            jLabel9.setText("jLabel9");

            jScrollPane2.setViewportView(jEditorPane1);

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            setUndecorated(true);

            jPanel1.setBackground(new java.awt.Color(255, 255, 255));
            jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jPanel4.setBackground(new java.awt.Color(102, 102, 102));

            tabg.setBackground(new java.awt.Color(255, 108, 44));

            jPanel17.setBackground(new java.awt.Color(102, 102, 255));

            jPanel21.setBackground(new java.awt.Color(255, 51, 51));

            jButton10.setBackground(new java.awt.Color(255, 51, 51));
            jButton10.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
            jButton10.setForeground(new java.awt.Color(255, 255, 255));
            jButton10.setText("Current Semester");
            jButton10.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton10ActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
            jPanel21.setLayout(jPanel21Layout);
            jPanel21Layout.setHorizontalGroup(
                  jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(94, 94, 94))
            );
            jPanel21Layout.setVerticalGroup(
                  jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
            );

            jButton9.setBackground(new java.awt.Color(102, 102, 255));
            jButton9.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
            jButton9.setForeground(new java.awt.Color(255, 255, 255));
            jButton9.setText("Retake Predict");
            jButton9.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton9ActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
            jPanel17.setLayout(jPanel17Layout);
            jPanel17Layout.setHorizontalGroup(
                  jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addContainerGap(112, Short.MAX_VALUE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
            );
            jPanel17Layout.setVerticalGroup(
                  jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
            );

            jButton8.setBackground(new java.awt.Color(255, 108, 44));
            jButton8.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
            jButton8.setForeground(new java.awt.Color(255, 255, 255));
            jButton8.setText("Edit All Data");
            jButton8.setBorder(null);
            jButton8.setBorderPainted(false);
            jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        jButton8MouseEntered(evt);
                  }
            });
            jButton8.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton8ActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout tabgLayout = new javax.swing.GroupLayout(tabg);
            tabg.setLayout(tabgLayout);
            tabgLayout.setHorizontalGroup(
                  tabgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(tabgLayout.createSequentialGroup()
                        .addContainerGap(79, Short.MAX_VALUE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
            );
            tabgLayout.setVerticalGroup(
                  tabgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(tabgLayout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
            );

            javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
            jPanel4.setLayout(jPanel4Layout);
            jPanel4Layout.setHorizontalGroup(
                  jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                  .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(tabg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
            );
            jPanel4Layout.setVerticalGroup(
                  jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tabg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1170, 70));

            jPanel2.setBackground(new java.awt.Color(102, 102, 102));
            jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                  public void mouseDragged(java.awt.event.MouseEvent evt) {
                        jPanel2MouseDragged(evt);
                  }
            });
            jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        jPanel2MouseClicked(evt);
                  }
            });

            headname.setEditable(false);
            headname.setBackground(new java.awt.Color(102, 102, 102));
            headname.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            headname.setForeground(new java.awt.Color(255, 255, 255));
            headname.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
            headname.setText("Shartaz Yeasar Feeham");
            headname.setBorder(null);
            headname.setCaretColor(new java.awt.Color(102, 255, 0));
            headname.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        headnameActionPerformed(evt);
                  }
            });

            headcc.setEditable(false);
            headcc.setBackground(new java.awt.Color(102, 102, 102));
            headcc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            headcc.setForeground(new java.awt.Color(255, 255, 255));
            headcc.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
            headcc.setText("Current CGPA: 0.000");
            headcc.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectBeta/Files/x.png"))); // NOI18N
            jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        jLabel2MouseClicked(evt);
                  }
            });

            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectBeta/Files/lo.png"))); // NOI18N
            jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        jLabel1MouseClicked(evt);
                  }
            });

            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectBeta/Files/pw.png"))); // NOI18N

            headpc1.setEditable(false);
            headpc1.setBackground(new java.awt.Color(102, 102, 102));
            headpc1.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
            headpc1.setForeground(new java.awt.Color(255, 255, 255));
            headpc1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            headpc1.setText("CGPA Planner");
            headpc1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            headpc1.setCaretColor(new java.awt.Color(255, 255, 255));

            headpc.setEditable(false);
            headpc.setBackground(new java.awt.Color(102, 102, 102));
            headpc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            headpc.setForeground(new java.awt.Color(255, 255, 255));
            headpc.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
            headpc.setText("Predicted CGPA: 0.000");
            headpc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            headpc.setCaretColor(new java.awt.Color(255, 255, 255));

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                  jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(headpc1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                              .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(headpc, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(headcc, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addComponent(headname, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap())))
            );
            jPanel2Layout.setVerticalGroup(
                  jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                  .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                          .addComponent(headpc1)
                                          .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(headname, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                      .addComponent(headcc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(headpc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 120));

            Table.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

            jPanel7.setBackground(new java.awt.Color(255, 255, 255));

            jPanel5.setBackground(new java.awt.Color(102, 102, 255));

            jPanel12.setBackground(new java.awt.Color(204, 204, 255));

            retakenmsg1.setEditable(false);
            retakenmsg1.setBackground(new java.awt.Color(204, 204, 255));
            retakenmsg1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            retakenmsg1.setForeground(new java.awt.Color(204, 0, 0));

            retakenmsg2.setEditable(false);
            retakenmsg2.setBackground(new java.awt.Color(204, 204, 255));
            retakenmsg2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            retakenmsg2.setForeground(new java.awt.Color(204, 0, 0));

            retakenmsg3.setEditable(false);
            retakenmsg3.setBackground(new java.awt.Color(204, 204, 255));
            retakenmsg3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            retakenmsg3.setForeground(new java.awt.Color(204, 0, 0));

            retakenmsg4.setEditable(false);
            retakenmsg4.setBackground(new java.awt.Color(204, 204, 255));
            retakenmsg4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            retakenmsg4.setForeground(new java.awt.Color(204, 0, 0));

            javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
            jPanel12.setLayout(jPanel12Layout);
            jPanel12Layout.setHorizontalGroup(
                  jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(retakenmsg1)
                  .addComponent(retakenmsg2)
                  .addComponent(retakenmsg3)
                  .addComponent(retakenmsg4)
            );
            jPanel12Layout.setVerticalGroup(
                  jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(retakenmsg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(retakenmsg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(retakenmsg3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(retakenmsg4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            jPanel13.setBackground(new java.awt.Color(153, 153, 255));
            jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jLabel6.setForeground(new java.awt.Color(255, 255, 255));
            jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel6.setText("Courses you can improve");

            javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
            jPanel13.setLayout(jPanel13Layout);
            jPanel13Layout.setHorizontalGroup(
                  jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            jPanel13Layout.setVerticalGroup(
                  jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
            );

            jPanel15.setBackground(new java.awt.Color(153, 153, 255));
            jPanel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            jLabel7.setForeground(new java.awt.Color(255, 255, 255));
            jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel7.setText("Outcome");

            javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
            jPanel15.setLayout(jPanel15Layout);
            jPanel15Layout.setHorizontalGroup(
                  jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            jPanel15Layout.setVerticalGroup(
                  jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            retakeList.setModel(new javax.swing.AbstractListModel() {
                  String[] strings = { "[END]" };
                  public int getSize() { return strings.length; }
                  public Object getElementAt(int i) { return strings[i]; }
            });
            retakeList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            retakeList.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        retakeListMouseClicked(evt);
                  }
            });
            jScrollPane1.setViewportView(retakeList);

            jPanel16.setBackground(new java.awt.Color(204, 204, 255));

            gpaList.setForeground(new java.awt.Color(102, 102, 255));
            gpaList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Grade", "4.00 A+[80-100]", "3.75 A[75-79]", "3.50 A-[70-74]", "3.25 B+[65-69]", "3.00 B[60-64]", "2.75 B-[55-59]", "2.50 C+[50-54]", "2.25 C[45-49]", "2.00 D[40-44][" }));
            gpaList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

            modify.setBackground(new java.awt.Color(102, 102, 255));
            modify.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            modify.setForeground(new java.awt.Color(255, 255, 255));
            modify.setText("Done");
            modify.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        modifyActionPerformed(evt);
                  }
            });

            jLabel30.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            jLabel30.setForeground(new java.awt.Color(204, 0, 51));
            jLabel30.setText("Enter result");

            retakemsg2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            retakemsg2.setForeground(new java.awt.Color(102, 102, 102));
            retakemsg2.setText("Predict a new result");

            retakemsg3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            retakemsg3.setForeground(new java.awt.Color(102, 102, 102));
            retakemsg3.setText("see where your CGPA goes.");

            retakemsg.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            retakemsg.setForeground(new java.awt.Color(204, 0, 51));
            retakemsg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            retakemsg.setText("Select a course");

            retakeselected.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            retakeselected.setForeground(new java.awt.Color(204, 0, 51));
            retakeselected.setText("from above.");

            javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
            jPanel16.setLayout(jPanel16Layout);
            jPanel16Layout.setHorizontalGroup(
                  jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel16Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(retakemsg)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(retakeselected))
                              .addGroup(jPanel16Layout.createSequentialGroup()
                                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(jPanel16Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(gpaList, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(modify, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGroup(jPanel16Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addComponent(jLabel30)
                                                      .addComponent(retakemsg2)
                                                      .addComponent(retakemsg3))))
                                    .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel16Layout.setVerticalGroup(
                  jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(retakemsg)
                              .addComponent(retakeselected))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(retakemsg2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(retakemsg3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                              .addComponent(gpaList)
                              .addComponent(modify, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                        .addContainerGap())
            );

            javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
            jPanel5.setLayout(jPanel5Layout);
            jPanel5Layout.setHorizontalGroup(
                  jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                              .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel5Layout.setVerticalGroup(
                  jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(977, Short.MAX_VALUE))
            );

            jPanel14.setBackground(new java.awt.Color(102, 102, 255));

            jPanel31.setBackground(new java.awt.Color(204, 204, 255));

            jButton39.setBackground(new java.awt.Color(51, 153, 255));
            jButton39.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 18)); // NOI18N
            jButton39.setForeground(new java.awt.Color(255, 255, 255));
            jButton39.setText("Semester 01");
            jButton39.setMargin(new java.awt.Insets(0, 0, 0, 0));

            rps1c1.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps1c1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps1c1.setText("EEE201  3.75");
            rps1c1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps1c2.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps1c2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps1c2.setText("EEE201  3.75");
            rps1c2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps1c3.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps1c3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps1c3.setText("EEE201  3.75");
            rps1c3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps1c4.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps1c4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps1c4.setText("EEE201  3.75");
            rps1c4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rpg1.setBackground(new java.awt.Color(255, 51, 102));
            rpg1.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 18)); // NOI18N
            rpg1.setForeground(new java.awt.Color(255, 255, 255));
            rpg1.setText("GPA: 3.784");
            rpg1.setMargin(new java.awt.Insets(0, 0, 0, 0));

            rps1c8.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps1c8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps1c8.setText("EEE201  3.75");
            rps1c8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps1c7.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps1c7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps1c7.setText("EEE201  3.75");
            rps1c7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps1c6.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps1c6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps1c6.setText("EEE201  3.75");
            rps1c6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps1c5.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps1c5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps1c5.setText("EEE201  3.75");
            rps1c5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rpc1.setBackground(new java.awt.Color(102, 102, 255));
            rpc1.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 18)); // NOI18N
            rpc1.setForeground(new java.awt.Color(255, 255, 255));
            rpc1.setText("Credit: 13.5");
            rpc1.setMargin(new java.awt.Insets(0, 0, 0, 0));

            javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
            jPanel31.setLayout(jPanel31Layout);
            jPanel31Layout.setHorizontalGroup(
                  jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                                    .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rpc1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(rpg1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel31Layout.createSequentialGroup()
                                          .addComponent(rps1c5)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps1c6)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps1c7)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps1c8))
                                    .addGroup(jPanel31Layout.createSequentialGroup()
                                          .addComponent(rps1c1)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps1c2)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps1c3)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps1c4))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel31Layout.setVerticalGroup(
                  jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jButton39)
                              .addComponent(rpg1)
                              .addComponent(rpc1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(rps1c1)
                              .addComponent(rps1c2)
                              .addComponent(rps1c3)
                              .addComponent(rps1c4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(rps1c5)
                              .addComponent(rps1c6)
                              .addComponent(rps1c7)
                              .addComponent(rps1c8)))
            );

            jPanel32.setBackground(new java.awt.Color(204, 204, 255));

            jButton41.setBackground(new java.awt.Color(51, 153, 255));
            jButton41.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 18)); // NOI18N
            jButton41.setForeground(new java.awt.Color(255, 255, 255));
            jButton41.setText("Semester 02");
            jButton41.setMargin(new java.awt.Insets(0, 0, 0, 0));

            rps2c1.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps2c1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps2c1.setText("EEE201  3.75");
            rps2c1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps2c2.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps2c2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps2c2.setText("EEE201  3.75");
            rps2c2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps2c3.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps2c3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps2c3.setText("EEE201  3.75");
            rps2c3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps2c4.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps2c4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps2c4.setText("EEE201  3.75");
            rps2c4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rpg2.setBackground(new java.awt.Color(255, 51, 102));
            rpg2.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 18)); // NOI18N
            rpg2.setForeground(new java.awt.Color(255, 255, 255));
            rpg2.setText("GPA: 3.784");
            rpg2.setMargin(new java.awt.Insets(0, 0, 0, 0));

            rps2c8.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps2c8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps2c8.setText("EEE201  3.75");
            rps2c8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps2c7.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps2c7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps2c7.setText("EEE201  3.75");
            rps2c7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps2c6.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps2c6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps2c6.setText("EEE201  3.75");
            rps2c6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps2c5.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps2c5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps2c5.setText("EEE201  3.75");
            rps2c5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rpc2.setBackground(new java.awt.Color(102, 102, 255));
            rpc2.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 18)); // NOI18N
            rpc2.setForeground(new java.awt.Color(255, 255, 255));
            rpc2.setText("Credit: 13.5");
            rpc2.setMargin(new java.awt.Insets(0, 0, 0, 0));

            javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
            jPanel32.setLayout(jPanel32Layout);
            jPanel32Layout.setHorizontalGroup(
                  jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                                    .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rpc2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(rpg2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel32Layout.createSequentialGroup()
                                          .addComponent(rps2c5)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps2c6)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps2c7)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps2c8))
                                    .addGroup(jPanel32Layout.createSequentialGroup()
                                          .addComponent(rps2c1)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps2c2)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps2c3)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps2c4))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel32Layout.setVerticalGroup(
                  jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jButton41)
                              .addComponent(rpg2)
                              .addComponent(rpc2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(rps2c1)
                              .addComponent(rps2c2)
                              .addComponent(rps2c3)
                              .addComponent(rps2c4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(rps2c5)
                              .addComponent(rps2c6)
                              .addComponent(rps2c7)
                              .addComponent(rps2c8)))
            );

            jPanel34.setBackground(new java.awt.Color(204, 204, 255));

            rps3c1.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps3c1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps3c1.setText("EEE201  3.75");
            rps3c1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps3c2.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps3c2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps3c2.setText("EEE201  3.75");
            rps3c2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps3c3.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps3c3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps3c3.setText("EEE201  3.75");
            rps3c3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps3c4.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps3c4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps3c4.setText("EEE201  3.75");
            rps3c4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rpg3.setBackground(new java.awt.Color(255, 51, 102));
            rpg3.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 18)); // NOI18N
            rpg3.setForeground(new java.awt.Color(255, 255, 255));
            rpg3.setText("GPA: 3.784");
            rpg3.setMargin(new java.awt.Insets(0, 0, 0, 0));

            rps3c8.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps3c8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps3c8.setText("EEE201  3.75");
            rps3c8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps3c7.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps3c7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps3c7.setText("EEE201  3.75");
            rps3c7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps3c6.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps3c6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps3c6.setText("EEE201  3.75");
            rps3c6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps3c5.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps3c5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps3c5.setText("EEE201  3.75");
            rps3c5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            jButton44.setBackground(new java.awt.Color(51, 153, 255));
            jButton44.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 18)); // NOI18N
            jButton44.setForeground(new java.awt.Color(255, 255, 255));
            jButton44.setText("Semester 03");
            jButton44.setMargin(new java.awt.Insets(0, 0, 0, 0));

            rpc3.setBackground(new java.awt.Color(102, 102, 255));
            rpc3.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 18)); // NOI18N
            rpc3.setForeground(new java.awt.Color(255, 255, 255));
            rpc3.setText("Credit: 13.5");
            rpc3.setMargin(new java.awt.Insets(0, 0, 0, 0));

            javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
            jPanel34.setLayout(jPanel34Layout);
            jPanel34Layout.setHorizontalGroup(
                  jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                              .addGroup(jPanel34Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(jPanel34Layout.createSequentialGroup()
                                                .addComponent(rps3c5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rps3c6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rps3c7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rps3c8))
                                          .addGroup(jPanel34Layout.createSequentialGroup()
                                                .addComponent(rps3c1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rps3c2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rps3c3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rps3c4))))
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                                    .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rpc3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rpg3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel34Layout.setVerticalGroup(
                  jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(rpg3)
                              .addComponent(jButton44)
                              .addComponent(rpc3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(rps3c1)
                              .addComponent(rps3c2)
                              .addComponent(rps3c3)
                              .addComponent(rps3c4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(rps3c5)
                              .addComponent(rps3c6)
                              .addComponent(rps3c7)
                              .addComponent(rps3c8)))
            );

            jPanel33.setBackground(new java.awt.Color(204, 204, 255));

            jButton42.setBackground(new java.awt.Color(51, 153, 255));
            jButton42.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 18)); // NOI18N
            jButton42.setForeground(new java.awt.Color(255, 255, 255));
            jButton42.setText("Semester 04");
            jButton42.setMargin(new java.awt.Insets(0, 0, 0, 0));

            rps4c1.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps4c1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps4c1.setText("EEE201  3.75");
            rps4c1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps4c2.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps4c2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps4c2.setText("EEE201  3.75");
            rps4c2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps4c3.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps4c3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps4c3.setText("EEE201  3.75");
            rps4c3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps4c4.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps4c4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps4c4.setText("EEE201  3.75");
            rps4c4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rpg4.setBackground(new java.awt.Color(255, 51, 102));
            rpg4.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 18)); // NOI18N
            rpg4.setForeground(new java.awt.Color(255, 255, 255));
            rpg4.setText("GPA: 3.784");
            rpg4.setMargin(new java.awt.Insets(0, 0, 0, 0));

            rps4c8.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps4c8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps4c8.setText("EEE201  3.75");
            rps4c8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps4c7.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps4c7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps4c7.setText("EEE201  3.75");
            rps4c7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps4c6.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps4c6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps4c6.setText("EEE201  3.75");
            rps4c6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps4c5.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps4c5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps4c5.setText("EEE201  3.75");
            rps4c5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rpc4.setBackground(new java.awt.Color(102, 102, 255));
            rpc4.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 18)); // NOI18N
            rpc4.setForeground(new java.awt.Color(255, 255, 255));
            rpc4.setText("Credit: 13.5");
            rpc4.setMargin(new java.awt.Insets(0, 0, 0, 0));

            javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
            jPanel33.setLayout(jPanel33Layout);
            jPanel33Layout.setHorizontalGroup(
                  jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                                    .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rpc4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(rpg4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel33Layout.createSequentialGroup()
                                          .addComponent(rps4c5)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps4c6)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps4c7)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps4c8))
                                    .addGroup(jPanel33Layout.createSequentialGroup()
                                          .addComponent(rps4c1)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps4c2)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps4c3)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps4c4))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel33Layout.setVerticalGroup(
                  jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jButton42)
                              .addComponent(rpg4)
                              .addComponent(rpc4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(rps4c1)
                              .addComponent(rps4c2)
                              .addComponent(rps4c3)
                              .addComponent(rps4c4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(rps4c5)
                              .addComponent(rps4c6)
                              .addComponent(rps4c7)
                              .addComponent(rps4c8)))
            );

            jPanel37.setBackground(new java.awt.Color(204, 204, 255));

            jButton51.setBackground(new java.awt.Color(51, 153, 255));
            jButton51.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 18)); // NOI18N
            jButton51.setForeground(new java.awt.Color(255, 255, 255));
            jButton51.setText("Semester 07");
            jButton51.setMargin(new java.awt.Insets(0, 0, 0, 0));

            rps7c1.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps7c1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps7c1.setText("EEE201  3.75");
            rps7c1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps7c2.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps7c2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps7c2.setText("EEE201  3.75");
            rps7c2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps7c3.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps7c3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps7c3.setText("EEE201  3.75");
            rps7c3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps7c4.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps7c4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps7c4.setText("EEE201  3.75");
            rps7c4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rpg7.setBackground(new java.awt.Color(255, 51, 102));
            rpg7.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 18)); // NOI18N
            rpg7.setForeground(new java.awt.Color(255, 255, 255));
            rpg7.setText("GPA: 3.784");
            rpg7.setMargin(new java.awt.Insets(0, 0, 0, 0));

            rps7c8.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps7c8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps7c8.setText("EEE201  3.75");
            rps7c8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps7c7.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps7c7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps7c7.setText("EEE201  3.75");
            rps7c7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps7c6.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps7c6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps7c6.setText("EEE201  3.75");
            rps7c6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps7c5.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps7c5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps7c5.setText("EEE201  3.75");
            rps7c5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rpc7.setBackground(new java.awt.Color(102, 102, 255));
            rpc7.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 18)); // NOI18N
            rpc7.setForeground(new java.awt.Color(255, 255, 255));
            rpc7.setText("Credit: 13.5");
            rpc7.setMargin(new java.awt.Insets(0, 0, 0, 0));

            javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
            jPanel37.setLayout(jPanel37Layout);
            jPanel37Layout.setHorizontalGroup(
                  jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                                    .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rpc7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(rpg7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel37Layout.createSequentialGroup()
                                          .addComponent(rps7c5)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps7c6)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps7c7)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps7c8))
                                    .addGroup(jPanel37Layout.createSequentialGroup()
                                          .addComponent(rps7c1)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps7c2)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps7c3)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps7c4))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel37Layout.setVerticalGroup(
                  jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jButton51)
                              .addComponent(rpg7)
                              .addComponent(rpc7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(rps7c1)
                              .addComponent(rps7c2)
                              .addComponent(rps7c3)
                              .addComponent(rps7c4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(rps7c5)
                              .addComponent(rps7c6)
                              .addComponent(rps7c7)
                              .addComponent(rps7c8)))
            );

            jPanel39.setBackground(new java.awt.Color(204, 204, 255));

            jButton55.setBackground(new java.awt.Color(51, 153, 255));
            jButton55.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 18)); // NOI18N
            jButton55.setForeground(new java.awt.Color(255, 255, 255));
            jButton55.setText("Semester 05");
            jButton55.setMargin(new java.awt.Insets(0, 0, 0, 0));

            rps5c1.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps5c1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps5c1.setText("EEE201  3.75");
            rps5c1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps5c2.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps5c2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps5c2.setText("EEE201  3.75");
            rps5c2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps5c3.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps5c3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps5c3.setText("EEE201  3.75");
            rps5c3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps5c4.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps5c4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps5c4.setText("EEE201  3.75");
            rps5c4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rpg5.setBackground(new java.awt.Color(255, 51, 102));
            rpg5.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 18)); // NOI18N
            rpg5.setForeground(new java.awt.Color(255, 255, 255));
            rpg5.setText("GPA: 3.784");
            rpg5.setMargin(new java.awt.Insets(0, 0, 0, 0));

            rps5c8.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps5c8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps5c8.setText("EEE201  3.75");
            rps5c8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps5c7.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps5c7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps5c7.setText("EEE201  3.75");
            rps5c7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps5c6.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps5c6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps5c6.setText("EEE201  3.75");
            rps5c6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps5c5.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps5c5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps5c5.setText("EEE201  3.75");
            rps5c5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rpc5.setBackground(new java.awt.Color(102, 102, 255));
            rpc5.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 18)); // NOI18N
            rpc5.setForeground(new java.awt.Color(255, 255, 255));
            rpc5.setText("Credit: 13.5");
            rpc5.setMargin(new java.awt.Insets(0, 0, 0, 0));

            javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
            jPanel39.setLayout(jPanel39Layout);
            jPanel39Layout.setHorizontalGroup(
                  jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel39Layout.createSequentialGroup()
                                    .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rpc5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(rpg5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel39Layout.createSequentialGroup()
                                          .addComponent(rps5c5)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps5c6)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps5c7)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps5c8))
                                    .addGroup(jPanel39Layout.createSequentialGroup()
                                          .addComponent(rps5c1)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps5c2)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps5c3)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps5c4))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel39Layout.setVerticalGroup(
                  jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jButton55)
                              .addComponent(rpg5)
                              .addComponent(rpc5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(rps5c1)
                              .addComponent(rps5c2)
                              .addComponent(rps5c3)
                              .addComponent(rps5c4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(rps5c5)
                              .addComponent(rps5c6)
                              .addComponent(rps5c7)
                              .addComponent(rps5c8)))
            );

            jPanel40.setBackground(new java.awt.Color(204, 204, 255));

            jButton57.setBackground(new java.awt.Color(51, 153, 255));
            jButton57.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 18)); // NOI18N
            jButton57.setForeground(new java.awt.Color(255, 255, 255));
            jButton57.setText("Semester 08");
            jButton57.setMargin(new java.awt.Insets(0, 0, 0, 0));

            rps8c1.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps8c1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps8c1.setText("EEE201  3.75");
            rps8c1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps8c2.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps8c2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps8c2.setText("EEE201  3.75");
            rps8c2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps8c3.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps8c3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps8c3.setText("EEE201  3.75");
            rps8c3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps8c4.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps8c4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps8c4.setText("EEE201  3.75");
            rps8c4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rpg8.setBackground(new java.awt.Color(255, 51, 102));
            rpg8.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 18)); // NOI18N
            rpg8.setForeground(new java.awt.Color(255, 255, 255));
            rpg8.setText("GPA: 3.784");
            rpg8.setMargin(new java.awt.Insets(0, 0, 0, 0));

            rps8c8.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps8c8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps8c8.setText("EEE201  3.75");
            rps8c8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps8c7.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps8c7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps8c7.setText("EEE201  3.75");
            rps8c7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps8c6.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps8c6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps8c6.setText("EEE201  3.75");
            rps8c6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps8c5.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps8c5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps8c5.setText("EEE201  3.75");
            rps8c5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rpc8.setBackground(new java.awt.Color(102, 102, 255));
            rpc8.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 18)); // NOI18N
            rpc8.setForeground(new java.awt.Color(255, 255, 255));
            rpc8.setText("Credit: 13.5");
            rpc8.setMargin(new java.awt.Insets(0, 0, 0, 0));

            javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
            jPanel40.setLayout(jPanel40Layout);
            jPanel40Layout.setHorizontalGroup(
                  jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                                    .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rpc8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(rpg8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel40Layout.createSequentialGroup()
                                          .addComponent(rps8c5)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps8c6)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps8c7)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps8c8))
                                    .addGroup(jPanel40Layout.createSequentialGroup()
                                          .addComponent(rps8c1)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps8c2)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps8c3)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps8c4))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel40Layout.setVerticalGroup(
                  jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jButton57)
                              .addComponent(rpg8)
                              .addComponent(rpc8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(rps8c1)
                              .addComponent(rps8c2)
                              .addComponent(rps8c3)
                              .addComponent(rps8c4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(rps8c5)
                              .addComponent(rps8c6)
                              .addComponent(rps8c7)
                              .addComponent(rps8c8)))
            );

            jPanel41.setBackground(new java.awt.Color(204, 204, 255));

            jButton59.setBackground(new java.awt.Color(51, 153, 255));
            jButton59.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 18)); // NOI18N
            jButton59.setForeground(new java.awt.Color(255, 255, 255));
            jButton59.setText("Semester 10");
            jButton59.setMargin(new java.awt.Insets(0, 0, 0, 0));

            rps10c1.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps10c1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps10c1.setText("EEE201  3.75");
            rps10c1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps10c2.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps10c2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps10c2.setText("EEE201  3.75");
            rps10c2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps10c3.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps10c3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps10c3.setText("EEE201  3.75");
            rps10c3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps10c4.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps10c4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps10c4.setText("EEE201  3.75");
            rps10c4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rpg10.setBackground(new java.awt.Color(255, 51, 102));
            rpg10.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 18)); // NOI18N
            rpg10.setForeground(new java.awt.Color(255, 255, 255));
            rpg10.setText("GPA: 3.784");
            rpg10.setMargin(new java.awt.Insets(0, 0, 0, 0));

            rps10c8.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps10c8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps10c8.setText("EEE201  3.75");
            rps10c8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps10c7.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps10c7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps10c7.setText("EEE201  3.75");
            rps10c7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps10c6.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps10c6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps10c6.setText("EEE201  3.75");
            rps10c6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps10c5.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps10c5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps10c5.setText("EEE201  3.75");
            rps10c5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rpc10.setBackground(new java.awt.Color(102, 102, 255));
            rpc10.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 18)); // NOI18N
            rpc10.setForeground(new java.awt.Color(255, 255, 255));
            rpc10.setText("Credit: 13.5");
            rpc10.setMargin(new java.awt.Insets(0, 0, 0, 0));

            javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
            jPanel41.setLayout(jPanel41Layout);
            jPanel41Layout.setHorizontalGroup(
                  jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel41Layout.createSequentialGroup()
                        .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel41Layout.createSequentialGroup()
                                    .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rpc10, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(rpg10, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel41Layout.createSequentialGroup()
                                          .addComponent(rps10c5)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps10c6)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps10c7)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps10c8))
                                    .addGroup(jPanel41Layout.createSequentialGroup()
                                          .addComponent(rps10c1)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps10c2)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps10c3)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps10c4))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel41Layout.setVerticalGroup(
                  jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel41Layout.createSequentialGroup()
                        .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jButton59)
                              .addComponent(rpg10)
                              .addComponent(rpc10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(rps10c1)
                              .addComponent(rps10c2)
                              .addComponent(rps10c3)
                              .addComponent(rps10c4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(rps10c5)
                              .addComponent(rps10c6)
                              .addComponent(rps10c7)
                              .addComponent(rps10c8)))
            );

            jPanel42.setBackground(new java.awt.Color(204, 204, 255));

            jButton61.setBackground(new java.awt.Color(51, 153, 255));
            jButton61.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 18)); // NOI18N
            jButton61.setForeground(new java.awt.Color(255, 255, 255));
            jButton61.setText("Semester 11");
            jButton61.setMargin(new java.awt.Insets(0, 0, 0, 0));

            rps11c1.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps11c1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps11c1.setText("EEE201  3.75");
            rps11c1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps11c2.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps11c2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps11c2.setText("EEE201  3.75");
            rps11c2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps11c3.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps11c3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps11c3.setText("EEE201  3.75");
            rps11c3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps11c4.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps11c4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps11c4.setText("EEE201  3.75");
            rps11c4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rpg11.setBackground(new java.awt.Color(255, 51, 102));
            rpg11.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 18)); // NOI18N
            rpg11.setForeground(new java.awt.Color(255, 255, 255));
            rpg11.setText("GPA: 3.784");
            rpg11.setMargin(new java.awt.Insets(0, 0, 0, 0));

            rps11c8.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps11c8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps11c8.setText("EEE201  3.75");
            rps11c8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps11c7.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps11c7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps11c7.setText("EEE201  3.75");
            rps11c7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps11c6.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps11c6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps11c6.setText("EEE201  3.75");
            rps11c6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps11c5.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps11c5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps11c5.setText("EEE201  3.75");
            rps11c5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rpc11.setBackground(new java.awt.Color(102, 102, 255));
            rpc11.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 18)); // NOI18N
            rpc11.setForeground(new java.awt.Color(255, 255, 255));
            rpc11.setText("Credit: 13.5");
            rpc11.setMargin(new java.awt.Insets(0, 0, 0, 0));

            javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
            jPanel42.setLayout(jPanel42Layout);
            jPanel42Layout.setHorizontalGroup(
                  jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel42Layout.createSequentialGroup()
                                    .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rpc11, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(rpg11, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel42Layout.createSequentialGroup()
                                          .addComponent(rps11c5)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps11c6)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps11c7)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps11c8))
                                    .addGroup(jPanel42Layout.createSequentialGroup()
                                          .addComponent(rps11c1)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps11c2)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps11c3)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps11c4))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel42Layout.setVerticalGroup(
                  jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jButton61)
                              .addComponent(rpg11)
                              .addComponent(rpc11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(rps11c1)
                              .addComponent(rps11c2)
                              .addComponent(rps11c3)
                              .addComponent(rps11c4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(rps11c5)
                              .addComponent(rps11c6)
                              .addComponent(rps11c7)
                              .addComponent(rps11c8)))
            );

            jPanel43.setBackground(new java.awt.Color(204, 204, 255));

            jButton63.setBackground(new java.awt.Color(51, 153, 255));
            jButton63.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 18)); // NOI18N
            jButton63.setForeground(new java.awt.Color(255, 255, 255));
            jButton63.setText("Semester 06");
            jButton63.setMargin(new java.awt.Insets(0, 0, 0, 0));

            rps6c1.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps6c1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps6c1.setText("EEE201  3.75");
            rps6c1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps6c2.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps6c2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps6c2.setText("EEE201  3.75");
            rps6c2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps6c3.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps6c3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps6c3.setText("EEE201  3.75");
            rps6c3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps6c4.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps6c4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps6c4.setText("EEE201  3.75");
            rps6c4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rpg6.setBackground(new java.awt.Color(255, 51, 102));
            rpg6.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 18)); // NOI18N
            rpg6.setForeground(new java.awt.Color(255, 255, 255));
            rpg6.setText("GPA: 3.784");
            rpg6.setMargin(new java.awt.Insets(0, 0, 0, 0));

            rps6c8.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps6c8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps6c8.setText("EEE201  3.75");
            rps6c8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps6c7.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps6c7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps6c7.setText("EEE201  3.75");
            rps6c7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps6c6.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps6c6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps6c6.setText("EEE201  3.75");
            rps6c6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps6c5.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps6c5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps6c5.setText("EEE201  3.75");
            rps6c5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rpc6.setBackground(new java.awt.Color(102, 102, 255));
            rpc6.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 18)); // NOI18N
            rpc6.setForeground(new java.awt.Color(255, 255, 255));
            rpc6.setText("Credit: 13.5");
            rpc6.setMargin(new java.awt.Insets(0, 0, 0, 0));

            javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
            jPanel43.setLayout(jPanel43Layout);
            jPanel43Layout.setHorizontalGroup(
                  jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                                    .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rpc6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(rpg6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel43Layout.createSequentialGroup()
                                          .addComponent(rps6c5)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps6c6)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps6c7)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps6c8))
                                    .addGroup(jPanel43Layout.createSequentialGroup()
                                          .addComponent(rps6c1)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps6c2)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps6c3)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps6c4))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel43Layout.setVerticalGroup(
                  jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jButton63)
                              .addComponent(rpg6)
                              .addComponent(rpc6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(rps6c1)
                              .addComponent(rps6c2)
                              .addComponent(rps6c3)
                              .addComponent(rps6c4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(rps6c5)
                              .addComponent(rps6c6)
                              .addComponent(rps6c7)
                              .addComponent(rps6c8)))
            );

            jPanel44.setBackground(new java.awt.Color(204, 204, 255));

            jButton65.setBackground(new java.awt.Color(51, 153, 255));
            jButton65.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 18)); // NOI18N
            jButton65.setForeground(new java.awt.Color(255, 255, 255));
            jButton65.setText("Semester 09");
            jButton65.setMargin(new java.awt.Insets(0, 0, 0, 0));

            rps9c1.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps9c1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps9c1.setText("EEE201  3.75");
            rps9c1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps9c2.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps9c2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps9c2.setText("EEE201  3.75");
            rps9c2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps9c3.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps9c3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps9c3.setText("EEE201  3.75");
            rps9c3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps9c4.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps9c4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps9c4.setText("EEE201  3.75");
            rps9c4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rpg9.setBackground(new java.awt.Color(255, 51, 102));
            rpg9.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 18)); // NOI18N
            rpg9.setForeground(new java.awt.Color(255, 255, 255));
            rpg9.setText("GPA: 3.784");
            rpg9.setMargin(new java.awt.Insets(0, 0, 0, 0));

            rps9c8.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps9c8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps9c8.setText("EEE201  3.75");
            rps9c8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps9c7.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps9c7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps9c7.setText("EEE201  3.75");
            rps9c7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps9c6.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps9c6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps9c6.setText("EEE201  3.75");
            rps9c6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps9c5.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps9c5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps9c5.setText("EEE201  3.75");
            rps9c5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rpc9.setBackground(new java.awt.Color(102, 102, 255));
            rpc9.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 18)); // NOI18N
            rpc9.setForeground(new java.awt.Color(255, 255, 255));
            rpc9.setText("Credit: 13.5");
            rpc9.setMargin(new java.awt.Insets(0, 0, 0, 0));

            javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
            jPanel44.setLayout(jPanel44Layout);
            jPanel44Layout.setHorizontalGroup(
                  jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel44Layout.createSequentialGroup()
                                    .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rpc9, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(rpg9, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel44Layout.createSequentialGroup()
                                          .addComponent(rps9c5)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps9c6)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps9c7)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps9c8))
                                    .addGroup(jPanel44Layout.createSequentialGroup()
                                          .addComponent(rps9c1)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps9c2)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps9c3)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps9c4))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel44Layout.setVerticalGroup(
                  jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jButton65)
                              .addComponent(rpg9)
                              .addComponent(rpc9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(rps9c1)
                              .addComponent(rps9c2)
                              .addComponent(rps9c3)
                              .addComponent(rps9c4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(rps9c5)
                              .addComponent(rps9c6)
                              .addComponent(rps9c7)
                              .addComponent(rps9c8)))
            );

            jPanel45.setBackground(new java.awt.Color(204, 204, 255));

            jButton67.setBackground(new java.awt.Color(51, 153, 255));
            jButton67.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 18)); // NOI18N
            jButton67.setForeground(new java.awt.Color(255, 255, 255));
            jButton67.setText("Semester 12");
            jButton67.setMargin(new java.awt.Insets(0, 0, 0, 0));

            rps12c1.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps12c1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps12c1.setText("EEE201  3.75");
            rps12c1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps12c2.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps12c2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps12c2.setText("EEE201  3.75");
            rps12c2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps12c3.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps12c3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps12c3.setText("EEE201  3.75");
            rps12c3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps12c4.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps12c4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps12c4.setText("EEE201  3.75");
            rps12c4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rpg12.setBackground(new java.awt.Color(255, 51, 102));
            rpg12.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 18)); // NOI18N
            rpg12.setForeground(new java.awt.Color(255, 255, 255));
            rpg12.setText("GPA: 3.784");
            rpg12.setMargin(new java.awt.Insets(0, 0, 0, 0));

            rps12c8.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps12c8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps12c8.setText("EEE201  3.75");
            rps12c8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps12c7.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps12c7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps12c7.setText("EEE201  3.75");
            rps12c7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps12c6.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps12c6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps12c6.setText("EEE201  3.75");
            rps12c6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rps12c5.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 16)); // NOI18N
            rps12c5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            rps12c5.setText("EEE201  3.75");
            rps12c5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            rpc12.setBackground(new java.awt.Color(102, 102, 255));
            rpc12.setFont(new java.awt.Font("Gill Sans Nova Cond Lt", 1, 18)); // NOI18N
            rpc12.setForeground(new java.awt.Color(255, 255, 255));
            rpc12.setText("Credit: 13.5");
            rpc12.setMargin(new java.awt.Insets(0, 0, 0, 0));

            javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
            jPanel45.setLayout(jPanel45Layout);
            jPanel45Layout.setHorizontalGroup(
                  jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                                    .addComponent(jButton67, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rpc12, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(rpg12, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel45Layout.createSequentialGroup()
                                          .addComponent(rps12c5)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps12c6)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps12c7)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps12c8))
                                    .addGroup(jPanel45Layout.createSequentialGroup()
                                          .addComponent(rps12c1)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps12c2)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps12c3)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(rps12c4))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel45Layout.setVerticalGroup(
                  jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jButton67)
                              .addComponent(rpg12)
                              .addComponent(rpc12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(rps12c1)
                              .addComponent(rps12c2)
                              .addComponent(rps12c3)
                              .addComponent(rps12c4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(rps12c5)
                              .addComponent(rps12c6)
                              .addComponent(rps12c7)
                              .addComponent(rps12c8)))
            );

            selectcourse1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            selectcourse1.setForeground(new java.awt.Color(204, 0, 51));
            selectcourse1.setText("Select a cours from above");

            retakenlist.setEditable(false);
            retakenlist.setBackground(new java.awt.Color(102, 102, 255));
            retakenlist.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            retakenlist.setForeground(new java.awt.Color(255, 255, 255));
            retakenlist.setHorizontalAlignment(javax.swing.JTextField.LEFT);
            retakenlist.setText("Retaken Courses: ");
            retakenlist.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            retakenlist.setCaretColor(new java.awt.Color(255, 255, 255));

            footcc.setEditable(false);
            footcc.setBackground(new java.awt.Color(102, 102, 255));
            footcc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            footcc.setForeground(new java.awt.Color(255, 255, 255));
            footcc.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
            footcc.setText("Current CGPA: 0.000");
            footcc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            footcc.setCaretColor(new java.awt.Color(255, 255, 255));

            footpc.setEditable(false);
            footpc.setBackground(new java.awt.Color(255, 0, 0));
            footpc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            footpc.setForeground(new java.awt.Color(255, 255, 255));
            footpc.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
            footpc.setText("Predicted CGPA: 0.000");
            footpc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            footpc.setCaretColor(new java.awt.Color(255, 255, 255));

            freezerp.setBackground(new java.awt.Color(102, 102, 102));
            freezerp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            freezerp.setForeground(new java.awt.Color(255, 255, 255));
            freezerp.setText("Freeze");
            freezerp.setEnabled(false);
            freezerp.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        freezerpActionPerformed(evt);
                  }
            });

            retakecost.setEditable(false);
            retakecost.setBackground(new java.awt.Color(102, 102, 255));
            retakecost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            retakecost.setHorizontalAlignment(javax.swing.JTextField.LEFT);
            retakecost.setText("Retake cost: ");

            javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
            jPanel14.setLayout(jPanel14Layout);
            jPanel14Layout.setHorizontalGroup(
                  jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel14Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(retakenlist))
                              .addGroup(jPanel14Layout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addComponent(retakecost, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(footpc, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(footcc, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(freezerp)))
                        .addGap(81, 81, 81))
                  .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel14Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(jPanel14Layout.createSequentialGroup()
                                                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGroup(jPanel14Layout.createSequentialGroup()
                                                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGroup(jPanel14Layout.createSequentialGroup()
                                                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGroup(jPanel14Layout.createSequentialGroup()
                                                .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))))
                              .addGroup(jPanel14Layout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addComponent(selectcourse1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(jPanel14Layout.createSequentialGroup()
                                    .addGap(45, 45, 45)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(60, Short.MAX_VALUE))
            );
            jPanel14Layout.setVerticalGroup(
                  jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                              .addGroup(jPanel14Layout.createSequentialGroup()
                                    .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(jPanel14Layout.createSequentialGroup()
                                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(jPanel39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(jPanel43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(retakenlist, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(footcc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(footpc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(freezerp)
                              .addComponent(retakecost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177)
                        .addComponent(selectcourse1)
                        .addContainerGap(3120, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
            jPanel7.setLayout(jPanel7Layout);
            jPanel7Layout.setHorizontalGroup(
                  jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel7Layout.setVerticalGroup(
                  jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            Table.addTab("tab1", jPanel7);

            jPanel8.setBackground(new java.awt.Color(255, 255, 255));

            jPanel3.setBackground(new java.awt.Color(255, 108, 44));

            ebsem1.setBackground(new java.awt.Color(255, 108, 44));
            ebsem1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            ebsem1.setForeground(new java.awt.Color(255, 255, 255));
            ebsem1.setText("Semester 01");
            ebsem1.setMargin(new java.awt.Insets(0, 0, 0, 0));
            ebsem1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        ebsem1ActionPerformed(evt);
                  }
            });

            ebsem2.setBackground(new java.awt.Color(255, 108, 44));
            ebsem2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            ebsem2.setForeground(new java.awt.Color(255, 255, 255));
            ebsem2.setText("Semester 02");
            ebsem2.setMargin(new java.awt.Insets(0, 0, 0, 0));
            ebsem2.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        ebsem2ActionPerformed(evt);
                  }
            });

            ebsem3.setBackground(new java.awt.Color(255, 108, 44));
            ebsem3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            ebsem3.setForeground(new java.awt.Color(255, 255, 255));
            ebsem3.setText("Semester 03");
            ebsem3.setMargin(new java.awt.Insets(0, 0, 0, 0));
            ebsem3.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        ebsem3ActionPerformed(evt);
                  }
            });

            ebsem4.setBackground(new java.awt.Color(255, 108, 44));
            ebsem4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            ebsem4.setForeground(new java.awt.Color(255, 255, 255));
            ebsem4.setText("Semester 04");
            ebsem4.setMargin(new java.awt.Insets(0, 0, 0, 0));
            ebsem4.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        ebsem4ActionPerformed(evt);
                  }
            });

            ebsem5.setBackground(new java.awt.Color(255, 108, 44));
            ebsem5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            ebsem5.setForeground(new java.awt.Color(255, 255, 255));
            ebsem5.setText("Semester 05");
            ebsem5.setMargin(new java.awt.Insets(0, 0, 0, 0));
            ebsem5.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        ebsem5ActionPerformed(evt);
                  }
            });

            ebsem6.setBackground(new java.awt.Color(255, 108, 44));
            ebsem6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            ebsem6.setForeground(new java.awt.Color(255, 255, 255));
            ebsem6.setText("Semester 06");
            ebsem6.setMargin(new java.awt.Insets(0, 0, 0, 0));
            ebsem6.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        ebsem6ActionPerformed(evt);
                  }
            });

            ebsem7.setBackground(new java.awt.Color(255, 108, 44));
            ebsem7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            ebsem7.setForeground(new java.awt.Color(255, 255, 255));
            ebsem7.setText("Semester 07");
            ebsem7.setMargin(new java.awt.Insets(0, 0, 0, 0));
            ebsem7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                  public void mouseDragged(java.awt.event.MouseEvent evt) {
                        ebsem7MouseDragged(evt);
                  }
            });
            ebsem7.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        ebsem7MouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        ebsem7MouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        ebsem7MouseExited(evt);
                  }
            });
            ebsem7.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        ebsem7ActionPerformed(evt);
                  }
            });

            ebsem8.setBackground(new java.awt.Color(255, 108, 44));
            ebsem8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            ebsem8.setForeground(new java.awt.Color(255, 255, 255));
            ebsem8.setText("Semester 08");
            ebsem8.setMargin(new java.awt.Insets(0, 0, 0, 0));
            ebsem8.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        ebsem8ActionPerformed(evt);
                  }
            });

            ebsem9.setBackground(new java.awt.Color(255, 108, 44));
            ebsem9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            ebsem9.setForeground(new java.awt.Color(255, 255, 255));
            ebsem9.setText("Semester 09");
            ebsem9.setMargin(new java.awt.Insets(0, 0, 0, 0));
            ebsem9.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        ebsem9ActionPerformed(evt);
                  }
            });

            ebsem10.setBackground(new java.awt.Color(255, 108, 44));
            ebsem10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            ebsem10.setForeground(new java.awt.Color(255, 255, 255));
            ebsem10.setText("Semester 10");
            ebsem10.setMargin(new java.awt.Insets(0, 0, 0, 0));
            ebsem10.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        ebsem10ActionPerformed(evt);
                  }
            });

            ebsem11.setBackground(new java.awt.Color(255, 108, 44));
            ebsem11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            ebsem11.setForeground(new java.awt.Color(255, 255, 255));
            ebsem11.setText("Semester 11");
            ebsem11.setMargin(new java.awt.Insets(0, 0, 0, 0));
            ebsem11.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        ebsem11ActionPerformed(evt);
                  }
            });

            ebsem12.setBackground(new java.awt.Color(255, 108, 44));
            ebsem12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            ebsem12.setForeground(new java.awt.Color(255, 255, 255));
            ebsem12.setText("Semester 12");
            ebsem12.setMargin(new java.awt.Insets(0, 0, 0, 0));
            ebsem12.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        ebsem12ActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                  jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(ebsem1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(ebsem2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(ebsem3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(ebsem4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(ebsem5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(ebsem6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(ebsem7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(ebsem8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(ebsem9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(ebsem10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(ebsem11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(ebsem12, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(20, Short.MAX_VALUE))
            );
            jPanel3Layout.setVerticalGroup(
                  jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ebsem1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ebsem2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ebsem3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ebsem4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ebsem5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ebsem6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ebsem7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ebsem8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ebsem9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ebsem10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ebsem11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ebsem12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(32, Short.MAX_VALUE))
            );

            jPanel11.setBackground(new java.awt.Color(255, 108, 44));

            Edittitle.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
            Edittitle.setForeground(new java.awt.Color(255, 255, 255));
            Edittitle.setText("Select courses for Semester 01");
            Edittitle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

            CSE101.setBackground(new java.awt.Color(255, 108, 44));
            CSE101.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE101.setText("CSE101");
            CSE101.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE101.setBorderPainted(true);

            MAT101.setBackground(new java.awt.Color(255, 108, 44));
            MAT101.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            MAT101.setText("MAT101");
            MAT101.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            MAT101.setBorderPainted(true);
            MAT101.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        MAT101ActionPerformed(evt);
                  }
            });

            PHY101.setBackground(new java.awt.Color(255, 108, 44));
            PHY101.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            PHY101.setText("PHY101");
            PHY101.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            PHY101.setBorderPainted(true);

            EAP101.setBackground(new java.awt.Color(255, 108, 44));
            EAP101.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            EAP101.setText("EAP101");
            EAP101.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            EAP101.setBorderPainted(true);

            CSE103.setBackground(new java.awt.Color(255, 108, 44));
            CSE103.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE103.setText("CSE103");
            CSE103.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE103.setBorderPainted(true);

            CSE104.setBackground(new java.awt.Color(255, 108, 44));
            CSE104.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE104.setText("CSE104");
            CSE104.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE104.setBorderPainted(true);

            MAT103.setBackground(new java.awt.Color(255, 108, 44));
            MAT103.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            MAT103.setText("MAT103");
            MAT103.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            MAT103.setBorderPainted(true);

            PHY103.setBackground(new java.awt.Color(255, 108, 44));
            PHY103.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            PHY103.setText("PHY103");
            PHY103.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            PHY103.setBorderPainted(true);

            PHY104.setBackground(new java.awt.Color(255, 108, 44));
            PHY104.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            PHY104.setText("PHY104");
            PHY104.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            PHY104.setBorderPainted(true);

            EAP103.setBackground(new java.awt.Color(255, 108, 44));
            EAP103.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            EAP103.setText("EAP103");
            EAP103.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            EAP103.setBorderPainted(true);

            CSE105.setBackground(new java.awt.Color(255, 108, 44));
            CSE105.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE105.setText("CSE105");
            CSE105.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE105.setBorderPainted(true);
            CSE105.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        CSE105ActionPerformed(evt);
                  }
            });

            CSE106.setBackground(new java.awt.Color(255, 108, 44));
            CSE106.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE106.setText("CSE106");
            CSE106.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE106.setBorderPainted(true);

            MAT105.setBackground(new java.awt.Color(255, 108, 44));
            MAT105.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            MAT105.setText("MAT105");
            MAT105.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            MAT105.setBorderPainted(true);

            CHE101.setBackground(new java.awt.Color(255, 108, 44));
            CHE101.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CHE101.setText("CHE101");
            CHE101.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CHE101.setBorderPainted(true);
            CHE101.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        CHE101ActionPerformed(evt);
                  }
            });

            CHE102.setBackground(new java.awt.Color(255, 108, 44));
            CHE102.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CHE102.setText("CHE102");
            CHE102.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CHE102.setBorderPainted(true);

            jButton1.setBackground(new java.awt.Color(51, 51, 51));
            jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            jButton1.setForeground(new java.awt.Color(255, 255, 255));
            jButton1.setText("Done");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                  }
            });

            CSE201.setBackground(new java.awt.Color(255, 108, 44));
            CSE201.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE201.setText("CSE201");
            CSE201.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE201.setBorderPainted(true);

            CSE202.setBackground(new java.awt.Color(255, 108, 44));
            CSE202.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE202.setText("CSE202");
            CSE202.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE202.setBorderPainted(true);

            CSE203.setBackground(new java.awt.Color(255, 108, 44));
            CSE203.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE203.setText("CSE203");
            CSE203.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE203.setBorderPainted(true);

            CSE204.setBackground(new java.awt.Color(255, 108, 44));
            CSE204.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE204.setText("CSE204");
            CSE204.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE204.setBorderPainted(true);

            EEE201.setBackground(new java.awt.Color(255, 108, 44));
            EEE201.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            EEE201.setText("EEE201");
            EEE201.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            EEE201.setBorderPainted(true);
            EEE201.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        EEE201ActionPerformed(evt);
                  }
            });

            EEE202.setBackground(new java.awt.Color(255, 108, 44));
            EEE202.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            EEE202.setText("EEE202");
            EEE202.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            EEE202.setBorderPainted(true);

            jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            jLabel4.setForeground(new java.awt.Color(255, 255, 255));
            jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel4.setText("Select all courses that you have taken");

            jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            jLabel5.setForeground(new java.awt.Color(255, 255, 255));
            jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel5.setText("in following semseter!");

            GED201.setBackground(new java.awt.Color(255, 108, 44));
            GED201.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            GED201.setText("GED201");
            GED201.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            GED201.setBorderPainted(true);

            CSE205.setBackground(new java.awt.Color(255, 108, 44));
            CSE205.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE205.setText("CSE205");
            CSE205.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE205.setBorderPainted(true);

            CSE206.setBackground(new java.awt.Color(255, 108, 44));
            CSE206.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE206.setText("CSE206");
            CSE206.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE206.setBorderPainted(true);

            CSE208.setBackground(new java.awt.Color(255, 108, 44));
            CSE208.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE208.setText("CSE208");
            CSE208.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE208.setBorderPainted(true);

            EEE203.setBackground(new java.awt.Color(255, 108, 44));
            EEE203.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            EEE203.setText("EEE203");
            EEE203.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            EEE203.setBorderPainted(true);

            EEE204.setBackground(new java.awt.Color(255, 108, 44));
            EEE204.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            EEE204.setText("EEE204");
            EEE204.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            EEE204.setBorderPainted(true);

            CSE301.setBackground(new java.awt.Color(255, 108, 44));
            CSE301.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE301.setText("CSE301");
            CSE301.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE301.setBorderPainted(true);

            CSE209.setBackground(new java.awt.Color(255, 108, 44));
            CSE209.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE209.setText("CSE209");
            CSE209.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE209.setBorderPainted(true);
            CSE209.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        CSE209ActionPerformed(evt);
                  }
            });

            CSE210.setBackground(new java.awt.Color(255, 108, 44));
            CSE210.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE210.setText("CSE210");
            CSE210.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE210.setBorderPainted(true);
            CSE210.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        CSE210ActionPerformed(evt);
                  }
            });

            CSE211.setBackground(new java.awt.Color(255, 108, 44));
            CSE211.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE211.setText("CSE211");
            CSE211.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE211.setBorderPainted(true);
            CSE211.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        CSE211ActionPerformed(evt);
                  }
            });

            EEE205.setBackground(new java.awt.Color(255, 108, 44));
            EEE205.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            EEE205.setText("EEE205");
            EEE205.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            EEE205.setBorderPainted(true);
            EEE205.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        EEE205ActionPerformed(evt);
                  }
            });

            MAT201.setBackground(new java.awt.Color(255, 108, 44));
            MAT201.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            MAT201.setText("MAT201");
            MAT201.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            MAT201.setBorderPainted(true);
            MAT201.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        MAT201ActionPerformed(evt);
                  }
            });

            CSE302.setBackground(new java.awt.Color(255, 108, 44));
            CSE302.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE302.setText("CSE302");
            CSE302.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE302.setBorderPainted(true);

            CSE303.setBackground(new java.awt.Color(255, 108, 44));
            CSE303.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE303.setText("CSE303");
            CSE303.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE303.setBorderPainted(true);

            CSE304.setBackground(new java.awt.Color(255, 108, 44));
            CSE304.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE304.setText("CSE304");
            CSE304.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE304.setBorderPainted(true);

            CSE305.setBackground(new java.awt.Color(255, 108, 44));
            CSE305.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE305.setText("CSE305");
            CSE305.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE305.setBorderPainted(true);

            CSE306.setBackground(new java.awt.Color(255, 108, 44));
            CSE306.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE306.setText("CSE306");
            CSE306.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE306.setBorderPainted(true);

            CSE307.setBackground(new java.awt.Color(255, 108, 44));
            CSE307.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE307.setText("CSE307");
            CSE307.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE307.setBorderPainted(true);

            CSE308.setBackground(new java.awt.Color(255, 108, 44));
            CSE308.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE308.setText("CSE308");
            CSE308.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE308.setBorderPainted(true);

            CSE309.setBackground(new java.awt.Color(255, 108, 44));
            CSE309.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE309.setText("CSE309");
            CSE309.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE309.setBorderPainted(true);

            CSE310.setBackground(new java.awt.Color(255, 108, 44));
            CSE310.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE310.setText("CSE310");
            CSE310.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE310.setBorderPainted(true);

            CSE311.setBackground(new java.awt.Color(255, 108, 44));
            CSE311.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE311.setText("CSE311");
            CSE311.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE311.setBorderPainted(true);

            CSE312.setBackground(new java.awt.Color(255, 108, 44));
            CSE312.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE312.setText("CSE312");
            CSE312.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE312.setBorderPainted(true);

            CSE313.setBackground(new java.awt.Color(255, 108, 44));
            CSE313.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE313.setText("CSE313");
            CSE313.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE313.setBorderPainted(true);

            CSE314.setBackground(new java.awt.Color(255, 108, 44));
            CSE314.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE314.setText("CSE314");
            CSE314.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE314.setBorderPainted(true);

            GED303.setBackground(new java.awt.Color(255, 108, 44));
            GED303.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            GED303.setText("GED303");
            GED303.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            GED303.setBorderPainted(true);
            GED303.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        GED303ActionPerformed(evt);
                  }
            });

            CSE315.setBackground(new java.awt.Color(255, 108, 44));
            CSE315.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE315.setText("CSE315");
            CSE315.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE315.setBorderPainted(true);

            GED301.setBackground(new java.awt.Color(255, 108, 44));
            GED301.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            GED301.setText("GED301");
            GED301.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            GED301.setBorderPainted(true);
            GED301.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        GED301ActionPerformed(evt);
                  }
            });

            GED305.setBackground(new java.awt.Color(255, 108, 44));
            GED305.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            GED305.setText("GED305");
            GED305.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            GED305.setBorderPainted(true);
            GED305.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        GED305ActionPerformed(evt);
                  }
            });

            CSE317.setBackground(new java.awt.Color(255, 108, 44));
            CSE317.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE317.setText("CSE317");
            CSE317.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE317.setBorderPainted(true);

            CSE319.setBackground(new java.awt.Color(255, 108, 44));
            CSE319.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE319.setText("CSE319");
            CSE319.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE319.setBorderPainted(true);

            GED401.setBackground(new java.awt.Color(255, 108, 44));
            GED401.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            GED401.setText("GED401");
            GED401.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            GED401.setBorderPainted(true);

            CSE321.setBackground(new java.awt.Color(255, 108, 44));
            CSE321.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE321.setText("CSE321");
            CSE321.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE321.setBorderPainted(true);

            GED307.setBackground(new java.awt.Color(255, 108, 44));
            GED307.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            GED307.setText("GED307");
            GED307.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            GED307.setBorderPainted(true);
            GED307.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        GED307ActionPerformed(evt);
                  }
            });

            GED403.setBackground(new java.awt.Color(255, 108, 44));
            GED403.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            GED403.setText("GED403");
            GED403.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            GED403.setBorderPainted(true);

            CSE401.setBackground(new java.awt.Color(255, 108, 44));
            CSE401.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE401.setText("CSE401");
            CSE401.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE401.setBorderPainted(true);

            GED405.setBackground(new java.awt.Color(255, 108, 44));
            GED405.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            GED405.setText("GED405");
            GED405.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            GED405.setBorderPainted(true);

            CSE402.setBackground(new java.awt.Color(255, 108, 44));
            CSE402.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE402.setText("CSE402");
            CSE402.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE402.setBorderPainted(true);

            CSE403.setBackground(new java.awt.Color(255, 108, 44));
            CSE403.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE403.setText("CSE403");
            CSE403.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE403.setBorderPainted(true);

            CSE404.setBackground(new java.awt.Color(255, 108, 44));
            CSE404.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE404.setText("CSE404");
            CSE404.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE404.setBorderPainted(true);

            CSE405.setBackground(new java.awt.Color(255, 108, 44));
            CSE405.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE405.setText("CSE405");
            CSE405.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE405.setBorderPainted(true);

            CSE406.setBackground(new java.awt.Color(255, 108, 44));
            CSE406.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE406.setText("CSE406");
            CSE406.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE406.setBorderPainted(true);

            CSE407.setBackground(new java.awt.Color(255, 108, 44));
            CSE407.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE407.setText("CSE407");
            CSE407.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE407.setBorderPainted(true);

            CSE408.setBackground(new java.awt.Color(255, 108, 44));
            CSE408.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE408.setText("CSE408");
            CSE408.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE408.setBorderPainted(true);

            CSE409.setBackground(new java.awt.Color(255, 108, 44));
            CSE409.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE409.setText("CSE409");
            CSE409.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE409.setBorderPainted(true);

            CSE410.setBackground(new java.awt.Color(255, 108, 44));
            CSE410.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE410.setText("CSE410");
            CSE410.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE410.setBorderPainted(true);

            CSE411.setBackground(new java.awt.Color(255, 108, 44));
            CSE411.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE411.setText("CSE411");
            CSE411.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE411.setBorderPainted(true);

            GED407.setBackground(new java.awt.Color(255, 108, 44));
            GED407.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            GED407.setText("GED407");
            GED407.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            GED407.setBorderPainted(true);

            CSE413.setBackground(new java.awt.Color(255, 108, 44));
            CSE413.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE413.setText("CSE413");
            CSE413.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE413.setBorderPainted(true);

            CSE400.setBackground(new java.awt.Color(255, 108, 44));
            CSE400.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE400.setText("CSE400");
            CSE400.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE400.setBorderPainted(true);

            CSE437.setBackground(new java.awt.Color(255, 108, 44));
            CSE437.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE437.setText("CSE437");
            CSE437.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE437.setBorderPainted(true);

            CSE800.setBackground(new java.awt.Color(255, 108, 44));
            CSE800.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE800.setText("CSE800");
            CSE800.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE800.setBorderPainted(true);

            CSE438.setBackground(new java.awt.Color(255, 108, 44));
            CSE438.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            CSE438.setText("CSE438");
            CSE438.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CSE438.setBorderPainted(true);

            javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
            jPanel11.setLayout(jPanel11Layout);
            jPanel11Layout.setHorizontalGroup(
                  jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                              .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGroup(jPanel11Layout.createSequentialGroup()
                                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel11Layout.createSequentialGroup()
                                                      .addComponent(Edittitle)
                                                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                      .addComponent(jLabel5))
                                                .addGroup(jPanel11Layout.createSequentialGroup()
                                                      .addGap(4, 4, 4)
                                                      .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(jPanel11Layout.createSequentialGroup()
                                                                  .addComponent(CSE101)
                                                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                  .addComponent(MAT101)
                                                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                  .addComponent(PHY101)
                                                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                  .addComponent(EAP101)
                                                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                  .addComponent(CSE103)
                                                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                  .addComponent(CSE104)
                                                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                  .addComponent(MAT103)
                                                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                  .addComponent(PHY103)
                                                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                  .addComponent(PHY104))
                                                            .addGroup(jPanel11Layout.createSequentialGroup()
                                                                  .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(EEE202)
                                                                        .addComponent(CSE105))
                                                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                  .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel11Layout.createSequentialGroup()
                                                                              .addComponent(CSE106)
                                                                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                              .addComponent(CHE101)
                                                                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                              .addComponent(CHE102)
                                                                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                              .addComponent(MAT105)
                                                                              .addGap(5, 5, 5)
                                                                              .addComponent(CSE201)
                                                                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                              .addComponent(CSE202)
                                                                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                              .addComponent(CSE203)
                                                                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                              .addComponent(CSE204))
                                                                        .addGroup(jPanel11Layout.createSequentialGroup()
                                                                              .addComponent(GED201)
                                                                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                              .addComponent(CSE205)
                                                                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                              .addComponent(CSE206)
                                                                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                              .addComponent(CSE208)
                                                                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                              .addComponent(EEE203)
                                                                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                              .addComponent(EEE204)
                                                                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                              .addComponent(CSE209)
                                                                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                              .addComponent(CSE210)))))
                                                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                      .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                  .addComponent(EAP103)
                                                                  .addComponent(EEE201))
                                                            .addComponent(CSE211))))
                                          .addGroup(jPanel11Layout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addGroup(jPanel11Layout.createSequentialGroup()
                                                            .addComponent(CSE309)
                                                            .addGap(2, 2, 2)
                                                            .addComponent(CSE310)
                                                            .addGap(12, 12, 12)
                                                            .addComponent(CSE311)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(CSE312)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(GED301)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(GED303)
                                                            .addGap(2, 2, 2)
                                                            .addComponent(CSE313)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(CSE314)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(CSE315)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(CSE317))
                                                      .addGroup(jPanel11Layout.createSequentialGroup()
                                                            .addComponent(EEE205)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(MAT201)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(CSE301)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(CSE302)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(CSE303)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(CSE304)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(CSE305)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(CSE306)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(CSE307)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(CSE308))
                                                      .addGroup(jPanel11Layout.createSequentialGroup()
                                                            .addComponent(CSE319)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(CSE321)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(GED305)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(GED307)
                                                            .addGap(2, 2, 2)
                                                            .addComponent(GED401)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(GED403)
                                                            .addGap(2, 2, 2)
                                                            .addComponent(GED405)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(CSE401)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(CSE402)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(CSE403))
                                                      .addGroup(jPanel11Layout.createSequentialGroup()
                                                            .addComponent(CSE400)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(CSE437)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(CSE438)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(CSE800))
                                                      .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jButton1)
                                                            .addGroup(jPanel11Layout.createSequentialGroup()
                                                                  .addComponent(CSE404)
                                                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                  .addComponent(CSE405)
                                                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                  .addComponent(CSE406)
                                                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                  .addComponent(CSE407)
                                                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                  .addComponent(CSE408)
                                                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                  .addComponent(CSE409)
                                                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                  .addComponent(CSE410)
                                                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                  .addComponent(CSE411)
                                                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                  .addComponent(GED407)
                                                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                  .addComponent(CSE413))))))
                                    .addGap(2, 2, 2)))
                        .addContainerGap(74, Short.MAX_VALUE))
            );
            jPanel11Layout.setVerticalGroup(
                  jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(Edittitle)
                              .addComponent(jLabel5))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(CSE101)
                              .addComponent(PHY101)
                              .addComponent(EAP101)
                              .addComponent(CSE103)
                              .addComponent(CSE104)
                              .addComponent(MAT103)
                              .addComponent(PHY103)
                              .addComponent(PHY104)
                              .addComponent(EAP103)
                              .addComponent(MAT101))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(CSE105)
                              .addComponent(CSE106)
                              .addComponent(CHE101)
                              .addComponent(CHE102)
                              .addComponent(CSE201)
                              .addComponent(CSE202)
                              .addComponent(CSE203)
                              .addComponent(CSE204)
                              .addComponent(EEE201)
                              .addComponent(MAT105))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(EEE202)
                              .addComponent(GED201)
                              .addComponent(CSE205)
                              .addComponent(CSE206)
                              .addComponent(CSE208)
                              .addComponent(EEE203)
                              .addComponent(EEE204)
                              .addComponent(CSE209)
                              .addComponent(CSE210)
                              .addComponent(CSE211))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(EEE205)
                              .addComponent(MAT201)
                              .addComponent(CSE301)
                              .addComponent(CSE302)
                              .addComponent(CSE303)
                              .addComponent(CSE304)
                              .addComponent(CSE305)
                              .addComponent(CSE306)
                              .addComponent(CSE307)
                              .addComponent(CSE308))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(CSE309)
                              .addComponent(CSE310)
                              .addComponent(CSE311)
                              .addComponent(CSE312)
                              .addComponent(GED301)
                              .addComponent(GED303)
                              .addComponent(CSE313)
                              .addComponent(CSE314)
                              .addComponent(CSE315)
                              .addComponent(CSE317))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(CSE319)
                              .addComponent(CSE321)
                              .addComponent(GED305)
                              .addComponent(GED307)
                              .addComponent(GED401)
                              .addComponent(GED403)
                              .addComponent(GED405)
                              .addComponent(CSE401)
                              .addComponent(CSE402)
                              .addComponent(CSE403))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(CSE404)
                              .addComponent(CSE405)
                              .addComponent(CSE406)
                              .addComponent(CSE407)
                              .addComponent(CSE408)
                              .addComponent(CSE409)
                              .addComponent(CSE410)
                              .addComponent(CSE411)
                              .addComponent(GED407)
                              .addComponent(CSE413))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(CSE400)
                              .addComponent(CSE437)
                              .addComponent(CSE438)
                              .addComponent(CSE800))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(81, 81, 81))
            );

            javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
            jPanel8.setLayout(jPanel8Layout);
            jPanel8Layout.setHorizontalGroup(
                  jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel8Layout.setVerticalGroup(
                  jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            Table.addTab("tab2", jPanel8);

            jPanel9.setBackground(new java.awt.Color(255, 255, 255));

            jPanel6.setBackground(new java.awt.Color(255, 51, 51));

            csCourse1.setEditable(false);
            csCourse1.setBackground(new java.awt.Color(204, 204, 255));
            csCourse1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            csCourse1.setForeground(new java.awt.Color(51, 51, 51));
            csCourse1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            csCourse1.setText("CSE201");
            csCourse1.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        csCourse1MouseClicked(evt);
                  }
            });
            csCourse1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        csCourse1ActionPerformed(evt);
                  }
            });

            csCourse2.setEditable(false);
            csCourse2.setBackground(new java.awt.Color(204, 204, 255));
            csCourse2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            csCourse2.setForeground(new java.awt.Color(51, 51, 51));
            csCourse2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            csCourse2.setText("CSE201");
            csCourse2.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        csCourse2MouseClicked(evt);
                  }
            });
            csCourse2.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        csCourse2ActionPerformed(evt);
                  }
            });

            csCourse3.setEditable(false);
            csCourse3.setBackground(new java.awt.Color(204, 204, 255));
            csCourse3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            csCourse3.setForeground(new java.awt.Color(51, 51, 51));
            csCourse3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            csCourse3.setText("CSE201");
            csCourse3.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        csCourse3MouseClicked(evt);
                  }
            });
            csCourse3.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        csCourse3ActionPerformed(evt);
                  }
            });

            csCourse4.setEditable(false);
            csCourse4.setBackground(new java.awt.Color(204, 204, 255));
            csCourse4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            csCourse4.setForeground(new java.awt.Color(51, 51, 51));
            csCourse4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            csCourse4.setText("CSE201");
            csCourse4.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        csCourse4MouseClicked(evt);
                  }
            });
            csCourse4.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        csCourse4ActionPerformed(evt);
                  }
            });

            csCourse5.setEditable(false);
            csCourse5.setBackground(new java.awt.Color(204, 204, 255));
            csCourse5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            csCourse5.setForeground(new java.awt.Color(51, 51, 51));
            csCourse5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            csCourse5.setText("CSE201");
            csCourse5.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        csCourse5MouseClicked(evt);
                  }
            });
            csCourse5.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        csCourse5ActionPerformed(evt);
                  }
            });

            csCourse6.setEditable(false);
            csCourse6.setBackground(new java.awt.Color(204, 204, 255));
            csCourse6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            csCourse6.setForeground(new java.awt.Color(51, 51, 51));
            csCourse6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            csCourse6.setText("CSE201");
            csCourse6.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        csCourse6MouseClicked(evt);
                  }
            });
            csCourse6.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        csCourse6ActionPerformed(evt);
                  }
            });

            csCourse7.setEditable(false);
            csCourse7.setBackground(new java.awt.Color(204, 204, 255));
            csCourse7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            csCourse7.setForeground(new java.awt.Color(51, 51, 51));
            csCourse7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            csCourse7.setText("CSE201");
            csCourse7.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        csCourse7MouseClicked(evt);
                  }
            });
            csCourse7.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        csCourse7ActionPerformed(evt);
                  }
            });

            csCourse8.setEditable(false);
            csCourse8.setBackground(new java.awt.Color(204, 204, 255));
            csCourse8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            csCourse8.setForeground(new java.awt.Color(51, 51, 51));
            csCourse8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            csCourse8.setText("CSE201");
            csCourse8.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        csCourse8MouseClicked(evt);
                  }
            });
            csCourse8.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        csCourse8ActionPerformed(evt);
                  }
            });

            jPanel19.setBackground(new java.awt.Color(255, 51, 51));
            jPanel19.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jLabel8.setForeground(new java.awt.Color(255, 255, 255));
            jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel8.setText("Select a course");

            javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
            jPanel19.setLayout(jPanel19Layout);
            jPanel19Layout.setHorizontalGroup(
                  jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            jPanel19Layout.setVerticalGroup(
                  jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
            );

            javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
            jPanel6.setLayout(jPanel6Layout);
            jPanel6Layout.setHorizontalGroup(
                  jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(csCourse1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                              .addComponent(csCourse2)
                              .addComponent(csCourse3)
                              .addComponent(csCourse4)
                              .addComponent(csCourse5)
                              .addComponent(csCourse6)
                              .addComponent(csCourse7)
                              .addComponent(csCourse8)
                              .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
            );
            jPanel6Layout.setVerticalGroup(
                  jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(csCourse1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(csCourse2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(csCourse3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(csCourse4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(csCourse5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(csCourse6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(csCourse7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(csCourse8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(50, Short.MAX_VALUE))
            );

            jPanel18.setBackground(new java.awt.Color(255, 51, 51));

            csnumct1.setEditable(false);
            csnumct1.setBackground(new java.awt.Color(204, 204, 255));
            csnumct1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            csnumct1.setForeground(new java.awt.Color(51, 51, 51));
            csnumct1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
            csnumct1.setText(" CT 1");
            csnumct1.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        csnumct1MouseClicked(evt);
                  }
            });
            csnumct1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        csnumct1ActionPerformed(evt);
                  }
            });

            csct1num.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            csct1num.setForeground(new java.awt.Color(255, 0, 0));
            csct1num.setHorizontalAlignment(javax.swing.JTextField.LEFT);
            csct1num.setText("0");

            csnumct2.setEditable(false);
            csnumct2.setBackground(new java.awt.Color(204, 204, 255));
            csnumct2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            csnumct2.setForeground(new java.awt.Color(51, 51, 51));
            csnumct2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
            csnumct2.setText(" CT 2");
            csnumct2.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        csnumct2MouseClicked(evt);
                  }
            });
            csnumct2.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        csnumct2ActionPerformed(evt);
                  }
            });

            csct2num.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            csct2num.setForeground(new java.awt.Color(255, 0, 0));
            csct2num.setHorizontalAlignment(javax.swing.JTextField.LEFT);
            csct2num.setText("0");

            csnumct3.setEditable(false);
            csnumct3.setBackground(new java.awt.Color(204, 204, 255));
            csnumct3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            csnumct3.setForeground(new java.awt.Color(51, 51, 51));
            csnumct3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
            csnumct3.setText(" CT 3");
            csnumct3.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        csnumct3MouseClicked(evt);
                  }
            });
            csnumct3.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        csnumct3ActionPerformed(evt);
                  }
            });

            csct3num.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            csct3num.setForeground(new java.awt.Color(255, 0, 0));
            csct3num.setHorizontalAlignment(javax.swing.JTextField.LEFT);
            csct3num.setText("0");

            csasign.setEditable(false);
            csasign.setBackground(new java.awt.Color(204, 204, 255));
            csasign.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            csasign.setForeground(new java.awt.Color(51, 51, 51));
            csasign.setHorizontalAlignment(javax.swing.JTextField.LEFT);
            csasign.setText(" Assignment");
            csasign.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        csasignMouseClicked(evt);
                  }
            });
            csasign.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        csasignActionPerformed(evt);
                  }
            });

            csassignnum.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            csassignnum.setForeground(new java.awt.Color(255, 0, 0));
            csassignnum.setHorizontalAlignment(javax.swing.JTextField.LEFT);
            csassignnum.setText("0");

            cspresen.setEditable(false);
            cspresen.setBackground(new java.awt.Color(204, 204, 255));
            cspresen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            cspresen.setForeground(new java.awt.Color(51, 51, 51));
            cspresen.setHorizontalAlignment(javax.swing.JTextField.LEFT);
            cspresen.setText(" Presentation");
            cspresen.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        cspresenMouseClicked(evt);
                  }
            });
            cspresen.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        cspresenActionPerformed(evt);
                  }
            });

            cspresennum.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            cspresennum.setForeground(new java.awt.Color(255, 0, 0));
            cspresennum.setHorizontalAlignment(javax.swing.JTextField.LEFT);
            cspresennum.setText("0");

            csatten.setEditable(false);
            csatten.setBackground(new java.awt.Color(204, 204, 255));
            csatten.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            csatten.setForeground(new java.awt.Color(51, 51, 51));
            csatten.setHorizontalAlignment(javax.swing.JTextField.LEFT);
            csatten.setText(" Attendance");
            csatten.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        csattenMouseClicked(evt);
                  }
            });
            csatten.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        csattenActionPerformed(evt);
                  }
            });

            csattennum.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            csattennum.setForeground(new java.awt.Color(255, 0, 0));
            csattennum.setHorizontalAlignment(javax.swing.JTextField.LEFT);
            csattennum.setText("0");

            csmid.setEditable(false);
            csmid.setBackground(new java.awt.Color(204, 204, 255));
            csmid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            csmid.setForeground(new java.awt.Color(51, 51, 51));
            csmid.setHorizontalAlignment(javax.swing.JTextField.LEFT);
            csmid.setText(" MidTerm");
            csmid.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        csmidMouseClicked(evt);
                  }
            });
            csmid.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        csmidActionPerformed(evt);
                  }
            });

            csmidnum.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            csmidnum.setForeground(new java.awt.Color(255, 0, 0));
            csmidnum.setHorizontalAlignment(javax.swing.JTextField.LEFT);
            csmidnum.setText("0");

            csfinal.setEditable(false);
            csfinal.setBackground(new java.awt.Color(204, 204, 255));
            csfinal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            csfinal.setForeground(new java.awt.Color(51, 51, 51));
            csfinal.setHorizontalAlignment(javax.swing.JTextField.LEFT);
            csfinal.setText(" FinalExam");
            csfinal.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        csfinalMouseClicked(evt);
                  }
            });
            csfinal.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        csfinalActionPerformed(evt);
                  }
            });

            csfinalnum.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            csfinalnum.setForeground(new java.awt.Color(255, 0, 0));
            csfinalnum.setText("0");

            javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
            jPanel25.setLayout(jPanel25Layout);
            jPanel25Layout.setHorizontalGroup(
                  jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel25Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                              .addGroup(jPanel25Layout.createSequentialGroup()
                                    .addComponent(csnumct1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(csct1num, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(jPanel25Layout.createSequentialGroup()
                                    .addComponent(csnumct2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(csct2num, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(jPanel25Layout.createSequentialGroup()
                                    .addComponent(csnumct3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(csct3num, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(jPanel25Layout.createSequentialGroup()
                                    .addComponent(csasign, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(csassignnum, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(jPanel25Layout.createSequentialGroup()
                                    .addComponent(cspresen, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cspresennum, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(jPanel25Layout.createSequentialGroup()
                                    .addComponent(csatten, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(csattennum, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(jPanel25Layout.createSequentialGroup()
                                    .addComponent(csmid, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(csmidnum, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(jPanel25Layout.createSequentialGroup()
                                    .addComponent(csfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(csfinalnum)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel25Layout.setVerticalGroup(
                  jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel25Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(csnumct1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(csct1num, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(csnumct2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(csct2num, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(csnumct3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(csct3num, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(csasign, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(csassignnum, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(cspresen, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(cspresennum, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(csatten, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(csattennum, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(csmid, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(csmidnum, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                              .addComponent(csfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(csfinalnum))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            jPanel20.setBackground(new java.awt.Color(255, 51, 51));
            jPanel20.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            cshead.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            cshead.setForeground(new java.awt.Color(255, 255, 255));
            cshead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            cshead.setText("Semester 4");

            javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
            jPanel20.setLayout(jPanel20Layout);
            jPanel20Layout.setHorizontalGroup(
                  jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(cshead, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            );
            jPanel20Layout.setVerticalGroup(
                  jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(cshead, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
            );

            jPanel22.setBackground(new java.awt.Color(255, 51, 51));

            jTextField14.setEditable(false);
            jTextField14.setBackground(new java.awt.Color(255, 51, 51));
            jTextField14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jTextField14.setForeground(new java.awt.Color(255, 255, 255));
            jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            jTextField14.setText("COURSES");
            jTextField14.setBorder(null);

            cstCourse1.setEditable(false);
            cstCourse1.setBackground(new java.awt.Color(255, 51, 51));
            cstCourse1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            cstCourse1.setForeground(new java.awt.Color(255, 255, 255));
            cstCourse1.setText("COURSE");

            cstCourse2.setEditable(false);
            cstCourse2.setBackground(new java.awt.Color(255, 51, 51));
            cstCourse2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            cstCourse2.setForeground(new java.awt.Color(255, 255, 255));
            cstCourse2.setText("COURSE");

            cstCourse3.setEditable(false);
            cstCourse3.setBackground(new java.awt.Color(255, 51, 51));
            cstCourse3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            cstCourse3.setForeground(new java.awt.Color(255, 255, 255));
            cstCourse3.setText("COURSE");

            cstCourse4.setEditable(false);
            cstCourse4.setBackground(new java.awt.Color(255, 51, 51));
            cstCourse4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            cstCourse4.setForeground(new java.awt.Color(255, 255, 255));
            cstCourse4.setText("COURSE");

            cstCourse5.setEditable(false);
            cstCourse5.setBackground(new java.awt.Color(255, 51, 51));
            cstCourse5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            cstCourse5.setForeground(new java.awt.Color(255, 255, 255));
            cstCourse5.setText("COURSE");

            cstCourse6.setEditable(false);
            cstCourse6.setBackground(new java.awt.Color(255, 51, 51));
            cstCourse6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            cstCourse6.setForeground(new java.awt.Color(255, 255, 255));
            cstCourse6.setText("COURSE");

            cstCourse7.setEditable(false);
            cstCourse7.setBackground(new java.awt.Color(255, 51, 51));
            cstCourse7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            cstCourse7.setForeground(new java.awt.Color(255, 255, 255));
            cstCourse7.setText("COURSE");

            cstCourse8.setEditable(false);
            cstCourse8.setBackground(new java.awt.Color(255, 51, 51));
            cstCourse8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            cstCourse8.setForeground(new java.awt.Color(255, 255, 255));
            cstCourse8.setText("COURSE");

            jTextField19.setEditable(false);
            jTextField19.setBackground(new java.awt.Color(255, 51, 51));
            jTextField19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jTextField19.setForeground(new java.awt.Color(51, 51, 51));
            jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            jTextField19.setText("TOTAL");
            jTextField19.setBorder(null);

            javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
            jPanel22.setLayout(jPanel22Layout);
            jPanel22Layout.setHorizontalGroup(
                  jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                  .addComponent(cstCourse1)
                  .addComponent(cstCourse2)
                  .addComponent(cstCourse3)
                  .addComponent(cstCourse4)
                  .addComponent(cstCourse5)
                  .addComponent(cstCourse6)
                  .addComponent(cstCourse7)
                  .addComponent(cstCourse8)
                  .addGroup(jPanel22Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel22Layout.setVerticalGroup(
                  jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel22Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cstCourse1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cstCourse2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cstCourse3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cstCourse4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cstCourse5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cstCourse6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cstCourse7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cstCourse8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            jPanel26.setBackground(new java.awt.Color(255, 51, 51));

            jTextField15.setEditable(false);
            jTextField15.setBackground(new java.awt.Color(255, 51, 51));
            jTextField15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jTextField15.setForeground(new java.awt.Color(255, 255, 255));
            jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            jTextField15.setText("CREDIT");
            jTextField15.setBorder(null);

            cstCredit1.setEditable(false);
            cstCredit1.setBackground(new java.awt.Color(255, 51, 51));
            cstCredit1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            cstCredit1.setForeground(new java.awt.Color(255, 255, 255));
            cstCredit1.setText("CREDIT");

            cstCredit2.setEditable(false);
            cstCredit2.setBackground(new java.awt.Color(255, 51, 51));
            cstCredit2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            cstCredit2.setForeground(new java.awt.Color(255, 255, 255));
            cstCredit2.setText("CREDIT");

            cstCredit3.setEditable(false);
            cstCredit3.setBackground(new java.awt.Color(255, 51, 51));
            cstCredit3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            cstCredit3.setForeground(new java.awt.Color(255, 255, 255));
            cstCredit3.setText("CREDIT");

            cstCredit4.setEditable(false);
            cstCredit4.setBackground(new java.awt.Color(255, 51, 51));
            cstCredit4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            cstCredit4.setForeground(new java.awt.Color(255, 255, 255));
            cstCredit4.setText("CREDIT");

            cstCredit5.setEditable(false);
            cstCredit5.setBackground(new java.awt.Color(255, 51, 51));
            cstCredit5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            cstCredit5.setForeground(new java.awt.Color(255, 255, 255));
            cstCredit5.setText("CREDIT");

            cstCredit6.setEditable(false);
            cstCredit6.setBackground(new java.awt.Color(255, 51, 51));
            cstCredit6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            cstCredit6.setForeground(new java.awt.Color(255, 255, 255));
            cstCredit6.setText("CREDIT");

            cstCredit7.setEditable(false);
            cstCredit7.setBackground(new java.awt.Color(255, 51, 51));
            cstCredit7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            cstCredit7.setForeground(new java.awt.Color(255, 255, 255));
            cstCredit7.setText("CREDIT");

            cstCredit8.setEditable(false);
            cstCredit8.setBackground(new java.awt.Color(255, 51, 51));
            cstCredit8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            cstCredit8.setForeground(new java.awt.Color(255, 255, 255));
            cstCredit8.setText("CREDIT");

            csCredit.setEditable(false);
            csCredit.setBackground(new java.awt.Color(255, 51, 51));
            csCredit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            csCredit.setForeground(new java.awt.Color(51, 51, 51));
            csCredit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            csCredit.setText("CREDIT");
            csCredit.setBorder(null);

            javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
            jPanel26.setLayout(jPanel26Layout);
            jPanel26Layout.setHorizontalGroup(
                  jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jSeparator6)
                  .addComponent(cstCredit1)
                  .addComponent(cstCredit2)
                  .addComponent(cstCredit3)
                  .addComponent(cstCredit4)
                  .addComponent(cstCredit5)
                  .addComponent(cstCredit6)
                  .addComponent(cstCredit7)
                  .addComponent(cstCredit8)
                  .addGroup(jPanel26Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(csCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(13, Short.MAX_VALUE))
            );
            jPanel26Layout.setVerticalGroup(
                  jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel26Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cstCredit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cstCredit2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cstCredit3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cstCredit4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cstCredit5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cstCredit6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cstCredit7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cstCredit8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(csCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            jPanel27.setBackground(new java.awt.Color(255, 51, 51));

            jTextField17.setEditable(false);
            jTextField17.setBackground(new java.awt.Color(255, 51, 51));
            jTextField17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jTextField17.setForeground(new java.awt.Color(255, 255, 255));
            jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            jTextField17.setText("GPA");
            jTextField17.setBorder(null);

            cstGpa1.setEditable(false);
            cstGpa1.setBackground(new java.awt.Color(255, 51, 51));
            cstGpa1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            cstGpa1.setForeground(new java.awt.Color(255, 255, 255));
            cstGpa1.setText("GPA");

            cstGpa2.setEditable(false);
            cstGpa2.setBackground(new java.awt.Color(255, 51, 51));
            cstGpa2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            cstGpa2.setForeground(new java.awt.Color(255, 255, 255));
            cstGpa2.setText("GPA");

            cstGpa3.setEditable(false);
            cstGpa3.setBackground(new java.awt.Color(255, 51, 51));
            cstGpa3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            cstGpa3.setForeground(new java.awt.Color(255, 255, 255));
            cstGpa3.setText("GPA");

            cstGpa4.setEditable(false);
            cstGpa4.setBackground(new java.awt.Color(255, 51, 51));
            cstGpa4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            cstGpa4.setForeground(new java.awt.Color(255, 255, 255));
            cstGpa4.setText("GPA");

            cstGpa5.setEditable(false);
            cstGpa5.setBackground(new java.awt.Color(255, 51, 51));
            cstGpa5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            cstGpa5.setForeground(new java.awt.Color(255, 255, 255));
            cstGpa5.setText("GPA");

            cstGpa6.setEditable(false);
            cstGpa6.setBackground(new java.awt.Color(255, 51, 51));
            cstGpa6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            cstGpa6.setForeground(new java.awt.Color(255, 255, 255));
            cstGpa6.setText("GPA");

            cstGpa7.setEditable(false);
            cstGpa7.setBackground(new java.awt.Color(255, 51, 51));
            cstGpa7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            cstGpa7.setForeground(new java.awt.Color(255, 255, 255));
            cstGpa7.setText("GPA");

            cstGpa8.setEditable(false);
            cstGpa8.setBackground(new java.awt.Color(255, 51, 51));
            cstGpa8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            cstGpa8.setForeground(new java.awt.Color(255, 255, 255));
            cstGpa8.setText("GPA");

            csGpa.setEditable(false);
            csGpa.setBackground(new java.awt.Color(255, 51, 51));
            csGpa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            csGpa.setForeground(new java.awt.Color(51, 51, 51));
            csGpa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            csGpa.setText("GPA");
            csGpa.setBorder(null);

            javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
            jPanel27.setLayout(jPanel27Layout);
            jPanel27Layout.setHorizontalGroup(
                  jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
                  .addComponent(cstGpa1)
                  .addComponent(cstGpa2)
                  .addComponent(cstGpa3)
                  .addComponent(cstGpa4)
                  .addComponent(cstGpa5)
                  .addComponent(cstGpa6)
                  .addComponent(cstGpa7)
                  .addComponent(cstGpa8)
                  .addGroup(jPanel27Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(csGpa, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
            );
            jPanel27Layout.setVerticalGroup(
                  jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel27Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cstGpa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cstGpa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cstGpa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cstGpa4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cstGpa5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cstGpa6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cstGpa7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cstGpa8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(csGpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
            jPanel24.setLayout(jPanel24Layout);
            jPanel24Layout.setHorizontalGroup(
                  jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel24Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
            );
            jPanel24Layout.setVerticalGroup(
                  jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                              .addComponent(jPanel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jPanel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(21, Short.MAX_VALUE))
            );

            jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            jLabel11.setForeground(new java.awt.Color(255, 255, 255));
            jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            jLabel11.setText("Selected course :");
            jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

            jPanel28.setBackground(new java.awt.Color(255, 51, 51));
            jPanel28.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            jLabel10.setText("Note: In this section you can select your courses of current semester and plan for a result. You can also add the");

            jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            jLabel12.setText("planned result on main list clicking 'freeze' button to see how much effort it can make on your cgpa.");

            javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
            jPanel28.setLayout(jPanel28Layout);
            jPanel28Layout.setHorizontalGroup(
                  jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel28Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addGroup(jPanel28Layout.createSequentialGroup()
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
            );
            jPanel28Layout.setVerticalGroup(
                  jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addContainerGap())
            );

            selectedCourse.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            selectedCourse.setForeground(new java.awt.Color(255, 255, 255));
            selectedCourse.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            selectedCourse.setText("---------");
            selectedCourse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            selectedCourse.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        selectedCourseMouseEntered(evt);
                  }
            });
            selectedCourse.addInputMethodListener(new java.awt.event.InputMethodListener() {
                  public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                  }
                  public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                        selectedCourseInputMethodTextChanged(evt);
                  }
            });
            selectedCourse.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                  public void propertyChange(java.beans.PropertyChangeEvent evt) {
                        selectedCoursePropertyChange(evt);
                  }
            });
            selectedCourse.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyTyped(java.awt.event.KeyEvent evt) {
                        selectedCourseKeyTyped(evt);
                  }
            });

            jButton2.setBackground(new java.awt.Color(255, 51, 51));
            jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            jButton2.setForeground(new java.awt.Color(255, 255, 255));
            jButton2.setText("Set");
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton2ActionPerformed(evt);
                  }
            });

            csnum1.setEditable(false);
            csnum1.setBackground(new java.awt.Color(255, 204, 204));
            csnum1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            csnum1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            csnum1.setText("number");
            csnum1.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        csnum1MouseClicked(evt);
                  }
            });
            csnum1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                  public void propertyChange(java.beans.PropertyChangeEvent evt) {
                        csnum1PropertyChange(evt);
                  }
            });

            csnum2.setEditable(false);
            csnum2.setBackground(new java.awt.Color(255, 204, 204));
            csnum2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            csnum2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            csnum2.setText("number");
            csnum2.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        csnum2MouseClicked(evt);
                  }
            });

            csnum3.setEditable(false);
            csnum3.setBackground(new java.awt.Color(255, 204, 204));
            csnum3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            csnum3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            csnum3.setText("number");
            csnum3.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        csnum3MouseClicked(evt);
                  }
            });

            csAdd.setBackground(new java.awt.Color(255, 51, 51));
            csAdd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            csAdd.setForeground(new java.awt.Color(255, 255, 255));
            csAdd.setText("Add to table");
            csAdd.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        csAddActionPerformed(evt);
                  }
            });

            jLabel13.setText("Let the AI suggest you best possible");

            jLabel14.setText("numbers to obtain in upcoming");

            jLabel15.setText("events to obtain a certain grade.");

            csGoalNum.setBackground(new java.awt.Color(255, 204, 204));

            javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
            jPanel29.setLayout(jPanel29Layout);
            jPanel29Layout.setHorizontalGroup(
                  jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel29Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel29Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(0, 0, Short.MAX_VALUE))
                              .addGroup(jPanel29Layout.createSequentialGroup()
                                    .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(jLabel14)
                                          .addComponent(jLabel15))
                                    .addGap(18, 18, 18)
                                    .addComponent(csGoalNum)))
                        .addContainerGap())
            );
            jPanel29Layout.setVerticalGroup(
                  jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                              .addGroup(jPanel29Layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel15))
                              .addComponent(csGoalNum, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(16, Short.MAX_VALUE))
            );

            csAdd1.setBackground(new java.awt.Color(255, 51, 51));
            csAdd1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            csAdd1.setForeground(new java.awt.Color(255, 255, 255));
            csAdd1.setText("AI suggestor");
            csAdd1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        csAdd1ActionPerformed(evt);
                  }
            });

            jButton4.setBackground(new java.awt.Color(51, 51, 51));
            jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jButton4.setForeground(new java.awt.Color(255, 255, 255));
            jButton4.setText("Reset");
            jButton4.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton4ActionPerformed(evt);
                  }
            });

            jButton6.setBackground(new java.awt.Color(51, 51, 51));
            jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jButton6.setForeground(new java.awt.Color(255, 255, 255));
            jButton6.setText("Freeze");
            jButton6.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton6ActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
            jPanel18.setLayout(jPanel18Layout);
            jPanel18Layout.setHorizontalGroup(
                  jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel18Layout.createSequentialGroup()
                                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap())
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(jPanel18Layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(selectedCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGroup(jPanel18Layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 24, Short.MAX_VALUE)
                                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                      .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                                                      .addGroup(jPanel18Layout.createSequentialGroup()
                                                            .addComponent(csnum1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(csnum2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(csnum3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                      .addComponent(csAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                                                      .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                      .addComponent(csAdd1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                          .addGroup(jPanel18Layout.createSequentialGroup()
                                                .addComponent(jButton4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton6))
                                          .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(21, 21, 21))))
            );
            jPanel18Layout.setVerticalGroup(
                  jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel18Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                              .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel18Layout.createSequentialGroup()
                                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                          .addComponent(jLabel11)
                                          .addComponent(selectedCourse))
                                    .addGap(22, 22, 22)
                                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addGroup(jPanel18Layout.createSequentialGroup()
                                                .addComponent(jButton2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                      .addComponent(csnum1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(csnum3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(csnum2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(csAdd)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(23, 23, 23)
                                                .addComponent(csAdd1))))
                              .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jButton4)
                              .addComponent(jButton6))
                        .addContainerGap(36, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
            jPanel9.setLayout(jPanel9Layout);
            jPanel9Layout.setHorizontalGroup(
                  jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel9Layout.setVerticalGroup(
                  jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            Table.addTab("tab3", jPanel9);

            jPanel10.setBackground(new java.awt.Color(153, 255, 255));

            Notice.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            Notice.setForeground(new java.awt.Color(255, 0, 0));
            Notice.setText("Notice");
            Notice.setBorder(null);
            Notice.setBorderPainted(false);
            Notice.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            Notice.setMargin(new java.awt.Insets(8, 22, 8, 22));

            jPanel49.setBackground(new java.awt.Color(255, 51, 51));

            javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
            jPanel49.setLayout(jPanel49Layout);
            jPanel49Layout.setHorizontalGroup(
                  jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 268, Short.MAX_VALUE)
            );
            jPanel49Layout.setVerticalGroup(
                  jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 30, Short.MAX_VALUE)
            );

            jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);

            jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);

            jPanel50.setBackground(new java.awt.Color(255, 51, 51));

            javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
            jPanel50.setLayout(jPanel50Layout);
            jPanel50Layout.setHorizontalGroup(
                  jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 268, Short.MAX_VALUE)
            );
            jPanel50Layout.setVerticalGroup(
                  jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 30, Short.MAX_VALUE)
            );

            jPanel51.setBackground(new java.awt.Color(255, 51, 51));

            javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
            jPanel51.setLayout(jPanel51Layout);
            jPanel51Layout.setHorizontalGroup(
                  jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 268, Short.MAX_VALUE)
            );
            jPanel51Layout.setVerticalGroup(
                  jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 30, Short.MAX_VALUE)
            );

            jPanel52.setBackground(new java.awt.Color(255, 51, 51));

            javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
            jPanel52.setLayout(jPanel52Layout);
            jPanel52Layout.setHorizontalGroup(
                  jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 268, Short.MAX_VALUE)
            );
            jPanel52Layout.setVerticalGroup(
                  jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 30, Short.MAX_VALUE)
            );

            javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
            jPanel23.setLayout(jPanel23Layout);
            jPanel23Layout.setHorizontalGroup(
                  jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel23Layout.createSequentialGroup()
                        .addContainerGap(98, Short.MAX_VALUE)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                  .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel23Layout.createSequentialGroup()
                              .addContainerGap()
                              .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                              .addContainerGap()))
            );
            jPanel23Layout.setVerticalGroup(
                  jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jSeparator7, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                  .addComponent(jSeparator8)
                  .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel23Layout.createSequentialGroup()
                              .addContainerGap()
                              .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            );

            jButton3.setBackground(new java.awt.Color(255, 51, 51));
            jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            jButton3.setForeground(new java.awt.Color(255, 255, 255));
            jButton3.setText("Set");
            jButton3.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton3ActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
            jPanel10.setLayout(jPanel10Layout);
            jPanel10Layout.setHorizontalGroup(
                  jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(Notice, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159))
                  .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                              .addGap(437, 437, 437)
                              .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addContainerGap(437, Short.MAX_VALUE)))
            );
            jPanel10Layout.setVerticalGroup(
                  jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addGap(161, 161, 161)
                                    .addComponent(Notice, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addGap(74, 74, 74)
                                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(279, Short.MAX_VALUE))
                  .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                              .addGap(249, 249, 249)
                              .addComponent(jButton3)
                              .addContainerGap(250, Short.MAX_VALUE)))
            );

            Table.addTab("tab4", jPanel10);

            jPanel1.add(Table, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 1170, 560));

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1168, javax.swing.GroupLayout.PREFERRED_SIZE)
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 33, Short.MAX_VALUE))
            );

            setSize(new java.awt.Dimension(1168, 780));
            setLocationRelativeTo(null);
      }// </editor-fold>//GEN-END:initComponents

      private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
            System.exit(0);
      }//GEN-LAST:event_jLabel2MouseClicked

      private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
            new PlannerLogin().setVisible(true);
            setVisible(false);
      }//GEN-LAST:event_jLabel1MouseClicked

      private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
            
            Notice.setText("Are you sure you want to reset all data and set again?");
            JOptionPane.showMessageDialog(this, Notice);
            
            jButton8.setContentAreaFilled(false);
            jButton9.setContentAreaFilled(true);
            jButton10.setContentAreaFilled(true);
            Notice.setText("Enter your current semester number.");
            Table.setSelectedIndex(1);
            StuData.CurrentSem = Integer.parseInt(JOptionPane.showInputDialog(Notice));
            switch(StuData.CurrentSem){
                  case 1: ebsem2.setVisible(false);
                  case 2: ebsem3.setVisible(false);
                  case 3: ebsem4.setVisible(false);
                  case 4: ebsem5.setVisible(false);
                  case 5: ebsem6.setVisible(false);
                  case 6: ebsem7.setVisible(false);
                  case 7: ebsem8.setVisible(false);
                  case 8: ebsem9.setVisible(false);
                  case 9: ebsem10.setVisible(false);
                  case 10: ebsem11.setVisible(false);
                  case 11: ebsem12.setVisible(false);
                  Notice.setText("Please select the courses you have taken in Semester 01");
            JOptionPane.showMessageDialog(this, Notice, "Notice!", WIDTH);
            }
      }//GEN-LAST:event_jButton8ActionPerformed

      private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
             jButton8.setContentAreaFilled(true);
            jButton9.setContentAreaFilled(false);
            jButton10.setContentAreaFilled(true);
            Table.setSelectedIndex(0);
            refresh();
            
      }//GEN-LAST:event_jButton9ActionPerformed

      private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
            jButton8.setContentAreaFilled(true);
            jButton9.setContentAreaFilled(true);
            jButton10.setContentAreaFilled(false);
            Table.setSelectedIndex(2);
            cshead.setText("Semester "+StuData.CurrentSem);
            int i=0;
            for(int x=1; x<=8; x++){
                  if(StuData.semester[StuData.CurrentSem][x]==null)
                   {i=x; x+=8;}
                          }
            System.out.println();
            csCourse1.setText(StuData.semester[StuData.CurrentSem][1]);
            csCourse2.setText(StuData.semester[StuData.CurrentSem][2]);
            csCourse3.setText(StuData.semester[StuData.CurrentSem][3]);
            csCourse4.setText(StuData.semester[StuData.CurrentSem][4]);
            csCourse5.setText(StuData.semester[StuData.CurrentSem][5]);
            csCourse6.setText(StuData.semester[StuData.CurrentSem][6]);
            csCourse7.setText(StuData.semester[StuData.CurrentSem][7]);
            csCourse8.setText(StuData.semester[StuData.CurrentSem][8]);
            switch(i){
                  case 1: csCourse1.setVisible(false);
                  case 2: csCourse2.setVisible(false);
                  case 3: csCourse3.setVisible(false);
                  case 4: csCourse4.setVisible(false);
                  case 5: csCourse5.setVisible(false);
                  case 6: csCourse6.setVisible(false);
                  case 7: csCourse7.setVisible(false);
                  case 8: csCourse8.setVisible(false);
            }
            
      }//GEN-LAST:event_jButton10ActionPerformed

      private void jButton8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseEntered
            // TODO add your handling code here:
      }//GEN-LAST:event_jButton8MouseEntered

      private void ebsem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ebsem12ActionPerformed
            Edittitle.setText("Select courses for Semester 12");
      }//GEN-LAST:event_ebsem12ActionPerformed

      private void ebsem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ebsem11ActionPerformed
            Edittitle.setText("Select courses for Semester 11");
      }//GEN-LAST:event_ebsem11ActionPerformed

      private void ebsem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ebsem10ActionPerformed
            Edittitle.setText("Select courses for Semester 10");
      }//GEN-LAST:event_ebsem10ActionPerformed

      private void ebsem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ebsem9ActionPerformed
            Edittitle.setText("Select courses for Semester 09");
      }//GEN-LAST:event_ebsem9ActionPerformed

      private void ebsem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ebsem8ActionPerformed
            Edittitle.setText("Select courses for Semester 08");
      }//GEN-LAST:event_ebsem8ActionPerformed

      private void ebsem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ebsem7ActionPerformed
            Edittitle.setText("Select courses for Semester 07");
      }//GEN-LAST:event_ebsem7ActionPerformed

      private void ebsem7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ebsem7MouseExited
            // TODO add your handling code here:
      }//GEN-LAST:event_ebsem7MouseExited

      private void ebsem7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ebsem7MouseEntered
            // TODO add your handling code here:
      }//GEN-LAST:event_ebsem7MouseEntered

      private void ebsem7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ebsem7MouseClicked
            // TODO add your handling code here:
      }//GEN-LAST:event_ebsem7MouseClicked

      private void ebsem7MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ebsem7MouseDragged
            // TODO add your handling code here:
      }//GEN-LAST:event_ebsem7MouseDragged

      private void ebsem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ebsem6ActionPerformed
            Edittitle.setText("Select courses for Semester 06");
      }//GEN-LAST:event_ebsem6ActionPerformed

      private void ebsem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ebsem5ActionPerformed
            Edittitle.setText("Select courses for Semester 05");
      }//GEN-LAST:event_ebsem5ActionPerformed

      private void ebsem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ebsem4ActionPerformed
            Edittitle.setText("Select courses for Semester 04");
      }//GEN-LAST:event_ebsem4ActionPerformed

      private void ebsem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ebsem3ActionPerformed
            Edittitle.setText("Select courses for Semester 03");
      }//GEN-LAST:event_ebsem3ActionPerformed

      private void ebsem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ebsem2ActionPerformed
            Edittitle.setText("Select courses for Semester 02");

      }//GEN-LAST:event_ebsem2ActionPerformed

      private void ebsem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ebsem1ActionPerformed
            Edittitle.setText("Select courses for Semester 01");
      }//GEN-LAST:event_ebsem1ActionPerformed

      private void MAT101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAT101ActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_MAT101ActionPerformed

      private void CSE105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CSE105ActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_CSE105ActionPerformed

      private void CHE101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHE101ActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_CHE101ActionPerformed

      private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            StuData.ptr=0;
            if(CSE101.isSelected()){      StuData.setcourse(CSE101.getText());      CSE101.setSelected(false);     CSE101.setVisible(false);    }
            if(PHY101.isSelected()){      StuData.setcourse(PHY101.getText());      PHY101.setSelected(false);      PHY101.setVisible(false);    }
            if(MAT101.isSelected()){      StuData.setcourse(MAT101.getText());      MAT101.setSelected(false);      MAT101.setVisible(false);    }
            
            if(EAP101.isSelected()){      StuData.setcourse(EAP101.getText());      EAP101.setSelected(false);      EAP101.setVisible(false);    }
            if(PHY103.isSelected()){      StuData.setcourse(PHY103.getText());      PHY103.setSelected(false);      PHY103.setVisible(false);    }
            if(PHY104.isSelected()){      StuData.setcourse(PHY104.getText());      PHY104.setSelected(false);      PHY104.setVisible(false);    }
            if(MAT103.isSelected()){      StuData.setcourse(MAT103.getText());      MAT103.setSelected(false);      MAT103.setVisible(false);    }
            if(CSE103.isSelected()){      StuData.setcourse(CSE103.getText());      CSE103.setSelected(false);      CSE103.setVisible(false);    }
            if(CSE104.isSelected()){      StuData.setcourse(CSE104.getText());      CSE104.setSelected(false);     CSE104.setVisible(false);    }
            
            if(CSE105.isSelected()){      StuData.setcourse(CSE105.getText());      CSE105.setSelected(false);     CSE105.setVisible(false);    }
            if(CSE106.isSelected()){      StuData.setcourse(CSE106.getText());      CSE106.setSelected(false);     CSE106.setVisible(false);    }
            if(MAT105.isSelected()){      StuData.setcourse(MAT105.getText());      MAT105.setSelected(false);     MAT105.setVisible(false);    }
            if(EAP103.isSelected()){      StuData.setcourse(EAP103.getText());      EAP103.setSelected(false);     EAP103.setVisible(false);    }
            if(CHE101.isSelected()){      StuData.setcourse(CHE101.getText());      CHE101.setSelected(false);     CHE101.setVisible(false);    }
            if(CHE102.isSelected()){      StuData.setcourse(CHE102.getText());      CHE102.setSelected(false);     CHE102.setVisible(false);    }
            
            if(CSE201.isSelected()){      StuData.setcourse(CSE201.getText());      CSE201.setSelected(false);     CSE201.setVisible(false);    }
            if(CSE202.isSelected()){      StuData.setcourse(CSE202.getText());      CSE202.setSelected(false);     CSE202.setVisible(false);    }
            if(CSE203.isSelected()){      StuData.setcourse(CSE203.getText());      CSE203.setSelected(false);     CSE203.setVisible(false);    }
            if(CSE204.isSelected()){      StuData.setcourse(CSE204.getText());      CSE204.setSelected(false);     CSE204.setVisible(false);    }
            if(EEE201.isSelected()){      StuData.setcourse(EEE201.getText());      EEE201.setSelected(false);     EEE201.setVisible(false);    }
            if(EEE202.isSelected()){      StuData.setcourse(EEE202.getText());      EEE202.setSelected(false);     EEE202.setVisible(false);    }
            
            if(GED201.isSelected()){      StuData.setcourse(GED201.getText());      GED201.setSelected(false);     GED201.setVisible(false);    }
            if(CSE205.isSelected()){      StuData.setcourse(CSE205.getText());      CSE205.setSelected(false);     CSE205.setVisible(false);    }
            if(CSE206.isSelected()){      StuData.setcourse(CSE206.getText());     CSE206.setSelected(false);     CSE206.setVisible(false);    }
            if(CSE208.isSelected()){      StuData.setcourse(CSE208.getText());      CSE208.setSelected(false);     CSE208.setVisible(false);    }
            if(EEE203.isSelected()){      StuData.setcourse(EEE203.getText());      EEE203.setSelected(false);     EEE203.setVisible(false);    }
            if(EEE204.isSelected()){      StuData.setcourse(EEE204.getText());      EEE204.setSelected(false);     EEE204.setVisible(false);    }
           
            if(CSE209.isSelected()){      StuData.setcourse(CSE209.getText());      CSE209.setSelected(false);     CSE209.setVisible(false);    }
            if(CSE210.isSelected()){      StuData.setcourse(CSE210.getText());      CSE210.setSelected(false);     CSE210.setVisible(false);    }
            if(CSE211.isSelected()){      StuData.setcourse(CSE211.getText());      CSE211.setSelected(false);     CSE211.setVisible(false);    }
            if(EEE205.isSelected()){      StuData.setcourse(EEE205.getText());      EEE205.setSelected(false);     EEE205.setVisible(false);    }
            if(MAT201.isSelected()){      StuData.setcourse(MAT201.getText());      MAT201.setSelected(false);     MAT201.setVisible(false);    }
            
            if(CSE301.isSelected()){      StuData.setcourse(CSE301.getText());      CSE301.setSelected(false);     CSE301.setVisible(false);    }
            if(CSE302.isSelected()){      StuData.setcourse(CSE302.getText());      CSE302.setSelected(false);    CSE302.setVisible(false);    }
            if(CSE303.isSelected()){      StuData.setcourse(CSE303.getText());      CSE303.setSelected(false);     CSE303.setVisible(false);    }
            if(CSE304.isSelected()){      StuData.setcourse(CSE304.getText());      CSE304.setSelected(false);     CSE304.setVisible(false);    }
            if(CSE305.isSelected()){      StuData.setcourse(CSE305.getText());      CSE305.setSelected(false);     CSE305.setVisible(false);    }
            if(CSE306.isSelected()){      StuData.setcourse(CSE306.getText());      CSE306.setSelected(false);     CSE306.setVisible(false);    }
            if(CSE307.isSelected()){      StuData.setcourse(CSE307.getText());      CSE307.setSelected(false);     CSE307.setVisible(false);    }
            if(CSE308.isSelected()){      StuData.setcourse(CSE308.getText());      CSE308.setSelected(false);     CSE308.setVisible(false);    }
            
            if(CSE309.isSelected()){      StuData.setcourse(CSE309.getText());      CSE309.setSelected(false);     CSE309.setVisible(false);    }
            if(CSE310.isSelected()){      StuData.setcourse(CSE310.getText());      CSE310.setSelected(false);     CSE310.setVisible(false);    }
            if(CSE311.isSelected()){      StuData.setcourse(CSE311.getText());      CSE311.setSelected(false);     CSE311.setVisible(false);    }
            if(CSE312.isSelected()){      StuData.setcourse(CSE312.getText());      CSE312.setSelected(false);     CSE312.setVisible(false);    }
            if(GED301.isSelected()){      StuData.setcourse(GED301.getText());      GED301.setSelected(false);     GED301.setVisible(false);    }
            if(GED303.isSelected()){      StuData.setcourse(GED303.getText());      GED303.setSelected(false);     GED303.setVisible(false);    }
            
            if(CSE313.isSelected()){      StuData.setcourse(CSE313.getText());      CSE313.setSelected(false);     CSE313.setVisible(false);    }
            if(CSE314.isSelected()){      StuData.setcourse(CSE314.getText());      CSE314.setSelected(false);     CSE314.setVisible(false);    }
            if(CSE315.isSelected()){      StuData.setcourse(CSE315.getText());      CSE315.setSelected(false);     CSE315.setVisible(false);    }
            if(CSE317.isSelected()){      StuData.setcourse(CSE317.getText());      CSE317.setSelected(false);     CSE317.setVisible(false);    }
            if(CSE319.isSelected()){      StuData.setcourse(CSE319.getText());      CSE319.setSelected(false);     CSE319.setVisible(false);    }
            if(CSE321.isSelected()){      StuData.setcourse(CSE321.getText());      CSE321.setSelected(false);     CSE321.setVisible(false);    }
            if(GED305.isSelected()){      StuData.setcourse(GED305.getText());      GED305.setSelected(false);     GED305.setVisible(false);    }
            if(GED307.isSelected()){      StuData.setcourse(GED307.getText());      GED307.setSelected(false);     GED307.setVisible(false);    }
            
            if(CSE401.isSelected()){      StuData.setcourse(CSE401.getText());      CSE401.setSelected(false);     CSE401.setVisible(false);    }
            if(CSE402.isSelected()){      StuData.setcourse(CSE402.getText());      CSE402.setSelected(false);     CSE402.setVisible(false);    }
            if(CSE403.isSelected()){      StuData.setcourse(CSE403.getText());      CSE403.setSelected(false);     CSE403.setVisible(false);    }
            if(CSE404.isSelected()){      StuData.setcourse(CSE404.getText());      CSE404.setSelected(false);     CSE404.setVisible(false);    }
            if(CSE405.isSelected()){      StuData.setcourse(CSE405.getText());      CSE405.setSelected(false);     CSE405.setVisible(false);    }
            if(CSE406.isSelected()){      StuData.setcourse(CSE406.getText());      CSE406.setSelected(false);    CSE406.setVisible(false);    }
            if(CSE407.isSelected()){      StuData.setcourse(CSE407.getText());      CSE407.setSelected(false);     CSE407.setVisible(false);    }
            if(CSE408.isSelected()){      StuData.setcourse(CSE408.getText());      CSE408.setSelected(false);     CSE408.setVisible(false);    }
            if(CSE409.isSelected()){      StuData.setcourse(CSE409.getText());      CSE409.setSelected(false);     CSE409.setVisible(false);    }
            if(CSE410.isSelected()){      StuData.setcourse(CSE410.getText());      CSE410.setSelected(false);     CSE410.setVisible(false);    }
            if(GED401.isSelected()){      StuData.setcourse(GED401.getText());      GED401.setSelected(false);     GED401.setVisible(false);    }
            if(GED403.isSelected()){      StuData.setcourse(GED403.getText());      GED403.setSelected(false);     GED403.setVisible(false);    }
            if(GED405.isSelected()){      StuData.setcourse(GED405.getText());      GED405.setSelected(false);     GED405.setVisible(false);    }
            
            if(CSE411.isSelected()){      StuData.setcourse(CSE411.getText());     CSE411.setSelected(false);     CSE411.setVisible(false);    }
            if(GED407.isSelected()){      StuData.setcourse(GED407.getText());    GED407.setSelected(false);     GED407.setVisible(false);    }
            if(CSE413.isSelected()){      StuData.setcourse(CSE413.getText());      CSE413.setSelected(false);     CSE413.setVisible(false);    }
            if(CSE400.isSelected()){      StuData.setcourse(CSE400.getText());      CSE400.setSelected(false);     CSE400.setVisible(false);    }
            
            if(CSE437.isSelected()){      StuData.setcourse(CSE437.getText());      CSE437.setSelected(false);     CSE437.setVisible(false);    }
            if(CSE438.isSelected()){      StuData.setcourse(CSE438.getText());      CSE438.setSelected(false);    CSE438.setVisible(false);    }
            if(CSE800.isSelected()){      StuData.setcourse(CSE800.getText());      CSE800.setSelected(false);     CSE800.setVisible(false);    }
            
            
            StuData.SemCount++;
            if(StuData.SemCount-1==StuData.CurrentSem)
            {
                  Notice.setText("It's almost done! Now please enter results of selected courses.");
                  JOptionPane.showMessageDialog(this, Notice, "Notice!", WIDTH);
                  
                  for(int i=1; i<13; i++){
                        if(i==StuData.CurrentSem)
                              continue;
                        if (StuData.semester[i][1]==null) continue;
                        for(int j=1; j<13; j++){
                              if(StuData.semester[i][j]==null)
                                    break;
                              Notice.setText("Enter result of course: "+StuData.semester[i][j]);
                              StuData.semresult[i][j] = Double.parseDouble(JOptionPane.showInputDialog(Notice));
                        }
                  }
                  for(int j=1; j<13; j++){
                              if(StuData.semester[StuData.CurrentSem][j]==null)
                                    break;
                              StuData.semresult[StuData.CurrentSem][j] = 0.01;
                        }
                  for(int i=1; i<13; i++){
                        if (StuData.semresult[i][1]==0) continue;
                        for(int j=1; j<13; j++){
                              if(StuData.semresult[i][j]==0)
                                    break;
                        }
                  }
                  Notice.setText("Congratulations! You are ready to go. Have fun!");
                  JOptionPane.showMessageDialog(this, Notice, "It's done!", WIDTH);
                  Table.setSelectedIndex(0);
                  refresh();
                  setcgpa();
                  setrplist();
                  new Details().zipData();
            }
            else{
            Notice.setText("Please select the courses you have taken in Semester "+StuData.SemCount);
            JOptionPane.showMessageDialog(this, Notice, "Notice!", WIDTH);
            Edittitle.setText("Select courses for Semester "+StuData.SemCount);}
            
      }//GEN-LAST:event_jButton1ActionPerformed

      private void EEE201ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EEE201ActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_EEE201ActionPerformed

      private void modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyActionPerformed
            String c;
            double g=0, credit=0;
            c=retakeselected.getText();
            if((gpaList.getSelectedItem().toString()).equals("Select"))
                    {}
            else{
                  g = Double.parseDouble((gpaList.getSelectedItem().toString()).substring(0, 4));
            }
            for(int i=0; i<=12; i++)
                  for(int j=0; j<=8; j++){
                        String s = StuData.semester[i][j];
                        if(s==c){
                              StuData.semresult[i][j]=g;
                              credit = StuData.semcredit[i][j];
                              i=13; j=9;
                        }
                  }
            retakenmsg1.setText("Course name: "+retakeselected.getText());
            retakenmsg2.setText("Predicted gpa: "+g);
            retakenmsg3.setText("Credit: "+credit);
            retakenmsg4.setText("Cost: "+credit*2650+"Taka");
            
            if(StuData.retakelist(c)==1){
                  retakenlist.setText(retakenlist.getText()+" "+c);
                  StuData.retakecost+=credit*2650;
                  retakecost.setText("Retake cost: "+StuData.retakecost);
            }
            else {}
            refresh();
            setcgpa("predicted");
            
      }//GEN-LAST:event_modifyActionPerformed

      private void CSE209ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CSE209ActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_CSE209ActionPerformed

      private void CSE210ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CSE210ActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_CSE210ActionPerformed

      private void CSE211ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CSE211ActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_CSE211ActionPerformed

      private void EEE205ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EEE205ActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_EEE205ActionPerformed

      private void MAT201ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAT201ActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_MAT201ActionPerformed

      private void GED303ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GED303ActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_GED303ActionPerformed

      private void GED301ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GED301ActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_GED301ActionPerformed

      private void GED305ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GED305ActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_GED305ActionPerformed

      private void GED307ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GED307ActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_GED307ActionPerformed

      private void retakeListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retakeListMouseClicked
            retakemsg.setText("Selected course:");
            retakemsg2.setText("Now set the result you hope.");
            retakeselected.setText((retakeList.getSelectedValue()).toString());
      }//GEN-LAST:event_retakeListMouseClicked

      private void csCourse1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_csCourse1MouseClicked
            selectedCourse.setText(csCourse1.getText());
      }//GEN-LAST:event_csCourse1MouseClicked

      private void csCourse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csCourse1ActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_csCourse1ActionPerformed

      private void csCourse2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_csCourse2MouseClicked
            selectedCourse.setText(csCourse2.getText());
      }//GEN-LAST:event_csCourse2MouseClicked

      private void csCourse2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csCourse2ActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_csCourse2ActionPerformed

      private void csCourse3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_csCourse3MouseClicked
            selectedCourse.setText(csCourse3.getText());
      }//GEN-LAST:event_csCourse3MouseClicked

      private void csCourse3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csCourse3ActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_csCourse3ActionPerformed

      private void csCourse4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_csCourse4MouseClicked
            selectedCourse.setText(csCourse4.getText());
      }//GEN-LAST:event_csCourse4MouseClicked

      private void csCourse4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csCourse4ActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_csCourse4ActionPerformed

      private void csCourse5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_csCourse5MouseClicked
            selectedCourse.setText(csCourse5.getText());
      }//GEN-LAST:event_csCourse5MouseClicked

      private void csCourse5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csCourse5ActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_csCourse5ActionPerformed

      private void csCourse6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_csCourse6MouseClicked
            selectedCourse.setText(csCourse6.getText());
      }//GEN-LAST:event_csCourse6MouseClicked

      private void csCourse6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csCourse6ActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_csCourse6ActionPerformed

      private void csCourse7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_csCourse7MouseClicked
            selectedCourse.setText(csCourse7.getText());
      }//GEN-LAST:event_csCourse7MouseClicked

      private void csCourse7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csCourse7ActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_csCourse7ActionPerformed

      private void csCourse8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_csCourse8MouseClicked
            selectedCourse.setText(csCourse8.getText());
      }//GEN-LAST:event_csCourse8MouseClicked

      private void csCourse8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csCourse8ActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_csCourse8ActionPerformed

      private void csnumct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csnumct1ActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_csnumct1ActionPerformed

      private void csnumct1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_csnumct1MouseClicked
            // TODO add your handling code here:
      }//GEN-LAST:event_csnumct1MouseClicked

      private void csnumct2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_csnumct2MouseClicked
            // TODO add your handling code here:
      }//GEN-LAST:event_csnumct2MouseClicked

      private void csnumct2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csnumct2ActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_csnumct2ActionPerformed

      private void csnumct3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_csnumct3MouseClicked
            // TODO add your handling code here:
      }//GEN-LAST:event_csnumct3MouseClicked

      private void csnumct3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csnumct3ActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_csnumct3ActionPerformed

      private void csasignMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_csasignMouseClicked
            // TODO add your handling code here:
      }//GEN-LAST:event_csasignMouseClicked

      private void csasignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csasignActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_csasignActionPerformed

      private void cspresenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cspresenMouseClicked
            // TODO add your handling code here:
      }//GEN-LAST:event_cspresenMouseClicked

      private void cspresenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cspresenActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_cspresenActionPerformed

      private void csattenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_csattenMouseClicked
            // TODO add your handling code here:
      }//GEN-LAST:event_csattenMouseClicked

      private void csattenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csattenActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_csattenActionPerformed

      private void csmidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_csmidMouseClicked
            // TODO add your handling code here:
      }//GEN-LAST:event_csmidMouseClicked

      private void csmidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csmidActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_csmidActionPerformed

      private void csfinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_csfinalMouseClicked
            // TODO add your handling code here:
      }//GEN-LAST:event_csfinalMouseClicked

      private void csfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csfinalActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_csfinalActionPerformed

      private void selectedCourseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectedCourseMouseEntered
            
      }//GEN-LAST:event_selectedCourseMouseEntered

      private void selectedCourseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_selectedCourseKeyTyped
            
      }//GEN-LAST:event_selectedCourseKeyTyped

      private void selectedCourseInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_selectedCourseInputMethodTextChanged
      }//GEN-LAST:event_selectedCourseInputMethodTextChanged

      private void selectedCoursePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_selectedCoursePropertyChange
                  isitlab=0;
                  
//following codes are for, when a lab course in cs is selected number properties will change. And when a theory is selected all must be changed as it was before. so here, these codes
                  csattennum.setVisible(true);
                  csmidnum.setVisible(true);
                  csfinalnum.setVisible(true);
                  csatten.setVisible(true);
                  csmid.setVisible(true);
                  csfinal.setVisible(true);
                  csnumct1.setText("CT 1");
                  csnumct2.setText("CT 2");
                  csnumct3.setText("CT 3");
                  csasign.setText("Assignment");
                  cspresen.setText("Presentation");
                  
                        csnum1.setText(null);
                        csnum2.setText(null);
                        csnum3.setText(null);
            for(int i=1; i<=8; i++){
                  if((StuData.semester[1][1])==null)
                        break;
                  if((StuData.semester[StuData.CurrentSem][i]).equals(selectedCourse.getText()))
                  {
                        
                        StuData.cscredit=StuData.semcredit[StuData.CurrentSem][i];
                        if(StuData.semcredit[StuData.CurrentSem][i]<3)
                              isitlab=1;
                        else if(StuData.semcredit[StuData.CurrentSem][i]>=3)
                              isitlab=0;
                        break;
                  }
            }
            if(isitlab==1){
                  csattennum.setVisible(false);
                  csmidnum.setVisible(false);
                  csfinalnum.setVisible(false);
                  csatten.setVisible(false);
                  csmid.setVisible(false);
                  csfinal.setVisible(false);
                  
                  csnumct1.setText("Atten. 10%");
                  csnumct2.setText("L. report 20%");
                  csnumct3.setText("Viva 15%");
                  csasign.setText("Project 25%");
                  cspresen.setText("Fianl 30%");
            }
      }//GEN-LAST:event_selectedCoursePropertyChange

      private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            int ct1=Integer.parseInt(csct1num.getText());
            int ct2=Integer.parseInt(csct2num.getText());
            int ct3=Integer.parseInt(csct3num.getText());
            int assign=Integer.parseInt(csassignnum.getText());
            int presen=Integer.parseInt(cspresennum.getText());
            int atten=Integer.parseInt(csattennum.getText());
            int mid=Integer.parseInt(csmidnum.getText());
            int fin=Integer.parseInt(csfinalnum.getText());
            
            if(isitlab==0){
            if(ct1<0||ct1>15||ct2<0||ct2>15||ct3<0||ct3>15||assign<0||assign>5||presen<0||presen>5||atten<0||atten>5||mid<0||mid>30||fin<0||fin>40)
            {     Notice.setText("Please enter a valid number!");
                  JOptionPane.showMessageDialog(this, Notice);
            }
            else{
                  double ct=0;
            
            int c[]={ct1, ct2, ct3};
            Arrays.sort(c);
            ct=c[2]+c[1];
            ct/=2;
                  Double num = ct+assign+presen+atten+mid+fin;
                  csnum1.setText(num.toString());
                  Details gpa = new Details();
                  String x = gpa.point(num);
                  csnum2.setText(x);
                  x=gpa.point(num, "grade");
                  csnum3.setText(x);
            }
            }
            
            
            else{
                  if(ct1<0||ct1>10||ct2<0||ct2>20||ct3<0||ct3>15||assign<0||assign>25||presen<0||presen>30)
            {     Notice.setText("Please enter a valid number!");
                  JOptionPane.showMessageDialog(this, Notice);
            }
            else{
                  Double num = (double)ct1+ct2+ct3+assign+presen;
                  csnum1.setText(num.toString());
                  Details gpa = new Details();
                  String x = gpa.point(num);
                  csnum2.setText(x);
                  x=gpa.point(num, "grade");
                  csnum3.setText(x);
            }
            }
      }//GEN-LAST:event_jButton2ActionPerformed

      private void csnum1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_csnum1PropertyChange
            
      }//GEN-LAST:event_csnum1PropertyChange

      private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_jButton3ActionPerformed

      private void csAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csAddActionPerformed
          
            if(selectedCourse.getText().equals(cstCourse1.getText()) || selectedCourse.getText().equals(cstCourse2.getText()) || selectedCourse.getText().equals(cstCourse3.getText()) || selectedCourse.getText().equals(cstCourse4.getText()) || selectedCourse.getText().equals(cstCourse5.getText()) || selectedCourse.getText().equals(cstCourse6.getText()) || selectedCourse.getText().equals(cstCourse7.getText()) || selectedCourse.getText().equals(cstCourse8.getText()))
            {
                  Notice.setText("You can not add a course that you alrady added!");
                  JOptionPane.showMessageDialog(this, Notice);
            }
            else if(csnum3.getText()==null)
            {
                  Notice.setText("Please set numbers clicking on 'Set'");
                  JOptionPane.showMessageDialog(this, Notice);
            }
            else{
            StuData.csptr++;
            
            StuData.cscredittotal+=StuData.cscredit; //ok
            StuData.csgpatotal+=Double.parseDouble(csnum3.getText())*StuData.cscredit;
            csCredit.setText(String.format("%.01f", StuData.cscredittotal)); //ok
            csGpa.setText(String.format("%.03f", StuData.csgpatotal/StuData.cscredittotal)); //ok
            String x = String.format("%.01f", StuData.cscredit); //ok
            
            
            switch(StuData.csptr){
                  case 1: cstCourse1.setText(selectedCourse.getText());       cstGpa1.setText(csnum3.getText());       cstCredit1.setText(x);         break;
                  case 2: cstCourse2.setText(selectedCourse.getText());       cstGpa2.setText(csnum3.getText());       cstCredit2.setText(x);        break;
                  case 3: cstCourse3.setText(selectedCourse.getText());       cstGpa3.setText(csnum3.getText());       cstCredit3.setText(x);        break;
                  case 4: cstCourse4.setText(selectedCourse.getText());       cstGpa4.setText(csnum3.getText());       cstCredit4.setText(x);        break;
                  case 5: cstCourse5.setText(selectedCourse.getText());       cstGpa5.setText(csnum3.getText());       cstCredit5.setText(x);        break;
                  case 6: cstCourse6.setText(selectedCourse.getText());       cstGpa6.setText(csnum3.getText());       cstCredit6.setText(x);        break;
                  case 7: cstCourse7.setText(selectedCourse.getText());       cstGpa7.setText(csnum3.getText());       cstCredit7.setText(x);        break;
                  case 8: cstCourse8.setText(selectedCourse.getText());       cstGpa8.setText(csnum3.getText());       cstCredit8.setText(x);        break;
            }
            StuData.cscoursecounter++;
         }
      }//GEN-LAST:event_csAddActionPerformed

      private void csnum1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_csnum1MouseClicked
            Notice.setText("Please enter numbers individually in left table.");
            JOptionPane.showMessageDialog(this,Notice);
      }//GEN-LAST:event_csnum1MouseClicked

      private void csnum2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_csnum2MouseClicked
Notice.setText("Please enter numbers individually in left table.");
            JOptionPane.showMessageDialog(this,Notice);            // TODO add your handling code here:
      }//GEN-LAST:event_csnum2MouseClicked

      private void csnum3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_csnum3MouseClicked
Notice.setText("Please enter numbers individually in left table.");
            JOptionPane.showMessageDialog(this,Notice);            // TODO add your handling code here:
      }//GEN-LAST:event_csnum3MouseClicked

      private void csAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csAdd1ActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_csAdd1ActionPerformed

      private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
            X=evt.getX();
            Y=evt.getY();
      }//GEN-LAST:event_jPanel2MouseClicked

      private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
            int xx=evt.getXOnScreen();
            int yy=evt.getYOnScreen();
            this.setLocation(xx-X, yy-Y);
      }//GEN-LAST:event_jPanel2MouseDragged

      private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            //Resetting all temp helpers
            StuData.cscredit=StuData.cscredittotal=StuData.csgpatotal=StuData.csptr=StuData.cscoursecounter=0;
            //Resetting the table
            cstCourse1.setText("COURSE"); cstGpa1.setText("GPA"); cstCredit1.setText("CREDIT");
            cstCourse2.setText("COURSE"); cstGpa2.setText("GPA"); cstCredit2.setText("CREDIT");
            cstCourse3.setText("COURSE"); cstGpa3.setText("GPA"); cstCredit3.setText("CREDIT");
            cstCourse4.setText("COURSE"); cstGpa4.setText("GPA"); cstCredit4.setText("CREDIT");
            cstCourse5.setText("COURSE"); cstGpa5.setText("GPA"); cstCredit5.setText("CREDIT");
            cstCourse6.setText("COURSE"); cstGpa6.setText("GPA"); cstCredit6.setText("CREDIT");
            cstCourse7.setText("COURSE"); cstGpa7.setText("GPA"); cstCredit7.setText("CREDIT");
            cstCourse8.setText("COURSE"); cstGpa8.setText("GPA"); cstCredit8.setText("CREDIT");
            csGpa.setText("GPA");
            csCredit.setText(null);
            csCredit.setText("CREDIT");
      }//GEN-LAST:event_jButton4ActionPerformed

      private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
            //User can try to freeze data not entering all course result which will genarate error in rp. So a course counter is needed
            int i=0;
            for(i=1; i<=8; i++)
                  if(StuData.semester[StuData.CurrentSem][i]==null)
                        break; i--;
            if(i>StuData.cscoursecounter)
            {
                  Notice.setText("You must add all course result on table before freezing.");
                  JOptionPane.showMessageDialog(this, Notice);
            }
            else{
                  for(i=1; i<=8; i++){    if(StuData.semester[StuData.CurrentSem][i]==null)     break;
                        if(cstCourse1.getText().equals(StuData.semester[StuData.CurrentSem][i])){
                              StuData.semcredit[StuData.CurrentSem][i]=Double.parseDouble(cstCredit1.getText());
                              StuData.semresult[StuData.CurrentSem][i]=Double.parseDouble(cstGpa1.getText());
                              break;      }     }
                  
                  for(i=1; i<=8; i++){    if(StuData.semester[StuData.CurrentSem][i]==null)     break;
                        if(cstCourse2.getText().equals(StuData.semester[StuData.CurrentSem][i])){
                              StuData.semcredit[StuData.CurrentSem][i]=Double.parseDouble(cstCredit2.getText());
                              StuData.semresult[StuData.CurrentSem][i]=Double.parseDouble(cstGpa2.getText());
                              break;      }     }
                  
                  for(i=1; i<=8; i++){    if(StuData.semester[StuData.CurrentSem][i]==null)     break;
                        if(cstCourse3.getText().equals(StuData.semester[StuData.CurrentSem][i])){
                              StuData.semcredit[StuData.CurrentSem][i]=Double.parseDouble(cstCredit3.getText());
                              StuData.semresult[StuData.CurrentSem][i]=Double.parseDouble(cstGpa3.getText());
                              break;      }     }
                  
                  for(i=1; i<=8; i++){    if(StuData.semester[StuData.CurrentSem][i]==null)     break;
                        if(cstCourse4.getText().equals(StuData.semester[StuData.CurrentSem][i])){
                              StuData.semcredit[StuData.CurrentSem][i]=Double.parseDouble(cstCredit4.getText());
                              StuData.semresult[StuData.CurrentSem][i]=Double.parseDouble(cstGpa4.getText());
                              break;      }     }
                  
                  for(i=1; i<=8; i++){    if(StuData.semester[StuData.CurrentSem][i]==null)     break;
                        if(cstCourse5.getText().equals(StuData.semester[StuData.CurrentSem][i])){
                              StuData.semcredit[StuData.CurrentSem][i]=Double.parseDouble(cstCredit5.getText());
                              StuData.semresult[StuData.CurrentSem][i]=Double.parseDouble(cstGpa5.getText());
                              break;      }     }
                  
                  for(i=1; i<=8; i++){    if(StuData.semester[StuData.CurrentSem][i]==null)     break;
                        if(cstCourse6.getText().equals(StuData.semester[StuData.CurrentSem][i])){
                              StuData.semcredit[StuData.CurrentSem][i]=Double.parseDouble(cstCredit6.getText());
                              StuData.semresult[StuData.CurrentSem][i]=Double.parseDouble(cstGpa6.getText());
                              break;      }     }
                  
                  for(i=1; i<=8; i++){    if(StuData.semester[StuData.CurrentSem][i]==null)     break;
                        if(cstCourse7.getText().equals(StuData.semester[StuData.CurrentSem][i])){
                              StuData.semcredit[StuData.CurrentSem][i]=Double.parseDouble(cstCredit7.getText());
                              StuData.semresult[StuData.CurrentSem][i]=Double.parseDouble(cstGpa7.getText());
                              break;      }     }
                  
                  for(i=1; i<=8; i++){    if(StuData.semester[StuData.CurrentSem][i]==null)     break;
                        if(cstCourse8.getText().equals(StuData.semester[StuData.CurrentSem][i])){
                              StuData.semcredit[StuData.CurrentSem][i]=Double.parseDouble(cstCredit8.getText());
                              StuData.semresult[StuData.CurrentSem][i]=Double.parseDouble(cstGpa8.getText());
                              break;      }     }
                  
                  
                  
                Notice.setText("Predicted results ara added to original database.");
                JOptionPane.showMessageDialog(this, Notice);
                StuData.CurrentSem++;
                refresh();
                setcgpa();
                setrplist();
                StuData.CurrentSem--;
                Table.setSelectedIndex(0);
            }
      }//GEN-LAST:event_jButton6ActionPerformed

      private void freezerpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_freezerpActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_freezerpActionPerformed

      private void headnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_headnameActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_headnameActionPerformed

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
                  java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                  java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                  java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                  java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
                        Home obj = new Home();
                        obj.setVisible(true);
                        obj.refresh();
                        obj.setcgpa();
                        obj.headpc.setVisible(false);
                        obj.footpc.setVisible(false);
                        obj.setrplist();
                  }
            });
      }
      void setrpcourse(){
            String s;
            for(int i=1; i<=12; i++){
                  for(int j=1; j<=8; j++){
                        if(StuData.semester[i][j]!=null){   
                              s = StuData.semester[i][j]+"  "+String.format("%.02f",StuData.semresult[i][j]); 
                              StuData.semcredit[i][j] = StuData.coursecredit(StuData.semester[i][j]);
                        }
                        else s = "-- -- -- -- -- --";
                        
                        switch(i*10+j){
                              case 11: rps1c1.setText(s); break;
                              case 12: rps1c2.setText(s); break;
                              case 13: rps1c3.setText(s); break;
                              case 14: rps1c4.setText(s); break;
                              case 15: rps1c5.setText(s); break;
                              case 16: rps1c6.setText(s); break;
                              case 17: rps1c7.setText(s); break;
                              case 18: rps1c8.setText(s); break;
                              case 21: rps2c1.setText(s); break;
                              case 22: rps2c2.setText(s); break;
                              case 23: rps2c3.setText(s); break;
                              case 24: rps2c4.setText(s); break;
                              case 25: rps2c5.setText(s); break;
                              case 26: rps2c6.setText(s); break;
                              case 27: rps2c7.setText(s); break;
                              case 28: rps2c8.setText(s); break;
                              case 31: rps3c1.setText(s); break;
                              case 32: rps3c2.setText(s); break;
                              case 33: rps3c3.setText(s); break;
                              case 34: rps3c4.setText(s); break;
                              case 35: rps3c5.setText(s); break;
                              case 36: rps3c6.setText(s); break;
                              case 37: rps3c7.setText(s); break;
                              case 38: rps3c8.setText(s); break;
                               case 41: rps4c1.setText(s); break;
                              case 42: rps4c2.setText(s); break;
                              case 43: rps4c3.setText(s); break;
                              case 44: rps4c4.setText(s); break;
                              case 45: rps4c5.setText(s); break;
                              case 46: rps4c6.setText(s); break;
                              case 47: rps4c7.setText(s); break;
                              case 48: rps4c8.setText(s); break;
                               case 51: rps5c1.setText(s); break;
                              case 52: rps5c2.setText(s); break;
                              case 53: rps5c3.setText(s); break;
                              case 54: rps5c4.setText(s); break;
                              case 55: rps5c5.setText(s); break;
                              case 56: rps5c6.setText(s); break;
                              case 57: rps5c7.setText(s); break;
                              case 58: rps5c8.setText(s); break;
                               case 61: rps6c1.setText(s); break;
                              case 62: rps6c2.setText(s); break;
                              case 63: rps6c3.setText(s); break;
                              case 64: rps6c4.setText(s); break;
                              case 65: rps6c5.setText(s); break;
                              case 66: rps6c6.setText(s); break;
                              case 67: rps6c7.setText(s); break;
                              case 68: rps6c8.setText(s); break;
                               case 71: rps7c1.setText(s); break;
                              case 72: rps7c2.setText(s); break;
                              case 73: rps7c3.setText(s); break;
                              case 74: rps7c4.setText(s); break;
                              case 75: rps7c5.setText(s); break;
                              case 76: rps7c6.setText(s); break;
                              case 77: rps7c7.setText(s); break;
                              case 78: rps7c8.setText(s); break;
                               case 81: rps8c1.setText(s); break;
                              case 82: rps8c2.setText(s); break;
                              case 83: rps8c3.setText(s); break;
                              case 84: rps8c4.setText(s); break;
                              case 85: rps8c5.setText(s); break;
                              case 86: rps8c6.setText(s); break;
                              case 87: rps8c7.setText(s); break;
                              case 88: rps8c8.setText(s); break;
                               case 91: rps9c1.setText(s); break;
                              case 92: rps9c2.setText(s); break;
                              case 93: rps9c3.setText(s); break;
                              case 94: rps9c4.setText(s); break;
                              case 95: rps9c5.setText(s); break;
                              case 96: rps9c6.setText(s); break;
                              case 97: rps9c7.setText(s); break;
                              case 98: rps9c8.setText(s); break;
                               case 101: rps10c1.setText(s); break;
                              case 102: rps10c2.setText(s); break;
                              case 103: rps10c3.setText(s); break;
                              case 104: rps10c4.setText(s); break;
                              case 105: rps10c5.setText(s); break;
                              case 106: rps10c6.setText(s); break;
                              case 107: rps10c7.setText(s); break;
                              case 108: rps10c8.setText(s); break;
                              case 111: rps11c1.setText(s); break;
                              case 112: rps11c2.setText(s); break;
                              case 113: rps11c3.setText(s); break;
                              case 114: rps11c4.setText(s); break;
                              case 115: rps11c5.setText(s); break;
                              case 116: rps11c6.setText(s); break;
                              case 117: rps11c7.setText(s); break;
                              case 118: rps11c8.setText(s); break;
                              case 121: rps12c1.setText(s); break;
                              case 122: rps12c2.setText(s); break;
                              case 123: rps12c3.setText(s); break;
                              case 124: rps12c4.setText(s); break;
                              case 125: rps12c5.setText(s); break;
                              case 126: rps12c6.setText(s); break;
                              case 127: rps12c7.setText(s); break;
                              case 128: rps12c8.setText(s); break;
                              
                        }
                  }
            }
 //           if(StuData.semester[1][1]!=null)    rps1c1.setText(StuData.semester[1][1]+"  "+String.format("%.02f",StuData.semresult[1][1]));     else rps1c1.setText("-- -- -- -- -- --");

      }
void setrpcredit(){
      double c=0;
         for(int i=0; i<=12; i++){
               c=0;
                for(int j=0; j<=8; j++){
                      c+= StuData.semcredit[i][j];
                }
                switch(i){
                     case 1: rpc1.setText("Credit: "+String.format("%.01f",c)); break;
                     case 2: rpc2.setText("Credit: "+String.format("%.01f",c)); break;
                     case 3: rpc3.setText("Credit: "+String.format("%.01f",c)); break;
                     case 4: rpc4.setText("Credit: "+String.format("%.01f",c)); break;
                     case 5: rpc5.setText("Credit: "+String.format("%.01f",c)); break;
                     case 6: rpc6.setText("Credit: "+String.format("%.01f",c)); break;
                     case 7: rpc7.setText("Credit: "+String.format("%.01f",c)); break;
                     case 8: rpc8.setText("Credit: "+String.format("%.01f",c)); break;
                     case 9: rpc9.setText("Credit: "+String.format("%.01f",c)); break;
                     case 10: rpc10.setText("Credit: "+String.format("%.01f",c)); break;
                     case 11: rpc11.setText("Credit: "+String.format("%.01f",c)); break;
                     case 12: rpc12.setText("Credit: "+String.format("%.01f",c)); break;
                }
                
          }
}
void setcgpa(){
      double subresult=0, subcredit=0, gpa=0, totalcredit=0, c=0;
         for(int i=0; i<=12; i++){
               if(i==StuData.CurrentSem)
                     break;
                for(int j=0; j<=8; j++){
                      subresult = StuData.semresult[i][j];
                      subcredit = StuData.semcredit[i][j];
                      totalcredit+=subcredit;
                      gpa+=subcredit*subresult;
                }
          }
         c=gpa/totalcredit;
         headcc.setText("Current CGPA: "+String.format("%.03f",c));
         StuData.cgpa=c;
         footpc.setText("Current CGPA: "+String.format("%.03f",c));
}
void setcgpa(String x){
      double subresult=0, subcredit=0, gpa=0, totalcredit=0, c=0;
         for(int i=0; i<=12; i++){
               if(i==StuData.CurrentSem)
                     break;
                for(int j=0; j<=8; j++){
                      subresult = StuData.semresult[i][j];
                      subcredit = StuData.semcredit[i][j];
                      totalcredit+=subcredit;
                      gpa+=subcredit*subresult;
                }
          }
         c=gpa/totalcredit;
         headpc.setText("Predicted CGPA: "+String.format("%.03f",c));
         headcc.setText("Original CGPA: "+String.format("%.3f", StuData.cgpa));
         headpc.setVisible(true);
         c=gpa/totalcredit;
         footpc.setText("Predicted CGPA: "+String.format("%.03f",c));
         footcc.setText("Original CGPA: "+String.format("%.3f", StuData.cgpa));
         footpc.setVisible(true);
}
void setrpgpa(){
      double subresult=0, subcredit=0, gpa=0, totalcredit=0, c=0;
         for(int i=0; i<=12; i++){
               subresult = 0; subcredit = 0; gpa = 0; totalcredit = 0; c = 0;
                for(int j=0; j<=8; j++){
                      subresult = StuData.semresult[i][j];
                      subcredit = StuData.semcredit[i][j];
                      totalcredit+=subcredit;
                      gpa+=subcredit*subresult;
                }
                c = gpa/totalcredit;
                switch(i){
                     case 1: rpg1.setText("GPA: "+String.format("%.03f",c)); break;
                     case 2: rpg2.setText("GPA: "+String.format("%.03f",c)); break;
                     case 3: rpg3.setText("GPA: "+String.format("%.03f",c)); break;
                     case 4: rpg4.setText("GPA: "+String.format("%.03f",c)); break;
                     case 5: rpg5.setText("GPA: "+String.format("%.03f",c)); break;
                     case 6: rpg6.setText("GPA: "+String.format("%.03f",c)); break;
                     case 7: rpg7.setText("GPA: "+String.format("%.03f",c)); break;
                     case 8: rpg8.setText("GPA: "+String.format("%.03f",c)); break;
                     case 9: rpg9.setText("GPA: "+String.format("%.03f",c)); break;
                     case 10: rpg10.setText("GPA: "+String.format("%.03f",c)); break;
                     case 11: rpg11.setText("GPA: "+String.format("%.03f",c)); break;
                     case 12: rpg12.setText("GPA: "+String.format("%.03f",c)); break;
                }
                
          }
}
void setrplist(){
      DefaultListModel listop = new DefaultListModel();
            retakeList.setModel(listop);
            int listindex=0;
            for(int i=1; i<=12; i++){
                  if(i==StuData.CurrentSem)
                     break;
                  for(int j=1; j<=8; j++){
                        if(StuData.semresult[i][j]<3){
                              listop.add(listindex, StuData.semester[i][j]);
                              listindex++;
                        }
                  }
            }
}
void refresh(){
      setrpcourse();
      setrpcredit();
      setrpgpa();
}

void loginSetUp(){
      headname.setText(StuData.name);
      headpc.setVisible(false);
      footpc.setVisible(false);
      if(StuData.regStatus==0){
            Notice.setText("You must fill up the course information first!");
            JOptionPane.showMessageDialog(this,Notice);
                        Notice.setText("Enter your current semester number.");
            Table.setSelectedIndex(1);
            StuData.CurrentSem = Integer.parseInt(JOptionPane.showInputDialog(Notice));
            switch(StuData.CurrentSem){
                  case 1: ebsem2.setVisible(false);
                  case 2: ebsem3.setVisible(false);
                  case 3: ebsem4.setVisible(false);
                  case 4: ebsem5.setVisible(false);
                  case 5: ebsem6.setVisible(false);
                  case 6: ebsem7.setVisible(false);
                  case 7: ebsem8.setVisible(false);
                  case 8: ebsem9.setVisible(false);
                  case 9: ebsem10.setVisible(false);
                  case 10: ebsem11.setVisible(false);
                  case 11: ebsem12.setVisible(false);
                  Notice.setText("Please select the courses you have taken in Semester 01");
            JOptionPane.showMessageDialog(this, Notice, "Notice!", WIDTH);
            }
       }
      else{
            new Details().exploreData();
            refresh();
            setcgpa();
            setrplist();
      }
}

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JCheckBox CHE101;
      private javax.swing.JCheckBox CHE102;
      private javax.swing.JCheckBox CSE101;
      private javax.swing.JCheckBox CSE103;
      private javax.swing.JCheckBox CSE104;
      private javax.swing.JCheckBox CSE105;
      private javax.swing.JCheckBox CSE106;
      private javax.swing.JCheckBox CSE201;
      private javax.swing.JCheckBox CSE202;
      private javax.swing.JCheckBox CSE203;
      private javax.swing.JCheckBox CSE204;
      private javax.swing.JCheckBox CSE205;
      private javax.swing.JCheckBox CSE206;
      private javax.swing.JCheckBox CSE208;
      private javax.swing.JCheckBox CSE209;
      private javax.swing.JCheckBox CSE210;
      private javax.swing.JCheckBox CSE211;
      private javax.swing.JCheckBox CSE301;
      private javax.swing.JCheckBox CSE302;
      private javax.swing.JCheckBox CSE303;
      private javax.swing.JCheckBox CSE304;
      private javax.swing.JCheckBox CSE305;
      private javax.swing.JCheckBox CSE306;
      private javax.swing.JCheckBox CSE307;
      private javax.swing.JCheckBox CSE308;
      private javax.swing.JCheckBox CSE309;
      private javax.swing.JCheckBox CSE310;
      private javax.swing.JCheckBox CSE311;
      private javax.swing.JCheckBox CSE312;
      private javax.swing.JCheckBox CSE313;
      private javax.swing.JCheckBox CSE314;
      private javax.swing.JCheckBox CSE315;
      private javax.swing.JCheckBox CSE317;
      private javax.swing.JCheckBox CSE319;
      private javax.swing.JCheckBox CSE321;
      private javax.swing.JCheckBox CSE400;
      private javax.swing.JCheckBox CSE401;
      private javax.swing.JCheckBox CSE402;
      private javax.swing.JCheckBox CSE403;
      private javax.swing.JCheckBox CSE404;
      private javax.swing.JCheckBox CSE405;
      private javax.swing.JCheckBox CSE406;
      private javax.swing.JCheckBox CSE407;
      private javax.swing.JCheckBox CSE408;
      private javax.swing.JCheckBox CSE409;
      private javax.swing.JCheckBox CSE410;
      private javax.swing.JCheckBox CSE411;
      private javax.swing.JCheckBox CSE413;
      private javax.swing.JCheckBox CSE437;
      private javax.swing.JCheckBox CSE438;
      private javax.swing.JCheckBox CSE800;
      private javax.swing.JCheckBox EAP101;
      private javax.swing.JCheckBox EAP103;
      private javax.swing.JCheckBox EEE201;
      private javax.swing.JCheckBox EEE202;
      private javax.swing.JCheckBox EEE203;
      private javax.swing.JCheckBox EEE204;
      private javax.swing.JCheckBox EEE205;
      private javax.swing.JLabel Edittitle;
      private javax.swing.JCheckBox GED201;
      private javax.swing.JCheckBox GED301;
      private javax.swing.JCheckBox GED303;
      private javax.swing.JCheckBox GED305;
      private javax.swing.JCheckBox GED307;
      private javax.swing.JCheckBox GED401;
      private javax.swing.JCheckBox GED403;
      private javax.swing.JCheckBox GED405;
      private javax.swing.JCheckBox GED407;
      private javax.swing.JCheckBox MAT101;
      private javax.swing.JCheckBox MAT103;
      private javax.swing.JCheckBox MAT105;
      private javax.swing.JCheckBox MAT201;
      private javax.swing.JButton Notice;
      private javax.swing.JCheckBox PHY101;
      private javax.swing.JCheckBox PHY103;
      private javax.swing.JCheckBox PHY104;
      private javax.swing.JTabbedPane Table;
      private javax.swing.JButton csAdd;
      private javax.swing.JButton csAdd1;
      private javax.swing.JTextField csCourse1;
      private javax.swing.JTextField csCourse2;
      private javax.swing.JTextField csCourse3;
      private javax.swing.JTextField csCourse4;
      private javax.swing.JTextField csCourse5;
      private javax.swing.JTextField csCourse6;
      private javax.swing.JTextField csCourse7;
      private javax.swing.JTextField csCourse8;
      private javax.swing.JTextField csCredit;
      private javax.swing.JTextField csGoalNum;
      private javax.swing.JTextField csGpa;
      private javax.swing.JTextField csasign;
      private javax.swing.JTextField csassignnum;
      private javax.swing.JTextField csatten;
      private javax.swing.JTextField csattennum;
      private javax.swing.JTextField csct1num;
      private javax.swing.JTextField csct2num;
      private javax.swing.JTextField csct3num;
      private javax.swing.JTextField csfinal;
      private javax.swing.JTextField csfinalnum;
      private javax.swing.JLabel cshead;
      private javax.swing.JTextField csmid;
      private javax.swing.JTextField csmidnum;
      private javax.swing.JTextField csnum1;
      private javax.swing.JTextField csnum2;
      private javax.swing.JTextField csnum3;
      private javax.swing.JTextField csnumct1;
      private javax.swing.JTextField csnumct2;
      private javax.swing.JTextField csnumct3;
      private javax.swing.JTextField cspresen;
      private javax.swing.JTextField cspresennum;
      private javax.swing.JTextField cstCourse1;
      private javax.swing.JTextField cstCourse2;
      private javax.swing.JTextField cstCourse3;
      private javax.swing.JTextField cstCourse4;
      private javax.swing.JTextField cstCourse5;
      private javax.swing.JTextField cstCourse6;
      private javax.swing.JTextField cstCourse7;
      private javax.swing.JTextField cstCourse8;
      private javax.swing.JTextField cstCredit1;
      private javax.swing.JTextField cstCredit2;
      private javax.swing.JTextField cstCredit3;
      private javax.swing.JTextField cstCredit4;
      private javax.swing.JTextField cstCredit5;
      private javax.swing.JTextField cstCredit6;
      private javax.swing.JTextField cstCredit7;
      private javax.swing.JTextField cstCredit8;
      private javax.swing.JTextField cstGpa1;
      private javax.swing.JTextField cstGpa2;
      private javax.swing.JTextField cstGpa3;
      private javax.swing.JTextField cstGpa4;
      private javax.swing.JTextField cstGpa5;
      private javax.swing.JTextField cstGpa6;
      private javax.swing.JTextField cstGpa7;
      private javax.swing.JTextField cstGpa8;
      private javax.swing.JButton ebsem1;
      private javax.swing.JButton ebsem10;
      private javax.swing.JButton ebsem11;
      private javax.swing.JButton ebsem12;
      private javax.swing.JButton ebsem2;
      private javax.swing.JButton ebsem3;
      private javax.swing.JButton ebsem4;
      private javax.swing.JButton ebsem5;
      private javax.swing.JButton ebsem6;
      private javax.swing.JButton ebsem7;
      private javax.swing.JButton ebsem8;
      private javax.swing.JButton ebsem9;
      private javax.swing.JTextField footcc;
      private javax.swing.JTextField footpc;
      private javax.swing.JButton freezerp;
      private javax.swing.JComboBox gpaList;
      private javax.swing.JTextField headcc;
      private javax.swing.JTextField headname;
      private javax.swing.JTextField headpc;
      private javax.swing.JTextField headpc1;
      private javax.swing.JButton jButton1;
      private javax.swing.JButton jButton10;
      private javax.swing.JButton jButton2;
      private javax.swing.JButton jButton3;
      private javax.swing.JButton jButton39;
      private javax.swing.JButton jButton4;
      private javax.swing.JButton jButton41;
      private javax.swing.JButton jButton42;
      private javax.swing.JButton jButton44;
      private javax.swing.JButton jButton5;
      private javax.swing.JButton jButton51;
      private javax.swing.JButton jButton55;
      private javax.swing.JButton jButton57;
      private javax.swing.JButton jButton59;
      private javax.swing.JButton jButton6;
      private javax.swing.JButton jButton61;
      private javax.swing.JButton jButton63;
      private javax.swing.JButton jButton65;
      private javax.swing.JButton jButton67;
      private javax.swing.JButton jButton8;
      private javax.swing.JButton jButton9;
      private javax.swing.JEditorPane jEditorPane1;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel10;
      private javax.swing.JLabel jLabel11;
      private javax.swing.JLabel jLabel12;
      private javax.swing.JLabel jLabel13;
      private javax.swing.JLabel jLabel14;
      private javax.swing.JLabel jLabel15;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel30;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JLabel jLabel6;
      private javax.swing.JLabel jLabel7;
      private javax.swing.JLabel jLabel8;
      private javax.swing.JLabel jLabel9;
      private javax.swing.JPanel jPanel1;
      private javax.swing.JPanel jPanel10;
      private javax.swing.JPanel jPanel11;
      private javax.swing.JPanel jPanel12;
      private javax.swing.JPanel jPanel13;
      private javax.swing.JPanel jPanel14;
      private javax.swing.JPanel jPanel15;
      private javax.swing.JPanel jPanel16;
      private javax.swing.JPanel jPanel17;
      private javax.swing.JPanel jPanel18;
      private javax.swing.JPanel jPanel19;
      private javax.swing.JPanel jPanel2;
      private javax.swing.JPanel jPanel20;
      private javax.swing.JPanel jPanel21;
      private javax.swing.JPanel jPanel22;
      private javax.swing.JPanel jPanel23;
      private javax.swing.JPanel jPanel24;
      private javax.swing.JPanel jPanel25;
      private javax.swing.JPanel jPanel26;
      private javax.swing.JPanel jPanel27;
      private javax.swing.JPanel jPanel28;
      private javax.swing.JPanel jPanel29;
      private javax.swing.JPanel jPanel3;
      private javax.swing.JPanel jPanel31;
      private javax.swing.JPanel jPanel32;
      private javax.swing.JPanel jPanel33;
      private javax.swing.JPanel jPanel34;
      private javax.swing.JPanel jPanel37;
      private javax.swing.JPanel jPanel39;
      private javax.swing.JPanel jPanel4;
      private javax.swing.JPanel jPanel40;
      private javax.swing.JPanel jPanel41;
      private javax.swing.JPanel jPanel42;
      private javax.swing.JPanel jPanel43;
      private javax.swing.JPanel jPanel44;
      private javax.swing.JPanel jPanel45;
      private javax.swing.JPanel jPanel49;
      private javax.swing.JPanel jPanel5;
      private javax.swing.JPanel jPanel50;
      private javax.swing.JPanel jPanel51;
      private javax.swing.JPanel jPanel52;
      private javax.swing.JPanel jPanel6;
      private javax.swing.JPanel jPanel7;
      private javax.swing.JPanel jPanel8;
      private javax.swing.JPanel jPanel9;
      private javax.swing.JScrollPane jScrollPane1;
      private javax.swing.JScrollPane jScrollPane2;
      private javax.swing.JSeparator jSeparator1;
      private javax.swing.JSeparator jSeparator2;
      private javax.swing.JSeparator jSeparator3;
      private javax.swing.JSeparator jSeparator4;
      private javax.swing.JSeparator jSeparator5;
      private javax.swing.JSeparator jSeparator6;
      private javax.swing.JSeparator jSeparator7;
      private javax.swing.JSeparator jSeparator8;
      private javax.swing.JTextField jTextField14;
      private javax.swing.JTextField jTextField15;
      private javax.swing.JTextField jTextField17;
      private javax.swing.JTextField jTextField19;
      private javax.swing.JButton modify;
      private javax.swing.JList retakeList;
      private javax.swing.JTextField retakecost;
      private javax.swing.JLabel retakemsg;
      private javax.swing.JLabel retakemsg2;
      private javax.swing.JLabel retakemsg3;
      private javax.swing.JTextField retakenlist;
      private javax.swing.JTextField retakenmsg1;
      private javax.swing.JTextField retakenmsg2;
      private javax.swing.JTextField retakenmsg3;
      private javax.swing.JTextField retakenmsg4;
      private javax.swing.JLabel retakeselected;
      private javax.swing.JButton rpc1;
      private javax.swing.JButton rpc10;
      private javax.swing.JButton rpc11;
      private javax.swing.JButton rpc12;
      private javax.swing.JButton rpc2;
      private javax.swing.JButton rpc3;
      private javax.swing.JButton rpc4;
      private javax.swing.JButton rpc5;
      private javax.swing.JButton rpc6;
      private javax.swing.JButton rpc7;
      private javax.swing.JButton rpc8;
      private javax.swing.JButton rpc9;
      private javax.swing.JButton rpg1;
      private javax.swing.JButton rpg10;
      private javax.swing.JButton rpg11;
      private javax.swing.JButton rpg12;
      private javax.swing.JButton rpg2;
      private javax.swing.JButton rpg3;
      private javax.swing.JButton rpg4;
      private javax.swing.JButton rpg5;
      private javax.swing.JButton rpg6;
      private javax.swing.JButton rpg7;
      private javax.swing.JButton rpg8;
      private javax.swing.JButton rpg9;
      private javax.swing.JLabel rps10c1;
      private javax.swing.JLabel rps10c2;
      private javax.swing.JLabel rps10c3;
      private javax.swing.JLabel rps10c4;
      private javax.swing.JLabel rps10c5;
      private javax.swing.JLabel rps10c6;
      private javax.swing.JLabel rps10c7;
      private javax.swing.JLabel rps10c8;
      private javax.swing.JLabel rps11c1;
      private javax.swing.JLabel rps11c2;
      private javax.swing.JLabel rps11c3;
      private javax.swing.JLabel rps11c4;
      private javax.swing.JLabel rps11c5;
      private javax.swing.JLabel rps11c6;
      private javax.swing.JLabel rps11c7;
      private javax.swing.JLabel rps11c8;
      private javax.swing.JLabel rps12c1;
      private javax.swing.JLabel rps12c2;
      private javax.swing.JLabel rps12c3;
      private javax.swing.JLabel rps12c4;
      private javax.swing.JLabel rps12c5;
      private javax.swing.JLabel rps12c6;
      private javax.swing.JLabel rps12c7;
      private javax.swing.JLabel rps12c8;
      private javax.swing.JLabel rps1c1;
      private javax.swing.JLabel rps1c2;
      private javax.swing.JLabel rps1c3;
      private javax.swing.JLabel rps1c4;
      private javax.swing.JLabel rps1c5;
      private javax.swing.JLabel rps1c6;
      private javax.swing.JLabel rps1c7;
      private javax.swing.JLabel rps1c8;
      private javax.swing.JLabel rps2c1;
      private javax.swing.JLabel rps2c2;
      private javax.swing.JLabel rps2c3;
      private javax.swing.JLabel rps2c4;
      private javax.swing.JLabel rps2c5;
      private javax.swing.JLabel rps2c6;
      private javax.swing.JLabel rps2c7;
      private javax.swing.JLabel rps2c8;
      private javax.swing.JLabel rps3c1;
      private javax.swing.JLabel rps3c2;
      private javax.swing.JLabel rps3c3;
      private javax.swing.JLabel rps3c4;
      private javax.swing.JLabel rps3c5;
      private javax.swing.JLabel rps3c6;
      private javax.swing.JLabel rps3c7;
      private javax.swing.JLabel rps3c8;
      private javax.swing.JLabel rps4c1;
      private javax.swing.JLabel rps4c2;
      private javax.swing.JLabel rps4c3;
      private javax.swing.JLabel rps4c4;
      private javax.swing.JLabel rps4c5;
      private javax.swing.JLabel rps4c6;
      private javax.swing.JLabel rps4c7;
      private javax.swing.JLabel rps4c8;
      private javax.swing.JLabel rps5c1;
      private javax.swing.JLabel rps5c2;
      private javax.swing.JLabel rps5c3;
      private javax.swing.JLabel rps5c4;
      private javax.swing.JLabel rps5c5;
      private javax.swing.JLabel rps5c6;
      private javax.swing.JLabel rps5c7;
      private javax.swing.JLabel rps5c8;
      private javax.swing.JLabel rps6c1;
      private javax.swing.JLabel rps6c2;
      private javax.swing.JLabel rps6c3;
      private javax.swing.JLabel rps6c4;
      private javax.swing.JLabel rps6c5;
      private javax.swing.JLabel rps6c6;
      private javax.swing.JLabel rps6c7;
      private javax.swing.JLabel rps6c8;
      private javax.swing.JLabel rps7c1;
      private javax.swing.JLabel rps7c2;
      private javax.swing.JLabel rps7c3;
      private javax.swing.JLabel rps7c4;
      private javax.swing.JLabel rps7c5;
      private javax.swing.JLabel rps7c6;
      private javax.swing.JLabel rps7c7;
      private javax.swing.JLabel rps7c8;
      private javax.swing.JLabel rps8c1;
      private javax.swing.JLabel rps8c2;
      private javax.swing.JLabel rps8c3;
      private javax.swing.JLabel rps8c4;
      private javax.swing.JLabel rps8c5;
      private javax.swing.JLabel rps8c6;
      private javax.swing.JLabel rps8c7;
      private javax.swing.JLabel rps8c8;
      private javax.swing.JLabel rps9c1;
      private javax.swing.JLabel rps9c2;
      private javax.swing.JLabel rps9c3;
      private javax.swing.JLabel rps9c4;
      private javax.swing.JLabel rps9c5;
      private javax.swing.JLabel rps9c6;
      private javax.swing.JLabel rps9c7;
      private javax.swing.JLabel rps9c8;
      private javax.swing.JLabel selectcourse1;
      private javax.swing.JLabel selectedCourse;
      private javax.swing.JPanel tabg;
      // End of variables declaration//GEN-END:variables
}
