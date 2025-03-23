import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Define custom date formats
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // Format and display the date in different formats
        System.out.println("Current Date in dd/MM/yyyy format: " + currentDate.format(format1));
        System.out.println("Current Date in yyyy-MM-dd format: " + currentDate.format(format2));
        System.out.println("Current Date in EEE, MMM dd, yyyy format: " + currentDate.format(format3));
    }
}