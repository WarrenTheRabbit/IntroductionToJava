package SingleDimensionalArrays.Exercise7_5;

public class printDistinctEfficient {


    public static void main(String[] args) {
        long startTime = System.nanoTime();

        /* … The code being measured starts … */
        int[] numbers = {2,2,3,3,3,6,7,8,9,10};


        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            boolean isDistinct = true;

            // Check all values to the left of the current number.
            for (int j = i - 1; j >= 0; j--) {

                // If a duplicate exists in the left-hand side
                // of the array, the number is not distinct.
                if (numbers[j] == currentNumber) {
                    isDistinct = false;
                }
            }
            // Print the number if no duplicate number was found.
            if (isDistinct) {
                System.out.print(currentNumber + " " );
            }
        }

        /* … The code being measured ends … */

        long endTime = System.nanoTime();

        // get the difference between the two nano time valuess
        long timeElapsed = endTime - startTime;

        System.out.println("\n" + printDistinctEfficient.class.getSimpleName()
        + " took " + timeElapsed/1000000 + " milliseconds.");
    }




}
