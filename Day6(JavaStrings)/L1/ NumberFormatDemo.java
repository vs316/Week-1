import java.util.Scanner;

public class NumberFormatDemo {

    // Method that generates NumberFormatException
    public static void generateException(String text) {
        System.out.println("Converted Number: " + Integer.parseInt(text)); // This will throw NumberFormatException
    }

    // Method that handles NumberFormatException using try-catch
    public static void handleException(String text) {
        try {
            System.out.println("Converted Number: " + Integer.parseInt(text));
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: Input is not a valid integer.");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a number as text: ");
        String userInput = scanner.nextLine();

        // Demonstrating NumberFormatException
        System.out.println("\nGenerating NumberFormatException...");
        try {
            generateException(userInput);  // This will crash the program if input is not a valid number
        } catch (Exception e) {
            System.out.println("Exception handled in main: " + e);
        }

        // Demonstrating exception handling
        System.out.println("\nHandling NumberFormatException safely...");
        handleException(userInput);

        scanner.close();
    }
}