package practice;

import java.util.Scanner;

public class SubarraySum {

	public void display(Integer[] arr, int sum) {

		int start = 0, currsum = arr[0], i;

		for (i = 0; i < arr.length; i++) {
			if (sum > currsum && start < i) {
				currsum += arr[start++];
			}
		}

		if (sum == currsum) {
			System.out.println("[" + start + "," + i + "]");
		} else {
			System.out.println("No subarray found");
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

		System.out.println("Enter sum : ");
		int sum = sc.nextInt();

		SubarraySum subarraySum = new SubarraySum();
		subarraySum.display(arr, sum);
		sc.close();

	}

}
