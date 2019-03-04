package vagrant_11_1;
import java.util.Scanner;
public class problem5 {
// n的阶层分之一的和
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		float sum=0;
		for(int i=1;i<=n;i++) {
			sum+=1.0/i;
		}
		System.out.println(sum);
	}

}
