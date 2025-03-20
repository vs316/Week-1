package ControlFlow;

import java.util.Scanner;

public class TallestAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input ages
        System.out.println("Enter the ages of Aman, Akbar, and Anthony in order separated by space: ");
        int ageOfAman = sc.nextInt();
        int ageOfAkbar = sc.nextInt();
        int ageOfAnthony = sc.nextInt();

        // Input heights
        System.out.println("Enter the heights of Aman, Akbar, and Anthony in cms in order separated by space: ");
        float heightOfAman = sc.nextFloat();
        float heightOfAkbar = sc.nextFloat();
        float heightOfAnthony = sc.nextFloat();

        // Determine the youngest friend
        String youngestFriend;
        int youngestAge;

        if (ageOfAman <= ageOfAkbar && ageOfAman <= ageOfAnthony) {
            youngestFriend = "Aman";
            youngestAge = ageOfAman;
        } else if (ageOfAkbar <= ageOfAman && ageOfAkbar <= ageOfAnthony) {
            youngestFriend = "Akbar";
            youngestAge = ageOfAkbar;
        } else {
            youngestFriend = "Anthony";
            youngestAge = ageOfAnthony;
        }

        // Determine the tallest friend
        String tallestFriend;
        float tallestHeight;

        if (heightOfAman >= heightOfAkbar && heightOfAman >= heightOfAnthony) {
            tallestFriend = "Aman";
            tallestHeight = heightOfAman;
        } else if (heightOfAkbar >= heightOfAman && heightOfAkbar >= heightOfAnthony) {
            tallestFriend = "Akbar";
            tallestHeight = heightOfAkbar;
        } else {
            tallestFriend = "Anthony";
            tallestHeight = heightOfAnthony;
        }

        // Print results
        System.out.println("The youngest friend is " + youngestFriend + " and his age is: " + youngestAge);
        System.out.println("The tallest friend is " + tallestFriend + " and his height is: " + tallestHeight + " cms");

        sc.close(); // Close the scanner
    }
}