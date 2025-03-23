package JavaStrings;

import java.util.Random;
import java.util.Scanner;

public class StudentScorecard {

    // Method to generate random scores for Physics, Chemistry, and Maths for all students
    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3]; // 3 subjects: PCM

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 40 + random.nextInt(61); // Physics (40 to 100)
            scores[i][1] = 40 + random.nextInt(61); // Chemistry (40 to 100)
            scores[i][2] = 40 + random.nextInt(61); // Maths (40 to 100)
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateStats(int[][] scores) {
        int numStudents = scores.length;
        double[][] stats = new double[numStudents][3]; // Total, Average, Percentage

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100; // Max marks = 300

            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100.0) / 100.0; // Round to 2 decimal places
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return stats;
    }

    // Method to determine the grade based on percentage
    public static String[] calculateGrades(double[][] stats) {
        int numStudents = stats.length;
        String[] grades = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            double percentage = stats[i][2]; // Get percentage

            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R"; // Remedial
            }
        }
        return grades;
    }

    // Method to display the student scorecard in tabular format
    public static void displayScorecard(int[][] scores, double[][] stats, String[] grades) {
        System.out.println("\n📊 Student Scorecard 📊");
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-10s %-8s %-8s %-8s %-8s %-10s %-12s %-8s\n",
                "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage", "Grade");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-8d %-8d %-8d %-8.0f %-10.2f %-12.2f %-8s\n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    stats[i][0], stats[i][1], stats[i][2], grades[i]);
        }
        System.out.println("-------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for number of students
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();

        // Generating random scores
        int[][] scores = generateScores(numStudents);

        // Calculating total, average, and percentage
        double[][] stats = calculateStats(scores);

        // Calculating grades
        String[] grades = calculateGrades(stats);

        // Displaying the scorecard
        displayScorecard(scores, stats, grades);

        scanner.close();
    }
}


