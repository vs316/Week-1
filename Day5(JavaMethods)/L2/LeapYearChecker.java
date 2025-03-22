package JavaMethods;

import java.util.Scanner;

public class LeapYearChecker {
    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if (year >= 1582) { // Gregorian calendar only
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }
        return false; // Not valid for years before 1582
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a year
        System.out.println("Enter a year: ");
        int year = sc.nextInt();

        // Check and display whether it's a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        sc.close();
    }
}