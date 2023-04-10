package practice;

import java.util.Scanner;

public class PeakNumber {

	public void display(Integer[] arr) {

		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] arg) {

		System.out.println("Size of an array: ");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Integer[] arr = new Integer[n];

		System.out.println("Enter " + n + " elements :");
		for (int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			arr[i] = temp;
		}

		PeakNumber peak = new PeakNumber();
		System.out.println("Peak Elements : ");
		peak.display(arr);
		sc.close();

	}
}
