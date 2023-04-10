package practice;

public class SecondMax {

	static class forest {
		private void display() {
			System.out.println("It is from inner class");
		}
	}

	public static void main(String... args) {

		SecondMax.forest secondMax = new SecondMax.forest();
		secondMax.display();

//		int[] a = { 1, 18, 2, 3, 4, 5, 12 };
//
//		Arrays.sort(a);
//		for (int i : a) {
//			System.out.println(i);
//		}
//
//		int max = a[0];
//		int secmax = a[0];
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] > max) {
//				secmax = max;
//				max = a[i];
//			}
//			if (a[i] < max && a[i] > secmax) {
//				secmax = a[i];
//			}
//		}
//		System.out.println(secmax);
	}

}
