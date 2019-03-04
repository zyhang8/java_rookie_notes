
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example5_11;
class  动物 {
   void cry() {
   }  
}
class 狗 extends 动物 {
   void cry() {
      System.out.println("汪汪....."); 
   }  
}
class 猫 extends 动物  {
   void cry() {
      System.out.println("喵喵....."); 
   }  
}
public class Example5_11 { 
   public static void main(String args[]) {
      动物 animal;
      animal = new 狗();
      animal.cry(); 
      animal=new 猫();
      animal.cry();
  }
}
