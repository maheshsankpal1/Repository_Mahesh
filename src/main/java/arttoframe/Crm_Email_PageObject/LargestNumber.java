package arttoframe.Crm_Email_PageObject;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
	
		int x, y, z;
		System.out.println("Enter three integers:");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();

		if (x > y && x > z) 
			System.out.println("x is the greatest number");
		 else if (y > x && y > z) 
			System.out.println("Y is the greatest number");
		 else
			System.out.println("Z is the greatest number");
	
	}
}

    

