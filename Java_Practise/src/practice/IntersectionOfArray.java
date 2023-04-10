package practice;

import java.util.Scanner;

public class IntersectionOfArray {

	public void display(Integer[] a1, Integer[] a2) {

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Size of Array1 :");
		int n = sc.nextInt();
		Integer[] arr1 = new Integer[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}

		System.out.println("Size of Array2");
		int m = sc.nextInt();
		Integer[] arr2 = new Integer[m];
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}

		IntersectionOfArray inn = new IntersectionOfArray();
		inn.display(arr1, arr2);
		sc.close();
	}

}
