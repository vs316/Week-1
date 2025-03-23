package JavaStrings;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (result.indexOf(String.valueOf(ch)) == -1) {
                result.append(ch);
            }
        }
        System.out.println("String after removing duplicates: " + result);
        sc.close();

    }
}
