
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example8_9;
import java.util.Scanner;
public class Example8_9 {
  public static void main (String args[ ]) {
      String regex = "[a-zA-Z|0-9|_]+"; 
      Scanner scanner = new Scanner(System.in);
      String str = scanner.nextLine();
      if(str.matches(regex)) {
          System.out.println(str+"是英文字母,数字或下划线构成"); 
      }
      else {
          System.out.println(str+"中有非法字符"); 
      }
   }
}