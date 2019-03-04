
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example9_1;
import javax.swing.*;
import java.awt.*;
public class Example9_1 {
    public static void main(String args[]) {
    	//JFrame类实例化窗口
       JFrame window1=new JFrame("第一个窗口");
       JFrame window2=new JFrame("第二个窗口");
       //获取窗口类内容面板
       Container con=window1.getContentPane();
       con.setBackground(Color.yellow) ;       //设置窗口的背景色
       window2.getContentPane().setBackground(Color.blue) ;
//       添加菜单栏
       JMenuBar bar=new JMenuBar();
       JMenu menu=new JMenu("菜单");
       JMenuItem subMen=new JMenu("软件项目");
       JMenuItem itemLiterature=new JMenuItem("1");
       JMenuItem itemCooking=new JMenuItem("2");
       menu.add(itemLiterature);
       menu.addSeparator();
       menu.add(itemCooking);
       menu.add(subMen);
       subMen.add(new JMenuItem("1"));
       subMen.add(new JMenuItem("2"));
       bar.add(menu);
       window2.setJMenuBar(bar);
       //窗口大小
       window1.setBounds(60,100,188,108);
       window2.setBounds(60,188,188,108);
//       window2.setBounds(260,100,188,108);
       window1.setVisible(true);//展示
       window1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//关一个
       window2.setVisible(true);//展示
       window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //关全部
    }
}
