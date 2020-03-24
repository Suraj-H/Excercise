package validate;

public class ArmstrongNumber {
    public static void isArmstrongNumber(long number) {
        long tempNumber = 0;
        int remainder = 0;
        long result = 0;
        int digitCount = 0;

        tempNumber = number;
        while (tempNumber != 0) {
            tempNumber /= 10;
            ++digitCount;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            remainder = (int) (tempNumber % 10);
            result += (long) (Math.pow(remainder, digitCount));
            tempNumber /= 10;
        }

        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
