
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example12_9;
public class Example12_9 {
   public static void main(String args[]) {
     ThreadJoin  a = new ThreadJoin();
     Thread customer = new Thread(a);
     Thread cakeMaker = new Thread(a);
     customer.setName("顾客");
     cakeMaker.setName("蛋糕师");
     a.setJoinThread(cakeMaker);
     customer.start();
   }
}
