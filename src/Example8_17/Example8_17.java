
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example8_17;
import java.math.*;
public class Example8_17 {
  public static void main(String args[]) {
      double a = 5.0;
      double st = Math.sqrt(a);
      System.out.println(a+"的平方根:"+st);
      System.out.printf("大于等于%f的最小整数%d\n",5.2,(int)Math.ceil(5.2));
      System.out.printf("小于等于%f的最大整数%d\n",-5.2,(int)Math.floor(-5.2));
      System.out.printf("%f四舍五入的整数:%d\n",12.9,Math.round(12.9));
      System.out.printf("%f四舍五入的整数:%d\n",-12.6,Math.round(-12.6));
      BigInteger result = new BigInteger("0"),
                 one = new BigInteger("123456789"),
                 two = new BigInteger("987654321");
       result = one.add(two);
       System.out.println("和:"+result);
       result=one.multiply(two);
       System.out.println("积:"+result);
    }
}
