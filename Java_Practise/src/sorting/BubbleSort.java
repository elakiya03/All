package sorting;

/*
 * compares adjacent element and swap them if they are in wrong order
 * 
 * 
 * 
 * 
 */
public class BubbleSort {

	static void bubblesort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

		for (int i : a) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		int[] a = { 2, 7, 4, 1, 0, 6, 9, 5 };
		bubblesort(a);
	}

}
