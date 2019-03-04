
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example1_1;
public class Hello {
   public static void main (String args[]) {
      System.out.println("大家好!");
      System.out.println("Nice to meet you");
      Student stu=new Student();
      stu.speak("We are students");
   }
}
class Student {
   public void speak(String s) {
      System.out.println(s);
   }
}
