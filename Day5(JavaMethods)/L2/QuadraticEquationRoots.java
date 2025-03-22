package JavaMethods;

import java.util.Scanner;

public class QuadraticEquationRoots {

    // Method to calculate roots of a quadratic equation
    public static String[] quadrootsSolver(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c; // Correct discriminant
        String[] roots = new String[2]; // Array to store roots (as Strings for handling complex roots)

        if (delta > 0) { // Two distinct real roots
            roots[0] = String.valueOf((-b + Math.sqrt(delta)) / (2 * a));
            roots[1] = String.valueOf((-b - Math.sqrt(delta)) / (2 * a));
        } else if (delta == 0) { // One real root
            double singleRoot = -b / (2 * a);
            roots[0] = String.valueOf(singleRoot);
            roots[1] = String.valueOf(singleRoot); // Both roots are the same
        } else { // Complex roots
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-delta) / (2 * a);
            roots[0] = realPart + " + " + imaginaryPart + "i";
            roots[1] = realPart + " - " + imaginaryPart + "i";
        }

        return roots;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input coefficients
        System.out.println("Enter values for a, b, and c to find roots of the equation ax^2 + bx + c:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        // Validate 'a' to ensure it's not zero
        if (a == 0) {
            System.out.println("Coefficient 'a' cannot be 0 in a quadratic equation.");
            return;
        }

        // Calculate and display roots
        String[] roots = quadrootsSolver(a, b, c);
        System.out.println("Roots of the quadratic equation " + a + "x^2 + " + b + "x + " + c + " are:");
        System.out.println("Root 1: " + roots[0]);
        System.out.println("Root 2: " + roots[1]);

        sc.close();
    }
}