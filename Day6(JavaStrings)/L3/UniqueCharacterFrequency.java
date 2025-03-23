package JavaStrings;

import java.util.Scanner;

public class UniqueCharacterFrequency {

    // Method to find unique characters in the string
    public static char[] findUniqueCharacters(String text) {
        char[] uniqueChars = new char[text.length()]; // Maximum possible unique characters
        int uniqueCount = 0;

        // Find unique characters using nested loops
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the character is already in uniqueChars array
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If unique, add to uniqueChars array
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create a new array with exact unique count
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }

    // Method to find the frequency of unique characters
    public static String[][] findCharacterFrequency(String text) {
        char[] uniqueChars = findUniqueCharacters(text);
        int[] frequency = new int[uniqueChars.length];

        // Count frequency of each unique character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            for (int j = 0; j < uniqueChars.length; j++) {
                if (uniqueChars[j] == currentChar) {
                    frequency[j]++;
                    break;
                }
            }
        }

        // Store results in a 2D String array
        String[][] charFrequencyArray = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            charFrequencyArray[i][0] = String.valueOf(uniqueChars[i]); // Store character
            charFrequencyArray[i][1] = String.valueOf(frequency[i]); // Store frequency
        }

        return charFrequencyArray;
    }

    // Method to display the character frequencies
    public static void displayCharacterFrequencies(String[][] charFrequencyArray) {
        System.out.println("\nCharacter Frequency:");
        for (String[] row : charFrequencyArray) {
            System.out.println(row[0] + " -> " + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find the frequency of unique characters
        String[][] frequencyArray = findCharacterFrequency(input);

        // Display result
        displayCharacterFrequencies(frequencyArray);

        scanner.close();
    }
}
