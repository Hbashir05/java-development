package com.pluralsight;
import java.util.Scanner;

public class AddressBuilder {
    // Initalize the scanner.
    static Scanner scanner = new Scanner(System.in);

    static String fullName;
    static String billingStreet;
    static String billingCity;
    static String billingState;
    static int billingZip;
    static String shippingStreet;
    static String shippingCity;
    static String shippingState;
    static int shippingZip;
    static String finalBilling;
    static String finalShipping;

    public static void main(String[] args) {
        enterName();

        // Call the enterBilling method.
        enterBilling();

        // Call the enterShipping method.
        enterShipping();

        // Call the parseBilling method.
        parseBilling();

        // Call the parseShipping method.
        parseShipping();

        // Call the printInformation method.
        printInformation();
    }
    public static void enterName(){
        System.out.println("Please provide the following information:");
        System.out.print("Full Name: ");
        fullName = scanner.nextLine();
    }
    public static void enterBilling(){
        System.out.print("\nBilling Street: ");
        billingStreet = scanner.nextLine();

        System.out.print("Billing City: ");
        billingCity = scanner.nextLine();

        System.out.print("Billing State: ");
        billingState = scanner.nextLine();

        System.out.print("Billing Zip: ");
        billingZip = scanner.nextInt();
        scanner.nextLine();
    }
    public static void enterShipping(){
        System.out.print("\nShipping Street: ");
        shippingStreet = scanner.nextLine();

        System.out.print("Shipping City: ");
        shippingCity = scanner.nextLine();

        System.out.print("Shipping State: ");
        shippingState = scanner.nextLine();

        System.out.print("Shipping Zip: ");
        shippingZip = scanner.nextInt();
        scanner.nextLine();
    }
    public static void parseBilling(){

        StringBuilder billingBuilder = new StringBuilder();

        billingBuilder.append(billingStreet).append("\n").append(billingCity).append(", ").append(billingState).append(" ").append(billingZip);

        finalBilling = billingBuilder.toString();
    }
    public static void parseShipping(){
        StringBuilder shippingBuilder = new StringBuilder();

        shippingBuilder.append(shippingStreet).append("\n").append(shippingCity).append(", ").append(shippingState).append(" ").append(shippingZip);

        finalShipping = shippingBuilder.toString();
    }
    public static void printInformation() {
        System.out.println("\n" + fullName + "\n");
        System.out.println("Billing Address:\n" + finalBilling);
        System.out.println("\nShipping Address:\n" + finalShipping);
    }

}
