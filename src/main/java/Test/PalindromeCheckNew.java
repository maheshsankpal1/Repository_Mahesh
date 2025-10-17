package Test;

public class PalindromeCheckNew {

	public static void main(String[] args) {
		String str = "Madamy";
		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		if (reverse.equalsIgnoreCase(str)) {
			System.out.println("String is palindrome");

		} else
			System.out.println("String is not palindrome");
	}

}
