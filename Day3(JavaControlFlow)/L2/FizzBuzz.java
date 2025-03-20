//package ControlFlow;
//
//import java.util.Scanner;
//
//public class FizzBuzz {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num;
//
//        // Input validation to ensure a positive integer
//        do {
//            System.out.println("Enter a positive integer: ");
//            num = sc.nextInt();
//        } while (num <= 0);
//
//        // FizzBuzz logic using a for loop
//        for (int i = 1; i <= num; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz"); // Multiples of both 3 and 5
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz"); // Multiples of 3 only
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz"); // Multiples of 5 only
//            } else {
//                System.out.println(i); // Non-multiples
//            }
//        }
//
//        sc.close(); // Close the scanner
//    }
//}

package ControlFlow;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        // Input validation: Keep asking until a positive integer is entered
        do {
            System.out.println("Enter a positive integer: ");
            num = sc.nextInt();
        } while (num <= 0);

        int i = 1; // Start counting from 1
        while (i <= num) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz"); // Multiples of both 3 and 5
            } else if (i % 3 == 0) {
                System.out.println("Fizz"); // Multiples of 3 only
            } else if (i % 5 == 0) {
                System.out.println("Buzz"); // Multiples of 5 only
            } else {
                System.out.println(i); // Other numbers
            }
            i++; // Increment the counter
        }

        sc.close(); // Close the scanner
    }
}