package collection.map;

import java.util.Hashtable;
import java.util.Map;

public class Hashtableclass {

	public static void main(String[] args) {

		Hashtable<Integer, String> h = new Hashtable<>();
		h.put(1, "Jimin");
		h.put(2, "Taylor");
		h.put(3, "Virat");

		for (Map.Entry<Integer, String> string : h.entrySet()) {
			System.out.println(string.getKey() + " " + string.getValue());
		}
	}

}
