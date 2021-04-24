package SingleDimensionalArrays.Exercise7_4;

import java.util.Scanner;

public class AnalyzeScoresFunctional {

    private static int count;
    private static double sum;
    private static double average;
    private static int numberAbove;
    private static int numberBelow;

    public static void main(String[] args) {

        double[] scores = new double[100];
        addScores(scores);
        analyseScores(scores);
        printAnalysis();
    }

    private static void addScores(double[] scores) {
        double item;
        Scanner inputStream = new Scanner(System.in);

        do {
            System.out.print("Enter a score to add: ");
            item = inputStream.nextDouble();

            if (item >= 0) {
                sum+= item;
                scores[count++] = item;
            }
        } while (item >= 0);

    }


    public static void analyseScores(double[] scores) {

        double item;
        Scanner inputStream = new Scanner(System.in);

        average = sum / count;

        for (int i = 0; i < count; i++) {
            if (scores[i] >= average) {
                numberAbove++;
            } else {
                numberBelow++;
            }
        }
    }

    private static void printAnalysis() {
        System.out.println("Number of scores added: " + count);
        System.out.println("Average: " + average);
        System.out.printf("There are %s scores that are average or better " +
                        "and there are %s that are worse than average.",
                numberAbove, numberBelow);
    }



}
