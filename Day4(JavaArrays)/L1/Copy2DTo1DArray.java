package JavaArrays;

import java.util.Scanner;

public class Copy2DTo1DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input for the dimensions of the 2D array
        System.out.println("Enter the number of rows and columns in the matrix separated by a space: ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        // Step 2: Initialize the 2D array (matrix)
        int[][] matrix = new int[rows][columns];

        // Step 3: Populate the 2D array with user inputs
        System.out.println("Enter the values for the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter value for matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Step 4: Initialize a 1D array to copy the elements from the 2D array
        int[] array = new int[rows * columns]; // Size of 1D array is rows * columns

        // Step 5: Copy elements from the 2D array to the 1D array
        int index = 0; // Index variable for the 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index++] = matrix[i][j]; // Copy element and increment index
            }
        }

        // Step 6: Display the elements of the 1D array
        System.out.println("\nElements of the 1D array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        sc.close(); // Close the Scanner to free resources
    }
}