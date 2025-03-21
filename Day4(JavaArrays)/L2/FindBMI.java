package JavaArrays;

import java.util.Scanner;

public class FindBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of persons: ");
        int numberOfPeople = sc.nextInt();

        // A single 1D array to store weight, height, BMI, and status
        double[] data = new double[numberOfPeople * 4];

        // Input weight and height, calculate BMI, and determine status
        for (int i = 0; i < numberOfPeople; i++) {
            // Calculate starting index for the person
            int baseIndex = i * 4;

            // Input weight and height
            System.out.println("Enter weight (kg) and height (m) for Person " + (i + 1) + ": ");
            data[baseIndex] = sc.nextDouble(); // Weight
            data[baseIndex + 1] = sc.nextDouble(); // Height

            // Calculate BMI
            double weight = data[baseIndex];
            double height = data[baseIndex + 1];
            data[baseIndex + 2] = weight / (height * height); // BMI

            // Determine weight status
            double bmi = data[baseIndex + 2];
            if (bmi < 18.5) {
                data[baseIndex + 3] = 0; // Underweight
            } else if (bmi < 24.9) {
                data[baseIndex + 3] = 1; // Normal weight
            } else if (bmi < 29.9) {
                data[baseIndex + 3] = 2; // Overweight
            } else {
                data[baseIndex + 3] = 3; // Obese
            }
        }

        // Display results
        System.out.println("\nBMI Results:");
        String[] statuses = {"Underweight", "Normal weight", "Overweight", "Obese"};
        for (int i = 0; i < numberOfPeople; i++) {
            int baseIndex = i * 4;
            System.out.println("Person " + (i + 1) + " - Weight: " + data[baseIndex] + "kg, Height: " +
                    data[baseIndex + 1] + "m, BMI: " + String.format("%.2f", data[baseIndex + 2]) +
                    ", Status: " + statuses[(int) data[baseIndex + 3]]);
        }

        sc.close();
    }
}