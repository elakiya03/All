package thread.java;

public class multiThread3 {

	public static void main(String[] args) {
		new Thread() {
			public void run() {
				System.out.println("Are we meant to be together?");
			}
		}.start();
	}

}
