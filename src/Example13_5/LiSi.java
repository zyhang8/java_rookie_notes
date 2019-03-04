
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example13_5;
import java.net.*;
import java.util.*;
public class LiSi  {
   public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      Thread readData ; 
      ReceiveLetterForLi receiver = new ReceiveLetterForLi();
      try{  readData = new Thread(receiver);
            readData.start();           //负责接收信息的线程 
            byte [] buffer=new byte[1];
            InetAddress address=InetAddress.getByName("127.0.0.1");
            DatagramPacket dataPack=
            new DatagramPacket(buffer,buffer.length, address,888);
            DatagramSocket postman=new DatagramSocket();
            System.out.print("输入发送给张三的信息:");
            while(scanner.hasNext()) {
                String mess = scanner.nextLine();
                buffer=mess.getBytes();
                if(mess.length()==0) 
                    System.exit(0);
                buffer=mess.getBytes();
                dataPack.setData(buffer);
                postman.send(dataPack);  
                System.out.print("继续输入发送给张三的信息:");
            }
       }
       catch(Exception e) {
            System.out.println(e);
       }
   }
}
