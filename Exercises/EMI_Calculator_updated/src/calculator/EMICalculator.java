package calculator;

import java.util.Scanner;

public class EMICalculator {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void printEMI(int principal, double annualInterest, byte years) {
        double emi = calculateEMI(principal, annualInterest, years);
        System.out.println();
        System.out.println("EMI: ");
        System.out.println("Monthly Payments: " + emi);
    }

    public static void printPaymentSchedule(int principal, double annualInterest, byte years) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE: ");
        for (short month = 1; month <= years * MONTHS_IN_YEAR; ++month) {
            double balance = calculateBalance(principal, annualInterest, years, month);
            System.out.println(balance);
        }
    }

    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }

    public static double calculateBalance(int principal, double annualInterest, byte years, short numberOfPaymentsMade) {
        double monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        double numberOfPayments = years * MONTHS_IN_YEAR;

        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }

    public static double calculateEMI(int principal, double annualInterest, byte years) {
        double monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        double numberOfPayments = years * MONTHS_IN_YEAR;

        double emi = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return emi;
    }
}