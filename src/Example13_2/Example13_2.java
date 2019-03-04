
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example13_2;
import java.net.*; 
public class Example13_2 {
   public static void main(String args[]) {
      try{  InetAddress address_1=InetAddress.getByName("www.sina.com.cn");
           System.out.println(address_1.toString()); 
           InetAddress address_2=InetAddress.getByName("166.111.222.3");
           System.out.println(address_2.toString());
      }
      catch(UnknownHostException e) {
           System.out.println("无法找到 www.sina.com.cn");
      } 
   }
}


