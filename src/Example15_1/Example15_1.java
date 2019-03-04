
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example15_1;
public class Example15_1 {
   public static void main(String args[]) {
      Circle circle=new Circle(10);
      Cone<Circle> coneOne=new Cone<Circle>(circle);//创建一个（圆）锥对象  
      coneOne.setHeight(16);
      System.out.println(coneOne.computerVolume());
      Rect rect=new Rect(15,23);
      Cone<Rect> coneTwo=new Cone<Rect>(rect);//创建一个（方）锥对象
      coneTwo.setHeight(98); 
      System.out.println(coneTwo.computerVolume());
  }
}