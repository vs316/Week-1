package JavaStrings;

import java.util.Scanner;

public class CalendarGenerator {

    // Array to store month names
    private static final String[] MONTH_NAMES = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    // Array to store the number of days in each month (non-leap year)
    private static final int[] DAYS_IN_MONTH = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the number of days in a month
    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29; // February in a leap year
        }
        return DAYS_IN_MONTH[month - 1]; // Return days from array
    }

    // Method to get the first day of the month using Gregorian calendar formula
    public static int getFirstDayOfMonth(int month, int year) {
        int day = 1; // First day of the month
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + (31 * m0) / 12) % 7; // Day of the week (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
        return d0;
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        String monthName = MONTH_NAMES[month - 1]; // Get month name
        int daysInMonth = getDaysInMonth(month, year); // Get days in month
        int startDay = getFirstDayOfMonth(month, year); // Get first day of month

        // Print calendar header
        System.out.printf("%n   %s %d%n", monthName, year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        // Print spaces for first day alignment
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        // Print days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf(" %3d", day);
            if ((startDay + day) % 7 == 0) { // Move to next line after Saturday
                System.out.println();
            }
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for month and year
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Validate month input
        if (month < 1 || month > 12) {
            System.out.println("Invalid month! Please enter a value between 1 and 12.");
        } else {
            displayCalendar(month, year); // Display the calendar
        }

        scanner.close();
    }
}
