
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example4_19;
public class Example4_19 {
   public static void main(String args[]) {
      Student zhang=new Student(); 
      Student geng=new Student();  
      zhang.setAge(23); 
      System.out.println("zhang的年龄："+zhang.getAge()); 
      geng.setAge(25);
      //zhang.age=23;或geng.age=25;都是非法的，因为zhang和geng已经不在Student类中 
      System.out.println("geng的年龄："+geng.getAge());  
    }
}




