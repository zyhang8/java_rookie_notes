
// java�α�����,��ѧϰʵ��;
// �ο��Կα���������.
// ��������������ϸע��˵��,�����������ϵ��.--ylin
// "�Ұ�ѧϰ,ѧϰҲ����."ר��ˮӡ.

package Example10_20;
import java.io.*;
public class Example10_20 {
   public static void main(String args[]) {
      StandardExam exam = new StandardExam();
      File f = new File("test.txt");
      exam.setTestFile(f); 
      exam.startExamine();
   }
} 