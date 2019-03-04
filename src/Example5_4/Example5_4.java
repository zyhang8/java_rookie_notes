
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example5_4;
public class Example5_4 {
    public static void main(String args[]) {
       double math=64,english=76.5,chinese=66;
       ImportantUniversity univer = new  ImportantUniversity();
       univer.enterRule(math,english,chinese); //调用重写的方法
       math=89;
       english=80;
       chinese=86;
       univer = new  ImportantUniversity();
       univer.enterRule(math,english,chinese); //调用重写的方法
    }
}