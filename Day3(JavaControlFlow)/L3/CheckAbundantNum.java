package ControlFlow;

import java.util.Scanner;

public class CheckAbundantNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sumOfDivisors = 0;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sumOfDivisors += i;
            }
        }
        if (sumOfDivisors > n) {
            System.out.println(n + " is an Abundant number.");
        } else {
            System.out.println(n + " is not an Abundant number.");
        }
        sc.close();
    }

}
