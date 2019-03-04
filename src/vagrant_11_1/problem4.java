package vagrant_11_1;

public class problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min=50,max=0;
		for(int i=0;i<20;i++) {
			int data=(int)(50*Math.random());
			System.out.print(String.valueOf(data)+' ');
			min=(data<min)?data:min;
			max=(data>max)?data:max;
		}
		System.out.println('\n'+"max:"+String.valueOf(max)+'\n'+"min:"+String.valueOf(min));
	}

}
