
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example12_3;
public class Example12_3 {
   public static void main(String args[ ]) {
      House house = new House();
      house.setWater(10);
      Thread dog,cat;
      dog=new Thread(house); 
      cat=new Thread(house);  //cat和dog的目标对象相同 
      dog.setName("狗");
      cat.setName("猫"); 
      dog.start();
      cat.start();
   }
}
