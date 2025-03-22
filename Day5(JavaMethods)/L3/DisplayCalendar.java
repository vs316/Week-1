package JavaMethods;

import java.util.Scanner;

public class DisplayCalendar {
    public static String GetNameOfMonth(int n) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return months[n - 1];
    }

    public static boolean leapYearChecker(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int GetNumberOfDaysInMonth(int n, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean leapYearCheck = leapYearChecker(year);
        if (leapYearCheck) {
            days[1] = 29;
        }
        return days[n - 1];
    }

    public static int getFirstDayOfMonth(int year, int month) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7; // 1 represents the first day of the month
        return d0; // d0 corresponds to days: 0 = Sun, 1 = Mon, ..., 6 = Sat
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month(1-12): ");
        int month = sc.nextInt();
        System.out.println("Enter year:");
        int year = sc.nextInt();

        // Get the month's name
        String monthName = GetNameOfMonth(month);

        // Get number of days in the month
        int daysInMonth = GetNumberOfDaysInMonth(month, year);
        // Get first day of the month
        int firstDay = getFirstDayOfMonth(year, month);
        System.out.println("\n         " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        // Add spaces for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print the days
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);

            // Move to the next line after Saturday
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();


    }
}

