
// java�α�����,��ѧϰʵ��;
// �ο��Կα���������.
// ��������������ϸע��˵��,�����������ϵ��.--ylin
// "�Ұ�ѧϰ,ѧϰҲ����."ר��ˮӡ.

package Example5_4;
public class ImportantUniversity extends University{
    void enterRule(double math,double english,double chinese) {
        double total=math+english+chinese;
        if(total>=220)  
           System.out.println("����"+total+"�ﵽ�ص��ѧ¼ȡ��");
        else
           System.out.println("����"+total+"δ�ﵽ�ص��ѧ¼ȡ��");
    }
}