package Design_end;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=3;
		for(int i=3;i<=100;i++) {
			int j;
			for(j=2;j<=i;j++) {
				if(i%j==0)break;
			}
			if(j==i)sum=sum+i;
		}
		System.out.println(sum);
	}

}
