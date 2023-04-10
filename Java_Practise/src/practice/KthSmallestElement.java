package practice;

import java.util.HashMap;
import java.util.Map.Entry;

public class KthSmallestElement {

	static int kthsmallest(int[] a, int size) {

		HashMap<Integer, Integer> m = new HashMap<>();

		for (int i = 0; i < a.length; i++) {
			if (m.containsKey(a[i])) {
				m.put(a[i], m.get(a[i]) + 1);
			} else {
				m.put(a[i], 1);
			}
		}

		for (Entry<Integer, Integer> count : m.entrySet()) {
			if ((count.getValue() >= size / 2) && ((count.getValue() > 1))) {
				return count.getKey();
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		int[] a = { 1, 1, 3, 1, 2 };
		System.out.println(kthsmallest(a, 5));
	}

}
