
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example4_14;
public class People{
    int leg,hand;
    String name;
    People(String s){
        name=s;
        this.init();   //可以省略this，即将this.init();写成init();
    }
    void init(){
       leg=2;
       hand=2;
       System.out.println(name+"有"+hand+"只手"+leg+"条腿");
    }
    public static void main(String args[]){
      People boshi=new People("布什"); //创建boshi时，构造方法中的this就是对象boshi
    }
} 


