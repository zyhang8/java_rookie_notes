
// java�α�����,��ѧϰʵ��;
// �ο��Կα���������.
// ��������������ϸע��˵��,�����������ϵ��.--ylin
// "�Ұ�ѧϰ,ѧϰҲ����."ר��ˮӡ.

package Example15_1;
public class Circle {
   double area,radius; 
   Circle(double r) {
      radius=r;
   } 
   public String toString() { //��дObject���toString()����
      area=radius*radius*Math.PI;
      return ""+area;
   }
}
