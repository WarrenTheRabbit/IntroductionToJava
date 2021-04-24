package SingleDimensionalArrays.Exercise7_3;

import java.util.Scanner;

/**
 * Write a program that reads the integers between 1
 * and 100 and counts the occurrences of each.
 * Assume the input ends with 0.
 *
 */
public class CountOccurrences {

    public static void main(String[] args) {

        // Initialise Scanner.
        Scanner inputStream = new Scanner(System.in);

        // Initialise array to count occurrences of each number, such that
        // occurrences of the number x are recorded at index x - 1.
        // For example: the occurrences of number 1 are recorded at count[0].
        int[] count = new int[100];

        // Declare variable for number received from input.
        int number;

        System.out.println("Enter numbers between 1 and 100. This program " +
                "will count the occurences.\nWhen you are finished entering numbers," +
                " press 0: ");

        do  {

            // validate input to be between 1 and 20
            while (
                    (number = inputStream.nextInt()) < 0 ||
                    number > 20) {
                System.out.print("Invalid. Try again: ");
            }

            if (number != 0) {
                // increment count for that occurrence
                count[number-1]++;
            }

        } while (number != 0);

        // Display count information
        for (int i = 0; i < count.length; i++) {
            System.out.printf("%d occurs %d %s%n",
                    i + 1, // the value
                    count[i], // its number of occurrences
                    (count[i] == 1) ? "time" : "times" // correct verb
            );
        }
    }

}
