package fileOperation;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadNumberOnlyAndSum {

	private static int count = 0;
	private static int sum = 0;

	public static void main(String[] args) {

		try {
			BufferedReader file = new BufferedReader(new FileReader("a.txt"));
			int i;
			String str = "";
			while ((i = file.read()) != -1) {
				str += (char) i;

			}

			for (int i1 = 0; i1 < str.length(); i1++) {
				if (Character.isDigit(str.charAt(i1))) {
					count++;
					sum += str.charAt(i1) - 48;
				}
			}
			file.close();
			System.out.println("\nTotal Number of Integers in file : " + count);
			System.out.println("Total sum of Integers : " + sum);
		} catch (Exception e) {
			System.out.println("Some error occured");
			e.printStackTrace();
		}
	}

}
