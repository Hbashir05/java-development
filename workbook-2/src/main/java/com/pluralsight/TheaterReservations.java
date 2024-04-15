package com.pluralsight;
import java.util.Scanner;

public class TheaterReservations {
    static Scanner scanner = new Scanner(System.in);

    static String name;
    static String date;
    static int tickets;
    static String firstName;
    static String lastName;
    static int year;
    static int month;
    static int day;

    public static void main(String[] args) {
        // Call the enterName method.
        enterName();

        // Call the enterDate method.
        enterDate();

        // Call the enterTickets method.
        enterTickets();

        // Call the parseInputs method.
        parseInputs();

        // Call the printInformation method.
        printInformation();
    }
    public static void enterName() {
        System.out.print("Please enter your name: ");
        name = scanner.nextLine();
    }

    public static void enterDate() {
        System.out.print("What date will you be coming (MM/DD/YYYY): ");
        date = scanner.nextLine();
    }

    public static void enterTickets() {
        System.out.print("How many tickets would you like?: ");
        tickets = scanner.nextInt();
    }

    public static void parseInputs() {
        String[] ticketName = name.split(" ");
        firstName = ticketName[0];
        lastName = ticketName[1];
        name = lastName + ", " + firstName;

        String[] ticketDate = date.split("/");
        day = Integer.parseInt(ticketDate[0]);
        month = Integer.parseInt(ticketDate[1]);
        year = Integer.parseInt(ticketDate[2]);
        date = year + "-" + month + "-" + day;

    }
    public static void printInformation() {
        // If user is reserving 1 ticket.
        if (tickets == 1) {
            System.out.println(tickets + " ticket reserved for " + date + " under " + name);
        }
        if (tickets > 1) {
            System.out.println(tickets + " tickets reserved for " + date + " under " + name);
        }

}

}
