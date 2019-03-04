
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example3_9;
import java.util.*;
public class Example3_9 {
    public static void main (String args[ ]){
      Scanner reader=new Scanner(System.in);
      double sum=0;
       int m=0;
       while(reader.hasNextDouble()){
           double x=reader.nextDouble();
           m=m+1;
           sum=sum+x;
       }
       System.out.printf("%d个数的和为%f\n",m,sum);
       System.out.printf("%d个数的平均值是%f\n",m,sum/m); 
    }
}
