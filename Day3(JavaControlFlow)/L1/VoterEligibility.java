package ControlFlow;

import java.util.Scanner;

public class VoterEligibility {
    public static void main(String[] args) {
        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter voter age: ");
        age = input.nextInt();
        if (age >= 18) {
            System.out.println("The person's age is "+age+  " and can vote.");
        } else {
            System.out.println("The person's age is"+age+ " and cannot vote.");
        }
    }
}
