package ControlFlow;

import java.util.Scanner;

public class DisplayOddEvenNumsTillN {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        } else {
            System.out.println("Wrong input! Enter again: ");
            n = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " : Even number");
            } else {
                System.out.println(i + " : Odd number");
            }
        }
        sc.close();
    }
}
