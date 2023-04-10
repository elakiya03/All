package classes.java;

class outer {
	static int x;

	static int display(int n, int m) {
		return n * m;
	}

	static class inner {
		static {
			System.out.println("Displaying inside static block");
		}

		public void cal() {
			System.out.println(x = display(4, 5));
		}
	}
}

public class StaticClass {

	public static void main(String[] args) {
		new outer.inner().cal();
	}

}
