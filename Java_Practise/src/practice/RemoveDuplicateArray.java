package practice;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateArray {

	public static void main(String[] args) {

		int[] arr = { 5, 6, 7, 6, 3, 5, 6, 1, 1, 4 };

		HashMap<Integer, Integer> m = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (m.containsKey(arr[i])) {
				m.put(arr[i], m.get(arr[i]) + 1);
			} else {
				m.put(arr[i], 1);
			}
		}

		for (Map.Entry<Integer, Integer> i : m.entrySet()) {
			if (i.getValue() == 1)
				System.out.println(i.getKey());
		}

	}

}
