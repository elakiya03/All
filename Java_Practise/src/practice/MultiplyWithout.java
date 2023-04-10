package practice;

import java.util.Scanner;

public class MultiplyWithout {

	static int product(int a, int b) {

		if (b == 0)
			return 0;

		if (b > 0)
			return (a + product(a, b - 1));

		if (b < 0)
			return -product(a, -b);

		return -1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x :");
		int x = sc.nextInt();

		System.out.println("Enter y:");
		int y = sc.nextInt();

		System.out.println("Product of two numbers : " + product(x, y));

//		System.out.println("----------------------------");
//		System.out.println("Bitwise Exclusive OR :" + (x ^ y));
//		System.out.println("Bitwise AND :"+(x & y));
//		System.out.println("Bitwise OR :" +(x | y));
//		System.out.println("Bitwise complement :" + ~x + ~y);
//		System.out.println("Left shift :"+ (x << 1));
//		System.out.println("Right shift : "+ (y >> 1));
//		System.out.println("----------------------------");
		sc.close();
	}

}
