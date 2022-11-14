import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class NewJFrame extends javax.swing.JFrame {
       
      private ObjectOutputStream output;
      private ObjectInputStream input;
      private ServerSocket server;
      private Socket connection;
      
      public NewJFrame() {
            super("Server side...");
            initComponents();
            
      }
      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jScrollPane1 = new javax.swing.JScrollPane();
            msgin = new javax.swing.JTextArea();
            jButton1 = new javax.swing.JButton();
            jScrollPane2 = new javax.swing.JScrollPane();
            chatWindow = new javax.swing.JTextArea();
            jLabel1 = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setResizable(false);

            msgin.setBackground(new java.awt.Color(255, 255, 255));
            msgin.setColumns(20);
            msgin.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
            msgin.setRows(5);
            msgin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            jScrollPane1.setViewportView(msgin);

            jButton1.setBackground(new java.awt.Color(51, 51, 51));
            jButton1.setFont(new java.awt.Font("Footlight MT Light", 1, 48)); // NOI18N
            jButton1.setForeground(new java.awt.Color(255, 255, 255));
            jButton1.setText("SEND");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                  }
            });

            chatWindow.setEditable(false);
            chatWindow.setBackground(new java.awt.Color(204, 204, 204));
            chatWindow.setColumns(20);
            chatWindow.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
            chatWindow.setRows(5);
            chatWindow.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
            jScrollPane2.setViewportView(chatWindow);

            jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
            jLabel1.setText("LAN Messenger");

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                              .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                              .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                        .addContainerGap())
            );

            pack();
      }// </editor-fold>//GEN-END:initComponents

      private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            String s = msgin.getText();
            msgin.setText("");
            sendMessage ("S - "+s);
      }//GEN-LAST:event_jButton1ActionPerformed

      public static void main(String args[]) {
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
            java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
                        new NewJFrame().setVisible(true);
                  }
            });
      }

        // set up and run the server 
      public void startRunning (){
            try{
                  server = new ServerSocket(6789,100); //Making server
            while(true){
                  try {
                        waitForConnection();
                        setupStreams();
                        whileChatting();
                  }catch(EOFException eofException){
                        showMessage("\n Server ended the connection!");
                  }finally {
                        closerCrap();
                  }
            }
            }catch (IOException ioException){
                  ioException.printStackTrace();
            }
      }
      // wait for connection , then display connection information
      private void  waitForConnection() throws IOException{
            showMessage ("Waiting for someone to connect......\n");
            connection = server.accept();
            showMessage ("Now connected to " +connection.getInetAddress().getHostName()  );
      }
      //get stream to  send and receive data
      private void setupStreams() throws IOException{
            output = new ObjectOutputStream(connection.getOutputStream());
            output.flush();
            input= new ObjectInputStream(connection.getInputStream());
            showMessage("\nStream are now setup!");
      }
      //during the chat conversation 
      private void whileChatting() throws IOException {
            String message = "You ar now connected!\n";
            sendMessage(message);
            ableToType(true);
            do{
                  try{
                        message= (String) input.readObject();
                        sendMessage(message);
                  } catch (ClassNotFoundException classNotFoundException) {
                        showMessage("\nUnknown error happened.");
                  }
            }while(!message.equals("C - END"));
      }

      // Close stream and sockets after you are done chatting
      private void closerCrap(){
            showMessage("\nClosing connections.....\n");
            ableToType(false);
            try{
                  output.close();
                  input.close();
                  connection.close();
            }catch(IOException ioException){
                  ioException. printStackTrace();
            }
      }
      //send a message to client
      private void sendMessage(String message){
            try{
                  output.writeObject("" + message);
                  showMessage("\n" + message);
            }catch(IOException ioException){
                  chatWindow.append("\n ERROR sending message.");
            }
      }
      //update chatWindow
      private void showMessage(final String text){
            SwingUtilities.invokeLater(
                  new Runnable(){
                        public void run(){
                              chatWindow.append(text);
                        }
                  }
            );
      }
      
      // let the user type into the input box
      private void ableToType(final boolean tof){
            SwingUtilities.invokeLater(
                  new Runnable(){
                        public void run(){
                              msgin.setEditable(tof);
                        }
                  }
            );
      }
      


      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JTextArea chatWindow;
      private javax.swing.JButton jButton1;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JScrollPane jScrollPane1;
      private javax.swing.JScrollPane jScrollPane2;
      private javax.swing.JTextArea msgin;
      // End of variables declaration//GEN-END:variables
}
