//implement dequeue interface

package collection.dequeue;

import java.util.ArrayDeque;

public class Arraydeque {

	public static void main(String[] args) {

		ArrayDeque<Integer> d = new ArrayDeque<>();

		d.addLast(4);
		d.addFirst(3);
		d.add(6);

		System.out.println(d);
	}

}
