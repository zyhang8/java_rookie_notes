
// java�α�����,��ѧϰʵ��;
// �ο��Կα���������.
// ��������������ϸע��˵��,�����������ϵ��.--ylin
// "�Ұ�ѧϰ,ѧϰҲ����."ר��ˮӡ.

package Example12_1;
public class Example12_1 { 
   public  static void main(String args[]) { //���߳�
       SpeakElephant  speakElephant;
       SpeakCar  speakCar;  
       speakElephant = new SpeakElephant() ;      //�����߳�
       speakCar = new SpeakCar();                //�����߳�
       speakElephant.start();                          //�����߳� 
       speakCar.start();                         //�����߳�
       for(int i=1;i<=15;i++) {
          System.out.print("����"+i+"  ");
       }  
   }
}