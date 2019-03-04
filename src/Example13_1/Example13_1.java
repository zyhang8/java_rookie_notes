
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example13_1;
import java.net.*;
import java.io.*;
import java.util.*;
public class Example13_1 {
   public static void main(String args[]) {
       Scanner scanner;
       URL url;
       Thread readURL;
       Look look = new Look();
       System.out.println("输入URL资源,例如:http://www.yahoo.com");
       scanner = new Scanner(System.in);
       String source = scanner.nextLine();//source存的是url字符串
       try {  url = new URL(source);//用sourse实例化url类,url应是net下的类
              look.setURL(url);//url传给look类下的url
              readURL = new Thread(look);//实例化线程对象
              readURL.start();//开始线程
       }
       catch(Exception exp){
          System.out.println(exp);//如果出错,输出错误.ps:尽量避免,理应抛出.或者确定错误类型后分类处理.
       } 
   }
}

