package Design_end;

public class Birthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum;
		for(int i=1;;i++) {
			sum=0;
			for(int j=i;sum<236;j++) {
				sum+=j;
			}
			if(sum==236) {
				System.out.println(i);
				break;
			}
		}
	}

}
