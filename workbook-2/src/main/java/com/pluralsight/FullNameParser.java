package com.pluralsight;
import java.sql.SQLOutput;
import java.util.Scanner;

public class FullNameParser {
    static Scanner scanner = new Scanner(System.in);
    static String fullName;
    static String firstName, middleName = "", lastName;

    public static void main(String[] args){
// Call to the enterName method.
        enterName();

        // Call to the parseName method.
        parseName();

    }
    public static void enterName(){
        System.out.println("Please enter your name (First Last or First Middle Last): ");
        fullName = scanner.nextLine().trim();
    }
    public static void  parseName(){
        String[] splitName=fullName.split(" ");
        int numberofNames = splitName.length;

        if (numberofNames == 3) {
            System.out.println("First name: " + splitName[0]);
            System.out.println("Middle name: " + splitName[1]);
            System.out.println("Last name: " + splitName[2]);
        }else if (numberofNames == 2){
            System.out.println("First name: "+ splitName[0]);
            System.out.println("Middle name: (none)");
            System.out.println("Last name: "+ splitName[1]);
        }else {
            System.out.println("Invalid input");
        }

    }


    }


