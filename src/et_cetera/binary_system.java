package et_cetera;
import java.util.Scanner;

public class binary_system {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int x = 0, y;
		x = s.nextInt();
		while (x >= 0 && x <= 250) {
			if (x <= 127) {
				y = 0;
				System.out.println("y:" + y);
			} else {
				y = 1;
				System.out.println("y:" + y);
			}
			x = s.nextInt();
		}
		s.close();
	}

}
