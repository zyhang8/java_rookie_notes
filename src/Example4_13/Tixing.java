
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example4_13;
public class Tixing { 
   double above,bottom,height;
   Tixing(double a,double b,double h) {
      above = a;
      bottom = b;
      height = h; 
   }
   double getArea() {
      return (above+bottom)*height/2;
   }
}

