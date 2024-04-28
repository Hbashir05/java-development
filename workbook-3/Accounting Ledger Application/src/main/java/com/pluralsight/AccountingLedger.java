package com.pluralsight;

import java.util.Scanner;

public class AccountingLedger {

    // Create scanner for input
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Call homeMenu method.
        homeMenu();

    }

    public static void homeMenu() {
        System.out.println("Welcome to the Ledger");
        System.out.println("(1) Deposit");
        System.out.println("(2) Payments");
        System.out.println("(3) Reports");
        System.out.println("(4) All Entries");
    }
}
