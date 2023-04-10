package practice;

public class RearrangeNegPos {

	public void display(int[] arr) {

		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				if (i != j && j < arr.length) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j++] = temp;
				}
			}
		}

		for (int x : arr) {
			System.out.println(arr[x]);
		}
	}

	public static void main(String[] args) {

//		System.out.println("Size of an array: ");
//		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		int[] arr = new int[n];
//		
//		System.out.println("Enter "+n+" elements :");
//		for(int i=0;i<n-1;i++) {
//			int temp = sc.nextInt();
//			arr[i]=temp;
//		}

		int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
		RearrangeNegPos reg = new RearrangeNegPos();
		reg.display(arr);
		// sc.close();
	}

}
