
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example9_7;
public class Example9_7 {
   public static void main(String args[]) {
      WindowActionEvent win=new WindowActionEvent();
      PoliceListen police = new PoliceListen(); //创建监视器
      win.setMyCommandListener(police); //窗口组合监视器
      win.setBounds(100,100,460,360);
      win.setTitle("处理ActionEvent事件");
   }
}

