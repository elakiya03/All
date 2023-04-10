package practice;

import java.util.Scanner;

public class ReverseArray {

	public void display(Integer[] arr) {

		int i = 0;
		int j = arr.length - 1;

		while (i < j) {
			int temp = arr[i];
			arr[i++] = arr[j];
			arr[j--] = temp;
		}

		System.out.println("Reversed Array:");
		for (int x : arr) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {

		System.out.println("Size of an array: ");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Integer[] arr = new Integer[n];

		System.out.println("Enter " + n + " elements :");
		for (int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			arr[i] = temp;
		}

		ReverseArray rev = new ReverseArray();
		rev.display(arr);
		sc.close();
	}

}
