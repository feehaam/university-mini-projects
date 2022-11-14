import java.io.*;
import java.util.*;


public class MyInputTester {
	
		static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		static Scanner sc = new Scanner(System.in);
		
	public static void main(String args[]) throws IOException {
		String s="";
		long t1=0;
		long t2=0;
		int c=0;
		for(int i=0; i<250000; i++) {
			s = i1();
			c++;
			if(c==1)
				t1=System.currentTimeMillis();
			if(c==250000)
				t2=System.currentTimeMillis();
		}
		long time = t2-t1;
		System.err.println("\nTotal time taken: "+time+" millis.");
	}
	
	static String i0() {
		return sc.nextLine();
	}
	static String i1() throws IOException {
		return br.readLine();
	}
}
