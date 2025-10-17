package Test;

public class PalindromeCheck {

	public static void main(String[] args) {
		String str1 = "TENET";
		String str2 = "";
		int n = str1.length() - 1;
		

		for (int i = n; i >= 0; i--) {
			str2 += str1.charAt(i);

		}

		if (str1.equals(str2)) {
			System.out.println("Given string is palindrome");
		} else {
			System.out.println("Given string is not palindrome");

		}

	}

}
