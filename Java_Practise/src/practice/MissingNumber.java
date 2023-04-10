package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MissingNumber {

	static int display(ArrayList<Integer> l) {
		Collections.sort(l);

		for (int i = 1; i < l.size(); i++) {
			if ((l.get(i) - l.get(i - 1)) > 1) {
				return i + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of an array : ");
		int n = sc.nextInt();

		ArrayList<Integer> l = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			l.add(sc.nextInt());
		}

		System.out.println("Missing Number are : " + display(l));
	}

}
