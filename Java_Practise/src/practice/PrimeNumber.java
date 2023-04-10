package practice;

import java.util.Scanner;

public class PrimeNumber {

	boolean flag = true;

	public void display(int n) {
		if (n == 0)
			return;
		if (n == 1)
			return;

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.println("It is not prime number");
				flag = false;
				break;
			}

		}

		if (flag)
			System.out.println("It is prime number");
	}

	public static void main(String[] args) {

		PrimeNumber prime = new PrimeNumber();
		System.out.println("Enter any number :");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		prime.display(n);
		sc.close();
	}

}
