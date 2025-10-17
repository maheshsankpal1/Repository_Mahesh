package Test;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;   // store original number
        int reversed = 0;

        // Reverse the number
        while (num > 0) {
            int digit = num % 10;          // get last digit
            reversed = reversed * 10 + digit; // build reversed number
            num = num / 10;                // remove last digit
        }

        // Check palindrome
        if (original == reversed) {
            System.out.println(original + " is a Palindrome number.");
        } else {
            System.out.println(original + " is NOT a Palindrome number.");
        }
    }
}
