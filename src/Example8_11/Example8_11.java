
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example8_11;
import java.util.Scanner; 
public class Example8_11 {
   public static void main (String args[ ]) {
      System.out.println("一行文本:");
      Scanner reader=new Scanner(System.in);
      String str = reader.nextLine();
  //regex匹配由空格、数字和!"#$%&'()*+,-./:;<=>?@[\]^_`{|}~组成的字符序列
      String regex = "[\\s\\d\\p{Punct}]+"; 
      String words[] = str.split(regex); 
      for(int i=0;i<words.length;i++){
         int m = i+1;
         System.out.println("单词"+m+":"+words[i]);
      }   
   }
}



