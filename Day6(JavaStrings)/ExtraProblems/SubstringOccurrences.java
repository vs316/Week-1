package JavaStrings;

import java.util.Scanner;

public class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        System.out.println("Enter substring: ");
        String substring = sc.nextLine();
        int count = 0;
        for (int i = 0; i <= input.length() - substring.length(); i++) {
            if (input.startsWith(substring, i)) {
                count++;
            }
        }
        System.out.println("Occurrences of substring: " + count);
        sc.close();

    }

}
