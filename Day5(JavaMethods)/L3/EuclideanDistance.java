package JavaMethods;

import java.util.Scanner;

public class EuclideanDistance {

    // Method to calculate Euclidean distance
    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to calculate the equation of a line
    public static double[] calculateLineEquation(int x1, int y1, int x2, int y2) {
        double slope = (double) (y2 - y1) / (x2 - x1);
        double yIntercept = y1 - slope * x1;
        return new double[]{slope, yIntercept}; // Return slope and y-intercept
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for two points
        System.out.println("Enter coordinates of first point (x1, y1):");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter coordinates of second point (x2, y2):");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        // Calculate and display Euclidean distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);

        // Calculate and display line equation
        double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);
        System.out.println("Line Equation: y = " + lineEquation[0] + "x + " + lineEquation[1]);

        sc.close();
    }
}