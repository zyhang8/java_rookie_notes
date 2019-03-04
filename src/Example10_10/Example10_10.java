
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example10_10;
import java.io.*;
public class Example10_10 {
   public static void main(String args[]) {
      try {
         ByteArrayOutputStream outByte=new ByteArrayOutputStream();
         byte [] byteContent="mid-autumn festival".getBytes(); 
         outByte.write(byteContent); 
         ByteArrayInputStream inByte=new ByteArrayInputStream(outByte.toByteArray());
         byte backByte []=new byte[outByte.toByteArray().length];
         inByte.read(backByte);
         System.out.println(new String(backByte));
         CharArrayWriter outChar=new CharArrayWriter();
         char [] charContent="中秋快乐".toCharArray(); 
         outChar.write(charContent); 
         CharArrayReader inChar=new CharArrayReader(outChar.toCharArray());
         char backChar []=new char[outChar.toCharArray().length];
         inChar.read(backChar);
         System.out.println(new String(backChar));
      }
      catch(IOException exp){}
  }
}
