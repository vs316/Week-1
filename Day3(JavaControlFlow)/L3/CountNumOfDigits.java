package ControlFlow;

import java.util.Scanner;

public class CountNumOfDigits {
    public static void main(String[] args) {
        int n, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        n = sc.nextInt();
        int origNum = n;
        while (origNum != 0) {
            count++;
            origNum /= 10;
        }
        if (n == 0) {
            count = 1;
        }
        System.out.println(n + " contains " + count + " digits.");
        sc.close();
    }
}
//optimal method- convert to string and measure length
//package ControlFlow;
//
//import java.util.Scanner;
//
//public class CountNumOfDigits {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter a value: ");
//        int n = sc.nextInt(); // Input from the user
//
//        // Convert the number to a string and count the digits
//        int count = String.valueOf(Math.abs(n)).length();
//
//        System.out.println(n + " contains " + count + " digits.");
//        sc.close();
//    }
//}