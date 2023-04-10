package collection.set;

import java.util.LinkedHashSet;

public class Linkedhashset {

	public static void main(String[] args) {

		LinkedHashSet<String> l = new LinkedHashSet<>();

		l.add("Ram");
		l.add("Virat");
		l.add("");
		l.add("Jim");
		l.add("Ram");
		l.add("Elak");

		l.add("Faf");
		l.add("Elak");
		System.out.println(l);
	}

}
