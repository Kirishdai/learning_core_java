// MyRunnable.java
// A Runnable that counts down 5 seconds and exits the program if no input is given

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);  // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }

            if (i == 5) {
                System.out.println("Times up");
                System.exit(0);  // Force exit if input wasn't entered in time
            }
        }
    }
}
