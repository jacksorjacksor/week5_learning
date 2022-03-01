import java.util.Date;

/**
 * GreetingThread
 */
public class GreetingThread extends Thread {
    // VARIABLES
    // constants
    private static final int REPETITIONS = 3;
    private static final int DELAY = 1000;

    // instance var
    private String greeting;

    // Constructor
    public GreetingThread(String aGreeting) {
        greeting = aGreeting;
    }

    // run() started
    @Override
    public void run() {
        try {
            for (int i = 0; i < REPETITIONS; i++) {
                Date now = new Date();
                System.out.println(now + " " + greeting);
                Thread.sleep(DELAY);
            }

        } catch (InterruptedException e) {
            System.err.println(e.toString());
        }
        System.out.println("DONE");
    }
}