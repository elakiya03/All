package thread.java;

class Sender {
	public void sendermsg(String msg) {

		synchronized (this) {
			System.out.println("Sending message");

			try {
				Thread.sleep(800);
			} catch (Exception e) {
				System.out.println(e);
			}

			System.out.println(msg + "\nSent");
		}
	}
}

class SenderThread extends Thread {
	private String msg;
	Sender s;

	SenderThread(String m, Sender obj) {
		msg = m;
		s = obj;
	}

	public void run() {

		s.sendermsg(msg);

	}
}

public class Sychronizeblock {

	public static void main(String[] args) {
		Sender s = new Sender();
		SenderThread s1 = new SenderThread("A message: ily", s);
		SenderThread s2 = new SenderThread("A message: ihy", s);

		s1.start();
		s2.start();

		try {
			s1.join();
			s2.join();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
