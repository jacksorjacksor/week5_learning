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
        while (position < 1000) {

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