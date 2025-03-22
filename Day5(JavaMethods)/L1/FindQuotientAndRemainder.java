package JavaMethods;

import java.util.Scanner;

public class FindQuotientAndRemainder {
    // Method to find the quotient and remainder
    public static int[] calculateQuotientAndRemainder(int dividend, int divisor) {
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dividend: ");
        int dividend = sc.nextInt();
        System.out.println("Enter the divisor: ");
        int divisor = sc.nextInt();

        if (divisor != 0) {
            int[] result = calculateQuotientAndRemainder(dividend, divisor);
            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
        } else {
            System.out.println("Divisor cannot be zero.");
        }

        sc.close();
    }
}
