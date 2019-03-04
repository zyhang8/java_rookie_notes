
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example8_5;
import java.util.Date;
public class Example8_5 {
   public static void main(String args[]) {
       Date date = new Date();
       System.out.println(date.toString());
       TV tv = new TV();
       tv.setPrice(5897.98);
       System.out.println(tv.toString());  
   }
}
