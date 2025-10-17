package Test;

public class Find {

	public static void main(String[] args) {
		int[] arr = { 6, 8, 11, 7, 18 };
		int target = 17;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++)
				if (arr[i] + arr[j] == target) {
					System.out.println("two elements of array with sum 17 are : " + arr[i] + " and " + arr[j]);

				}

		}

	}

}
