package arttoframe.Crm_Email_PageObject;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		System.out.println("Enter any number:");
		Scanner sc = new Scanner(System.in);
		int usernum = sc.nextInt();
		if (usernum % 2 == 0){
			System.out.println("num is even");
		}
			else {
				System.out.println("num is odd");
			}
			
		}


}

