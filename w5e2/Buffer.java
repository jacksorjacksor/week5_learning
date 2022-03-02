package w5e2;

import java.util.Arrays;

// QUESTION:
// Buffer is often used to store data temporarily, which is useful to 
// --synchronise between 
// ---- the device that produces the data
// ---- the device that consumes the data
// 
// Write a Java program to simulate a buffer used with:
// ---- a producer (which produces the data and puts in the buffer) 
// ---- a consumer (which uses the data from the buffer)

// You should implement a class Buffer that represents a buffer. 
// The buffer can be implemented using an int array with a fixed number (called BUFFER_SIZE) of spaces.
// BUFFER_SIZE can be set to 10 for this exercise. 

// You also define two variables:
// -- head: index of the first element currently in the buffer.
// --  count: how many elements are currently available in the buffer.

public class Buffer {
    // VARIABLES
    private static final Integer BUFFER_SIZE = 10;
    private static Integer head = 0;
    private static Integer count = 0;

    // Syntax for making arrays of ints:
    Integer myNewArray[] = new Integer[BUFFER_SIZE];

    // METHODS
    // - PRIVATE
    private void setHead() {
        boolean hasHeadBeenSet = false;

        head = null;

        for (int i = 0; i < myNewArray.length; i++) {
            if (myNewArray[i] == null) {
                head = i;
                hasHeadBeenSet = true;
                break;
            }
        }
        // Counts number of items present
        setCount();
        if (!hasHeadBeenSet) {
            System.out.println("Buffer is full");
        }
    }

    private void setCount() {
        Integer newCount = 0;
        for (int i = 0; i < myNewArray.length; i++) {
            if (myNewArray[i] != null) {
                newCount++;
            }
        }
        count = newCount;
        System.out.println("Number of items in buffer: " + count);
    }

    // - PUBLIC
    public Integer get() {
        // gets the value nearest to the head
        setHead();
        if (head == null) {
            System.err.println("Nothing in there!");
        }
        Integer valueToReturn = myNewArray[head];
        myNewArray[head] = null;
        return valueToReturn;
    }

    public void put(int value) {
        // puts the value at the end of the buffer
        // (as far away from the head as possible)
        setHead();
        myNewArray[count] = value;

        System.out.println("index to put in: " + head);
        System.out.println("Array: " + Arrays.toString(myNewArray));
    }

}
