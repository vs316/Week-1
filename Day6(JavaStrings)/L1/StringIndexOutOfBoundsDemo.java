import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method that generates StringIndexOutOfBoundsException
    public static void generateException(String text) {
        // Accessing an index beyond the length of the string
        System.out.println("Character at invalid index: " + text.charAt(text.length()));
    }

    // Method that handles StringIndexOutOfBoundsException using try-catch
    public static void handleException(String text) {
        try {
            // Attempting to access an invalid index
            System.out.println("Character at invalid index: " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: Index is out of bounds.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Demonstrating StringIndexOutOfBoundsException
        System.out.println("\nGenerating StringIndexOutOfBoundsException...");
        try {
            generateException(userInput);  // This will crash the program
        } catch (Exception e) {
            System.out.println("Exception handled in main: " + e);
        }

        // Demonstrating exception handling
        System.out.println("\nHandling StringIndexOutOfBoundsException safely...");
        handleException(userInput);

        scanner.close();
    }
}