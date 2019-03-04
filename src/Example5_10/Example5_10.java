
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example5_10;
class  类人猿 {
   void crySpeak(String s) {
       System.out.println(s); 
   }  
}
class People extends 类人猿 {
   void computer(int a,int b) { 
      int c=a*b;
      System.out.println(c); 
   }
   void crySpeak(String s) {
      System.out.println("***"+s+"***"); 
   }  
}
public class Example5_10 {
   public static void main(String args[]) {
      类人猿 monkey;
      People geng = new People();   
      monkey = geng ; //monkey是People对象geng的上转型对象
      monkey.crySpeak("I love this game");//等同于geng.crySpeak("I love this game");
      People people=(People)monkey; //把上转型对象强制转化为子类的对象
      people.computer(10,10);
   }
}
