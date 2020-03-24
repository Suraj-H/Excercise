package geocalculator;

import validate.Validate;
import java.util.Scanner;

public class GeoCalculator {

    public void printMenu() {

        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("1. Area of Circle \n2. Aread of Square \n3. Area of Rectangle \n4. Area of triangle \n5. Area of Equilateral Triangle " +
                    "\n6. Area of Rhombus \n7. Exit");
            System.out.print("\nSelect valid option: ");
            short choice = (short) Validate.getValidNumber();
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.println("----- Calculate area of Circle -----");
                    System.out.print("Enter number for radius of circle: ");
                    double radius = (double) Validate.getValidNumber();
                    calculateArea(radius);
                    break;
                case 2:
                    System.out.println("----- Calculate area of Square -----");
                    System.out.print("Enter number for side of Square: ");
                    float side = (float) Validate.getValidNumber();
                    calculateArea(side);
                    break;
                case 3:
                    System.out.println("----- Calculate area of Rectangle -----");
                    System.out.print("Enter number for height of Rectangle: ");
                    double height = (double) Validate.getValidNumber();
                    System.out.print("Enter number for length of Rectangle: ");
                    double length = (double) Validate.getValidNumber();
                    calculateArea(height, length);
                    break;
                case 4:
                    System.out.println("----- Calculate area of Triangle -----");
                    System.out.print("Enter number for height of Triangle: ");
                    long heightT = Validate.getValidNumber();
                    System.out.print("Enter number for base of Triangle: ");
                    int base = (int) Validate.getValidNumber();
                    calculateArea(heightT, base);
                    break;
                case 5:
                    System.out.println("----- Calculate area of Equilateral Triangle -----");
                    System.out.print("Enter number for side of Equilateral Triangle: ");
                    long sideT = Validate.getValidNumber();
                    calculateArea(sideT);
                    break;
                case 6:
                    System.out.println("----- Calculate area of Rhombus -----");
                    System.out.print("Enter number for diagonalP of Rhombus: ");
                    int diagonalP = (int) Validate.getValidNumber();
                    System.out.print("Enter number for diagonalP of Rhombus: ");
                    int diagonalQ = (int) Validate.getValidNumber();
                    calculateArea(diagonalP, diagonalQ);
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Select valid option!");
            }

            System.out.print("\nType (1) for Continue or (any key) for Exit: ");
            if (!scanner.next().equals("1"))
                System.exit(0);
            System.out.println();
        }
    }

    public void calculateArea(float side) {
        System.out.println("Area of the square: " + side * side);
    }

    public void calculateArea(double height, double length) {
        System.out.println("Area of rectangle: " + height * length);
    }

    public void calculateArea(long height, int base) {
        System.out.println("Area of triangle: " + (height * base) / 2);
    }

    public void calculateArea(long side) {
        System.out.println("Area of Equilateral triangle: " + String.format("%.2f", (Math.sqrt(3) * (side * side) / 4)));
    }

    public void calculateArea(double radius) {
        System.out.println("Area of circle: " + 3.14 * (radius * radius));
    }
    
    public void calculateArea(int diagonalP, int diagonalQ) {
        System.out.println("Area of Rhombus: " + (diagonalP * diagonalQ) / 2);
    }
}