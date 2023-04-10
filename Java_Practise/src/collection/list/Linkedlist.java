//implements list interface
package collection.list;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<>();
		l.add(8);
		l.add(3);
		l.add(9);
		l.add(0);
		l.add(5);

		for (Integer integer : l) {
			System.out.println(integer);
		}

		System.out.println(l);
	}

}
