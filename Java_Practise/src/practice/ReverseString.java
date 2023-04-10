package practice;

import java.util.Scanner;

public class ReverseString {

	public void display(String str) {
		String strRev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			strRev += str.charAt(i);
		}

		System.out.println("Reversed String : " + strRev);
	}

	public static void main(String[] args) {

		ReverseString rev = new ReverseString();
		System.out.println("Type something... ");

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String s = "elakiya";
		s.concat("sundar");
		System.out.println(s);
		rev.display(str);
		sc.close();
	}

}
