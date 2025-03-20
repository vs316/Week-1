package ControlFlow;

import java.util.Scanner;

public class CalcGradePercentage {
    public static void main(String[] args) {
        float physics, chem, math;
        Scanner sc = new Scanner(System.in);

        // Input marks and validate
        System.out.println("Enter marks in Physics, Chemistry, and Math out of 100, separated by spaces: ");
        physics = sc.nextFloat();
        chem = sc.nextFloat();
        math = sc.nextFloat();

        // Validate input marks are between 0 and 100
        if (physics < 0 || physics > 100 || chem < 0 || chem > 100 || math < 0 || math > 100) {
            System.out.println("Error: Marks should be between 0 and 100. Please try again.");
            sc.close();
            return;
        }

        // Calculate average marks
        float avgMarks = (physics + chem + math) / 3;

        // Determine grade and remarks
        String grade, remarks;
        if (avgMarks >= 80) {
            grade = "A";
            remarks = "(Level 4, above agency-normalized standards)";
        } else if (avgMarks >= 70) {
            grade = "B";
            remarks = "(Level 3, at agency-normalized standards)";
        } else if (avgMarks >= 60) {
            grade = "C";
            remarks = "(Level 2, below, but approaching agency-normalized standards)";
        } else if (avgMarks >= 50) {
            grade = "D";
            remarks = "(Level 1, well below agency-normalized standards)";
        } else if (avgMarks >= 40) {
            grade = "E";
            remarks = "(Level 1-, too below agency-normalized standards)";
        } else {
            grade = "R";
            remarks = "Remedial Standards";
        }

        // Display the results
        System.out.printf("Grade: %s\nRemarks: %s\nAverage Marks in PCM: %.2f\n", grade, remarks, avgMarks);
        sc.close();
    }
}