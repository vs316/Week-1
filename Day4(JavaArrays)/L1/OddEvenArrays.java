package JavaArrays;

import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take an integer input from the user
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        // Check if the number is a natural number
        if (number <= 0) {
            System.err.println("Error: Please enter a natural number greater than 0.");
            System.exit(0);
        }

        // Create arrays for odd and even numbers
        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];

        // Index variables for odd and even arrays
        int oddIndex = 0;
        int evenIndex = 0;

        // Iterate from 1 to the number and separate odd/even numbers
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i; // Store even number and increment index
            } else {
                oddNumbers[oddIndex++] = i; // Store odd number and increment index
            }
        }

        // Print the odd numbers array
        System.out.println("\nOdd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        // Print the even numbers array
        System.out.println("\nEven Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        // Close the Scanner object
        sc.close();
    }
}