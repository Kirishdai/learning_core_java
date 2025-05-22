// MyRunnable2.java
// Implements Runnable and prints a message 5 times with a delay

public class MyRunnable2 implements Runnable {

    private final String text;

    // Constructor receives a message to be printed
    MyRunnable2(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);  // Pause for 1 second
                // Print the current thread name along with the message
                System.out.println(Thread.currentThread().getName() + " " + text);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}
