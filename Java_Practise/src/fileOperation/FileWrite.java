package fileOperation;

import java.io.FileWriter;

public class FileWrite {

	public static void main(String[] args) {

		try {
			FileWriter file = new FileWriter("a.txt");
			file.write("I am writing from the code");
			System.out.println("Written");
			file.flush();
			file.close();

		} catch (Exception e) {
			System.out.println("An Error Occured");
			e.printStackTrace();
		}
	}

}
