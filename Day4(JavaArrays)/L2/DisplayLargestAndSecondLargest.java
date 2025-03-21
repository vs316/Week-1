package JavaArrays;

import java.util.Scanner;

public class DisplayLargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number (no limit on size): ");
        long number = sc.nextLong();

        int maxDigit = 10, index = 0, largest = 0, secondLargest = 0;
        int[] arr = new int[maxDigit];

        // Extract digits from the number
        while (number != 0) {
            int digit = (int) (number % 10);
            number /= 10;

            // If the array is full, resize it
            if (index == maxDigit) {
                maxDigit += 10; // Increase array size
                int[] digitsTemp = new int[maxDigit];
                // Copy existing elements
                for (int i = 0; i < index; i++) {
                    digitsTemp[i] = arr[i];
                }
                arr = digitsTemp; // Assign resized array back to arr
            }

            arr[index++] = digit; // Add digit to the array
        }

        // Find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (arr[i] > largest) {
                secondLargest = largest; // Update second largest
                largest = arr[i]; // Update largest
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i]; // Update second largest
            }
        }

        // Display results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}