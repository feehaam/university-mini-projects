import java.io.*;
import java.nio.file.*;
public class Start {
      public static void main(String[] args) {
            start();
      }
      
      static void start(){
            File file = new File(Data.dir+"CFNotes");
            file.mkdir();
            Fileop.Create(Data.dir+"CFNotes\\"+"Conlist.txt");
            Fileop.Create(Data.dir+"CFNotes\\"+"Type.txt");
            Fileop.Create(Data.dir+"CFNotes\\"+"Diff.txt");
            Fileop.Create(Data.dir+"CFNotes\\"+"Tag.txt");
            File f = new File(Data.dir+"CFNotes\\SpecialNotes");
            f.mkdir();
            f=new File(Data.dir+"CFNotes\\Resources");
            f.mkdir();
            Fileop.Create(Data.dir+"CFNotes\\SpecialNotes\\List.txt");
            Fileop.Create(Data.dir+"CFNotes\\SpecialNotes\\Count.txt");
            
            String s = Fileop.Read(Data.dir+"CFNotes\\"+"Conlist.txt");
            
            for(int i=0; i<s.length(); i++){
                  if(s.charAt(i)=='@'){
                        for(int j=i; j>=i; j++){
                              if(s.charAt(j)==';'){
                                    Data.addcon(s.substring(i+1, j));
                                    i=j;
                                    break;
                              }     }     }     }
            
            Note obj = new Note();
            obj.setmenu();
            obj.setVisible(true);
      }
}
//Its never done!!!!!!
//[THE END]