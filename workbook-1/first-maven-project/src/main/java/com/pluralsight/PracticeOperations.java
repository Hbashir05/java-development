package com.pluralsight;

public class PracticeOperations {
    private String stringOne, stringTwo, stringThree;
    private double doubleOne, doubleTwo, doubleThree;

    public PracticeOperations(String stringOne, String stringTwo, String stringThree, double doubleOne, double doubleTwo, double doubleThree) {
        this.stringOne = stringOne;
        this.stringTwo = stringTwo;
        this.stringThree = stringThree;
        this.doubleOne = doubleOne;
        this.doubleTwo = doubleTwo;
        this.doubleThree = doubleThree;
        calculate();
    }

    private void calculate() {
        String concatenatedString = stringOne + stringTwo + stringThree;
        System.out.println("Concatenated String: " + concatenatedString);

        double addResult = (doubleOne + doubleTwo) + doubleThree;
        System.out.println("Adding Result: " + addResult);

        double subtractResult = (doubleOne - doubleTwo) - doubleThree;
        System.out.println("Subtract Result: " + subtractResult);

        double multiplyResult = (doubleOne * doubleTwo) * doubleThree;
        System.out.println("Multiply Result: " + multiplyResult);

        double divideResult = (doubleOne / doubleTwo) / doubleThree;
        System.out.println("Divide Result: " + divideResult);

        double totalResult = addResult + subtractResult + multiplyResult + divideResult;
        System.out.println("Accumulation Result: " + totalResult);
    }

    public static void main(String[] args) {
        PracticeOperations practice = new PracticeOperations("stringOne ", "stringTwo ", "stringThree", 1.1, 2.2, 3.3);
    }


}
