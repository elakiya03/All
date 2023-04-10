package concepts.java;

class base {

	String name;

	base() {
		this("");
		System.out.println("No args constructor of base");
	}

	base(String name) {
		this.name = name;
		System.out.println("Parameterized constructor of base:" + name);
	}

	private void display() {
		System.out.println("Private");
	}

}

public class ConstructorChaining2 extends base {

	ConstructorChaining2() {
		System.out.println("No args constructor of derived");
	}

	ConstructorChaining2(String name) {
		super(name);
		System.out.println("Parameterized constructor of derived : " + name);
	}

	public static void main(String[] args) {

		ConstructorChaining2 c = new ConstructorChaining2("Elakiya");
		System.out.println("---------------------------------");
		ConstructorChaining2 cc = new ConstructorChaining2();

		// cannot call private method from other class
		// c.display();
	}

}
