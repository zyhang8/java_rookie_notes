
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example9_15;
public class Triangle {
   double sideA,sideB,sideC,area;
   boolean isTriange;
   public String getArea() {
     if(isTriange) {
        double p=(sideA+sideB+sideC)/2.0;
        area=Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC)) ;
        return String.valueOf(area);
     }
     else { 
        return "无法计算面积";
     }
   } 
   public void setA(double a) {
     sideA=a;
     if(sideA+sideB>sideC&&sideA+sideC>sideB&&sideC+sideB>sideA) 
       isTriange=true;
     else 
       isTriange=false;
   }
   public void setB(double b) {
     sideB=b;
     if(sideA+sideB>sideC&&sideA+sideC>sideB&&sideC+sideB>sideA) 
       isTriange=true;
     else 
       isTriange=false;
   }
   public void setC(double c) {
     sideC=c;
     if(sideA+sideB>sideC&&sideA+sideC>sideB&&sideC+sideB>sideA) 
       isTriange=true;
     else 
       isTriange=false;
   }
}
