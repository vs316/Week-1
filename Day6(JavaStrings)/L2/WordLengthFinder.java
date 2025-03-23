package JavaStrings;

import java.util.Scanner;

public class WordLengthFinder {


    // Method to find the length of a string without using length()
    public static int findStringLength(String text) {
        int count = 0;
        try {
            while (true) { // Infinite loop to count characters
                text.charAt(count); // If index is out of bounds, exception occurs
                count++; // Increment the count for each valid character
            }
        } catch (IndexOutOfBoundsException e) {
            return count; // Return the counted length
        }
    }

    // Method to split text into words without using split()
    public static String[] splitTextManually(String text) {
        int length = findStringLength(text);
        int wordCount = 1; // At least one word exists

        // Count words by counting spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Array to store words
        String[] words = new String[wordCount];
        int startIndex = 0, wordIndex = 0;

        // Extract words using space positions
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(startIndex, i);
                startIndex = i + 1; // Move to the next word
            }
        }

        // Store the last word
        words[wordIndex] = text.substring(startIndex, length);

        return words;
    }

    // Method to store words and their lengths in a 2D array
    public static String[][] getWordsWithLengths(String[] words) {
        int numWords = findStringLength(words[0]); // Count number of words
        String[][] wordLengthArray = new String[words.length][2]; // 2D Array for words and lengths

        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i]; // Store word
            wordLengthArray[i][1] = String.valueOf(findStringLength(words[i])); // Store word length as String
        }

        return wordLengthArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a sentence: ");
        String inputText = scanner.nextLine();

        // Splitting manually
        String[] manualSplitWords = splitTextManually(inputText);

        // Getting words with lengths
        String[][] wordsWithLengths = getWordsWithLengths(manualSplitWords);

        // Displaying results in a table format
        System.out.println("\nWords and Their Lengths:");
        System.out.println("-------------------------");
        System.out.printf("%-15s | %s\n", "Word", "Length");
        System.out.println("-------------------------");

        for (String[] wordData : wordsWithLengths) {
            System.out.printf("%-15s | %d\n", wordData[0], Integer.parseInt(wordData[1]));
        }

        scanner.close();
    }
}
