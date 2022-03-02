package w5e3;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortWholeArray {

    private static final Integer TOTAL_NUMBER_OF_INTEGERS = 100;
    private static Integer[] myArray = new Integer[TOTAL_NUMBER_OF_INTEGERS];
    private static Random myRandomGen = new Random();

    public static void main(String[] args) {
        // Create array
        for (int i = 0; i < TOTAL_NUMBER_OF_INTEGERS; i++) {
            myArray[i] = myRandomGen.nextInt(TOTAL_NUMBER_OF_INTEGERS);
        }

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
        System.out.println(Arrays.toString(myArray));

        // Sort the array
        // BUBBLE SORT ALGORITHM
    }
}

// for i in range(len(my_list)):
// for j in range(len(my_list) - 1):
// if my_list[j] > my_list[j + 1]:
// my_list[j], my_list[j + 1] = my_list[j + 1], my_list[j]
