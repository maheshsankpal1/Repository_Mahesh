package Test;

public class RemoveDupliates {

	public static void main(String[] args) {
		String str1 = "automation";
		String result = "";

		for (int i = 0; i < str1.length(); i++) {
			char currentChar = str1.charAt(i);

			if (result.indexOf(currentChar) == -1) {
				result += currentChar;
			}

		}
		System.out.println("After removing duplicates: " + result); // Print the result

	}

}

 
