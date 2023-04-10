package practice;

import java.util.Scanner;

public class Fibonacci {

	int x = 0;
	int y = 1;

	public void display(int n) {
		// int count = 2;
		while (n > 0) {
			int sum = x + y;
			x = y;
			y = sum;
			// count++;
			n--;
			System.out.println(sum);
		}

	}

	public static void main(String[] args) {

		Fibonacci fib = new Fibonacci();
		System.out.println("Enter any number :");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		fib.display(n);
		sc.close();

	}

}
