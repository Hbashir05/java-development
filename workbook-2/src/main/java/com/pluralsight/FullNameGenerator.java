package com.pluralsight;
import java.util.Scanner;

public class FullNameGenerator {
    // Initalize the scanner.
    static Scanner scanner = new Scanner(System.in);

    // Create the variables.
    static String fullName;
    static String firstName, middleName = "", lastName;

    public static void main(String[] args) {
// Call to the enterName method.
        enterName();

    }

    public static String enterName() {

        System.out.println("Please enter your name:");

        System.out.print("First Name: ");
        String firstname = scanner.nextLine().trim();

        System.out.print("Middle Name: ");
        String middlename = scanner.nextLine().trim();

        System.out.print("Last Name: ");
        String lastname = scanner.nextLine().trim();

        System.out.print("Suffix: ");
        String suffix = scanner.nextLine().trim();

        String results;
        String fullname;

        //If they dont have a middle name
        if (middlename.isEmpty() && suffix.isEmpty()) {
            results = "%s %s";
            fullname = String.format(results, firstname, lastname);
        } else if (middlename.isEmpty()) {
            results = "%s %s %s";
            fullname = String.format(results, firstname, lastname, suffix);
        } else {
            results = "%s %s %s %s";
            fullname = String.format(results, firstname, middlename, lastname, suffix);
        }
        System.out.print(fullname);

        return firstname;
    }
}








