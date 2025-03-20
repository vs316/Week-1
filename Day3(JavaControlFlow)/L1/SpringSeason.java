package ControlFlow;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        int month, day;

        System.out.println("Enter the month and day in numbers separated by a space (Months: 1-12 | Days: 1-31): ");
        Scanner sc = new Scanner(System.in);
        month = sc.nextInt();
        day = sc.nextInt();
        sc.close();

        // Check if the input is valid
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println("Invalid input! Please enter a valid month (1-12) and day (1-31).");
            return; // Exit the program
        }

        // Check if it's spring season
        if ((month == 3 && day >= 20 && day <= 31) || // March 20 to 31
                (month > 3 && month < 6) ||              // April and May
                (month == 6 && day >= 1 && day <= 20)) { // June 1 to 20
            System.out.println("It's Spring Season.");
        } else {
            System.out.println("It's not Spring Season.");
        }
    }
}