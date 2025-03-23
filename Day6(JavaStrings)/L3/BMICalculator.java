package JavaStrings;

import java.util.Scanner;

public class BMICalculator {
    // Method to calculate BMI and return BMI status
    public static String[] computeBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);
        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 24.9) {
            status = "Normal";
        } else if (bmi < 29.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        // Return BMI and status as an array
        return new String[]{String.format("%.2f", bmi), status};
    }

    public static String[][] computeAllBMI(double[][] personData) {
        String[][] bmiResults = new String[10][4];  // 10 rows, 4 columns (Height, Weight, BMI, Status)
        for (int i = 0; i < 10; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];
            String[] bmiData = computeBMI(weight, height);//Get BMI and status
            bmiResults[i][0] = String.format("%.1f cm", height);
            bmiResults[i][1] = String.format("%.1f kg", weight);
            bmiResults[i][2] = bmiData[0];//BMI Value
            bmiResults[i][3] = bmiData[1];//Status
        }
        return bmiResults;

    }

    // Method to display the BMI results in a tabular format
    public static void displayBMIResults(String[][] bmiResults) {
        System.out.println("\n================ BMI REPORT ================");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height", "Weight", "BMI", "Status");
        System.out.println("============================================");

        for (String[] row : bmiResults) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", row[0], row[1], row[2], row[3]);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] personData = new double[10][2];
        System.out.println("Enter the weight(kg) and height(cm) of 10 team members:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d - Weight (kg): ", i + 1);
            personData[i][0] = scanner.nextDouble();
            System.out.printf("Person %d - Height (cm): ", i + 1);
            personData[i][1] = scanner.nextDouble();
        }

        String[][] bmiResults = computeAllBMI(personData);

        displayBMIResults(bmiResults);

        scanner.close();
    }
}
