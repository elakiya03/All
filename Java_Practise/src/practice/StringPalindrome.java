package practice;

import java.util.Scanner;

public class StringPalindrome {

	public void display(String s) {

		int i = 0;
		int j = s.length() - 1;

		boolean flag = true;

		while (i < j) {
			if (s.charAt(i++) != s.charAt(j--)) {
				flag = false;
				System.out.println("Not a palindrome");
				break;
			}

		}

		if (flag)
			System.out.println("Palindrome ");

	}

	public static void main(String[] args) {

		StringPalindrome str = new StringPalindrome();

		System.out.println("Enter any string :");

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		str.display(s);
		sc.close();

	}

}
