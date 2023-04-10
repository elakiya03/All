package practice;

import java.util.HashMap;
import java.util.Map;

public class StringConversion {

	public static void main(String[] args) throws Exception {

		String s = "aaaabbbb";

		Map<Character, Integer> m = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (!m.containsKey(c)) {
				m.put(c, 1);
			} else {
				m.put(c, (m.get(c) + 1));
			}
		}

		for (Map.Entry<Character, Integer> string : m.entrySet()) {
			System.out.print(string.getKey() + "" + string.getValue());
		}

	}

}
