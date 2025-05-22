// EnumsDemo.java
// Demonstrates how to use enums with switch-case logic

import java.util.Scanner;

public class EnumsDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String response = scanner.nextLine().toUpperCase();  // Convert input to uppercase for enum match

        try {
            // Convert user input string to enum constant
            Day day = Day.valueOf(response);

            // Use enhanced switch to determine weekday/weekend
            switch (day) {
                case SUNDAY, SATURDAY -> System.out.println("It is a weekend");
                case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("It is a weekday");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Please enter a valid day.");
        }

        scanner.close();
    }
}
