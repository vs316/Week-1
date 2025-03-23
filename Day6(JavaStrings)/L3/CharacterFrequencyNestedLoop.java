package JavaStrings;

import java.util.Scanner;

public class CharacterFrequencyNestedLoop {

    // Method to find character frequencies using nested loops
    public static String[] findCharacterFrequency(String text) {
        char[] characters = text.toCharArray(); // Convert string to character array
        int length = characters.length;
        int[] frequency = new int[length];

        // Outer loop: Iterate through each character
        for (int i = 0; i < length; i++) {
            if (characters[i] == '0') continue; // Skip already counted characters
            frequency[i] = 1; // Initialize frequency to 1

            // Inner loop: Count occurrences of the current character
            for (int j = i + 1; j < length; j++) {
                if (characters[i] == characters[j]) {
                    frequency[i]++;
                    characters[j] = '0'; // Mark duplicate character as '0'
                }
            }
        }

        // Count the number of unique characters (non-'0' elements)
        int uniqueCount = 0;
        for (char c : characters) {
            if (c != '0') uniqueCount++;
        }

        // Store characters and their frequencies in a 1D String array
        String[] charFrequencyArray = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (characters[i] != '0') {
                charFrequencyArray[index] = characters[i] + " -> " + frequency[i];
                index++;
            }
        }

        return charFrequencyArray;
    }

    // Method to display character frequencies
    public static void displayCharacterFrequencies(String[] charFrequencyArray) {
        System.out.println("\nCharacter Frequency:");
        for (String entry : charFrequencyArray) {
            System.out.println(entry);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find the frequency of characters
        String[] frequencyArray = findCharacterFrequency(input);

        // Display result
        displayCharacterFrequencies(frequencyArray);

        scanner.close();
    }
}

