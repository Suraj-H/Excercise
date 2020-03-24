package triangle;

import java.util.Scanner;

public class Validate {
     public static long getValidNumber() {
        Scanner scanner = new Scanner(System.in);
        long number = 0;

        do {
            while (!scanner.hasNextInt()) {
                System.out.println("That's not a valid number!");
                System.out.print("Enter a valid number again: ");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (number <= 0);

        return number;
    }
}