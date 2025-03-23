package JavaMethods;

import java.util.Scanner;

public class MaxOf3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three integers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int max = findMaximum(num1, num2, num3);
        System.out.println("The maximum number is: " + max);

        scanner.close();
    }

    public static int findMaximum(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}