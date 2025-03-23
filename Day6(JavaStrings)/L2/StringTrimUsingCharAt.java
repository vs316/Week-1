package JavaStrings;

import java.util.Scanner;

public class StringTrimUsingCharAt {

    // Method to find the start and end indexes excluding leading and trailing spaces
    public static int[] findTrimIndexes(String text) {
        int start = 0, end = text.length() - 1;

        // Find the first non-space character
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Find the last non-space character
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        StringBuilder trimmedText = new StringBuilder();
        for (int i = start; i <= end; i++) {
            trimmedText.append(text.charAt(i));
        }
        return trimmedText.toString();
    }

    // Method to compare two strings character by character using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string with leading and trailing spaces: ");
        String inputText = scanner.nextLine();

        // Finding trim indexes
        int[] trimIndexes = findTrimIndexes(inputText);
        int startIndex = trimIndexes[0];
        int endIndex = trimIndexes[1];

        // Getting manually trimmed string
        String manuallyTrimmedText = createSubstring(inputText, startIndex, endIndex);

        // Using built-in trim() method
        String builtInTrimmedText = inputText.trim();

        // Comparing both results
        boolean isSame = compareStrings(manuallyTrimmedText, builtInTrimmedText);

        // Displaying results
        System.out.println("\nManually Trimmed String: '" + manuallyTrimmedText + "'");
        System.out.println("Built-in Trimmed String: '" + builtInTrimmedText + "'");
        System.out.println("Are both results the same? " + isSame);

        scanner.close();
    }
}

