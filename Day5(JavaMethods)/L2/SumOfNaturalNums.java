package JavaMethods;

import java.util.Scanner;

public class SumOfNaturalNums {
    // Recursive method to calculate the sum of n natural numbers
    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursiveSum(n - 1);
    }

    // Method to calculate the sum using the formula
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a natural number
        System.out.println("Enter a natural number (n): ");
        int n = sc.nextInt();

        if (n > 0) {
            // Calculate sums
            int recursiveResult = recursiveSum(n);
            int formulaResult = formulaSum(n);

            // Display results
            System.out.println("Sum of first " + n + " natural numbers (using recursion): " + recursiveResult);
            System.out.println("Sum of first " + n + " natural numbers (using formula): " + formulaResult);

            // Compare results
            if (recursiveResult == formulaResult) {
                System.out.println("Both calculations are correct and produce the same result.");
            } else {
                System.out.println("There is a discrepancy between the calculations.");
            }
        } else {
            System.out.println("Please enter a positive natural number.");
        }

        sc.close();
    }
}
