// MultithreadingDemo.java
// Demonstrates concurrent execution using two threads running the same Runnable logic

public class MultithreadingDemo {
    public static void main(String[] args) {

        // Create two threads with different messages
        Thread thread1 = new Thread(new MyRunnable2("Ping"));
        Thread thread2 = new Thread(new MyRunnable2("Pong"));

        System.out.println("GAME START!");

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for both threads to complete
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }

        System.out.println("GAME OVER!");
    }
}
