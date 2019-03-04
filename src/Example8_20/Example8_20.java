
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example8_20;
import java.util.Date;
class Rect {
   double width,height,area;
   public double getArea() {  
      area = height*width;
      return area;
  }
}
public class Example8_20 {
   public static void main(String args[]) {
      try{   Class cs = Class.forName("Rect");
            Rect rect = (Rect)cs.newInstance();
            rect.width = 100;
            rect.height = 200;
            System.out.println("rect的面积"+rect.getArea());
            cs = Class.forName("java.util.Date");
            Date date = (Date)cs.newInstance();
            System.out.println(String.format("%tF %<tT %<tA",date));
       }
       catch(Exception e){
             System.out.println(e.toString());
       } 
   }  
}
