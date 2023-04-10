package fileOperation;

import java.io.File;

public class FileDeletion {

	public static void main(String[] args) {

		try {
			File file = new File("a.txt");
			if (file.delete()) {
				System.out.println("File is deleted");
			} else if (!file.exists()) {
				System.out.println("File is not Existed");
			} else {
				System.out.println("Cannot delete the file");
			}
		} catch (Exception e) {

			System.out.println("An error has been occured");
			e.printStackTrace();
		}
	}

}
