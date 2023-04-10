package fileOperation;

import java.io.File;

public class FileCreation {

	public static void main(String[] args) {

		try {
			File file = new File("a.txt");
//			if (file.exists())
//				System.out.println("File is created");
//			
			// So actual file is created when invoke createNewFile() method
			if (file.createNewFile()) {
				System.out.println("File is Created");
			} else {
				System.out.println("File already exits");
			}
		} catch (Exception e) {
			System.out.println("An error ocuured");
			e.printStackTrace();
		}
	}

}
