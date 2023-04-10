//implements list interface
package collection.list;

import java.util.Vector;

public class Vectorclass {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<>();
		v.add(3);
		v.add(5);
		v.add(9);
		v.add(7);

		System.out.println(v);

		v.toArray();

		System.out.println(v);
	}

}
