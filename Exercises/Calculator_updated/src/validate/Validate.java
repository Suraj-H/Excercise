package validate;

import java.util.Scanner;

public class Validate {

    public static long getValidNumber() {
        long number = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("That's not a valid number!");
                System.out.print("Enter a valid positive number: ");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (number <= 0);

        return number;
    }
}
