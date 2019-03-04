
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example15_10;
import java.util.*;
public class Example15_10 {
   public static void main(String args[]) {
      ArrayList<Integer> list=new ArrayList<Integer>();
      for(int i=0;i<10;i++) {
         list.add(i);  //自动装箱,实际添加到list中的是new Integer(i)。
      }
      for(int k=list.size()-1;k>=0;k--) {
         int m=list.get(k);  //自动拆箱,获取Integer对象中的int型数据
         System.out.printf("%3d",m);
      }
   }
}
