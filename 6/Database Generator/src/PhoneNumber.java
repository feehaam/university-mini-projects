import java.util.Random;
public class PhoneNumber {
      public static void main(String args[]){
            Random r = new Random();
            Long arr [] = new Long[10000000];
            Long x = Long.parseLong("10000000");
            for(int i=0; i<arr.length; i++){
                  arr[i] = x+i;
            }
            System.out.println("Made array");
            int a;
            for(int i=0; i<arr.length-1; i++){
                  if(arr[i]<arr[i+1]){
                        a = r.nextInt(arr.length);
                        Long temp = arr[i];
                        arr[i] = arr[a];
                        arr[a] = temp;
                  }
            }
            for(int i=0; i<arr.length; i+=1000){
                  System.out.println(arr[i]);
            }
      }
}
//01757455523