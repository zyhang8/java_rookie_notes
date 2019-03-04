
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example5_12;
abstract class GirlFriend {
   abstract void speak();
   abstract void cooking();
}
class ChinaGirlFriend extends GirlFriend {
   void speak(){
      System.out.println("你好");
   }
   void cooking(){
      System.out.println("水煮鱼"); 
   }
}
class AmericanGirlFriend extends GirlFriend {
   void speak(){
      System.out.println("hello");
   }
   void cooking(){
      System.out.println("roast beef"); 
   }
}
class Boy {
   GirlFriend friend;
   void setGirlfriend(GirlFriend f){
       friend = f;
   }
   void showGirlFriend() {
      friend.speak();
      friend.cooking();
   }
}
public class Example5_12 {
   public static void main(String args[]) {
      GirlFriend girl = new ChinaGirlFriend(); //girl是上转型对象
      Boy boy = new Boy();
      boy.setGirlfriend(girl);
      boy.showGirlFriend();     
      girl = new AmericanGirlFriend(); //girl是上转型对象
      boy.setGirlfriend(girl);
      boy.showGirlFriend();      
   }
}
