// NumberGuessingGame.java
// Demonstrates while loops, Random class, and user-controlled loop exit

import java.util.Random; // Import for random number generation
import java.util.Scanner; // Import for reading user input

public class NumberGuessingGame {
    public static void main(String[] args) {

        Random rand = new Random(); // Create Random object
        Scanner sc = new Scanner(System.in); // Create Scanner object

        // Generate a number between 1 to 100
        int randomNumber = rand.nextInt(100) + 1;
        int guess = 0; // stores user's guess
        int attempts = 0; // tracks number of attempts

        System.out.println("\n--Number Guessing Game--\n");

        // Main loop: runs until the user guesses correctly or quits
        while(guess != randomNumber) {

            System.out.print("Please enter a number between 1 and 100: ");
            guess = sc.nextInt(); // Read user guess
            attempts++;

            if (guess == randomNumber) {
                // Correct guess
                System.out.println("You guessed the number " + guess);
                break;
            } else {
                // Incorrect guess - ask if user wants to try again
                System.out.println("Try again!");
                System.out.println("Would you like to try again? (Y/N)");
                String answer = sc.next();

                // Exit if user says "N" or "n"
                if (answer.equalsIgnoreCase("N")) {
                    System.out.println("The number was " + randomNumber);
                    System.out.println("Thank you for using our program!");
                    break;
                }
            }
        }
        sc.close(); // close scanner to free resources
    }
}
