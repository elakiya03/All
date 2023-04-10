//implement set interface
//no duplicates
//no correct order

package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {

		HashSet<String> h = new HashSet<>();

		h.add("Ram");
		h.add("Virat");
		h.add("Ram");
		h.add("Elak");
		h.add("Jim");
		h.add("Faf");

		Iterator<String> i = h.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());
		}

		System.out.println(h);

	}

}
