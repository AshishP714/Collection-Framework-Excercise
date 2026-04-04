package CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Collection_Lecture_1 {

	public static void main(String[] args) {

		ArrayList<Object> list = new ArrayList<Object>();
		list.add("A");
		list.add(10);
		list.add("A");
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		list.add(2, "N");
		list.add("J");
		System.out.println(list);

		HashSet<Integer> str = new HashSet<Integer>();
		str.add(1);
		str.add(2);
		str.add(3);
		str.add(1);
		System.out.println("HashSet Integer :- " + str);

		HashSet<String> tree = new HashSet<String>();
		tree.add("Ashish");
		tree.add("Ashish");
		tree.add("Abhijeet");
		tree.add("Tushar");
		tree.add("Pranabh");
		System.out.println("HashSet :- " + tree);

		TreeSet<String> mam = new TreeSet<String>();
		mam.add("Ashish");
		mam.add("Abhijeet");
		mam.add("Tushar");
		mam.add("Pranabh");
		mam.add("Ashish");
		System.out.println("Sorted set :- " + mam);
		
		LinkedList<Integer> n = new LinkedList<Integer>();
		n.add(5);
		System.out.println(n);
	}
}