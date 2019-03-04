
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example8_23;
public class Example8_23 {
   public static void main(String args[]) {
      RedEnvelope redEnvelope = new RandomRedEnvelope(5.20,6);
      System.out.printf("以下用循环输出%d个人抢%.2f圆的随机红包:\n",
                         redEnvelope.remainPeople,redEnvelope.remainMoney);
      showProcess(redEnvelope);
   }
   public static void showProcess (RedEnvelope redEnvelope) {
      double sum = 0;
      while(redEnvelope.remainPeople>0){
         double money = redEnvelope.giveMoney();
         System.out.printf("%.2f\t",money);
         sum = sum+money;
      }
      String s = String.format("%.2f",sum);   //金额保留2位小数
      sum = Double.parseDouble(s);
      System.out.printf("\n%.2f圆的红包被抢完",sum);
   }
}