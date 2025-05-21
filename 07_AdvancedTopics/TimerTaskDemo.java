import java.util.Timer;
import java.util.TimerTask;

public class TimerTaskDemo {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {

            int counter = 3;

            @Override
            public void run() {
                System.out.println("Hello World");
                counter--;
                if(counter < 0 ){
                    System.out.println("Goodbye");
                    timer.cancel();
                }
            }
        };
        timer.schedule(timerTask, 0,1000);

    }
}

