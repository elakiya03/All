package practice;

public class Stringoperation {

	public static String add(String temp, int n) {
		String r = "";
		for (int i = 0; i < n; i++) {
			r += temp;
		}
		return r;
	}

	public static void main(String[] args) throws Exception {

		String s = "a3b2";
		StringBuilder rev = new StringBuilder();
		String temp = "";
		for (int x = 0; x < s.length() - 1; x++) {
			if (Character.isAlphabetic(s.charAt(x)))
				temp += s.charAt(x);
			if (Character.isDigit(s.charAt(x + 1))) {

				rev.append(add(temp, s.charAt(x + 1) - 48));
				temp = "";
			}
		}

		System.out.println(rev);

	}
}
