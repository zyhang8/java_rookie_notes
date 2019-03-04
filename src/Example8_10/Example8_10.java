
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example8_10;
public class Example8_10 {
   public static void main (String args[ ]) {
      String str = "欢迎大家访问http://www.xiaojiang.cn了解、参观公司";
      String regex = "(http://|www)\56?\\w+\56{1}\\w+\56{1}\\p{Alpha}+";
      System.out.printf("替换\n\"%s\"\n中的网站链接信息后得到的字符串:\n",str);
      str = str.replaceAll(regex,"******");
      System.out.println(str);
      String money = "89,235,678￥";
      System.out.print(money+"转化成数字:"); 
      String s = money.replaceAll("[,\\p{Sc}]","") ; //"\\p{Sc}"可匹配任何货币符号
      long  number = Long.parseLong(s);
      System.out.println(number); 
   }
}

