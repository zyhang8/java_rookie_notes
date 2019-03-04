
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example15_6;
import java.util.*;
public class Example15_6 {
   public static void main(String args[]) {
      Stack<Integer> stack=new Stack<Integer>();
      stack.push(new Integer(1)); 
      stack.push(new Integer(1));
      int k=1;
      while(k<=10) {
        for(int i=1;i<=2;i++) {
          Integer F1=stack.pop();
          int f1=F1.intValue();
          Integer F2=stack.pop();
          int f2=F2.intValue();
          Integer temp=new Integer(f1+f2);
          System.out.println(""+temp.toString()); 
          stack.push(temp);
          stack.push(F2);
          k++;
        }
      } 
   }
}


