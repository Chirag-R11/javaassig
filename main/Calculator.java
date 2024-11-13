package main;

// create class calculator
public class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Main method
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Displaying results of each add method
        System.out.println("Sum of two integers (5 + 10): " + calculator.add(5, 10));
        System.out.println("Sum of three integers (5 + 10 + 15): " + calculator.add(5, 10, 15));
        System.out.println("Sum of two doubles (5.5 + 10.5): " + calculator.add(5.5, 10.5));
    }
}