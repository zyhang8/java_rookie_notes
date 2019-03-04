
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example8_22;
import java.util.regex.*;
public class Example8_22 {
   public static void main(String args[ ]) { 
      String s = "市话76.8元,长途:167.38元,短信12.68"; 
      String regex = "[0123456789.]+";    //匹配数字序列 
      Pattern p =Pattern.compile(regex);  //模式对象
      Matcher m =p.matcher(s); 	          //匹配对象
      double sum =0;
      while(m.find()) {
         String item = m.group();
         System.out.println(item);
         sum = sum+Double.parseDouble(item);
      } 
      System.out.println("账单总价格:"+sum);
   }
}
