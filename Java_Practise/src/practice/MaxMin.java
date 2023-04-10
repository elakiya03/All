package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// find max and min elments in an array
public class MaxMin {

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

		System.out.println("Maximum element : " + Collections.max(Arrays.asList(arr)));
		System.out.println("Minimum element : " + Collections.min(Arrays.asList(arr)));
		sc.close();

	}

}
