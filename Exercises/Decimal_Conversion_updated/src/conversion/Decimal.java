package conversion;

public class Decimal {

    public static String decimalToBinary(String numberString) {
        int number = Integer.parseInt(numberString);

        String binary = "";
        while (number >= 2) {
            binary = (number % 2) + binary;
            number /= 2;
        }

        binary = number + binary;
        return binary;
    }

    public static String decimalToOctal(String numberString) {
        int number = Integer.parseInt(numberString);

        String octal = "";
        while (number >= 8) {
            octal = number % 8 + octal;
            number /= 8;
        }

        octal = number + octal;
        return octal;
    }

    public static String decimalToHexa(String numberString) {
        int number = Integer.parseInt(numberString);

        String hexa = "";
        while (number >= 16) {
            hexa = hexaStr(number % 16) + hexa;
            number /= 16;
        }
        hexa = hexaStr(number) + hexa;
        return hexa;
    }

    public static String hexaStr(int number) {
        String[] numberArray = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        return numberArray[number];
    }
}
