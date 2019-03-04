
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example4_11;
import java.util.*;
public class Example4_11 {
   public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      int [] a={12,34,9,23,45,6,45,90,123,19,34};
      Arrays.sort(a);
      System.out.println(Arrays.toString(a));
      System.out.println("输入整数，程序判断该整数是否在数组中:");
      int number = scanner.nextInt();
      int index=Arrays.binarySearch(a,number);    
      if(index>=0)
         System.out.println(number+"和数组中索引为"+index+"的元素值相同");   
      else
         System.out.println(number+"不与数组中任何元素值相同"); 
    }
}
