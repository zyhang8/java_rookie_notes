
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example5_3;
public class Goods {
    public double weight;
    public void oldSetWeight(double w) {
       weight=w;
       System.out.println("double型的weight="+weight);
    }
    public double oldGetPrice() {
        double price = weight*10;
        return price;
    }
}
