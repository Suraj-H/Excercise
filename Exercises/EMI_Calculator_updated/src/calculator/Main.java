package calculator;

import validate.Validate;

public class Main {
    public static void main(String[] args) {
//        int principal = (int) EMICalculator.readNumber("Principal: ", 1000, 1_000_000);
//        float annualInterest = (float) EMICalculator.readNumber("Annual Interest Rate: ", 1, 30);
//        byte years = (byte) EMICalculator.readNumber("Period (Years): ", 1, 30);
        System.out.println("Principal: ");
        int principal = (int) Validate.getValidNumber();
        System.out.println("Annual Interest Rate: ");
        double annualInterest = Validate.getValidNumber();
        System.out.println("Years: ");
        byte years = (byte) Validate.getValidNumber();

        EMICalculator.printEMI(principal, annualInterest, years);
        EMICalculator.printPaymentSchedule(principal, annualInterest, years);
    }
}
