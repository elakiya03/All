//implements list interface

package collection.list;

import java.util.Stack;

public class Stackclass {

	public static void main(String[] args) {

		Stack<String> s = new Stack<>();

		s.push("Elakiya");
		s.push("Virat");
		s.push("Jimin");
		s.push("JK");

		System.out.println("Peek element :" + s.peek());
		System.out.println(s);

	}
}
