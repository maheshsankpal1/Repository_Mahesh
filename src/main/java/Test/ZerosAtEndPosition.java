package Test;

public class ZerosAtEndPosition {

	public static void main(String[] args) {
		int[] arr = { 3, 7, 7, 0, 0, 8, 3, 4545,0, 34343, };
		int temp = 0;
		int count = 0;;
		
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] != 0) {
				temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;
				count ++;

			}

		}
		System.out.println("Array with zeros at the end:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

}
