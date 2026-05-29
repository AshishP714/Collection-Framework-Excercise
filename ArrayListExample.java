package CollectionFramewor;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		System.out.println("===== ArrayList =====");
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		
		System.out.println("Original List :- " + list);
		
		list.set(1, "Pineapple");
		
		System.out.println("Updated List :- " + list);
		
		list.remove("Orange");
		
		System.out.println("After removing last element from string :- " +list);
		
		Collections.sort(list);
		
		System.out.println("After sorting list :- " +list);
 	}
}