
// java�α�����,��ѧϰʵ��;
// �ο��Կα���������.
// ��������������ϸע��˵��,�����������ϵ��.--ylin
// "�Ұ�ѧϰ,ѧϰҲ����."ר��ˮӡ.

package Example1_1;
public class Hello {
   public static void main (String args[]) {
      System.out.println("��Һ�!");
      System.out.println("Nice to meet you");
      Student stu=new Student();
      stu.speak("We are students");
   }
}
class Student {
   public void speak(String s) {
      System.out.println(s);
   }
}
