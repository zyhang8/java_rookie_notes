
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example10_18;
import javax.swing.*; 
import java.io.*;
public class Example10_18 {
   public static void main(String args[]) {
      byte b[]=new byte[30];
      try{  FileInputStream input=new FileInputStream("Example10_18.java");
            ProgressMonitorInputStream in=
            new ProgressMonitorInputStream(null,"读取java文件",input);
            ProgressMonitor p=in.getProgressMonitor();  //获得进度条
            while(in.read(b)!=-1) {
               String s=new String(b);
               System.out.print(s);
               Thread.sleep(1000);//由于文件较小，为了看清进度条这里有意延缓1秒
            }
       }
       catch(Exception e){}
   }
}
