import java.util.Scanner;

public class UppercaseConversion {

    // Method to convert lowercase letters to uppercase using charAt() and ASCII logic
    public static String toUpperCaseManual(String text) {
        StringBuilder upperCaseText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Convert lowercase to uppercase if in range 'a' (97) to 'z' (122)
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);  // ASCII difference between lowercase and uppercase is 32
            }
            upperCaseText.append(ch);
        }
        return upperCaseText.toString();
    }

    // Method to compare two strings character by character using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // If lengths are different, strings are not equal
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // If any character is different, return false
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();

        // Converting to uppercase manually
        String manualUppercase = toUpperCaseManual(inputText);

        // Using built-in toUpperCase() method
        String builtInUppercase = inputText.toUpperCase();

        // Comparing both methods
        boolean areEqual = compareStrings(manualUppercase, builtInUppercase);

        // Displaying results
        System.out.println("\nManual Uppercase Conversion: " + manualUppercase);
        System.out.println("Built-in Uppercase Conversion: " + builtInUppercase);
        System.out.println("Are both results identical? " + (areEqual ? "Yes" : "No"));

        scanner.close();
    }
}