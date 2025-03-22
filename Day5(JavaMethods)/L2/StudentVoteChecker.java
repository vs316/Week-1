package JavaMethods;

import java.util.Scanner;

public class StudentVoteChecker {
    // Method to check if a student can vote
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Invalid age
        }
        return age >= 18; // Returns true if 18 or above
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10]; // Array to store the ages of 10 students

        // Input: Collect ages of 10 students
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        // Check voting eligibility for each student and display result
        for (int i = 0; i < 10; i++) {
            boolean canVote = canStudentVote(ages[i]);
            if (ages[i] < 0) {
                System.out.println("Student " + (i + 1) + ": Age is invalid (negative), cannot vote.");
            } else if (canVote) {
                System.out.println("Student " + (i + 1) + " with age " + ages[i] + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " with age " + ages[i] + " cannot vote.");
            }
        }

        sc.close(); // Close scanner to release resources
    }
}
