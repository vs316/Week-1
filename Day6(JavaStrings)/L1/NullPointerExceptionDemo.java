package JavaStrings;

public class NullPointerExceptionDemo {

    // Method that generates NullPointerException
    public static void generateException() {
        String text = null;
        // Attempting to call a method on a null reference (this will throw an exception)
        System.out.println(text.length());
    }

    // Method that handles NullPointerException using try-catch
    public static void handleException() {
        String text = null;
        try {
            // Attempting to call a method on a null reference
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: Cannot access methods on a null object.");
        }
    }

    public static void main(String[] args) {
        // Demonstrating NullPointerException
        System.out.println("Generating NullPointerException...");
        try {
            generateException();  // This will crash the program
        } catch (Exception e) {
            System.out.println("Exception handled in main: " + e);
        }

        // Demonstrating exception handling
        System.out.println("\nHandling NullPointerException safely...");
        handleException();
    }
}
