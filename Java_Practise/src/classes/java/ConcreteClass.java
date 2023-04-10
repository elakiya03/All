package classes.java;

/*
 * concrete class is normal class where it implement  
 * for all of its methods and no abstract methods
 *  
 * It can extend parent, abstract class and interface 
 * 
 */
public class ConcreteClass {

	static int sum(int x, int y) {
		return x + y;
	}

	public static void main(String args[]) {
		int p = sum(10, 8);
		System.out.println("Sum: " + p);
	}

}
