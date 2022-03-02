package w5e1;

import java.util.Random;

public class HorseThread extends Thread {
    // Variables
    Integer horseID;
    Integer numberOfSteps = 0;
    Integer position = 0;
    Random myRandom = new Random();

    // Constructor
    public HorseThread(Integer horseID) {
        this.horseID = horseID;
    }

    // METHODS:
    // - run
    public void run() {
        while (position < 1000) {
            numberOfSteps++;
            try {
                Integer val = myRandom.nextInt(6) + 1;
                position += val;
                Thread.sleep(1);

            } catch (InterruptedException e) {
                System.out.println("error:" + e);
            }
        }
    }

    // - get
    public int getNumberOfSteps() {
        return numberOfSteps;
    }

}