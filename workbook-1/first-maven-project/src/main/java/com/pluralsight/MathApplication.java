package com.pluralsight;

import java.util.Random;

public class MathApplication {
    public static void main(String[] args){
        //Question 1
        int Bobsalary = 500000;
        int Garysalary = 100000;

        //Who has the higher salary.
        int highsalary = Math.max(Bobsalary, Garysalary);

        //Print the higher salary
        System.out.println("The Highest salary is " + highsalary);

        //Question 2
        //Create a variable and set a price
        double carprice = 19.99;
        double truckprince = 59.99;

        //Lower price
        int lowestprice = (int) Math.min(carprice, truckprince);

        //Print the lower price
        System.out.println("The lowest price is "+ lowestprice);


        //Question 3
        //Create a variable and set the radius to 7.25
        double radius = 7.25;

        //Calculation of radius
        double area = Math.PI * radius * radius;

        //Print answer
        System.out.println("The area of a circle whose radius is 7.25 is " + area);

        //Question 4
        //Create a variable and set the value to 5
        double q4variable = 5.0;

        //Calculate the square root of 5
        double squareroot = Math.sqrt(q4variable);

        //Print the answer
        System.out.println("The square root of a variable " + squareroot);

        //Question 5
        //Calculate the difference in variables
        int x1 = 5, y1 = 10;
        int x2 = 85, y2 = 50;
        int dx = x2 - x1;
        int dy = y2 - y1;
        int dxsquared =dx * dx;
        int dysquared = dy * dy;
        int sumofsquares = dxsquared + dysquared;
        double distance = Math.sqrt(sumofsquares);

        //Print answer
        System.out.println("The distance between the points (5,85) and (10,50) is " + distance);

        //Question 6
        //Find the positive value of a variable after it is set to -3.9
        double q6variable = -3.9;
        double absolutevalue = Math.abs(q6variable);

        //Print answer
        System.out.println("The absolute positive value of a variable after it is set to -3.9 is " + absolutevalue);

        //Question 7
        //Display any random number between 0 and 1
        Random random = new Random();
        double randomnumber = random.nextDouble();

        //Print answer
        System.out.println("A random number between 0 and 1 is " + randomnumber);
        



    }
}
