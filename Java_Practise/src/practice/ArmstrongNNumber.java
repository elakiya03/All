package practice;

import java.util.Scanner;

public class ArmstrongNNumber {

	public void display(int n) {

		int sum = n;
		int a = 0;

		while (n > 0) {
			int temp = n % 10;
			a = a + (temp * temp * temp);
			n /= 10;

		}

		if (sum == a)
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");

	}

	public static void main(String[] args) {

		ArmstrongNNumber armstrongNNumber = new ArmstrongNNumber();

		System.out.println("Enter any digit number :");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		armstrongNNumber.display(n);
		sc.close();
	}

}
