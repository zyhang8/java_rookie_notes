
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example10_16;
import java.io.*;
import java.util.*;
public class Example10_16 {
   public static void main(String args[]) {
      File file = new File("student.txt");
      Scanner sc=null;
      int count=0;
      double sum=0;
      try { double score=0;
            sc = new Scanner(file);
            sc.useDelimiter("[^0123456789.]+"); 
            while(sc.hasNextDouble()){
                score=sc.nextDouble();
                count++;
                sum=sum+score;
                System.out.println(score); 
            }
            double aver=sum/count;
            System.out.println("平均成绩:"+aver);
      }
      catch(Exception exp){
         System.out.println(exp); 
      }
   }
}
