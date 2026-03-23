package Exercise;

import java.util.ArrayList;
import java.util.Collections;

class Sorting {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> i = new ArrayList<Integer>();
		i.add(20);
		i.add(10);
		i.add(25);
		i.add(5);
		i.add(15);
		i.add(0);
		
		System.out.println(i);
		Collections.sort(i, new Testing());
		System.out.println(i);
	}
}