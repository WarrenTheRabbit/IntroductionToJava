package SingleDimensionalArrays.Exercise7_4;
import java.util.Scanner;
/**
 * Write a program that reads an unspecified number of scores and
 * determines how many scores are above or equal to the average and how many
 * scores are below the average. Enter a negative number to signify the end of the
 * input. Assume that the maximum number of scores is 100.
 *
 ** TODO: stream-based solution. tuples?
 * */
public class AnalyzeScores {

    public static void main(String[] args) {
        // Initialise array to hold maximum possible number of scores.
        int[] scores = new int[100];

        // Add scores and store 1) the total of the scores and 2) how many were added
        // as the tuple {total, number of scores added}.
        double[] numberAndTotal = addScores(scores);

        // Calculate average score.
        double averageScore = numberAndTotal[0]/numberAndTotal[1];
        System.out.println("The average is: " + averageScore);

        // Get count for scores that are average or better.
        int scoresAverageOrBetter = getAverageOrBetter(averageScore, scores);

        System.out.println(scoresAverageOrBetter + " is the number of scores " +
                "that are average or better.");
    }

    private static int getAverageOrBetter(double averageScore, int[] scores) {
        int count = 0;
        for (int score : scores) {
            if (score >= averageScore) {
                count++;
            }
        }
        return count;
    }

    private static double[] addScores(int[] scores) {
        Scanner inputStream = new Scanner(System.in);
        // Counts how many scores have been added to
        // list.
        int count = 0;
        // Represents a single score that will be added to the
        // list of scores if it is a valid score.
        int scoreToAdd = 0;
        // A running total of the scores.
        double total = 0;

        // Add scores until user enters a negative score
        // or 100 scores have been entered.
        while (count < 100 && scoreToAdd >= 0) {
            scoreToAdd = inputStream.nextInt();
            if (scoreToAdd >=0) {
                scores[count++] = scoreToAdd;
                total += scoreToAdd;
            }
        }
        // Return the number of scores that were added.
        return new double[] {total, count};


    }


}
