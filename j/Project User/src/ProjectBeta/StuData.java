package ProjectBeta;
//@author MD.Feeham
public class StuData {
      
      //Essentail part
      static int regStatus=0;
      static String Location="";
      static int ptr = 0, rlptr = 0, csptr=0, CurrentSem, SemCount=1,cscoursecounter=0;
      static String semester[][] = new String[13][13], retakelist[]=new String[100];
      static double semresult[][] = new double[13][13], semcredit[][] = new double[13][13], cgpa, retakecost, cscredit=0, cscredittotal=0,csgpatotal=0;
      
      static void setcourse(String course){
            ptr++;
            semester[SemCount][ptr]=course;
      }
      
      static void show(){
            for(int i=1; i<13; i++){
                  if(semester[i][1]==null)
                        continue;
                  System.out.println("Showing results of semster "+i);
                  for(int j=1; j<13; j++){
                        if(semester[i][j]==null)
                              break;
                        System.out.print(semester[i][j]);
                  }
            System.out.println();
            }
      }
      
     static double coursecredit(String c){
           if((c.equals("GED201"))||(c.equals("GED407"))||(c.equals("EAP103")))
                 return 2.0;
           else if((c.equals("CSE306"))||(c.equals("CSE308"))||(c.equals("EEE204"))||(c.equals("EEE202"))||(c.equals("CSE204"))||(c.equals("CHE102")))
                 return 1.0;
           else if((c.equals("PHY104"))||(c.equals("CSE104"))||(c.equals("CSE106"))||(c.equals("CSE202"))||(c.equals("CSE206"))||(c.equals("CSE208"))||(c.equals("CSE2010"))||(c.equals("CSE302"))||(c.equals("CSE310"))||(c.equals("CSE312"))||(c.equals("CSE314"))||(c.equals("CSE402"))||(c.equals("CSE404"))||(c.equals("CSE406"))||(c.equals("CSE408"))||(c.equals("CSE410"))||(c.equals("CSE438")))
                 return 1.5;
           else return 3.0;
     } 
     
     static int retakelist(String s){
           int i, status;
           for(i=0; i<=rlptr; i++){
                 String x=retakelist[i];
                 if(s==x)
                       return 0;
           }
           retakelist[rlptr]=s;
           rlptr++;
           return 1;
     }
     
     //Studinfo basic part
     
      static String id, name, pas;
}
