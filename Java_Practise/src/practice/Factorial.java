package practice;

import java.util.Scanner;

public class Factorial {

	int count = 1;

	public void display(int n) {

		for (int i = 1; i <= n; i++) {
			count *= i;
		}

		System.out.println(count);
	}

	public static void main(String[] args) {

		Factorial fact = new Factorial();

		System.out.println("Enter any number :");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		fact.display(n);
		sc.close();
	}

}
