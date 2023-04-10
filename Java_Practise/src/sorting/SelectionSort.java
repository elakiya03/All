package sorting;

public class SelectionSort {

	static void selectionsort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;

		}

		for (int i : a) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		int[] a = { 2, 7, 4, 1, 0, 6, 9, 5 };
		selectionsort(a);

	}

}
