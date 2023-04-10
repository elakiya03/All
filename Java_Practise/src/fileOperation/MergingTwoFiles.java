package fileOperation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class MergingTwoFiles {

	public static void main(String[] args) throws Exception {

		PrintWriter file3 = new PrintWriter("c.txt");

		BufferedReader file1 = new BufferedReader(new FileReader("a.txt"));
		String line = file1.readLine();
		while (line != null) {
			file3.println(line);
			line = file1.readLine();
		}

		BufferedReader file2 = new BufferedReader(new FileReader("b.txt"));

		line = file2.readLine();
		while (line != null) {
			file3.println(line);
			line = file2.readLine();
		}
		file3.flush();
		file3.close();
		file1.close();
		file2.close();

		// System.out.println(file3);
		System.out.println("Merging of two is done successfully");
	}

}
