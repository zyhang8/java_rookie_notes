
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example12_7;
public class Example12_7 {
   public static void main(String args[]) {
      Bank bank = new Bank();
      bank.setMoney(200);
      Thread accountant,    //会计
             cashier;      //出纳
      accountant = new Thread(bank);
      cashier = new Thread(bank);
      accountant.setName("会计");
      cashier.setName("出纳");
      accountant.start();
      cashier.start(); 
   }
}

