
import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Method that generates ArrayIndexOutOfBoundsException
    public static void generateException(String[] names, int index) {
        System.out.println("Accessing element at index " + index + ": " + names[index]); // May throw exception
    }

    // Method that handles ArrayIndexOutOfBoundsException using try-catch
    public static void handleException(String[] names, int index) {
        try {
            System.out.println("Accessing element at index " + index + ": " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: Index out of bounds!");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Defining an array of names
        String[] names = {"Alice", "Bob", "Charlie", "David", "Emma"};

        // Taking user input for the index
        System.out.print("Enter an index to access (0-" + (names.length - 1) + "): ");
        int index = scanner.nextInt();

        // Demonstrating ArrayIndexOutOfBoundsException
        System.out.println("\nGenerating ArrayIndexOutOfBoundsException...");
        try {
            generateException(names, index);  // This may cause an exception
        } catch (Exception e) {
            System.out.println("Exception handled in main: " + e);
        }

        // Demonstrating exception handling
        System.out.println("\nHandling ArrayIndexOutOfBoundsException safely...");
        handleException(names, index);

        scanner.close();
    }
}



