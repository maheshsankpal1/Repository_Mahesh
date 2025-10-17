package arttoframe.Crm_Email_PageObject;

public class EvenAndOdd {

	public static void main(String[] args) {

		int a[] = { 10, 20, 15, 3, 6, 7, 8, 2, 5, 7 };
		int n = a.length;

		System.out.println("Even numbers are:");
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				System.out.print(a[i] + " ");

			}
			;

		}
		System.out.println();
		System.out.println("Odd numbers are:");
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 != 0) {
				System.out.print(a[i] + " ");

			}
			;

		}

	}

}
