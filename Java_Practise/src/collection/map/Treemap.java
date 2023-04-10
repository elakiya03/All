package collection.map;

import java.util.Map;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {

		TreeMap<Integer, String> t = new TreeMap<>();
		t.put(1, "Jimin");
		t.put(2, "Taylor");
		t.put(3, "Virat");

		for (Map.Entry<Integer, String> string : t.entrySet()) {
			System.out.println(string.getKey() + " " + string.getValue());
		}
		System.out.println(t);
	}

}
