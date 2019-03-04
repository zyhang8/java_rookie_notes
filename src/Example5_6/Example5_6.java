
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example5_6;
class A {
    Object get() {
       return null; //返回一个空对象
    }
}
class B extends A {
    Integer get() {
       return new Integer(100);//返回一个Integer对象
    }
}
public class Example5_6 {
    public static void main(String args[]) {
       B b=new B();
       Integer t=b.get();
       System.out.println(t.intValue());   
    } 
}
