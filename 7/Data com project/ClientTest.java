import javax.swing.JFrame;
public class ClientTest {
      public static void main (String[]args){
            Clients Nirob;
            Nirob=new Clients ("127.0.0.1");
            Nirob.setVisible(true);
            Nirob.startRunning();
      }
}

