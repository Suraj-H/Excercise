package calculator;

import validate.Validate;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

    }

    public static void addition(long firstNumber, long secondNumber) {
        System.out.println("Addition of " + firstNumber + " & " + secondNumber + " = " + (firstNumber + secondNumber));
    }

    public static void subtraction(long firstNumber, long secondNumber) {
        System.out.println("Subtraction of " + firstNumber + " & " + secondNumber + " = " + (firstNumber - secondNumber));
    }

    public static void multiplication(long firstNumber, long secondNumber) {
        System.out.println("Multiplication of " + firstNumber + " & " + secondNumber + " = " + (firstNumber * secondNumber));
    }

    public static void division(long firstNumber, long secondNumber) {
        System.out.println("Division of " + firstNumber + " & " + secondNumber + " = " + (firstNumber / secondNumber));
    }

    public static void square(long firstNumber) {
        System.out.println("Square of " + firstNumber + " = " + (firstNumber * firstNumber));
    }

    public static void squareRoot(long firstNumber) {
        System.out.println("SquareRoot of " + firstNumber + " = " + (Math.sqrt((double) firstNumber)));
    }

    public static void powerOf2(long firstNumber) {
        System.out.println("PowerOf2 of " + firstNumber + " = " + (Math.pow(firstNumber, 2)));
    }
}