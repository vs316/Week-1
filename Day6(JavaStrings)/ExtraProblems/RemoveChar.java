package JavaStrings;

import java.util.Scanner;


public class RemoveChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        System.out.println("Enter the character to be removed: ");
        String toRemove = sc.next();
        String result = input.replace(String.valueOf(toRemove), "");

        System.out.println("Modified String: " + result);
    }
}