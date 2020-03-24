package triangle;

public class FloydTriangle {

    public void floydTriangle() {
        System.out.print("Enter a valid positive number for rows: ");
        int rows = (int) Validate.getValidNumber();
        System.out.print("Enter a valid positive number as starting point: ");
        long startNumber = Validate.getValidNumber();

        System.out.println("----- Floyd Triangle -----");
        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(startNumber + " ");
                ++startNumber;
            }

            System.out.println();
        }
    }

    public void invertedFloydTriangle() {
        System.out.print("Enter a valid positive number for rows: ");
        int rows = (int) Validate.getValidNumber();

        System.out.println("----- Inverted Floyd Triangle -----");
        long lastNumber = rows * (rows + 1) / 2;

        for (int i = rows; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(lastNumber + " ");
                --lastNumber;
            }

            System.out.println();
        }

    }
}