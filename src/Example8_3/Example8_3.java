
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example8_3;
import java.util.*;
public class Example8_3 {
    public static void main(String args[]) {
       String [] a={"melon","apple","pear","banana"};
       String [] b={"西瓜","苹果","梨","香蕉"};
       System.out.println("使用SortString类的方法按字典序排列数组a:");
       SortString.sort(a);
       for(int i=0;i<a.length;i++) {
          System.out.print("  "+a[i]);
       }
       System.out.println("");
       System.out.println("使用类库中的Arrays类，按字典序排列数组b:"); 
       Arrays.sort(b);
       for(int i=0;i<b.length;i++) {
          System.out.print("  "+b[i]);
       }
    }
}
