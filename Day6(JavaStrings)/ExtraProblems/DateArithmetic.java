import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input date from user
        System.out.println("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();

        // Parse the input date
        LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        // Perform date arithmetic
        LocalDate updatedDate = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);

        // Format and display the result
        System.out.println("Original Date: " + date);
        System.out.println("Updated Date: " + updatedDate);

        scanner.close();
    }
}