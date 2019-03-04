
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example6_2;
interface  ShowMessage {
   void 显示商标(String s);
}
class TV implements ShowMessage {
   public void 显示商标(String s) {
      System.out.println(s);
   }
}
class PC implements ShowMessage {
   public void 显示商标(String s) { 
     System.out.println(s);
   }
}
public class Example6_2 {
   public static void main(String args[]) {
      ShowMessage sm;                  //声明接口变量
      sm=new TV();                     //接口变量中存放对象的引用
      sm.显示商标("长城牌电视机");      //接口回调。
      sm=new PC();                     //接口变量中存放对象的引用
      sm.显示商标("联想奔月5008PC机"); //接口回调
   } 
}
