
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example3_1;
public class Example3_1 {
   public static void main(String args[]) {
      char a1='十',a2='点',a3='进',a4='攻';
      char secret='A';
      a1=(char)(a1^secret);   
      a2=(char)(a2^secret);
      a3=(char)(a3^secret);   
      a4=(char)(a4^secret);
      System.out.println("密文:"+a1+a2+a3+a4);
      a1=(char)(a1^secret);   
      a2=(char)(a2^secret);
      a3=(char)(a3^secret);  
      a4=(char)(a4^secret);
      System.out.println("原文:"+a1+a2+a3+a4);
   }
}


