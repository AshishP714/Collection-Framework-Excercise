package CollectionFramewor;

import java.util.Comparator;

public class MyComparator3 implements Comparator<Integer> {

	public int compare(Integer i1, Integer i2) {
		
		Integer o1 = (Integer) i1;
		Integer o2 = (Integer) i2;

		if (o1 < o2) {
			return +1;
		} else if (o1 > o2) {
			return -1;
		} else {
			return 0;
		}
	}
}