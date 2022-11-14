package j;
import java.io.*;
import java.nio.file.*;
import java.util.Random;
public class FGenerator {
      
      public static void main(String args[]){
            
            int N = 3000100;
            Random r = new Random();
            
            /////////////////////////PERSON 19 TABLE  
            
            //Generation of names and genders array
            String namesAndAges [][] = Names.Generate(N);
            String names[] = new String[namesAndAges.length];
            String genders[] = new String[namesAndAges.length];
            for(int i=0; i<namesAndAges.length; i++){
                  names[i] = namesAndAges[i][0];
                  genders[i] = namesAndAges[i][1]; }
            //Generation of ages array
            nRandomizer ObjAge = new nRandomizer();
            ObjAge.setItems("18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", "101", "102", "103", "104");
            ObjAge.setPercentages(1.890, 2.030, 0.550, 1.930, 1.030, 2.320, 1.810, 0.860, 0.550, 1.600, 0.910, 0.840, 1.580, 0.980, 2.330, 1.160, 1.770, 1.920, 1.260, 0.680, 2.190, 0.800, 1.870, 0.980, 2.380, 2.330, 1.260, 1.650, 0.480, 2.040, 1.800, 0.950, 1.120, 2.350, 0.760, 1.060, 1.370, 0.640, 2.190, 0.410, 2.250, 2.190, 0.400, 1.270, 0.380, 1.180, 1.130, 1.150, 0.940, 0.590, 1.270, 1.350, 0.430, 0.460, 0.660, 0.010, 1.250, 1.150, 0.550, 1.100, 0.370, 0.960, 0.620, 1.270, 0.340, 1.040, 0.310, 0.350, 0.300, 0.020, 0.300, 0.470, 0.180, 0.090, 0.400, 0.090, 0.590, 0.250, 0.530, 0.380, 0.380, 0.400, 0.080, 0.100, 0.080, 0.010, 0.020);
            String age[] = ObjAge.Generate(N);
            int ages[] = new int[age.length];
            for(int i=0; i<age.length; i++)
                  ages[i] = Integer.valueOf(age[i]);
            //Generation of regions array
            nRandomizer ObjReg = new nRandomizer();            
            ObjReg.setItems("Dhaka", "Sylhet", "Rajshahi","Mymensingh", "Barisal", "Rongpur", "Khulna", "Chittagong");          
            ObjReg.setPercentages(18.0, 9.0, 14.0, 15.0, 13.0, 11.0, 12.0, 8.0);
            String regions[] = ObjReg.Generate(N);
            
            /////////////////////////BODY CONDITION 19 TABLE  
            
            //Generation of Blood group array
            nRandomizer ObjBlood = new nRandomizer();
            ObjBlood.setItems("O+", "A+", "B+", "AB+", "O-", "A-", "B", "AB-");
            ObjBlood.setPercentages(31.8, 21.44, 34.58, 8.85, 1.39, 0.96, 0.96, 0.64);
            String bloods[] = ObjBlood.Generate(N);
            //Generation of Weight array
            nRandomizer ObjWeight = new nRandomizer();
            ObjWeight.setItems("45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", "101", "102", "103", "104");
            ObjWeight.setPercentages(1.15, 1.36, 1.42, 1.14, 1.40, 0.83, 1.38, 1.04, 1.40, 1.28, 0.78, 1.25, 1.23, 1.35, 1.11, 1.18, 1.42, 0.48, 0.58, 0.46, 0.46, 0.57, 0.57, 0.62, 0.50, 0.46, 0.63, 0.59, 0.63, 0.61, 0.51, 0.51, 0.64, 0.55, 0.59, 0.64, 0.60, 0.54, 0.56, 0.45, 0.58, 0.63, 0.46, 0.55, 0.64, 0.61, 0.47, 0.51, 0.61, 0.59, 0.53, 0.47, 0.57, 0.46, 0.59, 0.50, 0.52, 0.57, 0.45, 0.62, 0.46, 0.52, 0.52, 0.57, 0.58, 0.54, 0.57, 0.56, 0.50, 0.59, 0.51, 0.57, 0.59, 0.45, 0.64, 0.63, 0.63, 0.57, 0.61, 0.52, 0.51, 0.54, 0.62, 0.63, 0.60, 0.47, 0.49);
            String weights[] = ObjWeight.Generate(N);
            //Generation of Hight array
            int hights[] = new int[N];
            for(int i=0; i<N; i++)
                  hights[i] = r.nextInt(45) + 140;
            //Generation of Kidney array
            nRandomizer ObjKidney = new nRandomizer();
            ObjKidney.setItems("Weak", "Normal");
            ObjKidney.setPercentages(7.7,92.3);
            String kidneys[] = ObjKidney.Generate(N);
            //Generation of Liver array
            nRandomizer ObjLiver = new nRandomizer();
            ObjLiver.setItems("Weak", "Normal");
            ObjLiver.setPercentages(7.1,92.9);
            String livers[] = ObjLiver.Generate(N);
            //Generation of Kardio array
            nRandomizer ObjKardio = new nRandomizer();
            ObjKardio.setItems("Weak", "Normal");
            ObjKardio.setPercentages(12.03,87.97);
            String kardios[] = ObjKardio.Generate(N);
            //Generation of Lungs array
            nRandomizer ObjLungs = new nRandomizer();
            ObjLungs.setItems("Weak", "Normal");
            ObjLungs.setPercentages(12.50,87.50);
            String lungs[] = ObjLungs.Generate(N);
            //Generation of Diabates array
            nRandomizer ObjDia = new nRandomizer();
            ObjDia.setItems("Low", "Normal", "High", "Very High");
            ObjDia.setPercentages(24.67,52.45,17.33,5.55);
            String dias[] = ObjDia.Generate(N);
            //Generation of Blood Pressure 
            nRandomizer ObjBp = new nRandomizer();
            ObjBp.setItems("Low", "Normal", "High", "Very High");
            ObjBp.setPercentages(24.67,52.45,17.33,5.55);
            String bps[] = ObjBp.Generate(N);
            
            /////////////////////////PUMONARY TUBRECULOSIS TABLE
            
            //Generaton of Infection array
            nRandomizer ObjPTInfection = new nRandomizer();
            ObjPTInfection.setItems("Not Affected", "Affected");
            ObjPTInfection.setPercentages(99.55,0.45);
            String PTInfections[] = ObjPTInfection.Generate(N);
            //Generaton of Period array
            String PTPeriods[] = new String[N];
            for(int i=0; i<PTInfections.length; i++){
                  if(PTInfections[i].equals("Affected"))
                        if(r.nextInt(1000)<915)
                              PTPeriods[i] = "Recovered";
                        else {
                              if(r.nextInt(1000)<112)
                                    PTPeriods[i] = "Still Suffering";
                              else 
                                    PTPeriods[i] = "Died";
           }     }
           for(int i=0; i<PTInfections.length; i++)
                  if(PTInfections[i].equals("Affected"))
                        if(r.nextInt(1000)>657)
                              lungs[i] = "Weak";

            /////////////////////////COVID 19 TABLE         
            
            //Generaton of Infection array
            nRandomizer ObjCovid19Infection = new nRandomizer();
            ObjCovid19Infection.setItems("Not Tested", "Not Affected", "Affected");
            ObjCovid19Infection.setPercentages(96.0, 3.66, 0.3125);
            String covid19Infections[] = ObjCovid19Infection.Generate(N);
            //Generation of Period array
            String covid19Period[] = new String[N];
            int totalCovidAffected = 0;
            for(int i=0; i<covid19Infections.length; i++)
                  if(covid19Infections[i].equals("Affected"))
                        totalCovidAffected++;
            nRandomizer ObjCovidAffected = new nRandomizer();
            ObjCovidAffected.setItems("Still suffering", "Died", "Recovered");
            ObjCovidAffected.setPercentages(19.6,1.4,79.0);
            String CovidAffected[] = ObjCovidAffected.Generate(N);
            int captr = -1;
            for(int i=0; i<covid19Period.length; i++)
                  if(covid19Infections[i].equals("Affected"))
                        covid19Period[i] = CovidAffected[++captr];
//            int cd = 0;
//            for(int i=0; i<covid19Period.length; i++)
//                  if(covid19Period[i]!=null && covid19Period[i].equals("Died"))
//                        cd++;
//            System.out.println("++++++++"+cd);
            for(int i=0; i<covid19Infections.length; i++)
                  if(covid19Period[i]!=null && covid19Period[i].equals("Died") && lungs[i].equals("Normal") && r.nextInt(100)>60)
                        covid19Period[i] = "Recovered";
                  else if(covid19Infections[i].equals("Affected") && lungs[i].equals("Weak") && r.nextInt(100)>50)
                         covid19Period[i] = "Died";     
//            cd = 0;
//            for(int i=0; i<covid19Period.length; i++)
//                  if(covid19Period[i]!=null && covid19Period[i].equals("Died"))
//                        cd++;
//            System.out.println("++++++++"+cd);
            
            /////////////////////////HIV TABLE
            
            //Generaton of Infection array
            nRandomizer ObjHivInfection = new nRandomizer();
            ObjHivInfection.setItems("Not Affected", "Affected");
            ObjHivInfection.setPercentages(99.6,0.4);
            String HivInfections[] = ObjHivInfection.Generate(N);
            //Generaton of Transmission array
            String HivTransmissions[] = new String[N];
            for(int i=0; i<HivInfections.length; i++){
                  if(HivInfections[i].equals("Affected"))
                        if(r.nextInt(1000)>222)
                              HivTransmissions[i] = "Sexually Transmitted";
                        else 
                              HivTransmissions[i] = "Other Way";
            }
            //Generaton of Period array
            String HivPeriods[] = new String[N];
            for(int i=0; i<HivInfections.length; i++){
                  if(HivInfections[i].equals("Affected"))
                        if(r.nextInt(1000)<658)
                              HivPeriods[i] = "Died";
                        else 
                              HivPeriods[i] = "Still Suffering";
            }
            
            /////////////////////////DENGUE TABLE
            
            //Generaton of Infection array
            nRandomizer ObjDengueInfection = new nRandomizer();
            ObjDengueInfection.setItems("Not Affected", "Affected");
            ObjDengueInfection.setPercentages(99.3,0.7);
            String DengueInfections[] = ObjDengueInfection.Generate(N);
            //Generaton of Period array
            String DenguePeriods[] = new String[N];
            for(int i=0; i<DengueInfections.length; i++){
                  if(DengueInfections[i].equals("Affected"))
                        if(r.nextInt(1000)<955)
                              DenguePeriods[i] = "Recovered";
                        else {
                              if(r.nextInt(1000)<312)
                                    DenguePeriods[i] = "Still Suffering";
                              else 
                                    DenguePeriods[i] = "Died";
           }     }
           for(int i=0; i<DengueInfections.length; i++)
                 if(DenguePeriods[i] != null)
                if(DenguePeriods[i].equals("Affected"))
                      if(r.nextInt(1000)>950)
                            livers[i] = "Weak";

            /////////////////////////HB TABLE
            
            //Generaton of Infection array
            nRandomizer ObjHBInfection = new nRandomizer();
            ObjHBInfection.setItems("Not Affected", "Affected");
            ObjHBInfection.setPercentages(98.88,1.22);
            String HBInfections[] = ObjHBInfection.Generate(N);
            //Generaton of Period array
            String HBPeriods[] = new String[N];
            for(int i=0; i<HBInfections.length; i++){
                  if(HBInfections[i].equals("Affected"))
                        if(r.nextInt(1000)<983)
                              HBPeriods[i] = "Recovered";
                        else {
                              if(r.nextInt(1000)<294)
                                    HBPeriods[i] = "Still Suffering";
                              else 
                                    HBPeriods[i] = "Died";
           }     }
           for(int i=0; i<HBInfections.length; i++)
                 if(HBInfections[i].equals("Affected"))
                       if(r.nextInt(1000)>832)
                             livers[i] = "Weak";

            /////////////////////////CHOLERA TABLE
            
            //Generaton of Infection array
            nRandomizer ObjCholeraInfection = new nRandomizer();
            ObjCholeraInfection.setItems("Not Affected", "Affected");
            ObjCholeraInfection.setPercentages(99.25,0.75);
            String CholeraInfections[] = ObjCholeraInfection.Generate(N);
            //Generaton of Period array
            String CholeraPeriods[] = new String[N];
            for(int i=0; i<CholeraInfections.length; i++){
                  if(CholeraInfections[i].equals("Affected"))
                        if(r.nextInt(1000)<986)
                              CholeraPeriods[i] = "Recovered";
                        else {
                              if(r.nextInt(1000)<121)
                                   CholeraPeriods[i] = "Still Suffering";
                              else 
                                    CholeraPeriods[i] = "Died";
           }     }
           for(int i=0; i<HBInfections.length; i++)
                  if(HBInfections[i].equals("Affected"))
                        if(r.nextInt(1000)>518)
                              kidneys[i] = "Weak";
            
           
System.out.println("\n\nGENERATING FILES...");


//Generating File
            FFiles.createFolder("D:\\Data");
            FFiles.delete("D:\\Data");
            FFiles.createFolder("D:\\Data");
            int div = 100000;
            int requiredFolder = (N)/div + 1;
            for(int i = 1; i<=requiredFolder; i++){
                  FFiles.create("D:\\Data\\Person "+i+".txt");
                  FFiles.create("D:\\Data\\Body_condition "+i+".txt");
                  FFiles.create("D:\\Data\\Covid19 "+i+".txt");
                  FFiles.create("D:\\Data\\Hiv "+i+".txt");
                  FFiles.create("D:\\Data\\Dengue "+i+".txt");
                  FFiles.create("D:\\Data\\Hepatitis_B "+i+".txt");
                  FFiles.create("D:\\Data\\Cholera "+i+".txt");
                  FFiles.create("D:\\Data\\Pulmonary_Tuberculosis "+i+".txt");
            }
            String Data = "";
            System.out.println("    Making person table...");
            //Files for person table
            for(int ii=1; ii<=requiredFolder; ii++){
                  Data = "";
                  Data += "INSERT INTO Person(Name, Gender, Age, Region) VALUES \n";
                  for(int i=ii*div-div; i<ii*div; i++){
                        if(i>=N) break;
                        Data += "( '" + names[i] + "', '" + genders[i] + "', " + ages[i] + ", '" + regions[i] + "' ),\n";
                        if((i+2)%100 == 0){
                                    FFiles.addTo("D:\\Data\\Person "+(ii*1)+ ".txt", Data);
                                    Data = "";
            }     }     }
            
            System.out.println("    Complete.\n    Making bodycontition table...");
            //Files for Body_condition
            for(int ii=1; ii<=requiredFolder; ii++){
                  Data = "";
                  Data += "INSERT INTO Body_Condition(Blood_Group, Weight, Height, Kidney, Liver, Lungs, Cardiography, Blood_Pressure, Diabetes) VALUES \n";
                  for(int i=ii*div-div; i<ii*div; i++){
                        if(i>=N) break;
                        Data += "( '" + bloods[i] + "', " + weights[i] + ", " + hights[i] + ", '" + kidneys[i] + "', '" + livers[i] + "', '" + lungs[i] + "', '" + kardios[i] + "', '" + bps[i] + "', '" + dias[i] + "' ),\n";
                        if((i+2)%100 == 0){
                                    FFiles.addTo("D:\\Data\\Body_Condition "+(ii*1)+ ".txt", Data);
                                    Data = "";
            }     }     }
            
            System.out.println("    Complete.\n    Making covid19 table...");
            //Files for Covid19
            for(int ii=1; ii<=requiredFolder; ii++){
                  Data = "";
                  Data += "INSERT INTO Covid19(Infection, Period) VALUES \n";
                  for(int i=ii*div-div; i<ii*div; i++){
                        if(i>=N) break;
                        Data += "( '" + covid19Infections[i] + "', '" + covid19Period[i] + "' ),\n";
                        if((i+2)%100 == 0){
                                    FFiles.addTo("D:\\Data\\Covid19 "+(ii*1)+ ".txt", Data);
                                    Data = "";
            }     }     }
            
            System.out.println("    Complete.\n    Making hiv table...");
            //Files for Hiv
            for(int ii=1; ii<=requiredFolder; ii++){
                  Data = "";
                  Data += "INSERT INTO HIV(Infection, Transmission, Period) VALUES \n";
                  for(int i=ii*div-div; i<ii*div; i++){
                        if(i>=N) break;
                        Data += "( '" + HivInfections[i] + "', '" + HivTransmissions[i] + "', '" + HivPeriods[i] + "' ),\n";
                        if((i+2)%100 == 0){
                                    FFiles.addTo("D:\\Data\\Hiv "+(ii*1)+ ".txt", Data);
                                    Data = "";
            }     }     }
            
            System.out.println("    Complete.\n    Making dengue table...");
            //Files for Dengue
            for(int ii=1; ii<=requiredFolder; ii++){
                  Data = "";
                  Data += "INSERT INTO Dengue(Infection, Period) VALUES \n";
                  for(int i=ii*div-div; i<ii*div; i++){
                        if(i>=N) break;
                        Data += "( '" + DengueInfections[i] + "', '" + DenguePeriods[i] + "' ),\n";
                        if((i+2)%100 == 0){
                                    FFiles.addTo("D:\\Data\\Dengue "+(ii*1)+ ".txt", Data);
                                    Data = "";
            }     }     }
            
            System.out.println("    Complete.\n    Making hepatitisB table...");
            //Files for HB
            for(int ii=1; ii<=requiredFolder; ii++){
                  Data = "";
                  Data += "INSERT INTO Hepatitis_B(Infection, Period) VALUES \n";
                  for(int i=ii*div-div; i<ii*div; i++){
                        if(i>=N) break;
                        Data += "( '" + HBInfections[i] + "', '" + HBPeriods[i] + "' ),\n";
                        if((i+2)%100 == 0){
                                    FFiles.addTo("D:\\Data\\Hepatitis_B "+(ii*1)+ ".txt", Data);
                                    Data = "";
            }     }     }
            
            System.out.println("    Complete.\n    Making cholera table...");
            //Files for Cholera
            for(int ii=1; ii<=requiredFolder; ii++){
                  Data = "";
                  Data += "INSERT INTO Cholera(Infection, Period) VALUES \n";
                  for(int i=ii*div-div; i<ii*div; i++){
                        if(i>=N) break;
                        Data += "( '" + CholeraInfections[i] + "', '" + CholeraPeriods[i] + "' ),\n";
                        if((i+2)%100 == 0){
                                    FFiles.addTo("D:\\Data\\Cholera "+(ii*1)+ ".txt", Data);
                                    Data = "";
            }     }     }
            
            System.out.println("    Complete.\n    Making pulmonary_tuberculosis table...");
            //Files for Pulmonary_Tuberculosis
            for(int ii=1; ii<=requiredFolder; ii++){
                  Data = "";
                  Data += "INSERT INTO Pulmonary_Tuberculosis(Infection, Period) VALUES \n";
                  for(int i=ii*div-div; i<ii*div; i++){
                        if(i>=N) break;
                        Data += "( '" + PTInfections[i] + "', '" + PTPeriods[i] + "' ),\n";
                        if((i+2)%100 == 0){
                                    FFiles.addTo("D:\\Data\\Pulmonary_Tuberculosis "+(ii*1)+ ".txt", Data);
                                    Data = "";
            }     }     }
            
                
            
      }
}




