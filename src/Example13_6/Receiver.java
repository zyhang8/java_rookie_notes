
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example13_6;
import java.net.*;
import java.util.*;
public class Receiver  {
   public static void main(String args[]) {
      int port = 5858;                               //组播的端口
      InetAddress group=null;                        //组播组的地址
      MulticastSocket socket=null;                   //多点广播套接字 
      try{
          group=InetAddress.getByName("239.255.8.0");//设置广播组的地址为239.255.8.0
          socket=new MulticastSocket(port);    //多点广播套接字将在port端口广播
          socket.joinGroup(group); //加入group
      }                          
      catch(Exception e){} 
      while(true) {   
         byte data[]=new byte[8192];
         DatagramPacket packet=null;
         packet=new DatagramPacket(data,data.length,group,port); //待接收的数据包
         try {  socket.receive(packet);
                String message=new String(packet.getData(),0,packet.getLength());
                System.out.println("接收的内容:\n"+message);
         }
         catch(Exception e) {}
      }
   }
}
