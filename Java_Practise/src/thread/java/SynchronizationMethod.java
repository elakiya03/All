package thread.java;

class table {
	synchronized static void print(int n) {
		for (int i = 1; i <= 5; i++)
			System.out.print(n * i + " ");
		System.out.println("\n");
		try {
			Thread.sleep(700);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

public class SynchronizationMethod {

	public static void main(String[] args) {
		table obj = new table();
		Thread t1 = new Thread() {
			public void run() {
				obj.print(5);
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				obj.print(100);
			}
		};

		t1.start();
		t2.start();
	}

}
