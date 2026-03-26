package CollectionFramewor;

import java.util.HashMap;
import java.util.Map;

public class MapTwoSumProblem {

	public static void main(String[] args) {
		
        int arr[] = {2,7,11,15};
        int target = 9;

        Map<Integer, Integer> map = new HashMap<>();

        for(int num : arr) {
            int diff = target - num;

            if(map.containsKey(diff)) {
                System.out.println("Pair: " + diff + ", " + num);
            }

            map.put(num, 1);
        }
    }
}