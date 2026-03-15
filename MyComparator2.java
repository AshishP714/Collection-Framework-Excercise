package CollectionFramewor;

import java.util.Comparator;

public class MyComparator2 implements Comparator {

	// various possible implementations of compare() method.
	
	@Override
	public int compare(Object obj1, Object obj2) {
		Integer I1 = (Integer) obj1;
		Integer I2 = (Integer) obj2;
		
//		return I1.compareTo(I2);
//		return -I1.compareTo(I2);
//		return I2.compareTo(I1);
//		return -I2.compareTo(I1);
//		return +1;
//		return -1;
		return 0;
	}
}