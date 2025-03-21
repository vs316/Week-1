package JavaArrays;

import java.util.Scanner;

public class DigitFrequencyUsingArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input for a number
        System.out.println("Enter a number: ");
        long number = sc.nextLong(); // Use long to handle large numbers

        // Step 2: Create a frequency array of size 10 for digits 0-9
        int[] frequency = new int[10];

        // Step 3: Loop through each digit in the number
        while (number != 0) {
            int digit = (int) (number % 10); // Extract the last digit
            frequency[digit]++; // Increment the frequency of the digit
            number /= 10; // Remove the last digit from the number
        }

        // Step 4: Display the frequency of each digit
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) { // Only display digits that appear in the number
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }

        sc.close(); // Close the scanner
    }
}