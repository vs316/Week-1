import java.util.Scanner;

public class LowercaseConversion {

    // Method to convert uppercase letters to lowercase using charAt() and ASCII logic
    public static String toLowerCaseManual(String text) {
        StringBuilder lowerCaseText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Convert uppercase to lowercase if in range 'A' (65) to 'Z' (90)
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);  // ASCII difference between uppercase and lowercase is 32
            }
            lowerCaseText.append(ch);
        }
        return lowerCaseText.toString();
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

        // Converting to lowercase manually
        String manualLowercase = toLowerCaseManual(inputText);

        // Using built-in toLowerCase() method
        String builtInLowercase = inputText.toLowerCase();

        // Comparing both methods
        boolean areEqual = compareStrings(manualLowercase, builtInLowercase);

        // Displaying results
        System.out.println("\nManual Lowercase Conversion: " + manualLowercase);
        System.out.println("Built-in Lowercase Conversion: " + builtInLowercase);
        System.out.println("Are both results identical? " + (areEqual ? "Yes" : "No"));

        scanner.close();
    }
}
