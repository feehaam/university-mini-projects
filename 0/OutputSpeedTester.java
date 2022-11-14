import java.io.*;
import java.util.Scanner;
/**
 *
 * @author MD.Feeham
 */
public class OutputSpeedTester {
      static int swftime=0, pwftime=0, owftime=0, bwftime=0, pbowftime=0, c1wftime=0, tested=1;
      static int test=0;
      
      
      //********************************
      static void settestvalue1(){        //More than 50 tests may take long time, Didn't take user input because that may reduce the original time.
            test=50;    //SET VALUE OF 'test' to number of tests you want to have.
      }//*******************************
      
      
      static void settestvalue2(){
            test=new Scanner(System.in).nextInt();
      }
      
      public static void main(String args[]) throws IOException{/*
          For each test, every single output function will be working 1 million(10^6) times.
          During these tests, total time taken by each function is calculated. 
          Finally average time and total time taken by them is printed.
          Aditionally, a non sequential testing loop[n=(1,2,3...p + 1,2,3...q + ...)] is used for better performance.   */
            
        //More than 30 tests may take long time, Didn't take user input because that may reduce the original time.
            settestvalue1(); 
            int t=1;
            while(tested<=test){
                  tester(t);
                  if((t+1+tested)>test)
                        t=1;
                  else t++;
                  if(tested+t>test)
                        break;
                  tested+=t;
            }
            System.out.println("\n\nTotal tested "+tested+" times. \nAverage time taken per test ");
            System.out.println("System.out: "+swftime/tested);
            System.out.println("PrintWriter: "+pwftime/tested);
            System.out.println("OutputStream: "+owftime/tested);
            System.out.println("BufferedWriter: "+bwftime/tested);
            System.out.println("MixedWriter: "+pbowftime/tested);
            System.out.println("CustomizedWriter: "+c1wftime/tested);
            
            System.out.println("\nTotal time taken per Writer ");
            Integer x;
            System.out.println("System.out: "+(Double.parseDouble((x=swftime).toString()))/1000+" seconds");
            System.out.println("PrintWriter: "+(Double.parseDouble((x=pwftime).toString()))/1000+" seconds");
            System.out.println("OutputStream: "+(Double.parseDouble((x=owftime).toString()))/1000+" seconds");
            System.out.println("BufferedWriter: "+(Double.parseDouble((x=bwftime).toString()))/1000+" seconds");
            System.out.println("MixedWriter: "+(Double.parseDouble((x=pbowftime).toString()))/1000+" seconds");
            System.out.println("CustomizedWriter: "+(Double.parseDouble((x=c1wftime).toString()))/1000+" seconds");
      }
      public static void tester(int n) throws IOException{
            System.out.println("Printing "+n+" times...");
            for(int i=1; i<=n; i++)
                  swf();
            for(int i=1; i<=n; i++)
                  pwf();
            for(int i=1; i<=n; i++)
                  owf();
            for(int i=1; i<=n; i++)
                  bwf();
            for(int i=1; i<=n; i++)
                  pbowf();
            for(int i=1; i<=n; i++)
                  c1wf();
      }
      
      public static void swf(){
            long t=System.currentTimeMillis();
            for(int i=1; i<=1000000; i++)
                  System.out.print("");
            swftime+=(System.currentTimeMillis()-t);
      }
      
      public static void pwf(){
            long t=System.currentTimeMillis();
            PrintWriter pw = new PrintWriter(System.out);
            for(int i=1; i<=1000000; i++)
                  pw.print("");
            pw.flush();
            pwftime+=(System.currentTimeMillis()-t);
      }
      
      public static void owf() throws IOException{
            long t=System.currentTimeMillis();
            OutputStreamWriter ow = new OutputStreamWriter(System.out);
            for(int i=1; i<=1000000; i++)
                  ow.write("");
            ow.flush();
            owftime+=(System.currentTimeMillis()-t);
      }
      
      public static void bwf() throws IOException{
            long t=System.currentTimeMillis();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            for(int i=1; i<=1000000; i++)
                  bw.write("");
            bw.flush();
            bwftime+=(System.currentTimeMillis()-t);
      }
      
      public static void pbowf(){
            long t=System.currentTimeMillis();
            PrintWriter m=new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
            for(int i=1; i<1000000; i++)
                  m.print("");
            m.flush();
            pbowftime+=(System.currentTimeMillis()-t);
      }
      
      public static void c1wf(){
            long t=System.currentTimeMillis();
            OutputWriter out = new OutputWriter(System.out);
            for(int i=1; i<1000000; i++)
                  out.print("");
            out.flush();
            c1wftime+=(System.currentTimeMillis()-t);
      }
}
class OutputWriter {
		private final PrintWriter writer;
		public OutputWriter(OutputStream outputStream) {
			writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
		}
		public OutputWriter(Writer writer) {
			this.writer = new PrintWriter(writer);
		}
		public void print(Object...objects) {
			for (int i = 0; i < objects.length; i++) {
				if (i != 0)
					writer.print(' ');
				writer.print(objects[i]);
			}
		}
		public void printLine(Object...objects) {
			print(objects);
			writer.println();
		}
		public void close() {
			writer.close();
		}
		public void flush() {
			writer.flush();
		}
}