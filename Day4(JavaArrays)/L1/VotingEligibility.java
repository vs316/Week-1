package JavaArrays;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int[] ageOfStudents = new int[10];
        for (int i = 0; i < ageOfStudents.length; i++) {
            System.out.print(" For student " + (i + 1) + ": ");
            ageOfStudents[i] = sc.nextInt();
        }
        for (int ageOfStudent : ageOfStudents) {
            if (ageOfStudent < 0) {
                System.err.println("Invalid Age");
                System.exit(0);
            } else if (ageOfStudent >= 18) {
                System.out.println("The student with age " + ageOfStudent + " can vote.");
            } else {
                System.out.println("The student with age " + ageOfStudent + " cannot vote.");
            }
        }
        sc.close();
    }
}
