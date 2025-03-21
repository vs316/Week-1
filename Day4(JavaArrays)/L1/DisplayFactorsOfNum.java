package JavaArrays;

import java.util.Scanner;

public class DisplayFactorsOfNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Take input for the number
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Validate the input to ensure it is a natural number
        if (number <= 0) {
            System.err.println("Error: Please enter a positive natural number.");
            System.exit(0);
        }

        // Step 2: Initialize variables and arrays
        int maxFactor = 10; // Initial size of the factors array
        int[] factors = new int[maxFactor];
        int index = 0; // Tracks the number of factors stored

        // Step 3: Find factors and store them in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // If the array is full, double its size
                if (index == maxFactor) {
                    maxFactor *= 2; // Double the size
                    int[] temp = new int[maxFactor];
                    // Copy old elements to the new array
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp; // Assign the resized array
                }
                // Add the factor to the array
                factors[index++] = i;
            }


        }

        // Step 4: Display the factors
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        input.close(); // Close the Scanner object
    }
}

//package JavaArrays;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class DisplayFactorsOfNum {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        // Take user input for the number
//        System.out.print("Enter a natural number: ");
//        int number = input.nextInt();
//
//        // Validate input to ensure it's a natural number
//        if (number <= 0) {
//            System.err.println("Error: Please enter a positive natural number.");
//            System.exit(0);
//        }
//
//        // Use ArrayList to store the factors dynamically
//        ArrayList<Integer> factors = new ArrayList<>();
//
//        // Find factors up to the square root of the number
//        for (int i = 1; i <= Math.sqrt(number); i++) {
//            if (number % i == 0) {
//                factors.add(i); // Add the first factor
//                if (i != number / i) { // Add the corresponding factor pair
//                    factors.add(number / i);
//                }
//            }
//        }
//
//        // Sort the factors (optional, to display them in ascending order)
//        factors.sort(null);
//
//        // Display the factors
//        System.out.println("Factors of " + number + ": " + factors);
//
//        input.close(); // Close the Scanner
//    }
//}