package ControlFlow;

import java.util.Scanner;

public class FindHarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        int origNum = n;
        while (origNum != 0) {
            int digits = origNum % 10;
            sum += digits;
            origNum /= 10;
        }
        if (n % sum == 0) {
            System.out.println(n + " is a Harshad number.");
        } else {
            System.out.println(n + " is not a Harshad number.");
        }
        sc.close();
    }
}
