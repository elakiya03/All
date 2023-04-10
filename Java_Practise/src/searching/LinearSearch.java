package searching;

public class LinearSearch {

	static boolean linearsearch(int[] a, int n) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == n)
				return true;
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
