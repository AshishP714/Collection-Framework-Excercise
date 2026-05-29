package CollectionFramewor;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		System.out.println("===== HashSet =====");

		HashSet<Integer> hashSet = new HashSet<Integer>();

		hashSet.add(31);
		hashSet.add(11);
		hashSet.add(41);
		hashSet.add(21);
		hashSet.add(51);

		System.out.println("Original Set :- " + hashSet);

		hashSet.remove(21);

		System.out.println("After removing Set :- " + hashSet);
	}
}