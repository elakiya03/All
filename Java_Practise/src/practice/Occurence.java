package practice;

import java.util.Scanner;

public class Occurence {

	public int display(Integer[] arr, int k) {
		int count = 0;
		for (int x : arr) {
			if (x == k)
				count++;
		}

		return count;
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

//		for(int i : arr) {
//			arr[i] = sc.nextInt();
//		}

		System.out.println("Enter x:");
		int k = sc.nextInt();

		Occurence oc = new Occurence();
		System.out.println("Count of " + k + " : " + oc.display(arr, k));
		sc.close();
	}

}
