package com.pluralsight;
import java.util.Scanner;

public class CellPhoneApplication {
    static Scanner scanner = new Scanner(System.in);
    static Cellphone cellphone = new Cellphone();

    public static void main(String[] args) {
        Cellphone phone1 = new Cellphone();
        Cellphone phone2 = new Cellphone();

        /*This allows phone1 and phone2 to automatically call from the createphone object line for each individually */
       Createphone(phone1); phone1.dial("123-456-7890");
       Createphone(phone2); phone2.dial("938-928-3949");

       //This has phone 1 dial phone 2 and vice versa given number
       phone1.dial(phone2.getPhoneNumber());
       phone2.dial(phone1.getPhoneNumber());

    }
    public static void Createphone(Cellphone cellphone){
        System.out.print("What is the serial number: ");
        cellphone.setSerialNumber(scanner.nextInt());
        scanner.nextLine();

        System.out.print("What is the model of the phone: ");
        cellphone.setModel(scanner.nextLine());

        System.out.print("Who is the carrier: ");
        cellphone.setCarrier(scanner.nextLine());

        System.out.print("What is the phone number: ");
        cellphone.setPhoneNumber(scanner.nextLine());

        System.out.print("Who is the owner of the phone: ");
        cellphone.setOwner(scanner.nextLine());

        System.out.println(cellphone.getSerialNumber());
        System.out.println(cellphone.getModel());
        System.out.println(cellphone.getCarrier());
        System.out.println(cellphone.getPhoneNumber());
        System.out.println(cellphone.getOwner());

    }

}
