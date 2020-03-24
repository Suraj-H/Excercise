package validate;

public class PrimeNumber {
    public static void isPrimeNumber(long number) {
        int i = 2;
        boolean flag = true;

        while (i <= number / 2) {
            if (number % i == 0) {
                flag = false;
                break;
            }

            ++i;
        }

        if (flag)
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");
    }
}
