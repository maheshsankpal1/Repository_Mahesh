package Test;

public class FindDuplicate {

	public static void main(String[] args) {
		int[] arr = { 21, 44, 53, 77, 32, 77, 45, 43, 43 };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i+ 1; j < arr.length ; j++)
			if (arr[i] == arr[j]) {
				System.out.println("Duplicate no is " + arr[i]);

			}
		}

	}

}
