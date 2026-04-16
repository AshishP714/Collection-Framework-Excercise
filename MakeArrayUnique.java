package CorePractice;

import java.util.TreeSet;

public class MakeArrayUnique {

	public static void main(String[] args) {

		int array[] = { 1, 1, 2, 2, 3 };

		int temp[] = new int[array.length];
		int count = 0;

		// Without set

		for (int i = 0; i < array.length; i++) {
			boolean isDuplicate = false;

			for (int j = 0; j < count; j++) {
				if (array[i] == temp[j]) {
					isDuplicate = true;
					break;
				}
			}

			if (isDuplicate == false) {
				temp[count] = array[i];
				count++;
			}
		}

		for (int i = 0; i < count; i++) {
			System.out.print(temp[i] + " ");
		}

		// Using Set
		System.out.println("\nUsing set");

		TreeSet<Integer> set = new TreeSet<Integer>();

		for (int i = 0; i < array.length; i++) {
			set.add(array[i]);
		}

		for (int a : set) {
			System.out.print(a + " ");
		}
	}
}