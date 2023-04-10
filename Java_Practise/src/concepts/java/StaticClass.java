package concepts.java;

public class StaticClass {
	// static method
	public static void display() {
		System.out.println("displaying without creating object");
	}

	//
	static int a = 10;
	static int b;
	// static block
	static {
		System.out.println("Static block");
		b = a * 10;
	}

	// instance can access static variable and methods directly
	public int ass() {
		return ++a;
	}

	public static void main(String[] args) {
		// display();
		StaticClass s = new StaticClass();
		System.out.println(s.ass());
		System.out.println(a + " " + b);
	}

}
