
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example7_7;
public class CargoBoat {
     int realContent;  //装载的重量
     int maxContent;   //最大装载量
     public void setMaxContent(int c) {
         maxContent = c;
     }
     public void loading(int m) throws DangerException {
       realContent += m;
       if(realContent>maxContent) {
          throw new DangerException(); 
       }
       System.out.println("目前装载了"+realContent+"吨货物");
     }
}
