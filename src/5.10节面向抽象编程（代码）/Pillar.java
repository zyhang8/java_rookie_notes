
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package 5.10节面向抽象编程（代码）;
public class Pillar {
    Geometry  bottom;        //bottom是抽象类Geometry声明的变量
    double height;
    Pillar (Geometry bottom,double height) {
        this.bottom=bottom; 
        this.height=height;
    }
    public double getVolume() {
        if(bottom==null) {
           System.out.println("没有底,无法计算体积");
           return -1;
        }
        return bottom.getArea()*height; //bottom可以调用子类重写的getArea方法
    }
}






