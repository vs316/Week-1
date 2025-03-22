package JavaMethods;

import java.util.Scanner;

public class SumOfNNaturalNums {
    // Method to calculate the sum of n natural numbers
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer (n): ");
        int n = sc.nextInt();

        if (n > 0) {
            int result = calculateSum(n);
            System.out.println("The sum of the first " + n + " natural numbers is: " + result);
        } else {
            System.out.println("Please enter a positive integer.");
        }

        sc.close();
    }
}