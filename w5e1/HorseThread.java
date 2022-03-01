package w5e1;

import java.util.Random;

/**
 * HorseThread
 */
public class HorseThread extends Thread {
    // Variables
    Integer horseID;
    Integer position = 0;

    // Constructor
    public HorseThread(Integer horseID) {
        this.horseID = horseID;
    }

    // Run
    public void run() {
        for (int i = 0; i < 10; i++) {

            try {
                Random myRandom = new Random();
                int val = myRandom.nextInt(6) + 1;
                position += val;
                Thread.sleep(10);

            } catch (InterruptedException e) {
                System.out.println("error:" + e);
            }
        }
    }

    // Get
    public int getPosition() {
        return position;
    }

}