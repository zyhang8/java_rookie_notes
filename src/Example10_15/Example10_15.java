
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example10_15;
import java.io.*;
import java.util.*;
public class Example10_15 {
   public static void main(String args[]) {
      File file = new File("cost.txt");
      Scanner sc=null;
      int sum=0;
      try { sc = new Scanner(file);
            while(sc.hasNext()){
               try{
                    int price=sc.nextInt();
                    sum=sum+price;
                    System.out.println(price); 
               } 
               catch(InputMismatchException exp){
                    String t=sc.next();
               }   
            }
            System.out.println("Total Cost:"+sum+" dollar");
      }
      catch(Exception exp){
         System.out.println(exp); 
      }
   }
}
