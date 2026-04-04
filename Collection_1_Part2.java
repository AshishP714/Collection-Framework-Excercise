package CollectionFramework;

import java.util.*;

public class Collection_1_Part2 {

	// 1 List interface Practice
	public static void listDemo() {

		// ArrayList - Dynamic array, fast random access
		List<String> arrayList = new ArrayList<>();
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Cherry");
		arrayList.add("Banana"); // Duplicates allowed
		System.out.println("ArrayList :- " + arrayList);
		System.out.println("Get index 1 :- " + arrayList.indexOf("Cherry"));
		System.out.println("Set value of index 1 :- " + arrayList.set(1, "Mango"));

		// LinkedList - Doubly-linked list, fast insertion/deletion
		List<String> linkedList = new LinkedList<>();
		linkedList.add("Dog");
		linkedList.add("Elephant");
		linkedList.add(0, "Cat"); // Insert at index
		System.out.println("LinkedList: " + linkedList);

		// Convert ArrayList objects into set.
		Set<String> treeSet = new TreeSet<String>();
		treeSet.addAll(arrayList);

		System.out.println("TreeSet sorting + unique" + treeSet);

		// Convert set into ArrayList and print using normal for loop.
		List<String> newList = new ArrayList<>(treeSet);

		for (int i = 0; i < newList.size(); i++) {
			System.out.println(newList.get(i));
		}
	}

	public static void main(String[] args) {
		System.out.println("=== JAVA COLLECTION FRAMEWORK DEMO ===\n");

		listDemo();
//		setDemo();
//		queueDemo();
//		mapDemo();
//		stackDemo();
//		iteratorDemo();
//		collectionsUtilityDemo();
	}
}
