package ControlFlow;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt and take user input
        System.out.println("Enter the month (1 = January, ..., 12 = December): ");
        int m = sc.nextInt(); // Month

        System.out.println("Enter the day: ");
        int d = sc.nextInt(); // practiceprograms.Day

        System.out.println("Enter the year: ");
        int y = sc.nextInt(); // Year

        // Apply the formulas for the Gregorian calendar
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // Output the day of the week
        System.out.println("The day of the week is: " + d0);
        // 0 = Sunday, 1 = Monday, ..., 6 = Saturday

        sc.close(); // Close the scanner
    }
}