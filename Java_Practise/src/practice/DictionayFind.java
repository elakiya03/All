package practice;

import java.util.HashMap;

public class DictionayFind {

	public static boolean match_words(String[] dict, String[] sent, int n, int m) {
		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 0; i < dict.length; i++) {
			if (map.containsKey(dict[i]))
				map.put(dict[i], map.get(dict[i]) + 1);
			else
				map.put(dict[i], 1);
		}

		for (int i = 0; i < sent.length; i++) {
			if (!map.containsKey(sent[i]))
				return false;
		}

		return true;
	}

	public static void main(String[] args) {

		String dictionary[] = { "find", "a", "geeks", "all", "for", "on", "geeks", "answers", "inter" };

		int n = dictionary.length;

		String sentence[] = { "find", "all", "answers", "on", "geek", "for", "geeks" };

		int m = sentence.length;

		if (match_words(dictionary, sentence, n, m))
			System.out.println("YES");
		else
			System.out.println("NO");

	}

}
