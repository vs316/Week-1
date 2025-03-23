package JavaStrings;

import java.util.Scanner;

public class CharacterFrequencyFinder {

    // Method to find the frequency of characters in a string
    public static char[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256]; // Array to store frequency of each character (ASCII size)

        // First loop: Count frequency of each character in the text
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Find number of unique characters
        int uniqueCharCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCharCount++;
            }
        }

        // Create 2D array to store characters and their frequencies
        char[][] charFrequencyArray = new char[uniqueCharCount][2];
        int index = 0;

        // Store characters and their frequencies
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                charFrequencyArray[index][0] = (char) i; // Store character
                charFrequencyArray[index][1] = (char) frequency[i]; // Store frequency (converted to char)
                index++;
            }
        }

        return charFrequencyArray;
    }

    // Method to display the character frequencies
    public static void displayCharacterFrequencies(char[][] charFrequencyArray) {
        System.out.println("\nCharacter Frequency:");
        for (char[] row : charFrequencyArray) {
            System.out.println(row[0] + " -> " + (int) row[1]); // Convert frequency back to integer
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find the frequency of characters
        char[][] frequencyArray = findCharacterFrequency(input);

        // Display result
        displayCharacterFrequencies(frequencyArray);

        scanner.close();
    }
}
