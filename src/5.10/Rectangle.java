
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package 5.10节面向抽象编程（代码）;
public class Rectangle extends Geometry {
    double a,b;
    Rectangle(double a,double b) {
        this.a=a; 
        this.b=b; 
    }
    public double getArea() {
        return a*b;
    }
}





