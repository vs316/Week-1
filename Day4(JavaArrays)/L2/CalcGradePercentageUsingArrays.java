package JavaArrays;

import java.util.Scanner;

public class CalcGradePercentageUsingArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Number of students
        System.out.println("Enter the number of students: ");
        int numStudents = sc.nextInt();

        // 2D array to store marks for Physics, Chemistry, and Maths
        float[][] marks = new float[numStudents][3]; // 3 columns for each subject
        float[] percentages = new float[numStudents];
        String[] grades = new String[numStudents];

        // Input marks for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");

            // Input marks for Physics with validation
            do {
                System.out.print("Physics (out of 100): ");
                marks[i][0] = sc.nextFloat();
                if (marks[i][0] < 0 || marks[i][0] > 100) {
                    System.out.println("Invalid input! Marks should be between 0 and 100.");
                }
            } while (marks[i][0] < 0 || marks[i][0] > 100);

            // Input marks for Chemistry with validation
            do {
                System.out.print("Chemistry (out of 100): ");
                marks[i][1] = sc.nextFloat();
                if (marks[i][1] < 0 || marks[i][1] > 100) {
                    System.out.println("Invalid input! Marks should be between 0 and 100.");
                }
            } while (marks[i][1] < 0 || marks[i][1] > 100);

            // Input marks for Maths with validation
            do {
                System.out.print("Maths (out of 100): ");
                marks[i][2] = sc.nextFloat();
                if (marks[i][2] < 0 || marks[i][2] > 100) {
                    System.out.println("Invalid input! Marks should be between 0 and 100.");
                }
            } while (marks[i][2] < 0 || marks[i][2] > 100);

            // Calculate percentage for the current student
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

            // Determine grade based on percentage
            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R"; // Remedial Standards
            }
        }

        // Display results for all students
        System.out.println("\nResults:");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("Student %d:\n", (i + 1));
            System.out.printf("Physics: %.2f, Chemistry: %.2f, Maths: %.2f\n", marks[i][0], marks[i][1], marks[i][2]);
            System.out.printf("Percentage: %.2f%%, Grade: %s\n\n", percentages[i], grades[i]);
        }

        sc.close();
    }
}