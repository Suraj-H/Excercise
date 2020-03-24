package series;

import triangle.Validate;

public class Fibonacci {

    public void fibonacciSeries() {
        long previousNumber = 0;
        long nextNumber = 1;

        System.out.print("Fibonacci series number count: ");
        int numberCount = (int) Validate.getValidNumber();

        System.out.println("----- Fibonacci Series -----");
        System.out.print("\t");
        for (int i = 1; i <= numberCount; ++i) {
            System.out.print(previousNumber + "\t");

            long tempNumber = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = tempNumber;
        }

        System.out.println();
    }
}
