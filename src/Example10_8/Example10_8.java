
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example10_8;
import java.io.*;
public class Example10_8 {
   public static void main(String args[]) {
      RandomAccessFile inAndOut=null;
      int data[]={1,2,3,4,5,6,7,8,9,10};
      try{ inAndOut=new RandomAccessFile("tom.dat","rw");
           for(int i=0;i<data.length;i++) {
              inAndOut.writeInt(data[i]);
           } 
           for(long i=data.length-1;i>=0;i--) { //一个int型数据占4个字节，inAndOut从
              inAndOut.seek(i*4);          //文件的第36个字节读取最后面的一个整数，
              System.out.printf("\t%d",inAndOut.readInt()); //每隔4个字节往前读取一个整数
           }
           inAndOut.close();
      }
      catch(IOException e){} 
   }
}
