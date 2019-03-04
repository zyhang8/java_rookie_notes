
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example10_13;
import java.io.*;
public class Example10_13 {
   public static void main(String args[]) {
      TV changhong = new TV();
      changhong.setName("长虹电视");
      changhong.setPrice(5678); 
      File file=new File("television.txt");
      try{ 
          FileOutputStream fileOut=new FileOutputStream(file);
          ObjectOutputStream objectOut=new ObjectOutputStream(fileOut);
          objectOut.writeObject(changhong); 
          objectOut.close(); 
          FileInputStream fileIn=new FileInputStream(file);
          ObjectInputStream objectIn=new ObjectInputStream(fileIn);
          TV xinfei=(TV)objectIn.readObject(); 
          objectIn.close();
          xinfei.setName("新飞电视");
          xinfei.setPrice(6666); 
          System.out.println("changhong的名字:"+changhong.getName());
          System.out.println("changhong的价格:"+changhong.getPrice());
          System.out.println("xinfei的名字:"+xinfei.getName());
          System.out.println("xinfei的价格:"+xinfei.getPrice());
       }
       catch(ClassNotFoundException event) {
          System.out.println("不能读出对象");
       }
       catch(IOException event) {
          System.out.println(event);
       }
   }
}
