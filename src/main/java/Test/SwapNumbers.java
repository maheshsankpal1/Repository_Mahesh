package Test;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number:");
		int x = sc.nextInt();

		System.out.println("Enter sec number:");
		int y = sc.nextInt();

		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("Entered two numbers after swap:" + x + " and " + y);

	}

}
