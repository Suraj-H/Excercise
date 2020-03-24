package numeric;

public class NumericFunctions {
    public static void printNumberSquare(long number) {
        System.out.println("Square of " + number + ": " + (number * number));
    }

    public static void printNumberSquareRoot(long number) {
        System.out.println("Square root of " + number + ": " + String.format("%.2f", Math.sqrt(number)));
    }
}
