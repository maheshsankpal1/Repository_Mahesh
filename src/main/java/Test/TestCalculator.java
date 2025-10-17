// TestCalculator.java
package Test;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator c1 = Calculator.getCalculatorObject();
        System.out.println("c1: " + c1);
        c1.add();
        System.out.println("---------------------");

        Calculator c2 = Calculator.getCalculatorObject();
        System.out.println("c2: " + c2);
        c2.add();
        System.out.println("---------------------");

        Calculator c3 = Calculator.getCalculatorObject();
        System.out.println("c3: " + c3);
        c3.add();
    }
}
