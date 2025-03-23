package JavaMethods;

import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to calculate its factorial:");
        int number = scanner.nextInt();

        System.out.println("Factorial of " + number + " is: " + factorial(number));

        scanner.close();
    }

    public static int factorial(int num) {
        if (num == 0 || num == 1) return 1;
        return num * factorial(num - 1);
    }
}
