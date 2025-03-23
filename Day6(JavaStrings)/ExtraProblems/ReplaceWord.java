package JavaStrings;

import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String sentence = sc.nextLine();
        System.out.println("Enter the word to replace: ");
        String wordToReplace = sc.nextLine();
        System.out.println("Enter the replacement word: ");
        String replacement = sc.nextLine();
        String result = sentence.replace(wordToReplace, replacement);
        System.out.println("Modified Sentence: " + result);
        sc.close();
    }
}

