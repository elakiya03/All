package sorting;

/*
 * 
 * iterate back and forth to place element in their correct position
 */
public class InsertionSort {

	static void insertionsort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int key = a[i];
			int j = i - 1;

			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
		}

		for (int i : a) {
			System.out.print(i);
		}
	}

	public static void main(String[] args) {
		int[] a = { 2, 7, 4, 1, 0, 6, 9, 5 };
		insertionsort(a);
	}

}
