
// java�α�����,��ѧϰʵ��;
// �ο��Կα���������.
// ��������������ϸע��˵��,�����������ϵ��.--ylin
// "�Ұ�ѧϰ,ѧϰҲ����."ר��ˮӡ.

package Example5_6;
class A {
    Object get() {
       return null; //����һ���ն���
    }
}
class B extends A {
    Integer get() {
       return new Integer(100);//����һ��Integer����
    }
}
public class Example5_6 {
    public static void main(String args[]) {
       B b=new B();
       Integer t=b.get();
       System.out.println(t.intValue());   
    } 
}
