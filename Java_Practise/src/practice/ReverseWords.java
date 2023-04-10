package practice;

public class ReverseWords {

//	public static void main(String[] args) {

//		String[] str = "elakiya, you can do this".split(" ");
//		String ans = "";
//		for (int i = str.length - 1; i >= 0; i--) {
//			ans += str[i] + " ";
//		}
//
//		System.out.println(ans);

	// Reverse the letters
	// of the word
	static void reverse(char str[], int start, int end) {
		// Temporary variable
		// to store character
		char temp;

		while (start <= end) {
			// Swapping the first
			// and last character
			temp = str[start];
			str[start] = str[end];
			str[end] = temp;
			start++;
			end--;
		}
	}

	// Function to reverse words
	static char[] reverseWords(char[] s) {
		// Reversing individual words as
		// explained in the first step

		int start = 0;
		for (int i = 0; i < s.length; i++) {
			// If we see a space, we
			// reverse the previous
			// word (word between
			// the indexes start and end-1
			// i.e., s[start..end-1]
			if (s[i] == ' ') {
				reverse(s, start, i);
				start = i + 1;
			}
		}

		// Reverse the last word
		reverse(s, start, s.length - 1);

		// Reverse the entire String
		reverse(s, 0, s.length - 1);
		return s;
	}

	// Driver Code
	public static void main(String[] args) {
		String s = "i like this program very much ";

		// Function call
		char[] p = reverseWords(s.toCharArray());
		System.out.print(p);

	}

}
