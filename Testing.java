package Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Testing implements Comparator<Integer> {
	
	public int compare(Integer i1, Integer i2) {
		
		if (i1 < i2) {
			return -1;
		} else if (i1 > i2) {
			return +1;
		} else {
			return 0;
		}
	}
}