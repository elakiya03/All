package fileOperation;

import java.io.FileReader;

public class FileRead {

	public static void main(String[] args) {

		try {
//			File file = new File("b.txt");
//			Scanner read = new Scanner(file);
//
//			while (read.hasNextLine()) {
//				String data = read.nextLine();
//				System.out.println(data);
//			}
//			System.out.println("Length of the file :" + file.length());
//			read.close();

			FileReader file = new FileReader("a.txt");
			int i;
			String str = "";
			while ((i = file.read()) != -1) {
				str += (char) i;

			}
			System.out.println(str);
			file.close();

		} catch (Exception e) {
			System.out.println("An error has been occured");
			e.printStackTrace();
		}
	}

}
