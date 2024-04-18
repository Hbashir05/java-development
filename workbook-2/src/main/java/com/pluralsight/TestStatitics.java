package com.pluralsight;

public class TestStatitics {

   static double[] testScores = {83.6, 84.9, 91.2, 100, 72.8, 62.9, 90.4, 87.7, 76.8, 98.8};

    public static void main(String[] args) {
        averageCalculator(testScores);
        highestScore(testScores);
        lowestScore(testScores);

    }
    public static void averageCalculator(double[] scores){
        // Initialize the sum variable
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        // Calculate the average
        double average = (double) sum/scores.length;

        // Print the results
        System.out.println("The average score is: "+average);
    }

    public static void highestScore(double[] scores) {
        double highScore = 0;

        for (double score : scores) {
            if (score > highScore){
                highScore = score;
            }
        }
        System.out.println("The highest score is: "+highScore);
    }

    public static void lowestScore(double[] scores){
        double lowestScore = 100;

        for (double score : scores){
            if (score < lowestScore){
                lowestScore = score;
            }
        }
        System.out.println("The lowers score is: "+lowestScore);
    }
}
