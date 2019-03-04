
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example15_1;
public class Circle {
   double area,radius; 
   Circle(double r) {
      radius=r;
   } 
   public String toString() { //重写Object类的toString()方法
      area=radius*radius*Math.PI;
      return ""+area;
   }
}
