import encode.Encode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word for encoding: ");
        String inputString = scanner.nextLine();

        System.out.println("Encoded string for " + inputString + ": " + Encode.encodeString(inputString));
        System.out.println("Encoded string for " + inputString + ": " + Encode.languageString(inputString));
    }
}