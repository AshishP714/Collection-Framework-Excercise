package CollectionFramewor;

import java.util.TreeSet;

public class SortingReverceOrder {

	public static void main(String[] args) {
		
		TreeSet<String> t = new TreeSet<String>(new MyComparator());
		t.add("Raja");
		t.add("ShobhaRani");
		t.add("RajaKumari");
		t.add("GangaBhavani");
		t.add("Ramulamma");
		System.out.println(t);
	}
}