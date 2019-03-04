
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example13_1;
import java.net.*;
import java.io.*;
public class Look implements Runnable {
   URL url;
   public void setURL(URL url) {
      this.url=url;
   }
   public void run() {
      try { 
        InputStream in = url.openStream();//输入流对象
        byte [] b = new byte[1024];//字节数组
        int n=-1;//记录读取字节数
        while((n=in.read(b))!=-1) {
           String str = new String(b,0,n);//将第0到n个字节内的数据转化为字符串
           System.out.print(str);//输出
        }
      }
      catch(IOException exp){}//暴力处理,应避免
   }
}