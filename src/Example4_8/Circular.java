
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example4_8;
public class Circular { 
    Circle bottom;
    double height;
    void setBottom(Circle c) { 
       bottom = c;
    }
    void setHeight(double h) {
       height = h;
    }
    double getVolme() {
       if(bottom == null)
          return -1;
       else
          return bottom.getArea()*height/3.0;
    }
    double getBottomRadius() {
       return bottom.getRadius();
    }
    public void setBottomRadius(double r){
       bottom.setRadius(r);
    } 
}
