package matrix;

import java.util.Scanner;

public class Matrix {
    private int[][] firstMatrix;
    private int[][] secondMatrix;
    private int[][] thirdMatrix;
    private int rows;
    private int columns;

    public void printMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            setDimensions();
            System.out.println();
            setFirstMatrixElements();
            printFirstMatrix();
            System.out.println();
            setSecondMatrixElements();
            printSecondMatrix();
            System.out.println();
            sumOfMatrices();
            printThirdMatrix();
            System.out.println();

            System.out.print("Type (1) to Continue or (any key) to Exit: ");
            try {
                flag = scanner.nextInt() == 1;
            } catch (Exception e) {
                System.exit(0);
            }

            System.out.println();
        }
    }

    public void setDimensions() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any rows number: ");
        rows = scanner.nextInt();

        System.out.print("Enter any columns number: ");
        columns = scanner.nextInt();

        firstMatrix = new int[rows][columns];
        secondMatrix = new int[rows][columns];
        thirdMatrix = new int[rows][columns];

        System.out.println("\nDimensions for rows:columns = " + rows + ":" + columns);
    }

    public void setFirstMatrixElements() {
        if ((rows != 0) && (columns != 0)) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter elements for firstMatrix: ");
            for (int i = 0; i < rows; ++i) {
                for (int j = 0; j < columns; ++j) {
                    System.out.print("\tfirstMatrix[" + i + "]" + "[" + j + "]" + ": ");
                    firstMatrix[i][j] = scanner.nextInt();
                }
            }
        }
        else
            System.out.println("Dimensions for Matrix is not set!");
    }

    public void setSecondMatrixElements() {
        if ((rows != 0) && (columns != 0)) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter elements for secondMatrix: ");
            for (int i = 0; i < rows; ++i) {
                for (int j = 0; j < columns; ++j) {
                    System.out.print("\tsecondMatrix[" + i + "]" + "[" + j + "]" + ": ");
                    secondMatrix[i][j] = scanner.nextInt();
                }
            }
        }
        else
            System.out.println("Dimensions for Matrix is not set!");
    }

    public void printFirstMatrix() {
        if (firstMatrix != null) {
            System.out.println("Elements of firstMatrix: ");
            for (int i = 0; i < rows; ++i) {
                for (int j = 0; j < columns; ++j) {
                    System.out.print(firstMatrix[i][j] + "\t");
                }

                System.out.println();
            }
        }
        else
            System.out.println("First Matrix is Empty!");
    }

    public void printSecondMatrix() {
        if (secondMatrix != null) {
            System.out.println("Elements of secondMatrix: ");
            for (int i = 0; i < rows; ++i) {
                for (int j = 0; j < columns; ++j) {
                    System.out.print(secondMatrix[i][j] + "\t");
                }

                System.out.println();
            }
        }
        else
            System.out.println("Second Matrix is Empty!");
    }

    private void sumOfMatrices() {
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < columns; ++j) {
                thirdMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
    }

    public void printThirdMatrix() {
        if (thirdMatrix != null) {
            System.out.println("Elements of thirdMatrix after addition of firstMatrix & secondMatrix: ");
            for (int i = 0; i < rows; ++i) {
                for (int j = 0; j < columns; ++j) {
                    System.out.print(thirdMatrix[i][j] + "\t");
                }

                System.out.println();
            }
        }
        else
            System.out.println("Third Matrix is Empty!");
    }
}