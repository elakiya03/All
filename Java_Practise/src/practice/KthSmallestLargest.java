package practice;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestLargest {

	public void display(Integer[] arr, int k) {

		Arrays.sort(arr);
		System.out.println("Kth Smallest element : " + arr[k - 1]);
		System.out.println("Kth Smallest element : " + arr[arr.length - k]);
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

		System.out.println("Enter K:");
		int k = sc.nextInt();

		KthSmallestLargest s = new KthSmallestLargest();
		s.display(arr, k);
		sc.close();
	}

}
