package Design_end;
//����һֵǮ�壬��ĸһֵǮ����������ֵǮһ����Ǯ��ټ����ʼ��̡���ĸ�����������Σ�
public class Chicken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
		// x+y+z=100,3*5*x+3*3*y+z=300
		for(x=0;x<=20;x++) {
			for(y=0;y<=33-x;y++) {
				z=100-x-y;
				if(3*5*x+3*3*y+z==300) {
					System.out.println("����"+Integer.toString(x)+"��ĸ"+Integer.toString(y)+"����"+Integer.toString(z));
				}
			}
		}

	}
}
