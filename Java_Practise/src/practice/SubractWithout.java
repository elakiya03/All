package practice;

import java.util.Scanner;

public class SubractWithout {

	static int subract(int x, int y) {
		if (y == 0)
			return x;

		return subract(x ^ y, (~x & y) << 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x :");
		int x = sc.nextInt();

		System.out.println("Enter y:");
		int y = sc.nextInt();

		System.out.println("subraction of two numbers : " + subract(x, y));

		sc.close();

	}

}
