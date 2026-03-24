package CollectionFramewor;

import java.util.TreeSet;

public class SortDecendingOrder {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>(new MyComparator3());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);			
		t.add(20);
		t.add(20);
		
		System.out.println("The output is :- "+t);
	}
}
