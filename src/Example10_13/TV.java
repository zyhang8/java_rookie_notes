
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example10_13;
import java.io.*;
public class TV implements Serializable{
   String name;
   int price; 
   public void setName(String s) {
      name=s;
   }
   public void setPrice(int n) {
      price=n;
   }
   public String getName() {
      return name;
   }
   public int getPrice() {
      return price;
   }
}