package Design9_1;
import java.util.Scanner;
public class homework9_1 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
		}
		System.out.println("1到100的和为:");
		System.out.println(sum);
		int factorial_num=1;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<n;i++) {
			factorial_num=factorial_num*i;
		}
		System.out.print(n);
		System.out.println("的阶乘为:");
		System.out.println(factorial_num);
	}
}
