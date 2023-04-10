//implement setsorted interface

package collection.setsorted;

import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {

		TreeSet<String> t = new TreeSet<String>();

		t.add("Elaks");
		t.add("Elak");
		t.add("Elaks");
		t.add("Jim");
		t.add("Anne");

		System.out.println(t);
	}

}
