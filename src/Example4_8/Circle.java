
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example4_8;
public class Circle { 
    double radius,area;
    void setRadius(double r) {
        radius=r;
    } 
    double getRadius() {
        return radius;
    }
    double getArea(){
        area=3.14*radius*radius;
        return area;
    }
}
