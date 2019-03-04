
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example12_8;
public class Example12_8 {
   public static void main(String args[ ]) {
      TicketHouse officer = new TicketHouse();
      Thread zhangfei,likui;
      zhangfei = new Thread(officer); 
      zhangfei.setName("张飞");
      likui = new Thread(officer);  
      likui.setName("李逵");
      zhangfei.start();
      likui.start();
   }
}
