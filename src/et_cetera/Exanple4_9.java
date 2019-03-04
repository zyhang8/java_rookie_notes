package et_cetera;
class SIM{
	long number;
	SIM(long number){
		this.number=number;
	}
	long getNumber() {
		return number;
	}
}
class MobileTelephone{
	SIM sim;
	void setSIM(SIM card) {
		sim=card;
	}
	MobileTelephone(SIM card){
		sim=card;
	}
	long lookNumber() {
		return sim.getNumber();
	}
}
public class Exanple4_9 {
	public static void main(String args[]) {
		SIM simOne = new SIM(13889776509L);
//		MobileTelephone mobile=new MobileTelephone();
//		mobile.setSIM(simOne);
		MobileTelephone mobile=new MobileTelephone(simOne);
		System.out.println("手机号码(改):"+mobile.lookNumber());
		SIM simTwo=new SIM(15967563567L);
//		mobile.setSIM(simTwo);
		mobile=new MobileTelephone(simTwo);
		System.out.println("手机号码(改):"+mobile.lookNumber());
	}
}
