import java.util.Random;
public class nRandomizer {

      String items[];
      Double percentages[], added = 0.0;
      Random r =new Random();
      int n, F=0, total, done=0;
      void setItems(String ... i) {
            items = i;
      }
      void setPercentages(Double ... i) {
            percentages = i;
      }
      Double p[];
      Double num[];
      String[] Generate(int x){
            n = items.length;
            System.out.print("GENERATING "+x+" DATA. USING "+n+" ITEMS.\n      COMPLETED: ");
            long time = System.currentTimeMillis();
            total = x;
            F=total/100;
            if(F==0) F=1;
            String result[] = new String[x];
            Double pp[] = new Double[n];
            Double numnum[] = new Double[n];
            p = pp;
            num = numnum;
            for(int i=0; i<n; i++){
                  p[i] = 0.0;
                  num[i] = 0.0;
            }
                  
            while(x-->0){
                  int overFlow[] = new int[n];
                  for(int i=0; i<n; i++){
                        if(p[i] >= percentages[i])
                              overFlow[i] = i;
                        else overFlow[i] = -1;
                  }
                  int VI = doo(n, overFlow);
                  num[VI]++;
                  added++;
                  calcPer();
                  result[x] = items[VI];
                  if(x%F==0){
                        done++;
                        if(done%20 == 0)
                        System.out.print((done) + "% ");
                  }
            }
            time = System.currentTimeMillis() - time;
            System.out.println("\n      Process successful.");
            System.out.println("      Total time taken: "+time/1000+" s");
            if(time/1000==0)
                  System.out.println("      Data generated per second: "+total);
            else
                  System.out.println("      Data generated per second: "+total/(time/1000));
            for(int ii=0; ii<items.length; ii++)
                  System.out.println("      "+items[ii] +" - "+percentages[ii]+"%");
            
            return result;
      }
      
      private void calcPer(){
            for(int i=0; i<p.length; i++){
                  p[i] = (num[i]/added) * 100;
            }
      }
      
      
      private int doo(int l, int ... arr){
      int x[] = new int[l];
      for(int i=0; i<x.length; i++)
            x[i] = i;
      for(int i=0; i<arr.length; i++){
            for(int j=0; j<x.length; j++){
                  if(arr[i] == x[j])
                        x[j] = -1;
            }
      }
      int available[] = new int[x.length];
      int pos = 0;
      for(int i=0; i<x.length; i++)
            if(x[i] != -1)
                 available[pos++] = x[i];
      if(pos<1)
            pos = 1;
       return available[r.nextInt(pos)];
      }
}