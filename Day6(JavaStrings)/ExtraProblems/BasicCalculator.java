package JavaMethods;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.println("Choose an operation: (1) Addition (2) Subtraction (3) Multiplication (4) Division");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> System.out.println("Result: " + (num1 + num2));
            case 2 -> System.out.println("Result: " + (num1 - num2));
            case 3 -> System.out.println("Result: " + (num1 * num2));
            case 4 -> {
                if (num2 != 0) System.out.println("Result: " + (num1 / num2));
                else System.out.println("Division by zero is not allowed.");
            }
            default -> System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
