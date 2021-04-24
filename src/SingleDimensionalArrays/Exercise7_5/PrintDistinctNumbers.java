package SingleDimensionalArrays.Exercise7_5;

import java.util.Arrays;

/**
 *  Write a program that reads in ten numbers and displays
 * the number of distinct numbers and the distinct numbers separated by
 * exactly one space (i.e., if a number appears multiple times, it is
 * displayed only once). (Hint: Read a number and store it to an array if
 * it is new. If the number is already in the array, ignore it.) After the
 * input, the array contains the distinct numbers
 */
public class PrintDistinctNumbers {

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        /* … The code being measured starts … */

        int[] numbers = {2,2,3,3,3,6,7,8,9,10};
        int[] distinct = new int[10];

        int insertIndex = 0;

        for (int i = 0; i < 10; i++) {
            int occurrences = 1;
            for (int j = 0; j < 10; j++) {
                if (numbers[i] == distinct[j]) {
                    occurrences++;
                }
            }
            if (occurrences == 1) {
                distinct[insertIndex++] = numbers[i];
            }
        }

        for (int i = 0; i < insertIndex; i++) {
            System.out.print(distinct[i] + " ");
        }

        /* … The code being measured ends … */

        long endTime = System.nanoTime();

        // get the difference between the two nano time valuess
        long timeElapsed = endTime - startTime;

        System.out.println("\n" + printDistinctEfficient.class.getSimpleName()
                + " took " + timeElapsed/1000000 + " milliseconds.");
    }





}
