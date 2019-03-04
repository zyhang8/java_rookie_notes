
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example9_5;
import javax.swing.*;
public class WindowBoxLayout extends JFrame  {
    Box boxH;               //行式盒
    Box boxVOne,boxVTwo;    //列式盒 
    public WindowBoxLayout() {
        setLayout(new java.awt.FlowLayout());
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    void init() {
        boxH =Box.createHorizontalBox();
        boxVOne=Box.createVerticalBox();
        boxVTwo=Box.createVerticalBox();
        boxVOne.add(new JLabel("姓名:"));
        boxVOne.add(new JLabel("职业:"));
        boxVTwo.add(new JTextField(10));
        boxVTwo.add(new JTextField(10));
        boxH.add(boxVOne);
        boxH.add(Box.createHorizontalStrut(10));
        boxH.add(boxVTwo);
        add(boxH);       
    }
}
