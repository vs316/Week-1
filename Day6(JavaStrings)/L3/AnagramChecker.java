package JavaStrings;

import java.util.Scanner;

public class AnagramChecker {
    public static boolean areAnagrams(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }
        int[] frequency1 = new int[256];//ASCII chars
        int[] frequency2 = new int[256];
        //Count frequency of characters in both texts
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
            frequency2[text2.charAt(i)]++;
        }
        //Compare character frequencies
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first text: ");
        String input1 = sc.nextLine();
        System.out.println("Enter second text: ");
        String input2 = sc.nextLine();

        String text1 = input1.replaceAll("\\s+", "").toLowerCase();
        String text2 = input2.replaceAll("\\s+", "").toLowerCase();

        boolean result = areAnagrams(text1, text2);
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }
        sc.close();

    }
}
