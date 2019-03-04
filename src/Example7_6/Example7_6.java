
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example7_6;
import java.util.Scanner;
public class Example7_6 {
  public static void main (String args[ ]) {
       int [] score={-120,98,89,120,99};
       int sum=0;
       for(int number:score) {
          assert number>0:"负数不能是成绩";
          sum=sum+number;
       } 
       System.out.println("总成绩:"+sum);    
   }
}
