package practice;

import java.util.HashMap;
import java.util.Scanner;

public class UnionOfArray {

	public void display(Integer[] a1, Integer[] a2) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a1.length; i++) {
			if (map.containsKey(a1[i])) {
				map.put(a1[i], map.get(a1[i]) + 1);
			} else {
				map.put(a1[i], 1);
			}
		}

		for (int i = 0; i < a2.length; i++) {
			if (map.containsKey(a2[i])) {
				map.put(a1[i], map.get(a2[i]) + 1);
			} else {
				map.put(a2[i], 1);
			}
		}

		for (int i : map.keySet()) {
			System.out.println(i);
		}
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

		UnionOfArray uni = new UnionOfArray();
		uni.display(arr1, arr2);
		sc.close();
	}

}
