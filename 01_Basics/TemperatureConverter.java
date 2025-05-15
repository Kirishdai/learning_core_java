// TemperatureConverter.java
// Demonstrates variables, user input, and conditionals

import java.util.Scanner;  // Import Scanner class for user input

public class TemperatureConverter {
    public static void main(String[] args) {
        // create Scanner object to read user input from console
        Scanner sc = new Scanner(System.in);

        // Display menu options
        System.out.println("\n--Temperature Converter--\n");
        System.out.println("Press 1 to convert to Fahrenheit");
        System.out.println("Press 2 to convert to Celsius \n");

        // Read user's choice
        int choice = sc.nextInt();

        if (choice == 1) {
            // User chose Celsius to Fahrenheit
            System.out.print("Enter temperature in Celsius: ");
            double celsius = sc.nextDouble();

            // Convert Celsius to Fahrenheit using formula
            double fahrenheit = (celsius * 9 / 5) + 32;

            // Display result
            System.out.printf("Result: %.2f°F", fahrenheit);
        } else if (choice == 2) {
            // User chose Fahrenheit to Celsius
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = sc.nextDouble();

            // Convert Fahrenheit to Celsius using formula
            double celsius = (fahrenheit - 32) * 5 / 9;

            // Display result
            System.out.printf("Result: %.2f°C", celsius);
        } else {
            // Handle invalid input
            System.out.println("Invalid choice.");
        }

        // Close scanner to prevent resource leak
        sc.close();

    }
}