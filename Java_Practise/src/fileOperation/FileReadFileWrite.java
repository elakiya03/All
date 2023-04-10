package fileOperation;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReadFileWrite {

	public static void main(String[] args) {
		try {
			FileReader f1 = new FileReader("a.txt");
			FileWriter f2 = new FileWriter("b.txt");

			String str = "";
			int i;

			while ((i = f1.read()) != -1) {
				str += (char) i;
			}
			f2.write(str);
			f2.append("\n\t\t- By Elakiya");
			f1.close();
			f2.flush();
			f2.close();

			System.out.println("the operation is succesfully done");
		} catch (Exception e) {
			System.out.println("An Error has been occured");
		}
	}

}
