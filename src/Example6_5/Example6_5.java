
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example6_5;
interface SpeakHello {
    void speakHello();
}
class Chinese implements SpeakHello {
   public  void speakHello() {
       System.out.println("中国人习惯问候语：你好,吃饭了吗? ");
   }
}
class English implements SpeakHello {
    public  void speakHello() {
       System.out.println("英国人习惯问候语:你好,天气不错 ");
    }
}
class KindHello {
   public void lookHello(SpeakHello hello) { //接口类型参数
       hello.speakHello();                    //接口回调
   }
}
public class Example6_5 {
   public static void main(String args[]) {
       KindHello kindHello=new KindHello();
       kindHello.lookHello(new Chinese());
       kindHello.lookHello(new English());
   }
}
