
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example7_5;
public class BankException extends Exception {
   String message;
   public BankException(int m,int n) {
       message="入账资金"+m+"是负数或支出"+n+"是正数，不符合系统要求.";
   }
   public String warnMess() {
       return message;
   }
} 
