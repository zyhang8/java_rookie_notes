
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example10_22;
import java.io.*;
import javax.swing.*;
import java.awt.*;
public class CompileDialog  extends JDialog {
    JTextArea showError;
    CompileDialog() {
       setTitle("编译对话框");
       showError = new JTextArea();
       Font f =new Font("宋体",Font.BOLD,15);
       showError.setFont(f);
       add(new JScrollPane(showError),BorderLayout.CENTER);
       setBounds(10,10,500,300);
    } 
    public void compile(String name) {
       try{  Runtime ce=Runtime.getRuntime();
             Process proccess = ce.exec("javac "+name);
             InputStream in=proccess.getErrorStream();
             BufferedInputStream bin=new BufferedInputStream(in);
             int n;
             boolean bn=true;
             byte error[]=new byte[100];
             while((n=bin.read(error,0,100))!=-1) {
                   String s=null;
                   s=new String(error,0,n);
                   showError.append(s);
                   if(s!=null) bn=false;
             }
             if(bn)  showError.append("编译正确"); 
        }
        catch(IOException e1){} 
    }
}