package JavaStrings;

import java.util.Arrays;
import java.util.Scanner;

public class StringSplit {
    public static int findStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[] SplitterMethod(String str) {
        int length = findStringLength(str);
        int wordCount = 1;
        //Count words by counting spaces
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int startIndex = 0, wordIndex = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                words[wordIndex++] = str.substring(startIndex, i);
                startIndex = i + 1;//Move to the next word
            }
        }

        words[wordIndex] = str.substring(startIndex, length);

        return words;
    }

    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        String[] builtInSplitString = input.split(" ");
        String[] manualSplitString = SplitterMethod(input);
        boolean areEqual = compareStringArrays(manualSplitString, builtInSplitString);
        System.out.println("Split String using the built in split() method= " + Arrays.toString(builtInSplitString));
        System.out.println("Split String using the manual method= " + Arrays.toString(manualSplitString));
        System.out.println("Are both results identical? " + (areEqual ? "Yes" : "No"));
        sc.close();
    }
}
