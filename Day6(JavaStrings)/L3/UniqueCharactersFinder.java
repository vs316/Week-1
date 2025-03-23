package JavaStrings;

import java.util.Scanner;

public class UniqueCharactersFinder {

    public static int getStringLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            return length;
        }
    }

    public static char[] findUniqueCharacters(String text) {
        int textLength = getStringLength(text);
        char[] uniqueChars = new char[textLength];
        int uniqueCount = 0;
        for (int i = 0; i < textLength; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            //Check if the character is already in the uniqueChars Array
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            //if unique, add to the array
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }
// Create a new array with the exact size of unique characters found
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        char[] uniqueCharacters = findUniqueCharacters(input);
        System.out.println("Unique characters: ");
        for (char c : uniqueCharacters) {
            System.out.print(c + " ");
        }

        sc.close();
    }

}
