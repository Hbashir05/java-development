package com.pluralsight;
import java.util.Scanner;

public class Highscorewins {
    static Scanner scanner = new Scanner(System.in);

    static String gameScore;
    static String winner;

    public static void main(String[] args) {
        // Call the enterGameScore method.
        enterGameScore();

        // Call the parseGameScore method.
        parseGameScore();

        // Call the printWinner method.
        printWinner();
    }

    public static void enterGameScore() {
        System.out.println("Please enter a game score (TeamA:TeamB|AScore:BScore): ");
        gameScore = scanner.nextLine();
    }

    public static void parseGameScore() {
        // Split the gameScore into two parts, teamPart and scorePart.
        String[] gameParts = gameScore.split("\\|");
        String teamPart = gameParts[0];
        String scorePart = gameParts[1];

        // Seperate the teamPart into homeName and visitorName.
        String[] teamName = teamPart.split(":");
        String homeName = teamName[0];
        String visitorName = teamName[1];

        // Seperate the scorePart into homeScore and visitorScore.
        String[] teamScore = scorePart.split(":");
        int homeScore = Integer.parseInt(teamScore[0]);
        int visitorScore = Integer.parseInt(teamScore[1]);

        // Compare the scores and figure out the winner.
        winner = (homeScore > visitorScore) ? homeName : visitorName;

    }

    public static void printWinner() {
        System.out.println("Winner: " + winner);

    }
}
