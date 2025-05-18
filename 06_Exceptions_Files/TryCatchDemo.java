// TryCatchDemo.java
// Demonstrates handling exceptions using try-catch-finally

public class TryCatchDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // Will cause ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("This block always runs (finally).");
        }

        System.out.println("Program continues after try-catch.");
    }
}
