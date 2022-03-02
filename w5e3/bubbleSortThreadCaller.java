package w5e3;

import java.util.Arrays;
import java.util.Random;

/**
 * bubbleSortThreadCaller
 */
public class bubbleSortThreadCaller {
    private static final Integer TOTAL_NUMBER_OF_INTEGERS = 100000;
    private static Integer[] myArray = new Integer[TOTAL_NUMBER_OF_INTEGERS];
    private static Random myRandomGen = new Random();

    public static void main(String[] args) {

        // Create array
        for (int i = 0; i < TOTAL_NUMBER_OF_INTEGERS; i++) {
            myArray[i] = myRandomGen.nextInt(TOTAL_NUMBER_OF_INTEGERS);
        }

        // Split the array
        Integer[] firstHalfOfArray = Arrays.copyOfRange(myArray, 0, Math.round(TOTAL_NUMBER_OF_INTEGERS / 2));
        Integer[] secondHalfOfArray = Arrays.copyOfRange(myArray, Math.round(TOTAL_NUMBER_OF_INTEGERS / 2),
                TOTAL_NUMBER_OF_INTEGERS);

        bubbleSortThread myBubbles1 = new bubbleSortThread();
        bubbleSortThread myBubbles2 = new bubbleSortThread();

        myBubbles1.start(firstHalfOfArray);
        myBubbles2.start(secondHalfOfArray);

    }
}
