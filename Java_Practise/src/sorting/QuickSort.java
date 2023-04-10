package sorting;

public class QuickSort {

	static int partition(int[] a, int l, int r) {
		int pivot = a[r];
		int i = l - 1;

		for (int j = l; j <= r - 1; j++) {
			if (a[j] < pivot) {
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}

		int temp = a[i + 1];
		a[i + 1] = a[r];
		a[r] = temp;

		return i + 1;
	}

	static void quicksort(int[] a, int l, int r) {

		if (l < r) {
			int pi = partition(a, l, r);
			quicksort(a, l, pi - 1);
			quicksort(a, pi + 1, r);
		}

	}

	public static void main(String[] args) {
		int[] a = { 2, 7, 4, 1, 0, 6, 9, 5 };
		quicksort(a, 0, a.length - 1);

		for (int i : a) {
			System.out.println(i);
		}
	}

}
