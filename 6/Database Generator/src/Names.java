import java.util.Random;

public class Names {
      public static void main(String[] args) {
            String arr [][] = Generate(100);
            for(int i=0; i<arr.length; i++){
                  System.out.println(arr[i][0] + " = " + arr[i][1]);
            }
      }
      public static String[][] Generate(Integer n){
            long time = System.currentTimeMillis();
            System.out.println("GENERATING "+n+" NAMES");
            
            System.out.println("      Compliting initial steps...");
            String BoyMuslimFname[] = getNameArray("F:\\DG\\Names\\BoyMuslimFname.txt");
            String BoyMuslimLname[] = getNameArray("F:\\DG\\Names\\BoyMuslimLname.txt");
            String GirlMuslimFname[] = getNameArray("F:\\DG\\Names\\GirlMuslimFname.txt");
            String GirlMuslimLname[] = getNameArray("F:\\DG\\Names\\GirlMuslimLname.txt");
            
            String BoyHinduFname[] = getNameArray("F:\\DG\\Names\\BoyHinduFname.txt");
            String BoyHinduLname[] = getNameArray("F:\\DG\\Names\\BoyHinduLname.txt");
            String GirlHinduFname[] = getNameArray("F:\\DG\\Names\\GirlHinduFname.txt");
            String GirlHinduLname[] = getNameArray("F:\\DG\\Names\\GirlHinduLname.txt");
            
            Double N = n.doubleValue();
            Double BNd = N/100*48, GNd = N/100*52;
            Double MBNd = BNd/100*86, MGNd = GNd/100*86;
            Double HBNd = BNd - MBNd, HGNd = GNd - MGNd;
            
            int MBN = MBNd.intValue(), MGN = MBNd.intValue();
            int HBN = HBNd.intValue(), HGN = HGNd.intValue();
            
            int got = n - (MBN + MGN + HBN + HGN);
            HBN += got/2; HGN += got/2;
            got = n - (MBN + MGN + HBN + HGN);
            MBN += got;
            
            Random R = new Random();
            String names[][] = new String[n][2];
            int p = -1, pp, t;
            
            System.out.println("      Creating names...");
            for(int i=0; i<MBN; i++){
                  names[++p][0] = BoyMuslimFname[R.nextInt(BoyMuslimFname.length-1)] + " " + BoyMuslimLname[R.nextInt(BoyMuslimLname.length-1)];
                  names[p][1] = "Male";
            }
                  pp = p; t = p;
            System.out.println("      + "+pp+" names complete | Total: "+t);
            
            for(int i=0; i<MGN; i++){
                  names[++p][0] = GirlMuslimFname[R.nextInt(GirlMuslimFname.length-1)] + " " + GirlMuslimLname[R.nextInt(GirlMuslimLname.length-1)];
                  names[p][1] = "Female";
            }
                  pp = p - t; t = p;
            System.out.println("      + "+pp+" names complete | Total: "+p);
            
            for(int i=0; i<HBN; i++){
                  names[++p][0] = BoyHinduFname[R.nextInt(BoyHinduFname.length-1)] + " " + BoyHinduLname[R.nextInt(BoyHinduLname.length-1)];
                  names[p][1] = "Male";
            }
                  pp = p - t; t = p;
            System.out.println("      + "+pp+" names complete | Total: "+p);
            
            for(int i=0; i<HGN; i++){
                  names[++p][0] = GirlHinduFname[R.nextInt(GirlHinduFname.length-1)] + " " + GirlHinduLname[R.nextInt(GirlMuslimLname.length-1)];
                  names[p][1] = "Female";
            }
                  pp = p - t; t = p;
            System.out.println("      + "+pp+" names complete | Total: "+(p+1));
            
            System.out.print("      Randomining names...\n      Completed: ");
            for(int i=0; i<n*5; i++){
                  if(i%n==0)
                        System.out.print((((i+1)/n)*20+20)+"% ");
                  int x = R.nextInt(p), y = R.nextInt(p);
                  String temp = names[x][0];
                  names[x][0] = names[y][0];
                  names[y][0] = temp;
                  
                  temp = names[x][1];
                  names[x][1] = names[y][1];
                  names[y][1] = temp;
            }
            System.out.println();
            System.out.println("      Process successful.");
            time = System.currentTimeMillis() - time;
            System.out.println("      Total time taken: "+time/1000+" s");
            return names;
      }
      
      private static String[] getNameArray(String loc){
            String s = purifyName(loc);
            int x = 0, p = 1;
            for(int i = 0; i<s.length(); i++)
                  if(s.charAt(i) == '\n')
                        p++;
            String arr[] = new String[p];
            p = 0;
            for(int i=0; i<s.length(); i++){
                  if(s.charAt(i) == '\n'){
                        arr[p] = s.substring(x,i);
                        p++;
                        x = i+1;
                  }
                  else if(i == s.length() - 1){
                        arr[p] = s.substring(x,i+1);
                        p++;
                  }
            }
            return arr;
      }
      
      private static String purifyName(String loc){
            String s = FFiles.read(loc);
            //Clearing numeric and special char
            for(int i=0; i<s.length(); i++)
                  if( (s.charAt(i)>='a'&&s.charAt(i)<='z') || (s.charAt(i)>='A'&&s.charAt(i)<='Z') || s.charAt(i)==' ' || s.charAt(i)=='\n') {}
                  else
                        s = s.substring(0,i) + " " + s.substring(i+1, s.length());
            
            //removing white spaces
            for(int i=0; i<10; i++){
                  s = s.replace(" ", "\n");
                  s = s.replace("\n\n", "\n");
            }
            
            //Case fixing
            s = s.toLowerCase();
            s = s.substring(0,1).toUpperCase() + s.substring(1,s.length());
            for(int i=0; i<s.length()-3; i++){
                  if(s.charAt(i) == '\n'){
                        s = s.substring(0,i+1) + s.substring(i+1,i+2).toUpperCase() + s.substring(i+2,s.length());
                  }
            }
            if(s.charAt(s.length() - 1) == '\n')
                  s = s.substring(0, s.length() - 2);
            FFiles.changeData(loc, s);
            
            return s;
      }
}