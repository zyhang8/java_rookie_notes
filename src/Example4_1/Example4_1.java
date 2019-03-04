
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example4_1;
class XiyoujiRenwu {
    float height,weight;
    String head, ear;
    void speak(String s) {
       System.out.println(s);
    }
}
public class Example4_1 {
    public static void main(String args[]) {
        XiyoujiRenwu  zhubajie;       //声明对象
        zhubajie = new XiyoujiRenwu(); //为对象分配变量(使用new和默认的构造方法)
    }
}
