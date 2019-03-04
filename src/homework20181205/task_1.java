
package homework20181205;
abstract class Beijing{
	abstract void name();
}
class Shoudu extends Beijing{
	void name() {
		System.out.println("Shoudu");
	}
}
class Jingchen extends Beijing{
	void name() {
		System.out.println("Jingchen");
	}
}
class Didu extends Beijing{
	void name() {
		System.out.println("Didu");
	}
}
public class task_1 {
	public static void main(String[] args) {
		Jingchen s1=new Jingchen();
		Shoudu s2=new Shoudu();
		Didu s3=new Didu();
		Beijing f;
		f=s1;f.name();
		f=s2;f.name();
		f=s3;f.name();
	}

}
