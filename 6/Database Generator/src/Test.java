import java.util.Random;
public class Test {
      public static void main(String args[]){
            int N = 1000;
            nRandomizer ObjKidney = new nRandomizer();
            ObjKidney.setItems("Weak", "Normal");
            ObjKidney.setPercentages(10.0,90.0);
            String kidneys[] = ObjKidney.Generate(N);
            count(kidneys, "Weak", "Normal");
      }
            
      static void count(String arr[], String ... x){
            for(int i=0; i<x.length; i++){
                  int c = 0;
                  for(int j=0; j<arr.length; j++)
                        if(arr[j].equals(x[i]))
                              c++;
                  System.out.println(x[i] + " === "+ c);
            }
      }
      public static void xx(){
            Random r = new Random();
            String s1="";
            String s2="";
            for(int i=4; i<40; i++)
                  s1+="\""+i+"\""+", ";
            int p = 100;
            for(int o=4; o<40; o++){
                  int x;
                  if(o<6)
                        x = r.nextInt(2);
                  else if(o<31)
                        x = r.nextInt(7);
                  else if(o<38)
                        x = r.nextInt(20);
                  else x = r.nextInt(40);
                  
                  x+=3;
                  p+=3;
                  s2+=String.valueOf(x+", ");
            }
                  System.out.println(p/100);
                  System.out.println(s1);
                  System.out.println(s2);
      }
}

