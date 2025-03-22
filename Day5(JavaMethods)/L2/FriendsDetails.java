package JavaMethods;

import java.util.Scanner;

public class FriendsDetails {
    // Method to find the youngest of the 3 friends
    public static String findYoungest(int[] ages, String[] names) {
        int minAgeIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minAgeIndex]) {
                minAgeIndex = i;
            }
        }
        return names[minAgeIndex];
    }

    // Method to find the tallest of the 3 friends
    public static String findTallest(double[] heights, String[] names) {
        int maxHeightIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxHeightIndex]) {
                maxHeightIndex = i;
            }
        }
        return names[maxHeightIndex];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arrays to store names, ages, and heights
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input: Collect ages and heights of the 3 friends
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.println("Enter the height of " + names[i] + " (in meters): ");
            heights[i] = sc.nextDouble();
        }

        // Find the youngest and tallest friends
        String youngest = findYoungest(ages, names);
        String tallest = findTallest(heights, names);

        // Display results
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        sc.close(); // Close scanner to release resources
    }
}