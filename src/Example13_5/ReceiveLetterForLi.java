
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example13_5;
import java.net.*;
public class ReceiveLetterForLi implements Runnable {
   public void run() {
      DatagramPacket pack=null;
      DatagramSocket postman=null;
      byte data[]=new byte[8192];
      try{  pack=new DatagramPacket(data,data.length);
            postman = new DatagramSocket(666);
      }
      catch(Exception e){} 
      while(true) {  
        if(postman==null) break;
        else
          try{ postman.receive(pack); 
               String message=new String(pack.getData(),0,pack.getLength());
               System.out.printf("%25s\n","收到:"+message);
          }
          catch(Exception e){}
      } 
   }
}
