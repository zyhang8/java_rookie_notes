
// java�α�����,��ѧϰʵ��;
// �ο��Կα���������.
// ��������������ϸע��˵��,�����������ϵ��.--ylin
// "�Ұ�ѧϰ,ѧϰҲ����."ר��ˮӡ.

package Example7_7;
public class CargoBoat {
     int realContent;  //װ�ص�����
     int maxContent;   //���װ����
     public void setMaxContent(int c) {
         maxContent = c;
     }
     public void loading(int m) throws DangerException {
       realContent += m;
       if(realContent>maxContent) {
          throw new DangerException(); 
       }
       System.out.println("Ŀǰװ����"+realContent+"�ֻ���");
     }
}