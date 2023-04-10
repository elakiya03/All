package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Hashmap {

	public static void main(String[] args) {

		HashMap<Integer, String> h = new HashMap<>();

		h.put(1, "Jimin");
		h.put(2, "Taylor");
		h.put(3, "Virat");

		System.out.println(h);

		Iterator<Entry<Integer, String>> itr = h.entrySet().iterator();
		// Iterator<Integer, String> itr= h.iterator();

		while (itr.hasNext()) {
			Entry<Integer, String> entry = itr.next();
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
	}

}
