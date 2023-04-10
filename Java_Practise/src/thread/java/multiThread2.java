package thread.java;

public class multiThread2 implements Runnable {
	@Override
	public void run() {
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {

		Thread t = new Thread(new multiThread2());
		t.start();
	}

}
