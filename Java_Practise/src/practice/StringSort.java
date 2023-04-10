package practice;

import java.util.Arrays;

public class StringSort {

	public static void main(String[] args) {

		String s = "elakiya";

		char[] a = s.toCharArray();

		Arrays.sort(a);

		for (char c : a) {
			System.out.print(c);
		}

	}

}
