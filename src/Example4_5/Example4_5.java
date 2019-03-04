
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example4_5;
public class Example4_5  {       
   public static void main(String args[]) {
      Rect ractangle = new Rect();
      ractangle.width = 109.87;
      ractangle.height = 25.18;
      double area=ractangle.getArea();
      System.out.println("矩形的面积:"+area); 
      Lader lader=new Lader();
      lader.above=10.798;
      lader.bottom=156.65;
      lader.height=18.12;
      area=lader.getArea();
      System.out.println("梯形的面积:"+area); 
    }
}

