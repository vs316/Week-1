package JavaStrings;

import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindromeIterative(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    //Reverse String and Compare
    public static boolean isPalindromeUsingReverse(String text) {
        String reversed = reverseString(text);
        return text.equals(reversed);
    }

    //Method to reverse string using charAt()
    public static String reverseString(String text) {
        StringBuilder reversed = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = sc.nextLine();
        String text = input.replaceAll("\\s+", "").toLowerCase();
        boolean isPalindromeIterative = isPalindromeIterative(text);
        boolean isPalindromeRecursive = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean isPalindromeUsingReverse = isPalindromeUsingReverse(text);
        System.out.println("\nPalindrome Check Results: ");
        System.out.println("Using Iterative Method: " + isPalindromeIterative);
        System.out.println("Using Recursive Method: " + isPalindromeRecursive);
        System.out.println("Using Reverse & Compare: " + isPalindromeUsingReverse);

    }
}
