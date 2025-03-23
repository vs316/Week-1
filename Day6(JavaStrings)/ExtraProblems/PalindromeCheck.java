package JavaStrings;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        StringBuilder rev = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            rev.append(input.charAt(i));
        }
        if (input.contentEquals(rev)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        sc.close();
    }
}
