package et_cetera;
import java.util.Scanner;

public class calculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1,z=0;
		float p = (float)0.1;
		float q = (float)0.02;
		Scanner s = new Scanner(System.in);
		z = s.nextInt();
		System.out.println("x:" + x);
		System.out.println("x--:" + x--);
		System.out.println("x:" + x);
		System.out.println("x++:" + x++);
		System.out.println("x:" + x);
		System.out.println("x+y:" +p%q);
		s.close();
	}

}
