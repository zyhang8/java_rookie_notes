
// java�α�����,��ѧϰʵ��;
// �ο��Կα���������.
// ��������������ϸע��˵��,�����������ϵ��.--ylin
// "�Ұ�ѧϰ,ѧϰҲ����."ר��ˮӡ.

package Example9_1;
import javax.swing.*;
import java.awt.*;
public class Example9_1 {
    public static void main(String args[]) {
    	//JFrame��ʵ��������
       JFrame window1=new JFrame("��һ������");
       JFrame window2=new JFrame("�ڶ�������");
       //��ȡ�������������
       Container con=window1.getContentPane();
       con.setBackground(Color.yellow) ;       //���ô��ڵı���ɫ
       window2.getContentPane().setBackground(Color.blue) ;
//       ��Ӳ˵���
       JMenuBar bar=new JMenuBar();
       JMenu menu=new JMenu("�˵�");
       JMenuItem subMen=new JMenu("�����Ŀ");
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
       //���ڴ�С
       window1.setBounds(60,100,188,108);
       window2.setBounds(60,188,188,108);
//       window2.setBounds(260,100,188,108);
       window1.setVisible(true);//չʾ
       window1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//��һ��
       window2.setVisible(true);//չʾ
       window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //��ȫ��
    }
}
