package conversion;

import validate.Validate;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter positive integer number: ");
        String number = String.valueOf(Validate.getValidNumber());
        System.out.println();

        System.out.println("Binary conversion of " + number + ": " + Decimal.decimalToBinary(number));
        System.out.println("Octal conversion of " + number + ": " + Decimal.decimalToOctal(number));
        System.out.println("Hexa conversion of " + number + ": " + Decimal.decimalToHexa(number));
    }
}