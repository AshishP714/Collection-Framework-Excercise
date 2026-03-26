package CollectionFramewor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortMapByValues {

	public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 3);
        map.put("B", 1);
        map.put("C", 2);

        List<Map.Entry<String, Integer>> list =
                new ArrayList<>(map.entrySet());

        list.sort(Map.Entry.comparingByValue());

        for(Map.Entry<String, Integer> e : list) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
