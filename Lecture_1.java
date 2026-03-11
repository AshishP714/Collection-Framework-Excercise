package CollectionFramewor;

import java.util.*;

public class Lecture_1 {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("A");
		l.add(10);
		l.add("A");
		l.add(null);
		System.out.println(l); // [A, 10, A, null]
		l.remove(2);
		System.out.println(l); // [A, 10, null]
		l.add(2, "S");
		l.add("P");
		System.out.println(l); // [A, 10, S, null, P]
	}
}