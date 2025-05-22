// ThreadingDemo.java
// Demonstrates the use of a separate thread with a countdown timer and daemon thread behavior

import java.util.Scanner;

public class ThreadingDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create and start a daemon thread running MyRunnable
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);  // Daemon thread will not prevent program from exiting
        thread.start();

        System.out.println("You have 5 seconds to enter your name");
        System.out.println("Enter your name:");

        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        scanner.close();
    }
}
