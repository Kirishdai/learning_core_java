// CustomExceptionDemo.java
// Demonstrates creating and using a custom exception

// Step 1: Define custom exception
class UnderageException extends Exception {
    public UnderageException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    // Step 2: Create method that throws the custom exception
    public static void checkAge(int age) throws UnderageException {
        if (age < 18) {
            throw new UnderageException("You must be 18 or older.");
        } else {
            System.out.println("Access granted.");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16);  // Will throw UnderageException
        } catch (UnderageException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
