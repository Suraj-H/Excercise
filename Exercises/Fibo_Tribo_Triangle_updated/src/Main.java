import series.Fibonacci;
import series.Tribonacci;
import triangle.FloydTriangle;
import triangle.PascalTriangle;
import triangle.Validate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().printMenu();
    }

    public void printMenu() {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        while (flag) {

            System.out.println("1. Fibonacci Series \n2. Tribonacci Series \n3. Floyd Triangle \n4. Inverted Floyd Triangle \n5. Pascal Triangle \n6. Exit");
            System.out.print("\nSelect option from menu: ");

            short choice = (short) Validate.getValidNumber();

            switch (choice) {
                case 1:
                    System.out.println("Fibonacci series selected.");
                    new Fibonacci().fibonacciSeries();
                    break;
                case 2:
                    System.out.println("Tribonacci series selected.");
                    new Tribonacci().tribonacciSeries();
                    break;
                case 3:
                    System.out.println("Floyd Triangle selected.");
                    new FloydTriangle().floydTriangle();
                    break;
                case 4:
                    System.out.println("Inverted Floyd Triangle selected.");
                    new FloydTriangle().invertedFloydTriangle();
                    break;
                case 5:
                    System.out.println("Pascal Triangle selected.");
                    new PascalTriangle().pascalTriangle();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid option selected.");
            }

            System.out.print("\nSelect (1) for Continue or (any key) for Exit: ");
            if (!scanner.next().equals("1"))
                System.exit(0);
            System.out.println();
        }
    }
}