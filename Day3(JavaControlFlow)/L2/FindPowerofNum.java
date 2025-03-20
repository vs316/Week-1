package ControlFlow;

import java.util.Scanner;

public class FindPowerofNum {
    public static void main(String[] args) {
        int base, exp;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the base and exponent: ");
            base = sc.nextInt();
            exp = sc.nextInt();
        } while (base <= 0 || exp <= 0);
        int res = 1, temp = 0;
//        for(int i=1;i<=exp;i++){
//            res*=base;
//        }
        while (temp != exp) {
            res *= base;
            temp += 1;
        }
        System.out.println(base + " raised to the power " + exp + " = " + res);
        sc.close();
    }

}
