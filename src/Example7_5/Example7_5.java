
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example7_5;
public class Example7_5 {
   public static void main(String args[]) {
      Bank bank=new Bank();
      try{  bank.income(200,-100);
            bank.income(300,-100);
            bank.income(400,-100);
            System.out.printf("银行目前有%d元\n",bank.getMoney());
            bank.income(200, 100);
            bank.income(99999,-100);
      }
      catch(BankException e) {
            System.out.println("计算收益的过程出现如下问题:");
            System.out.println(e.warnMess());        
      }
      System.out.printf("银行目前有%d元\n",bank.getMoney());
   }
}
