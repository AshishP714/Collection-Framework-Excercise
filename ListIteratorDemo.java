package CollectionFramewor;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		LinkedList  l = new LinkedList();
		l.add("Tushar");
		l.add("Abhijeet");
		l.add("Ashish");
		l.add("Milind");
		System.out.println(l);
		
		ListIterator Itr = l.listIterator();
		while(Itr.hasNext()) {
			String s = (String)Itr.next();
			if (s.equals("Abhijeet")) {
				Itr.remove();
			} else if(s.equals("Milind")) {
				Itr.add("Abhi");
			} else if(s.equals("Ashish")) {
				Itr.set("Nikhil");
			}
		}
		System.out.println(l);
	}
}