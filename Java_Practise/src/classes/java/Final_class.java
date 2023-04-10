package classes.java;

/*final*/class base {
	void display() {
		System.out.println("it is in base class");
	}
}

final class child extends base { // cannot extend final class
	void display() {
		System.out.println("it is in child class");
	}
}

public class Final_class {

	public static void main(String[] args) {
		new child().display();

	}

}
