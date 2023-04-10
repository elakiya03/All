package fileOperation;

import java.io.File;

public class CheckFileDirectory {

	public static void main(String[] args) {

		try {
			File file = new File("C://Desktop//elakiya.purple");
			if (file.exists()) {
				System.out.println("Directory and File do exists");
			} else {
				System.out.println("Its a lie 🤣😏🙄😣😜😴🙃🖤💚❤");
			}
		} catch (Exception e) {
			System.out.println("Errorr");
			e.printStackTrace();
		}
	}

}
