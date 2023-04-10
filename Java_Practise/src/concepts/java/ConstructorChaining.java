package concepts.java;

public class ConstructorChaining {

	ConstructorChaining() {
		this(5);
		System.out.println("Constructor");
	}

	ConstructorChaining(int x) {
		this(2, 4);
		System.out.println(x);
	}

	ConstructorChaining(int x, int y) {
		System.out.println(x * y);
	}

	public static void main(String... args) {
		new ConstructorChaining();
	}
}
