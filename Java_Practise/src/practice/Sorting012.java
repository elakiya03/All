package practice;

import java.util.Scanner;

public class Sorting012 {

	int count0, count1, count2 = 0;

	public void display(Integer[] arr) {
		for (int x : arr) {
			if (x == 0)
				count0++;
			if (x == 1)
				count1++;
			if (x == 2)
				count2++;
		}
		int i = 0;
		while (count0 > 0) {
			arr[i++] = 0;
			count0--;
		}

		while (count1 > 0) {
			arr[i++] = 1;
			count1--;
		}

		while (count2 > 0) {
			arr[i++] = 2;
			count2--;
		}

		for (int x : arr) {
			System.out.print(x + " ");
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

		Sorting012 sort = new Sorting012();
		sort.display(arr);
		sc.close();
	}

}
