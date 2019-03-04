
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example5_2;
class People {
    private int averHeight = 166;
    public int getAverHeight() {
       return averHeight;
    }
}
class ChinaPeople extends People {
     int height;
     public void setHeight(int h) {
          //height = h+averHeiht; // 非法，子类没有继承averHeiht
          height = h;
     }
     public int getHeight() {
        return height;
     }
}
public class Example5_2 {
  public static void main(String args[]) {
      ChinaPeople zhangSan = new ChinaPeople();
      System.out.println("子类对象未继承的averageHeight的值是:"+zhangSan.getAverHeight());
      zhangSan.setHeight(178);
      System.out.println("子类对象的实例变量height的值是:"+zhangSan.getHeight());
  }  
}
