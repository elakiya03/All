package practice;

import java.util.HashSet;

public class CountWords {

	public static void main(String[] args) {
		String[] words = { "welcome", "to", "geeks", "portal" };
		String str = "geeksforgeeks is a computer science portal for geeks";
		int count = 0;
		String[] s = str.split(" ");

		HashSet<String> h = new HashSet<>();

		for (String string : words) {
			h.add(string);
		}

		for (String st : s) {
			if (h.contains(st)) {
				count++;
			}
		}

		System.out.println(count);
	}

}
