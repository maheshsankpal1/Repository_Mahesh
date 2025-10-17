package Test;

import java.util.Arrays;

public class CheckSorted {

	public static boolean checkSorted(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr = { 43, 21, 53, 5, 11, 2, 44, };
		boolean result = checkSorted(arr);
		System.out.println("Is sorted" + result);

	}

}
