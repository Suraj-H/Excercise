import calculator.Calculator;
import validate.Validate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().printMenu();
    }

    public void printMenu() {
        long firstNumber = 0;
        long secondNumber = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("------ Numeric Calculator ------");
            System.out.println("1. Addition \n2. Subtraction \n3. Multiplication \n4. Division " +
                    "\n5. Square \n6. SquareRoot \n7. PowerOf2 \n8. Exit");

            System.out.print("\nSelect valid choice number: ");
            short choice = (short) Validate.getValidNumber();

            if (choice == 5 || choice == 6 || choice == 7) {
                System.out.print("Enter a number: ");
                firstNumber = Validate.getValidNumber();
            }
            else {
                System.out.print("Enter first number: ");
                firstNumber = Validate.getValidNumber();
                System.out.print("Enter second number: ");
                secondNumber = Validate.getValidNumber();
            }

            switch (choice) {
                case 1:
                    System.out.println("Addition selected >>");
                    Calculator.addition(firstNumber, secondNumber);
                    break;
                case 2:
                    System.out.println("Subtraction selected >>");
                    Calculator.subtraction(firstNumber, secondNumber);
                    break;
                case 3:
                    System.out.println("Multiplication selected >>");
                    Calculator.multiplication(firstNumber, secondNumber);
                    break;
                case 4:
                    System.out.println("Division selected >>");
                    Calculator.division(firstNumber, secondNumber);
                    break;
                case 5:
                    System.out.println("Square selected >>");
                    Calculator.square(firstNumber);
                    break;
                case 6:
                    System.out.println("SquareRoot selected >>");
                    Calculator.squareRoot(firstNumber);
                    break;
                case 7:
                    System.out.println("PowerOf2 selected >>");
                    Calculator.powerOf2(firstNumber);
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Entered choice is Invalid!");
            }

            System.out.print("\nSelect (1) to Continue or (any key) to Exit: ");
            if (!scanner.next().equals("1"))
                System.exit(0);
            System.out.println();
        }
    }
}