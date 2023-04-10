package practice;

import java.util.Scanner;

public class AddWithout {

	static int add(int x, int y) {
		if (y == 0)
			return x;

		else
			return add(x ^ y, (x & y) << 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x :");
		int x = sc.nextInt();

		System.out.println("Enter y:");
		int y = sc.nextInt();

		System.out.println("Addition of two numbers : " + add(x, y));
		sc.close();
	}

}
