import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method that generates IllegalArgumentException
    public static void generateException(String text) {
        // Setting start index greater than end index
        System.out.println("Substring: " + text.substring(5, 2));
    }

    // Method that handles IllegalArgumentException using try-catch
    public static void handleException(String text) {
        try {
            // Attempting an invalid substring operation
            System.out.println("Substring: " + text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: Start index is greater than end index.");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Demonstrating IllegalArgumentException
        System.out.println("\nGenerating IllegalArgumentException...");
        try {
            generateException(userInput);  // This will crash the program
        } catch (Exception e) {
            System.out.println("Exception handled in main: " + e);
        }

        // Demonstrating exception handling
        System.out.println("\nHandling IllegalArgumentException safely...");
        handleException(userInput);

        scanner.close();
    }
}