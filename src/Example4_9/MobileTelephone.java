
// java�α�����,��ѧϰʵ��;
// �ο��Կα���������.
// ��������������ϸע��˵��,�����������ϵ��.--ylin
// "�Ұ�ѧϰ,ѧϰҲ����."ר��ˮӡ.

package Example4_9;
public class MobileTelephone { 
    SIM sim;
    void setSIM(SIM card) {
        sim = card;
    } 
    long lookNumber(){
        return sim.getNumber();
    }
}
