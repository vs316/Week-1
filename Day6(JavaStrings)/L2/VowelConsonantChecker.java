package JavaStrings;

import java.util.Scanner;

public class VowelConsonantChecker {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        ch = Character.toLowerCase(ch); // Convert to lowercase
        if (ch >= 'a' && ch <= 'z') { // Check if it's a letter
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter"; // For spaces, digits, symbols, etc.
        }
    }

    // Method to find vowels and consonants in a string and return a 2D array
    public static String[][] findCharacterTypes(String text) {
        int length = text.length();
        String[][] characterTypeArray = new String[length][2];

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            characterTypeArray[i][0] = String.valueOf(ch); // Store the character
            characterTypeArray[i][1] = checkCharacterType(ch); // Store the character type
        }

        return characterTypeArray;
    }

    // Method to display the 2D array in a tabular format
    public static void displayCharacterTypes(String[][] characterTypeArray) {
        System.out.printf("%-10s | %s\n", "Character", "Type");
        System.out.println("----------------------");

        for (String[] characterData : characterTypeArray) {
            System.out.printf("%-10s | %s\n", characterData[0], characterData[1]);
        }
    }

    // practiceprograms.Main method to take input, process the string, and display results
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Process the string to find character types
        String[][] characterTypeArray = findCharacterTypes(inputText);

        // Display the results
        System.out.println("\nCharacter Types:");
        displayCharacterTypes(characterTypeArray);

        scanner.close();
    }
}