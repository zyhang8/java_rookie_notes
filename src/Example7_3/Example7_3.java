
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example7_3;
interface SpeakHello {
     void speak();
}
class  HelloMachine {
   public void turnOn(SpeakHello hello) {
       hello.speak();
   }
}
public class Example7_3 {
   public static void main(String args[]) {
      HelloMachine machine = new HelloMachine();
      machine.turnOn( new SpeakHello(){
                          public void speak() {
                             System.out.println("hello,you are welcome!");
                          }
                      } 
                    ); 
      machine.turnOn( new SpeakHello(){
                          public void speak() {
                              System.out.println("你好，欢迎光临!");
                          }
                      } 
                    ); 
   } 
}
