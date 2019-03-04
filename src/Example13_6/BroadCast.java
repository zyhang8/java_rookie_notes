
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example13_6;
import java.net.*;
public class BroadCast  { 
   String s="国庆放假时间是9月30日"; 
   int port=5858;                                    //组播的端口 
   InetAddress group=null;                          //组播组的地址
   MulticastSocket socket=null;                     //多点广播套接字  
   BroadCast() { 
      try { 
         group=InetAddress.getByName("239.255.8.0");//设置广播组的地址为239.255.8.0
         socket=new MulticastSocket(port);         //多点广播套接字将在port端口广播
         socket.setTimeToLive(1); //多点广播套接字发送数据报范围为本地网络
         socket.joinGroup(group); //加入group后,socket发送的数据报被group中的成员接收到
      }                                 
      catch(Exception e) {
         System.out.println("Error: "+ e);          
      }
   }
   public void play() {
      while(true) {
        try{   DatagramPacket packet=null;        //待广播的数据包
               byte data[]=s.getBytes(); 
               packet=new DatagramPacket(data,data.length,group,port); 
               System.out.println(new String(data)); 
               socket.send(packet);             //广播数据包
               Thread.sleep(2000);
        }
        catch(Exception e) {
               System.out.println("Error: "+ e);          
        }
      }
   }
   public static void main(String args[]) {
      new BroadCast().play();
   }
}

