
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example8_13;
import java.util.*;
public class GetPrice {
   public static double givePriceSum(String cost) {
	  //扫描类,负责接收数据流
      Scanner scanner = new Scanner(cost);
      //不接受'0123456789.'字符,贪婪匹配至少一个字符.
      scanner.useDelimiter("[^0123456789.]+"); //scanner设置分隔标记
      double sum=0;//总数
      while(scanner.hasNext()){//遍历匹配对象分割过的数据流
         try{  double price = scanner.nextDouble();//尝试输出数据为浮点数
               sum = sum+price;
         } 
         catch(InputMismatchException exp){//异常捕获
               String t = scanner.next();//读掉数据流中非浮点数部分
         }   
      }
      return sum;
   }
}
