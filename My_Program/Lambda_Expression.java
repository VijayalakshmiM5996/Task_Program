package My_Program;

import java.util.ArrayList;

class Lambda_Expression{
	public static void main(String args[]) {
		ArrayList <Integer>show=new ArrayList<Integer>();
		show.add(100);
		show.add(101);
		show.add(102);
		show.add(103);
		show.forEach(n->System.out.println(n));
		//show.forEach(n->{if(n%2==0)System.out.println(n%2==0);});
	}
}