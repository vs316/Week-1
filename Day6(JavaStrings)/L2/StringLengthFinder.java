package JavaStrings;

import java.util.Scanner;

public class StringLengthFinder {
    public static int FindStringLength(String str) {
        int length = 0, i = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            return length;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();
        int manualStringLength = FindStringLength(str);
        int builtInStringLength = str.length();
        System.out.println("The length of the entered string using our method = " + manualStringLength);
        System.out.println("The length of the entered string using the built-in method = " + builtInStringLength);
        System.out.println("Is the built-in string length and the manually calculated string length the same? " + ((manualStringLength == builtInStringLength) ? "Yes" : "No"));
        sc.close();

    }
}
