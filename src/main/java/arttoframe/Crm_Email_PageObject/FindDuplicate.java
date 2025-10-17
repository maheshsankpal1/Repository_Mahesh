package arttoframe.Crm_Email_PageObject;

import java.util.LinkedHashSet;

public class FindDuplicate {

	public static void main(String[] args) {
		String str1 = "hihellohowareyou";
		System.out.println("Original String:" + str1);

		String result = removeDuplicates(str1);
		System.out.println("String after removing duplicates :" + result);
	}

	public static String removeDuplicates(String str) {
		// Use LinkedHashSet to maintain order and remove duplicates
		LinkedHashSet<Character> charSet = new LinkedHashSet<>();

		for (char ch : str.toCharArray()) {
			charSet.add(ch); // Only unique characters will be stored
		}

		// Convert back to string
		StringBuilder sb = new StringBuilder();
		for (char ch : charSet) {
			sb.append(ch);
		}

		return sb.toString();

	}

}
