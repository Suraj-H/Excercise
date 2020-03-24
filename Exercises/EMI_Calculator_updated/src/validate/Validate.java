package validate;

import java.util.Scanner;

public class Validate {

    public static double getValidNumber() {
        double number = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            while (!scanner.hasNextDouble()) {
                System.out.println("That's not a valid number!");
                System.out.print("Enter a valid positive number: ");
                scanner.next();
            }
            number = scanner.nextDouble();
        } while (number <= 0);

        return number;
    }
}
