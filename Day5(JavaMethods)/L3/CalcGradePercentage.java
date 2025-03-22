package JavaMethods;

import java.util.Random;
import java.util.Scanner;

public class CalcGradePercentage {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3]; // 3 subjects: Physics, Chemistry, Math
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = random.nextInt(90) + 10; // Random score between 10 and 99 for Physics
            scores[i][1] = random.nextInt(90) + 10; // Random score between 10 and 99 for Chemistry
            scores[i][2] = random.nextInt(90) + 10; // Random score between 10 and 99 for Math
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3]; // [total, average, percentage]
        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Round to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Round to 2 decimal places
        }
        return results;
    }

    // Method to display the scorecard
    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-10.2f %-10.2f\n",
                    i + 1, scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.println("Enter the number of students:");
        int numStudents = sc.nextInt();

        // Generate random scores
        int[][] scores = generateScores(numStudents);

        // Calculate results
        double[][] results = calculateResults(scores);

        // Display the scorecard
        displayScorecard(scores, results);

        sc.close();
    }
}
