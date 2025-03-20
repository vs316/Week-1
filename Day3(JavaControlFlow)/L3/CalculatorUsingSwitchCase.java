package ControlFlow;

import java.util.Scanner;

public class CalculatorUsingSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of operations to be performed: ");
        int numOfOps = sc.nextInt();

        for (int i = 1; i <= numOfOps; i++) {
            System.out.println("Enter the first number: ");
            double first = sc.nextDouble();

            System.out.println("Enter the second number: ");
            double second = sc.nextDouble();

            System.out.println("Enter the operation (addition: +, subtraction: -, multiplication: *, division: /): ");
            String op = sc.next();

            double result = performOperation(first, second, op);
            if (!Double.isNaN(result)) {
                System.out.println("Result: " + result);
            } else {
                System.out.println("Invalid operation or division by zero.");
            }
        }

        sc.close();
    }

    public static double performOperation(double first, double second, String op) {
        double result = Double.NaN; // Initialize with NaN (Not a Number) for invalid cases

        switch (op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                }
                break;
            default:
                System.out.println("Invalid operator!");
        }

        return result;
    }
}