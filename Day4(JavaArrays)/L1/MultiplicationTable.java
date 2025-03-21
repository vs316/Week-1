package JavaArrays;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number: ");
        n = sc.nextInt();
        int[] table = new int[10];
        for (int i = 0; i < table.length; i++) {
            table[i] = (i + 1) * n;
        }
        System.out.println("Multiplication Table of " + n + " till 10 is: ");
        for (int i = 0; i < table.length; i++) {
            System.out.println(n + " * " + (i + 1) + " = " + table[i]);
        }
        sc.close();
    }
}
