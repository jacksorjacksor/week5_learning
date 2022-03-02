package w5e2;

import java.util.Random;

public class Producer {

    Random randomSleepLength = new Random();

    public void run() {
        Buffer myBuffer = new Buffer();
        for (int i = 1; i <= 100; i++) {
            try {
                myBuffer.put(i);
                // Waits for 50-150ms
                Thread.sleep(randomSleepLength.nextInt(101) + 50);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
        System.out.println(myBuffer.get());
    }
}
