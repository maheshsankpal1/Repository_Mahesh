package Test;

import org.openqa.selenium.interactions.Actions;

public class SecondLargestNum {
	public static void main(String[] args) {
	     int[] arr = {10, 20, 4, 6, 22, 34, 42, 21};
	     int first = Integer.MIN_VALUE;   // to store largest number
	     int second = Integer.MIN_VALUE;  // to store second largest

	     for (int num : arr) {            // loop through all numbers
	         if (num > first) {           // if number is bigger than current largest
	             second = first;          // make old largest the second largest
	             first = num;             // update largest
	         } else if (num > second && num != first) { 
	             // if number is smaller than largest but bigger than second largest
	             second = num;
	         
	             
	             
	         }
	     }

	     System.out.println("Second largest: " + second);
	 }
	}

	
		

	
