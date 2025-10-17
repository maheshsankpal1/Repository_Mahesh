package Test;

public class BubleSort {

	public static void main(String[] args) {
		int[] array = { 3, 6, 7, 2, 5, 9 };
		int result;
		int temp = 0;

		int n = array.length;

		System.out.println("Array before sorting :");
		{
			for (int num : array)
				System.out.println(num + "");

		}
		{
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n - 1; j++) {
					if (array[j] > array[j + 1]) {
						temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;

					}

				}
			}
		}

		System.out.println("Array after sorting :");
		{
			{
				for (int num : array)
					System.out.println(num + "");

			}

		}

	}

}
