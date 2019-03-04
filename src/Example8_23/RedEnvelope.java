
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example8_23;
public abstract class RedEnvelope {
    public double remainMoney;    //红包当前金额
    public int remainPeople;      //当前参与抢红包的人数   
    public double money ;         //当前用户抢到的金额
    public abstract double giveMoney(); //抽象方法，具体怎么抢红包由子类完成
}

