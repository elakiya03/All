/*  Given an array A of positive integers.
 *  Your task is to find the leaders in the array.
 *  An element of array is leader if it is greater than or 
 *  equal to all the elements to its right
 *  side. The rightmost element is always a leader
 */

package practice;

import java.util.ArrayList;

public class LeaderArray {

	static void display(int[] a) {
		ArrayList<Integer> l = new ArrayList<>();

		l.add(a[a.length - 1]);

		for (int i = a.length - 2; i > 0; i--) {

			if ((a[i] >= a[i + 1]) && a[i] >= a[i - 1]) {
				l.add(a[i]);
			}
		}

//		for (Integer i : l) {
//			System.out.print(i + " ");
//		}

		for (int i = l.size() - 1; i >= 0; i--) {
			System.out.print(l.get(i) + " ");
		}

	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 0 };
		display(a);
	}

}
