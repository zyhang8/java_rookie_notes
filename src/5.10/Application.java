
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package 5.10节面向抽象编程（代码）;
public class Application{
    public static void main(String args[]){
        Pillar pillar;
        Geometry bottom =null;
        pillar =new Pillar (bottom,100);  //null底的柱体
        System.out.println("体积"+pillar.getVolume());
        bottom=new Rectangle(12,22);
        pillar =new Pillar (bottom,58);  //pillar是具有矩形底的柱体
        System.out.println("体积"+pillar.getVolume());
        bottom=new Circle(10);
        pillar =new Pillar (bottom,58); //pillar是具有圆形底的柱体
        System.out.println("体积"+pillar.getVolume());
    }
} 
