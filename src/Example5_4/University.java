
// java�α�����,��ѧϰʵ��;
// �ο��Կα���������.
// ��������������ϸע��˵��,�����������ϵ��.--ylin
// "�Ұ�ѧϰ,ѧϰҲ����."ר��ˮӡ.

package Example5_4;
public class University {
    void enterRule(double math,double english,double chinese) {
        double total=math+english+chinese;
        if(total>=180) 
           System.out.println("����"+total+"�ﵽ��ѧ���¼ȡ��");
        else
           System.out.println("����"+total+"δ�ﵽ��ѧ���¼ȡ��");
    }
}
