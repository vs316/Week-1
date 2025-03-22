package JavaMethods;

import java.util.Scanner;

public class TrigonometricFunctions {
    // Method to calculate trigonometric functions
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle); // Convert angle to radians
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Angle in degrees
        System.out.println("Enter an angle in degrees: ");
        double angle = sc.nextDouble();

        // Call the method to calculate trigonometric functions
        double[] results = calculateTrigonometricFunctions(angle);

        // Display results
        System.out.printf("Sine of %.2f°: %.4f%n", angle, results[0]);
        System.out.printf("Cosine of %.2f°: %.4f%n", angle, results[1]);
        System.out.printf("Tangent of %.2f°: %.4f%n", angle, results[2]);

        sc.close();
    }
}



