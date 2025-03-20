package ControlFlow;

import java.util.Scanner;

public class CheckIsPrime {
    public static void main(String[] args) {
        boolean isPrime = true; // Initialize to true
        int n;

        // Get user input
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        // Special case for 1
        if (n == 1) {
            System.out.println("1 is not a prime number.");
        } else {
            // Loop through potential divisors from 2 up to √n
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) { // Check divisibility
                    isPrime = false;
                    break; // Exit the loop early if a divisor is found
                }
            }

            // Output result
            if (isPrime) {
                System.out.println(n + " is a prime number.");
            } else {
                System.out.println(n + " is not a prime number.");
            }
        }

        sc.close(); // Close the scanner
    }
}