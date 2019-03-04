package Design9_1;

public class bit_operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=7,b=-7;
		System.out.println(Integer.toBinaryString(a)+' '+Integer.toString(a));
		System.out.println(Integer.toBinaryString(a&b)+' '+Integer.toString(a&b));
		System.out.println(Integer.toBinaryString(a|b)+' '+Integer.toString(a|b));
		System.out.println(Integer.toBinaryString(a^b)+' '+Integer.toString(a^b));
		System.out.println(Integer.toBinaryString(a>>2)+' '+Integer.toString(a>>2));
		System.out.println(Integer.toBinaryString(a<<2)+' '+Integer.toString(a<<2));
		System.out.println(Integer.toBinaryString(a>>>2)+' '+Integer.toString(a>>>2));
	}

}
