package JavaArrays;

import java.util.Scanner;

public class MultiplicationTableFrom6To9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take integer input from the user
        System.out.println("Enter a number to find its multiplication table from 6 to 9:");
        int number = sc.nextInt();

        // Declare an array to store the multiplication results for 6 to 9
        int[] multiplicationResult = new int[4];

        // Loop through the range 6 to 9 and calculate the multiplication results
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i; // Store result in the array
        }

        // Display the results
        System.out.println("\nMultiplication Table of " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }

        // Close the Scanner
        sc.close();
    }
}
