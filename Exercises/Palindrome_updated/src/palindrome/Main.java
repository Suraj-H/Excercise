package palindrome;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().printMenu();
    }

    public void printMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("----- Check Palindrome String -----");
            System.out.println("1. Stack\n2. Queue\n3. ForLoop\n4. Exit\n");
            System.out.print("Select option to check palindrome string: ");

            switch (scanner.next()) {
                case "1":
                    System.out.println("Palindrome String check with Stack >> ");
                    new PalindromeStack().stackPalindromeString();
                    break;
                case "2":
                    System.out.println("Palindrome String check with Queue");
                    new PalindromeQueue().queuePalindromeString();
                    break;
                case "3":
                    System.out.println("Palindrome String check with ForLoop");
                    new PalindromeForLoop().forLoopPalindromeString();
                    break;
                case "4":
                    System.exit(0);
                default:
                    System.out.println("Not a valid option!");
            }

            System.out.print("\nType (1) to Continue or (any key) to exit: ");

            try {
                flag = scanner.nextInt() == 1;
            } catch (Exception e) {
                System.exit(0);
            }

            System.out.println();
        }
    }
}