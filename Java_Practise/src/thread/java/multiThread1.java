package thread.java;

public class multiThread1 extends Thread {

	@Override
	public void run() {
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
		multiThread1 t = new multiThread1();

		t.start();
	}

}
