package JavaMethods;

import java.util.Scanner;

public class DivChocsAmongChildren {
    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Number of chocolates and number of children
        System.out.println("Enter the number of chocolates: ");
        int numberOfChocolates = sc.nextInt();
        System.out.println("Enter the number of children: ");
        int numberOfChildren = sc.nextInt();

        if (numberOfChildren > 0) {
            // Call the method to calculate quotient and remainder
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            // Display results
            System.out.println("Each child gets: " + result[0] + " chocolates");
            System.out.println("Remaining chocolates: " + result[1]);
        } else {
            System.out.println("Number of children must be greater than 0.");
        }

        sc.close();
    }
}


