//implement queue interface

package collection.queue;

import java.util.PriorityQueue;

public class Priorityqueue {

	public static void main(String[] args) {

		PriorityQueue<Integer> p = new PriorityQueue<>();

		p.add(2);
		p.add(4);
		p.add(7);

		System.out.println(p);

	}

}
