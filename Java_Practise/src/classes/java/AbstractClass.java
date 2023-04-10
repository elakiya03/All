package classes.java;

interface x {
	int product(int a, int b);
}

abstract class abst implements x {
	public int product(int a, int b) {
		return a * b;
	}
}

public class AbstractClass extends abst {

	public static void main(String[] args) {
		// new AbstractClass();
		System.out.println(new AbstractClass().product(3, 2));
	}

}
