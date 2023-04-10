package searching;

import java.util.Arrays;

public class BinarySerach {
	static boolean linearsearch(int[] a, int n) {
		Arrays.sort(a);

		int l = 0, r = a.length - 1;

		while (l <= r) {
			int mid = l + (r - l) / 2;

			if (a[mid] == n)
				return true;

			if (a[mid] < n)
				l = mid + 1;
			else
				r = mid - 1;
		}
		return false;
	}

	public static void main(String[] args) {
		int[] a = { 2, 7, 4, 1, 0, 6, 9, 5 };
		int n = 7;

		if (linearsearch(a, n))
			System.out.println("Element is present");
		else
			System.out.println("Not Present");
	}

}
