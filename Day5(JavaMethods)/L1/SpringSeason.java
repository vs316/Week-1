package JavaMethods;

import java.util.Scanner;

public class SpringSeason {
    // Method to check if the given date is in Spring Season
    public static boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20 && day <= 31) || // March 20 to 31
                (month == 4 && day >= 1 && day <= 30) ||  // April 1 to 30
                (month == 5 && day >= 1 && day <= 31) ||  // May 1 to 31
                (month == 6 && day >= 1 && day <= 20);    // June 1 to 20
    }

    public static void main(String[] args) {
        // Create Scanner instance for user input
        Scanner sc = new Scanner(System.in);

        // Take input for month and day
        System.out.println("Enter the month (1-12): ");
        int month = sc.nextInt();
        System.out.println("Enter the day (1-31): ");
        int day = sc.nextInt();

        // Validate month and day
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println("Invalid date. Please enter a valid month (1-12) and day (1-31).");
        } else {
            // Call the method to check for Spring Season and display result
            if (isSpringSeason(month, day)) {
                System.out.println("It's a Spring Season.");
            } else {
                System.out.println("Not a Spring Season.");
            }
        }

        // Close the scanner
        sc.close();
    }
}