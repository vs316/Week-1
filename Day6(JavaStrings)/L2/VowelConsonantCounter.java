package JavaStrings;

import java.util.Scanner;

public class VowelConsonantCounter {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        ch = Character.toLowerCase(ch); // Convert to lowercase for uniformity
         /* if (ch >= 'A' && ch <= 'Z') {//convert to lowercase manually
            ch = (char) (ch + 32); // Convert to lowercase
        }*/
        if (ch >= 'a' && ch <= 'z') { // Check if it's a letter
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter"; // Handle non-alphabetical characters
        }
    }

    // Method to count vowels and consonants in a string
    public static int[] findVowelsAndConsonants(String text) {
        int vowels = 0, consonants = 0;

        for (int i = 0; i < text.length(); i++) { // Traverse the string using charAt()
            char ch = text.charAt(i);
            String type = checkCharacterType(ch);
            if (type.equals("Vowel")) {
                vowels++;
            } else if (type.equals("Consonant")) {
                consonants++;
            }
        }

        return new int[]{vowels, consonants}; // Return counts as an array
    }

    // practiceprograms.Main method to handle user input and display results
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Finding vowels and consonants
        int[] counts = findVowelsAndConsonants(inputText);

        // Displaying results
        System.out.println("\nResults:");
        System.out.println("Number of Vowels: " + counts[0]);
        System.out.println("Number of Consonants: " + counts[1]);

        scanner.close();
    }
}