
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example7_5;
public class Bank {
    private int money;
    public void income(int in,int out) throws BankException {
       if(in<=0||out>=0||in+out<=0) {
          throw new BankException(in,out); //方法抛出异常，导致方法结束
       }
       int netIncome=in+out;
       System.out.printf("本次计算出的纯收入是:%d元\n",netIncome);
       money=money+netIncome;
    } 
    public int getMoney() {
       return money;
    } 
}

