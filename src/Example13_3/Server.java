
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example13_3;//服务器类
import java.io.*;
import java.net.*;
public class Server {
   public static void main(String args[]) {
      String [] answer ={"南非","进入世界杯了","哈哈...问题真逗!"};
      ServerSocket serverForClient=null;
      Socket socketOnServer=null;
      DataOutputStream out=null;
      DataInputStream  in=null;
      try { serverForClient = new ServerSocket(2010);//创建ServerSocket类监听2010端口
      }
      catch(IOException e1) {
            System.out.println(e1);
      } 
      try{ System.out.println("等待客户呼叫");
           socketOnServer = serverForClient.accept(); //堵塞状态，除非有客户呼叫
           out=new DataOutputStream(socketOnServer.getOutputStream());//out用于控制输出流(发送到客户端)
           in=new DataInputStream(socketOnServer.getInputStream());//in用于控制输入流(从客户端输出)
           for(int i=0;i<answer.length;i++) {
              String s=in.readUTF(); // in读取信息，堵塞状态
              System.out.println("服务器收到客户的提问:"+s);
              out.writeUTF(answer[i]);
              Thread.sleep(500);
           }
      }
      catch(Exception e) {
          System.out.println("客户已断开"+e);
      }
   }
}
