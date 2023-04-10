package fileOperation;

import java.io.File;
import java.util.Arrays;

public class ListFiles {

	public static void main(String[] args) {

		try {
			File file = new File("C:\\Users\\elakiya.ks\\Documents");

			System.out.println(Arrays.toString(file.list()));
		} catch (Exception e) {
			System.out.println("Errorr🤣😏🙄😣😜😴🙃🖤💚❤");
			e.printStackTrace();
		}
	}

}
