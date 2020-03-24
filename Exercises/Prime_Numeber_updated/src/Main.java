import numeric.NumericFunctions;
import validate.ArmstrongNumber;
import validate.PrimeNumber;
import validate.Validate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().printMenu();
    }

    public void printMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            long number = Validate.getValidNumber();

            NumericFunctions.printNumberSquare(number);
            NumericFunctions.printNumberSquareRoot(number);
            PrimeNumber.isPrimeNumber(number);
            ArmstrongNumber.isArmstrongNumber(number);
            System.out.println();

            System.out.print("Type (1) for Continue or (any key) for Exit: ");
            if (!scanner.next().equals("1"))
                System.exit(0);
            System.out.println();
        }
    }
}