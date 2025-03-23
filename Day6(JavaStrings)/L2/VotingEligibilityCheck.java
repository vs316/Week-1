package JavaStrings;

import java.util.Random;
import java.util.Scanner;

public class VotingEligibilityCheck {

    // Method to generate random 2-digit ages for n students
    public static int[] generateStudentAges(int numberOfStudents) {
        Random random = new Random();
        int[] ages = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            ages[i] = random.nextInt(82) + 10; // Random age between 10 and 91
        }

        return ages;
    }

    // Method to determine voting eligibility and store in a 2D array
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]); // Store age as a string

            if (ages[i] < 0) {
                result[i][1] = "Invalid Age";
            } else if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }

        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayResults(String[][] results) {
        System.out.println("\nStudent Age Voting Eligibility");
        System.out.println("-------------------------------");
        System.out.printf("%-10s %-15s\n", "Age", "Eligibility");
        System.out.println("-------------------------------");

        for (String[] row : results) {
            System.out.printf("%-10s %-15s\n", row[0], row[1]);
        }

        System.out.println("-------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Generating random ages
        int[] studentAges = generateStudentAges(numberOfStudents);

        // Checking voting eligibility
        String[][] eligibilityResults = checkVotingEligibility(studentAges);

        // Displaying results
        displayResults(eligibilityResults);

        scanner.close();
    }
}
