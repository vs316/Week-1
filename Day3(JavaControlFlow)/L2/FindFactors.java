//package ControlFlow;
//
//import java.util.Scanner;
//
//public class FindFactors {
//    public static void main(String[] args) {
//        int n;
//        Scanner sc = new Scanner(System.in);
//
//        // Validate input to ensure the number is positive
//        do {
//            System.out.println("Enter a positive number: ");
//            n = sc.nextInt();
//        } while (n <= 0);
//
//        // Find and print the factors of n
//        System.out.println("Factors of " + n + " are:");
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) { // Check divisibility
//                System.out.print(i + " ");
//            }
//        }
//
//        sc.close();
//    }
//}
//while loop

package ControlFlow;

import java.util.Scanner;

public class FindFactors {
    public static void main(String[] args) {
        int n, i = 1;
        Scanner sc = new Scanner(System.in);

        // Validate input to ensure the number is positive
        do {
            System.out.println("Enter a positive number: ");
            n = sc.nextInt();
        } while (n <= 0);

        // Find and print the factors of n
        System.out.println("Factors of " + n + " are:");
        while (i <= n) {
            if (n % i == 0) { // Check divisibility
                System.out.print(i + " ");
            }
            i++; // Increment the counter
        }

        sc.close();
    }
}