
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example9_6;
import java.awt.event.*;
// 读取监听类,时实现事件监听接口.可用组件的addActionListener方法将该类对象绑定到组件上.
public class ReaderListen implements ActionListener { 
   public void actionPerformed(ActionEvent e) {
      String str=e.getActionCommand();   //获取封装在事件中的“命令”字符串
      //ActionEvent类方法:.getSource()(return object)获取源对象引用.
      //string getActionCommand()获取和事件相关的一个"命令"字符串,文本框的命令默认为文本框中字符串.
      //事件源的setCommand(String)方法可
      System.out.println(str+":"+str.length());
   }
}
