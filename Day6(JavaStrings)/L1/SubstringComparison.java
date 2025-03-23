package JavaStrings;

import java.util.Scanner;

public class SubstringComparison {

    // Method to create a substring using charAt() method
    public static String createSubstringUsingCharAt(String text, int start, int end) {
        StringBuilder substring = new StringBuilder();

        for (int i = start; i < end; i++) {
            substring.append(text.charAt(i)); // Append character by character
        }

        return substring.toString(); // Convert StringBuilder to String
    }

    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
        // Check if lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare characters at each index
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // Return false if any character mismatches
            }
        }

        return true; // Return true if all characters match
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input original string
        System.out.println("Enter the original string: ");
        String text = sc.nextLine();

        // Input start and end indices
        System.out.println("Enter the start index: ");
        int start = sc.nextInt();
        System.out.println("Enter the end index: ");
        int end = sc.nextInt();

        // Validate indices
        if (start < 0 || end > text.length() || start >= end) {
            System.out.println("Invalid indices! Start should be >= 0 and end should be <= string length, and start should be less than end.");
        } else {
            // Generate substring using charAt()
            String manualSubstring = createSubstringUsingCharAt(text, start, end);

            // Generate substring using built-in method
            String builtInSubstring = text.substring(start, end);

            // Compare the two substrings
            boolean areEqual = compareUsingCharAt(manualSubstring, builtInSubstring);

            // Display results
            System.out.println("Substring using charAt(): " + manualSubstring);
            System.out.println("Substring using substring(): " + builtInSubstring);
            System.out.println("Are both substrings equal? " + areEqual);
        }

        sc.close(); // Close Scanner
    }
}