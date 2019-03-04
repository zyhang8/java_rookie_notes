
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example7_1;
public class RedCowForm {
   static String formName;
   RedCow cow;  //内部类声明对象
   RedCowForm() {
   }
   RedCowForm(String s) {
      cow = new RedCow(150,112,5000);
      formName = s;
   }
   public void showCowMess() {
      cow.speak();
   }
   class RedCow {  //内部类的声明
      String cowName = "红牛";
      int height,weight,price;
      RedCow(int h,int w,int p){
          height = h;
          weight = w;
          price = p;
      }
      void speak() {
         System.out.println("偶是"+cowName+",身高:"+height+"cm 体重:"+weight+"kg,生活在"+formName);
      }
   }    //内部类结束
} 
