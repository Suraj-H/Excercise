package triangle;

public class PascalTriangle {

    public void pascalTriangle() {

        System.out.print("Enter a valid positive number for rows: ");
        int rows = (int) Validate.getValidNumber();

        for (int i = 0; i < rows; ++i) {
            for (int j = rows; j > i; --j) {
                System.out.print(" ");
            }

            long number = 1;

            for (int k = 0; k <= i; ++k) {
                System.out.print(number + " ");
                number = number * (i - k) / (k + 1);
            }

            System.out.println();
        }
    }
}