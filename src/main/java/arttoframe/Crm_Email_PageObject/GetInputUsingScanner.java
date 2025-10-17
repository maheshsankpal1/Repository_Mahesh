package arttoframe.Crm_Email_PageObject;

import java.util.Scanner;

public class GetInputUsingScanner {

	public static void main(String[] args) {
		int x;
		float y;
		String line;
		
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter a line:");
		String s = sn.nextLine();
		System.out.println("You have entered: " + s);
		
		System.out.println("Enter a number:");
		int s1 = sn.nextInt();
		System.out.println("You have entered: " + s1);
		
		
		
		

	}

}
