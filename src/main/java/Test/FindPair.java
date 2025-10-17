package Test;

public class FindPair {

	public static void main(String[] args) {
		int sum = 38;
		int[] arr = { 20, 32, 11, 55, 18, 20 };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; i < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					System.out.println("Pair is " + arr[i] + " and " + arr[j]);
				}

			}

		}

	}

}
