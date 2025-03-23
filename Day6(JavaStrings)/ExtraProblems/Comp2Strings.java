package JavaStrings;

import java.util.Scanner;

public class Comp2Strings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter another string: ");
        String str2 = sc.nextLine();
        int result = compareStringsLexicographically(str1, str2);

        if (result < 0) {
            System.out.println(str1 + " comes before " + str2);
        } else if (result > 0) {
            System.out.println(str1 + " comes after " + str2);
        } else {
            System.out.println(str1 + " is equal to " + str2);
        }
    }

    // Method to compare two strings lexicographically
    public static int compareStringsLexicographically(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());

        for (int i = 0; i < minLength; i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            if (ch1 < ch2) {
                return -1; // str1 comes before str2
            } else if (ch1 > ch2) {
                return 1; // str1 comes after str2
            }
        }

        // If all characters are equal, compare lengths
        if (str1.length() < str2.length()) {
            return -1; // str1 is shorter, so it comes before str2
        } else if (str1.length() > str2.length()) {
            return 1; // str1 is longer, so it comes after str2
        }


        return 0; // Strings are equal
    }
}
