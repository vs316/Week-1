package JavaMethods;

import java.util.Arrays;

public class RandomValuesCalculator {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = (int) (Math.random() * 9000) + 1000; // Generate random 4-digit number
        }
        return randomNumbers;
    }

    // Method to find the average, minimum, and maximum values of an array
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            sum += num; // Calculate sum
            min = Math.min(min, num); // Find minimum
            max = Math.max(max, num); // Find maximum
        }

        double average = (double) sum / numbers.length; // Calculate average
        return new double[]{average, min, max}; // Return average, min, and max in an array
    }

    public static void main(String[] args) {
        // Generate an array of 5 random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(5);

        // Find average, minimum, and maximum values
        double[] results = findAverageMinMax(randomNumbers);

        // Display results
        System.out.println("Random 4-Digit Numbers: " + Arrays.toString(randomNumbers));
        System.out.printf("Average: %.2f%n", results[0]);
        System.out.println("Minimum: " + (int) results[1]);
        System.out.println("Maximum: " + (int) results[2]);
    }
}
