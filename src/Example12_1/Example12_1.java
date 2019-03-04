
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example12_1;
public class Example12_1 { 
   public  static void main(String args[]) { //主线程
       SpeakElephant  speakElephant;
       SpeakCar  speakCar;  
       speakElephant = new SpeakElephant() ;      //创建线程
       speakCar = new SpeakCar();                //创建线程
       speakElephant.start();                          //启动线程 
       speakCar.start();                         //启动线程
       for(int i=1;i<=15;i++) {
          System.out.print("主人"+i+"  ");
       }  
   }
}
