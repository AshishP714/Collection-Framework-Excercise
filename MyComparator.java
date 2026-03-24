package CollectionFramewor;

import java.util.Comparator;

public class MyComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		 String s1 = o1.toString();
		 String s2 = (String)o2;
		 return s2.compareTo(s1);
	}	
}