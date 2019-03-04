
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example7_7;
public class Example7_7 {
   public static void main(String args[]) {
      CargoBoat ship = new CargoBoat();
      ship.setMaxContent(1000);
      int m =600;
      try{  
           ship.loading(m);
           m = 400;
           ship.loading(m);
           m = 367;
           ship.loading(m);
           m = 555;
           ship.loading(m);
      }
      catch(DangerException e) {
           System.out.println(e.warnMess()); 
           System.out.println("无法再装载重量是"+m+"吨的集装箱");       
      }
      finally {
          System.out.printf("货船将正点启航");
      }
  }
}
