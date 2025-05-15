// Calculator.java
// Demonstrates methods, parameter passing, return values, and enhanced switch expression

import java.util.Scanner;  // Import Scanner for user input

public class Calculator {

    // Method to add two numbers
    static double add(double a, double b) {
        return a + b;
    }

    // Method to subtract two numbers
    static double subtract(double a, double b) {
        return a - b;
    }

    // Method to multiply two numbers
    static double multiply(double a, double b) {
        return a * b;
    }

    // Method to divide two numbers with division-by-zero check
    static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create scanner for user input

        // Prompt user for two numbers
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        // Ask user to choose an operator
        System.out.println("Choose operation: +, -, *, /");
        char operator = sc.next().charAt(0);  // Read the first character of user input

        // Use enhanced switch to determine which operation to perform
        double result = switch (operator) {
            case '+' -> add(a, b);
            case '-' -> subtract(a, b);
            case '*' -> multiply(a, b);
            case '/' -> divide(a, b);
            default -> {
                System.out.println("Error: Invalid operator");
                yield 0;  // Return 0 if the operator is invalid
            }
        };

        // Print result with 2 decimal precision
        System.out.printf("Result: %.2f\n", result);

        sc.close();  // Close scanner to free system resources
    }
}
