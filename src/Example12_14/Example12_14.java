
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example12_14;
public class Example12_14 {
   public static void main(String args[]) {
      StandardExamInTime win=new StandardExamInTime();
      win.setTitle("限时回答问题");
      win.setTestFile(new java.io.File("test.txt"));
      win.setMAX(8); 
   }
}

