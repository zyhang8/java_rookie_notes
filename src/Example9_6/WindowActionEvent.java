
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example9_6;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
// 继承自JFrame(窗口类)
public class WindowActionEvent extends JFrame { 
   JTextField text;
   ActionListener listener;             //实例化监视器
   public WindowActionEvent() {
      setLayout(new FlowLayout());
      text = new JTextField(10); 
      add(text);//添加组件.父类方法
      listener = new ReaderListen();       //创建责计算字符串长度的监视器
      text.addActionListener(listener);   //text是事件源,listener是监视器,绑定
      // 展示.父类方法
      setVisible(true);
      // 设置默认退出.父
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}
