package JavaMethods;

import java.util.Scanner;

public class FindMeanHeightOfPlayers {
    public static double sumOfHeights(double heights[]) {
        double sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        return sum;
    }

    public static double meanHeight(double sumOfAllElements, int numOfElements) {
        return (sumOfAllElements / numOfElements);
    }

    public static double shortestHeight(double heights[]) {
        double shortest = Double.MAX_VALUE;
        for (int i = 0; i < heights.length; i++) {
            if (shortest > heights[i]) {
                shortest = heights[i];
            }
        }
        return shortest;
    }

    public static double tallestHeight(double heights[]) {
        double tallest = Double.MIN_VALUE;
        for (int i = 0; i < heights.length; i++) {
            if (tallest < heights[i]) {
                tallest = heights[i];
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        int length = heights.length;
        for (int i = 0; i < heights.length; i++) {
            System.out.println("Enter height of Player " + (i + 1) + " in cms : ");
            heights[i] = sc.nextDouble();
        }
        double sum = sumOfHeights(heights);
        System.out.println("Sum of all heights of the players = " + sum + " cms");
        System.out.println("Mean height= " + meanHeight(sum, length));
        System.out.println("Shortest height= " + shortestHeight(heights));
        System.out.println("Tallest height= " + tallestHeight(heights));
    }
}
