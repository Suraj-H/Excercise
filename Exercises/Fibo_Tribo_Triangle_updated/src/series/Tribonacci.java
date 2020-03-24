package series;

import triangle.Validate;

public class Tribonacci {

    public void tribonacciSeries() {
        long previosNumber = 0;
        long nextNumber = 1;
        long tempNumber = 0;

        System.out.print("Tribonacci series number count: ");
        int numberCount = (int) Validate.getValidNumber();

        System.out.println("----- Tribonacci Series -----");
        System.out.print("\t" + previosNumber + "\t" + nextNumber);

        for (int i = 2; i < numberCount; ++i) {
            tempNumber = previosNumber + nextNumber;
            System.out.print("\t" + tempNumber);
            previosNumber = nextNumber;
            nextNumber = tempNumber;
        }

        System.out.println();
    }
}
