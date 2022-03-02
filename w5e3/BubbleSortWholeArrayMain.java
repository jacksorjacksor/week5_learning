package w5e3;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortWholeArrayMain {
    private static final Integer TOTAL_NUMBER_OF_INTEGERS = 100;
    private static Integer[] myArray = new Integer[TOTAL_NUMBER_OF_INTEGERS];
    private static Random myRandomGen = new Random();

    private static Integer[] bubbleSort(Integer[] myArray) {
        int temp;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length - 1; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }
            }
        }
        return myArray;
    }

    public static void main(String[] args) {
        // Create array
        for (int i = 0; i < TOTAL_NUMBER_OF_INTEGERS; i++) {
            myArray[i] = myRandomGen.nextInt(TOTAL_NUMBER_OF_INTEGERS);
        }

        Integer[] firstHalfOfArray = Arrays.copyOfRange(myArray, 0, Math.round(TOTAL_NUMBER_OF_INTEGERS / 2));
        Integer[] secondHalfOfArray = Arrays.copyOfRange(myArray, Math.round(TOTAL_NUMBER_OF_INTEGERS / 2),
                TOTAL_NUMBER_OF_INTEGERS);

        firstHalfOfArray = bubbleSort(firstHalfOfArray);
        secondHalfOfArray = bubbleSort(secondHalfOfArray);

        System.out.println(Arrays.toString(firstHalfOfArray));
        System.out.println(Arrays.toString(secondHalfOfArray));
    }
}
