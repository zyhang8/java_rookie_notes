
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example15_1;
public class Cone<E> { 
   double height;
   E bottom;           //用泛型类E声明对象bottom
   public Cone (E b) {
      bottom=b;   
   }
   public void setHeight(double h) {
      height=h;
   }
   public double computerVolume() {
      String s=bottom.toString();//泛型变量只能调用从Object类继承的或重写的方法
      double area=Double.parseDouble(s); 
      return 1.0/3.0*area*height; 
   }
}