//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////





class BinaryRandomizer {
      String item1, item2;
      Double percentage1, percentage2;
      BinaryRandomizer(String i1, String i2, double p1){
            item1 = i1;       item2 = i2;
            percentage1 = p1;       percentage2 = 100-p1;
      }
      public String[] generate(int numberOfItems){
            Random r = new Random();
            String items[] = new String[numberOfItems];
            Double pi1=0.0, pi2=0.0, n = 0.0, n1 = 0.0, n2 = 0.0;
            for(int i = 0; i<numberOfItems; i++){
                  if(r.nextBoolean() && pi1<= percentage1){
                        n1++;
                        items[i] = item1;
                  }
                  else {
                        if(pi2 <= percentage2){
                              items[i] = item2;
                              n2++;
                        }
                        else {
                              items[i] = item1;
                              n1++;
                        }
                  }
                  n++;
                  pi1 = (n1/n) * 100;
                  pi2 = (n2/n) * 100;
            }
            for(int i=0; i<items.length; i++){
                  int pos1 = r.nextInt(numberOfItems);
                  int pos2 = r.nextInt(numberOfItems);
                  String x = items[pos1];
                  items[pos1] = items[pos2];
                  items[pos2] = x;
            }
            return items;
      }
}



//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



class nRandomizer {

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




//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




class Names {
      public static String[][] Generate(Integer n){
            long time = System.currentTimeMillis();
            
            System.out.println("GENERATING "+n+" NAMES");
            
            System.out.println("      Compliting initial steps...");
            
            String BoyMuslimFname[] = getNameArray("D:\\DG\\Names\\BoyMuslimFname.txt");
            String BoyMuslimLname[] = getNameArray("D:\\DG\\Names\\BoyMuslimLname.txt");
            String GirlMuslimFname[] = getNameArray("D:\\DG\\Names\\GirlMuslimFname.txt");
            String GirlMuslimLname[] = getNameArray("D:\\DG\\Names\\GirlMuslimLname.txt");
            
            String BoyHinduFname[] = getNameArray("D:\\DG\\Names\\BoyHinduFname.txt");
            String BoyHinduLname[] = getNameArray("D:\\DG\\Names\\BoyHinduLname.txt");
            String GirlHinduFname[] = getNameArray("D:\\DG\\Names\\GirlHinduFname.txt");
            String GirlHinduLname[] = getNameArray("D:\\DG\\Names\\GirlHinduLname.txt");
            
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
                  names[++p][0] = GirlHinduFname[R.nextInt(GirlHinduFname.length-1)] + " " + GirlHinduLname[R.nextInt(GirlHinduLname.length-1)];
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





//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




class FFiles {

	/* @author: SzYr FEEHAM
	 * There are 3 types of methods with different operations:
	 * 	
	 * >>Basic
	 * 		createFolder() - call with path as parameter to create a folder.
	 * 		createFile() - call with path and format as parameter to create a file.
	 * 		ifExists() - check if a folder or files exists or not. 
	 * 		rename() - call with path and new name as parameter to rename a file or folder.
	 * 		delete() - call with path as parameter to delete a file or folder.
	 * 	
	 * >>CopyPaste
	 * 		copy() - copy a folder (it doesn't paste automatically, must call paste after it.)
	 * 		cut() - cut a folder (it doesn't paste automatically, must call paste after it.)
	 * 		paste() - call with path as parameter where you want to paste the copied or cutted file/folder.
	 * 
	 * >>Use
	 * 		read() - read String data from a file.
	 * 		changeData() - replace files' existing data with some new data.
	 * 		addTo() - add some data after files' already existing data.
	 * 		createAndWrite() - create a file and put some data into it in a single call.
	 */
	
	private static String f1;
	private static boolean del=false;
	
	///////////////////////////////////////////
	
	//Create folder
	public static boolean createFolder(String filePath) {
		if(new File(filePath).mkdir())
			return true;
		else return false;
	}
	
	//Create a file with any name and format.
	public static int create(String fileNameWithPath) {
		try 
		{
			boolean fvar = new File(fileNameWithPath).createNewFile();
			if (fvar) return 1; //returns 1, if file operation was successful.
			else return -1; //returns -1, if there was an existing file with that name.
		} 
		catch(IOException e) { return 0; /*returns 0, if there is an error.*/ }
	}
	
	//Check if a File or path exists or not.
	public static boolean ifExists(String Path) {
		if(new File(Path).exists())
			return true;
		else return false;
	}
	
	//Rename file
	public static boolean rename(String Path, String newName) {
		String Path2="";
		for(int i=Path.length()-1; i>0; i--) {
			if(Path.charAt(i)=='\\') {
				if(Path.substring(i+1,Path.length()).toLowerCase().equals(newName.toLowerCase()))
					return false;
				Path2 = Path.substring(0,i)+"\\"+newName;
				break;
			}
		}
		File f = new File(Path);
		if(!f.exists()) 
			return false;
		if(f.isFile()) 
			return f.renameTo(new File(Path2));
		else {
			File f2 = new File(Path2);
			f2.mkdir();
			copy(Path);
			paste(Path2);
			delete(Path);
		}
		return true;
	}

	//Delete a file.
	public static boolean delete(String filePath) {
		File F = new File(filePath);
		if(F.isFile()) {
			if(F.delete())
				return true;
			else return false;
		}
		else {
			myRecursiveDelete(F);
			return true;
		}
	}
	private static void myRecursiveDelete(File F) {
		String [] entries = F.list();
		for(String item: entries) {
			File toDelete = new File(F.getPath(),item);
			toDelete.delete();
			if(toDelete.exists()) {
				myRecursiveDelete(toDelete);
				toDelete.delete();
			}
		}
		F.delete();
	}
	
	///////////////////////////////////////////
	
	//Copy a file
	public static void copy(String sourcePath) {
		f1 = sourcePath;
	}
	
	//Cut a file.
	public static void cut(String sourcePath) {
		f1 = sourcePath;
		del=true;
	}
	
	//Paste the copied file.
	public static boolean paste(String destination) {
		String source = f1;
		File src = new File(source);
		File dest = new File(destination);
		if(!src.exists()) return false;
		   if(!src.isFile()){
		    	try {
		    		copyFolder(src, dest);
		    	} 
		    		catch(IOException e) { return false; }
		    	}
		    else {
		    	for(int i=source.length()-1; i>0; i--)    
		    		if(source.charAt(i)=='\\') {
		    			destination = destination + source.substring(i,source.length());
		    			break;
		    		}
		    	dest = new File(destination);
		    	try {
		    		InputStream in = new FileInputStream(src);
		        	OutputStream out = new FileOutputStream(dest);
		        	byte[] buffer = new byte[1024];
		        	int length;
		        	while ((length = in.read(buffer)) > 0)
		        	    out.write(buffer, 0, length);
		        	in.close();
		        	out.close();
		    	}
		    	catch(IOException e) { return false; }
		    }
		if(del){
			delete(f1);
			del=false;
		}
		return true;
	}
	private static void copyFolder(File src, File dest) throws IOException{
	    	if(src.isDirectory()){
	    		if(!dest.exists()){
	    		   dest.mkdir();
	    		}
	    		String files[] = src.list();
	    		for (String file : files) {
	    		   File srcFile = new File(src, file);
	    		   File destFile = new File(dest, file);
	    		   copyFolder(srcFile,destFile);
	    		}
	    	}
	    	else{
	    		InputStream in = new FileInputStream(src);
	    	    OutputStream out = new FileOutputStream(dest);
	    	    byte[] buffer = new byte[1024];
	    	    int length;
	    	    while ((length = in.read(buffer)) > 0)
	    	    	out.write(buffer, 0, length);
	    	    in.close();
	    	    out.close();
	    	}
	    }

	///////////////////////////////////////////
	
	//Read a file from any location.
	public static String read(String filePath) {
		try 
		{
			return new String(Files.readAllBytes(Paths.get(filePath)));
		} 
		catch(IOException e) { return null; }
	}
	
	//Replace a files all data by saving new data.
	public static boolean changeData(String filePath, String data) {
		try 
		{
			Files.write(Paths.get(filePath), data.getBytes());
			return true;
		} 
		catch(IOException e) { return false; }
	}
	
	//Add some new data with files previously existing data.
	public static boolean addTo(String filePath, String data) {
		try 
		{
			Files.write(Paths.get(filePath), data.getBytes(), StandardOpenOption.APPEND);
			return true;
		} 
		catch(IOException e) { return false; }
	}
	//Crate a file and write data in it.
	public static boolean createAndWrite(String filePath, String data) {
		create(filePath);
		return changeData(filePath, data);
	}
}