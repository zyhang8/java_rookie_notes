package et_cetera;
import java.util.Scanner;

public class padding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int x = 0;
		x = s.nextInt();
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(x);
			}
			System.out.println();
		}
		s.close();
	}

}
