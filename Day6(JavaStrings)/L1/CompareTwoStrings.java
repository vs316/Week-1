package JavaStrings;

import java.util.Scanner;

public class CompareTwoStrings {
    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String s1, String s2) {
        // Check if lengths are different; if so, strings cannot be equal
        if (s1.length() != s2.length()) {
            return false;
        }

        // Compare characters at each index
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false; // If characters don't match, return false
            }
        }

        return true; // Strings match character by character
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input strings using Scanner next() method
        System.out.println("Enter the first string: ");
        String s1 = sc.next();
        System.out.println("Enter the second string: ");
        String s2 = sc.next();

        // Compare strings using charAt()
        boolean charAtResult = compareUsingCharAt(s1, s2);

        // Compare strings using built-in equals() method
        boolean equalsResult = s1.equals(s2);

        // Display results
        System.out.println("Comparison using charAt(): " + charAtResult);
        System.out.println("Comparison using equals(): " + equalsResult);

        // Verify if results match
        if (charAtResult == equalsResult) {
            System.out.println("Results of charAt() and equals() comparison are consistent.");
        } else {
            System.out.println("Results of charAt() and equals() comparison differ.");
        }

        sc.close();
    }
}
