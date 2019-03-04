
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example4_24;
import java.util.Scanner;
public class InputScore {
   DelScore del ;
   InputScore(DelScore del) {
       this.del = del;
   }
   public void inputScore() {
      System.out.println("请输入评委数");
      Scanner read=new Scanner(System.in);
      int count = read.nextInt();
      System.out.println("请输入各个评委的分数");
      double []a = new double[count];
      for(int i=0;i<count;i++) {
           a[i]=read.nextDouble();
      }
      del.doDelete(a);
   }
}
