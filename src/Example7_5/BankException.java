
// java�α�����,��ѧϰʵ��;
// �ο��Կα���������.
// ��������������ϸע��˵��,�����������ϵ��.--ylin
// "�Ұ�ѧϰ,ѧϰҲ����."ר��ˮӡ.

package Example7_5;
public class BankException extends Exception {
   String message;
   public BankException(int m,int n) {
       message="�����ʽ�"+m+"�Ǹ�����֧��"+n+"��������������ϵͳҪ��.";
   }
   public String warnMess() {
       return message;
   }
} 
