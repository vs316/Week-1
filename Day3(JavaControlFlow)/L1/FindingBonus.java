package ControlFlow;

import java.util.Scanner;

public class FindingBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sal, yearsOfService;
        System.out.println("Enter salary and years of service separated by a space: ");
        sal = sc.nextInt();
        yearsOfService = sc.nextInt();
        float bonus = 0f;
        if (yearsOfService > 5) {
            bonus += sal * 0.05f;
            System.out.println("Bonus Amount: " + bonus);
        } else {
            System.out.println("Not eligible for Bonus");
        }
        sc.close();
    }
}
