package JavaArrays;

import java.util.Scanner;

public class FindBMIUsingMultiDimArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of people: ");
        int number = sc.nextInt();
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];
        double bmi;
        for (int i = 0; i < number; i++) {
            do {
                System.out.println("Enter weight(in kgs) and height(in meters) of Person " + (i + 1) + ": ");
                personData[i][0] = sc.nextDouble();
                personData[i][1] = sc.nextDouble();
                if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                    System.out.println("Invalid input! Weight and height must be greater than 0. Please try again.");
                }

            } while (personData[i][0] <= 0 || personData[i][1] <= 0);
            double weight = personData[i][0];
            double height = personData[i][1];
            bmi = weight / Math.pow(height, 2);
            personData[i][2] = bmi;
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }

        }
        // Display results
        System.out.println("\nBMI Results:");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("   Weight: " + personData[i][0] + " kgs");
            System.out.println("   Height: " + personData[i][1] + " meters");
            System.out.println("   BMI: " + String.format("%.2f", personData[i][2]));
            System.out.println("   Weight Status: " + weightStatus[i]);
        }


        sc.close();
    }
}

