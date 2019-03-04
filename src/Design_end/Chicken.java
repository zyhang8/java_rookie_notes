package Design_end;
//鸡翁一值钱五，鸡母一值钱三，鸡雏三值钱一。百钱买百鸡，问鸡翁、鸡母、鸡雏各几何？
public class Chicken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
		// x+y+z=100,3*5*x+3*3*y+z=300
		for(x=0;x<=20;x++) {
			for(y=0;y<=33-x;y++) {
				z=100-x-y;
				if(3*5*x+3*3*y+z==300) {
					System.out.println("鸡翁"+Integer.toString(x)+"鸡母"+Integer.toString(y)+"鸡雏"+Integer.toString(z));
				}
			}
		}

	}
}
