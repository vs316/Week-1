package JavaArrays;

import java.util.Scanner;

public class ArraySumTillZeroOrNegInp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        double[] arr = new double[10];
        int i = 0;

        // Loop to take input until a negative number or zero is encountered or array is full
        while (i < arr.length) {
            System.out.print("Enter number: ");
            double input = sc.nextDouble();

            if (input <= 0) {
                break; // Stop the loop if input is zero or negative
            }
            arr[i] = input;
            i++;
        }

        // Display the elements in the array and calculate their sum
        System.out.println("Elements in array: ");
        for (int j = 0; j < i; j++) { // Iterate only till the valid inputs
            System.out.print(arr[j] + " ");
            sum += arr[j];
        }

        // Display the sum of the elements
        System.out.println("\nSum of all elements = " + sum);

        sc.close(); // Close the Scanner object
    }
}