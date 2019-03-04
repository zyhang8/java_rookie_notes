package vagrant_11_1;

import java.util.TreeSet;

public class explorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer>s=new TreeSet<Integer>();
		TreeSet<Integer>subs=new TreeSet<Integer>();
		for(int i=601;i<617;i++)
			if(i%2==0)s.add(i);
		subs=(TreeSet)s.subSet(604,true,611,true);
		s.add(620);
		System.out.println(s+""+subs);
	}
}
