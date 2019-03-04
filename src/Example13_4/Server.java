
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example13_4;
import java.io.*;
import java.net.*;
import java.util.*;
public class Server {
   public static void main(String args[]) {
      ServerSocket server=null;
      ServerThread thread;
      Socket you=null;
      while(true) {
        try{  server=new ServerSocket(2010);
        }
        catch(IOException e1) { 
              System.out.println("正在监听"); //ServerSocket对象不能重复创建
        } 
        try{  System.out.println(" 等待客户呼叫");
              you=server.accept();
              System.out.println("客户的地址:"+you.getInetAddress());
        } 
        catch (IOException e) {
              System.out.println("正在等待客户");
        }
        if(you!=null) { 
              new ServerThread(you).start(); //为每个客户启动一个专门的线程  
        }
      }
   }
}
class ServerThread extends Thread {
   Socket socket;
   DataOutputStream out=null;
   DataInputStream  in=null;
   String s=null;
   ServerThread(Socket t) {
      socket=t;
      try {  out=new DataOutputStream(socket.getOutputStream());
             in=new DataInputStream(socket.getInputStream());
      }
      catch (IOException e){}
   }  
   public void run() {        
      while(true) {
         try{  double r=in.readDouble();//堵塞状态，除非读取到信息
               double area=Math.PI*r*r;
               out.writeDouble(area);
         }
         catch (IOException e) {
               System.out.println("客户离开");
                return;
         }
      }
   } 
}
