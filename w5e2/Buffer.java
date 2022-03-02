package w5e2;

import java.lang.reflect.Array;

// QUESTION:
// Buffer is often used to store data temporarily, which is useful to 
// --synchronise between 
// ---- the device that produces the data
// ---- the device that consumes the data
// 
// Write a Java program to simulate a buffer used with:
// ---- a producer (which produces the data and puts in the buffer) 
// ---- a consumer (which uses the data from the buffer)
// 

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
        if (!hasHeadBeenSet) {
            System.out.println("Buffer is full");
        }
    }

    public Integer get() {
        setHead();
        if (head == null) {
            System.err.println("Nothing in there!");
        }
        Integer indexToGet = (head - 1) % BUFFER_SIZE;
        return myNewArray[indexToGet];
    }

    public void put(int value) {
        setHead();

        myNewArray[head] = value;

        // for (Integer integer : myNewArray) {
        // System.out.println(integer);
        // }
    }

}
