
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example8_19;
import java.text.*;
public class Example8_19 {
   public static void main(String args[]){
      int n= 12356789;
      System.out.println("整数"+n+"按千分组(带正号):");
      String s=String.format("%,+d",n);
      System.out.println(s);
      double number = 98765.6789;
      System.out.println(number+"格式化为整数7位，小数3位:");
      s=String.format("%011.3f",number);
      System.out.println(s);
   }
}
