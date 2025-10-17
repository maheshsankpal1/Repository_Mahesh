package Test;

public class BubleSorting {

	public static void main(String[] args) {
		int[] arr = { 43, 52, 32, 99, 22, 32, 44 };
		
		System.out.println("Before sorting:");
		for (int num : arr) {
			System.out.print(num + " ");
		}

	
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}
				System.out.println("\nAfter sorting:");
				for (int num : arr) {
					System.out.print(num + " ");
				}

			}

	}
	


