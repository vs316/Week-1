package ControlFlow;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        int num, sum = 0; // Initialize variables
        Scanner sc = new Scanner(System.in);

        // Input number from user
        System.out.println("Enter a number: ");
        num = sc.nextInt();

        int originalNumber = num; // Store the original number

        // Calculate the sum of the cubes of its digits
        while (originalNumber != 0) {
            int digit = originalNumber % 10; // Extract the last digit
            sum += (int) Math.pow(digit, 3); // Cube the digit and add to sum
            originalNumber = originalNumber / 10; // Remove the last digit
        }

        // Compare sum with the original number
        if (num == sum) {
            System.out.println(num + " is an Armstrong Number.");
        } else {
            System.out.println(num + " is not an Armstrong Number.");
        }

        sc.close(); // Close the scanner
    }
}