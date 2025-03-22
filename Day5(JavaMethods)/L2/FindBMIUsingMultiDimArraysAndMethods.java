package JavaMethods;


import java.util.Scanner;

public class FindBMIUsingMultiDimArraysAndMethods {

    // Method to calculate the BMI of each person and populate the array
    public static void calculateBMI(double[][] personData) {
        for (int i = 0; i < personData.length; i++) {
            // Convert height from cm to meters
            double heightInMeters = personData[i][1] / 100;
            // Calculate BMI
            double bmi = personData[i][0] / (heightInMeters * heightInMeters);
            personData[i][2] = bmi; // Store BMI in the array
        }
    }

    // Method to determine BMI status for each person
    public static String[] determineBMIStatus(double[][] personData) {
        String[] bmiStatus = new String[personData.length];
        for (int i = 0; i < personData.length; i++) {
            double bmi = personData[i][2];
            if (bmi < 18.5) {
                bmiStatus[i] = "Underweight";
            } else if (bmi < 24.9) {
                bmiStatus[i] = "Normal weight";
            } else if (bmi < 29.9) {
                bmiStatus[i] = "Overweight";
            } else {
                bmiStatus[i] = "Obese";
            }
        }
        return bmiStatus; // Return the array of BMI statuses
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of people is fixed to 10
        int numberOfPeople = 10;
        double[][] personData = new double[numberOfPeople][3]; // Array to store weight, height, and BMI
        String[] weightStatus;

        // Input data for each person
        for (int i = 0; i < numberOfPeople; i++) {
            do {
                System.out.println("Enter weight (in kgs) and height (in cm) for Person " + (i + 1) + ": ");
                personData[i][0] = sc.nextDouble(); // Weight in kg
                personData[i][1] = sc.nextDouble(); // Height in cm

                if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                    System.out.println("Invalid input! Weight and height must be greater than 0. Please try again.");
                }
            } while (personData[i][0] <= 0 || personData[i][1] <= 0);
        }

        // Calculate BMI for all persons
        calculateBMI(personData);

        // Determine BMI status for all persons
        weightStatus = determineBMIStatus(personData);

        // Display results
        System.out.println("\nBMI Results:");
        for (int i = 0; i < numberOfPeople; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("   Weight: " + personData[i][0] + " kgs");
            System.out.println("   Height: " + personData[i][1] + " cm");
            System.out.println("   BMI: " + String.format("%.2f", personData[i][2]));
            System.out.println("   Weight Status: " + weightStatus[i]);
        }

        sc.close(); // Close the scanner
    }
}