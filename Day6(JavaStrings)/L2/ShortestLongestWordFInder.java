package JavaStrings;

import java.util.Scanner;

class ShortestLongestWordFinder {
    public static int findStringLength(String text) {
        int count = 0;
        for (char c : text.toCharArray()) { // Convert the string to a character array
            count++;
        }
        return count;
    }

    public static String[] splitTextManually(String text) {
        int length = findStringLength(text);
        int wordCount = 0;

        // Count words by identifying transitions between non-space and space characters
        boolean inWord = false;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ') { // If current character is not a space
                if (!inWord) {
                    wordCount++;
                    inWord = true; // Start of a new word
                }
            } else {
                inWord = false; // Outside of a word
            }
        }

        String[] words = new String[wordCount];
        int startIndex = 0, wordIndex = 0;

        // Extract words based on spaces
        for (int i = 0; i <= length; i++) {
            if (i == length || text.charAt(i) == ' ') { // End of a word or end of text
                if (i > startIndex) { // Avoid empty words from consecutive spaces
                    words[wordIndex++] = text.substring(startIndex, i);
                }
                startIndex = i + 1; // Move to the next potential word start
            }
        }
        return words;
    }

    public static String[][] getWordsWithLengths(String[] words) {
        String[][] wordLengthArray = new String[words.length][2]; // 2D array for words and lengths
        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i]; // Store word
            wordLengthArray[i][1] = String.valueOf(findStringLength(words[i])); // Store word length as String
        }
        return wordLengthArray;
    }

    public static String[] findShortestAndLongestWords(String[][] wordLengthArray) {
        String shortestWord = wordLengthArray[0][0];
        String longestWord = wordLengthArray[0][0];
        int shortestLength = Integer.parseInt(wordLengthArray[0][1]);
        int longestLength = Integer.parseInt(wordLengthArray[0][1]);

        for (int i = 1; i < wordLengthArray.length; i++) {
            int currentLength = Integer.parseInt(wordLengthArray[i][1]);
            if (currentLength < shortestLength) {
                shortestLength = currentLength;
                shortestWord = wordLengthArray[i][0];
            }
            if (currentLength > longestLength) {
                longestLength = currentLength;
                longestWord = wordLengthArray[i][0];
            }
        }

        return new String[]{shortestWord, String.valueOf(shortestLength), longestWord, String.valueOf(longestLength)};
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

        // Finding shortest and longest words
        String[] shortestAndLongest = findShortestAndLongestWords(wordsWithLengths);

        // Displaying results
        System.out.println("\nWords and Their Lengths:");
        System.out.println("-------------------------");
        System.out.printf("%-15s | %s\n", "Word", "Length");
        System.out.println("-------------------------");

        for (String[] wordData : wordsWithLengths) {
            System.out.printf("%-15s | %s\n", wordData[0], wordData[1]);
        }

        System.out.println("\nShortest Word: " + shortestAndLongest[0] + " (Length: " + shortestAndLongest[1] + ")");
        System.out.println("Longest Word: " + shortestAndLongest[2] + " (Length: " + shortestAndLongest[3] + ")");

        scanner.close();
    }
}