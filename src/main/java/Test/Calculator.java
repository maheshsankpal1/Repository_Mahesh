// Calculator.java
package Test;

public class Calculator {
    int a = 10;
    int b = 5;

    // Private constructor
    private Calculator() {
        System.out.println("Running private constructor");
    }

    // Method to perform addition
    void add() {
        System.out.println("a value is: " + a);
        System.out.println("b value is: " + b);
        System.out.println("Add is: " + (a + b));
    }

    // Static method to get Calculator object
    static Calculator getCalculatorObject() {
        Calculator c = new Calculator();
        System.out.println("Returning Calculator object: " + c);
        return c;
    }
}
