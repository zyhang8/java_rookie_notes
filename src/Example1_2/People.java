
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example1_2;
public class People {
    int height; 
    String ear;
    void speak(String s) { 
       System.out.println(s);
    }
}
class A { 
    public static void main(String args[]) {
      People zhubajie;
      zhubajie = new People();
      zhubajie.height = 170;
      zhubajie.ear = "两只大耳朵";
      System.out.println("身高:"+zhubajie.height);
      System.out.println(zhubajie.ear);
      zhubajie.speak("师傅,咱们别去西天了,改去月宫吧");
    }
}
