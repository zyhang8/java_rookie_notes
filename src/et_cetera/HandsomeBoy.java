package et_cetera;

public class HandsomeBoy {
	float face_score;
	String name;
	HandsomeBoy(float fs,String name){
		this.face_score=fs;
		this.name=name;
	}
	void getname(String name) {//问别人姓名前需自报家门,礼貌.
		System.out.println("Nice to meet you, "+name+"!my name is "+this.name+".");
	}
	public static void main(String args[]) {
		HandsomeBoy ylin=new HandsomeBoy(100,"ylin");
		ylin.getname("czhang");
	}
}
