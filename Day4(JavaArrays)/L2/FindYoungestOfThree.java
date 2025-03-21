package JavaArrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindYoungestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[3];
        float[] height = new float[3];
        int youngest;
        float tallest;
        for (int i = 0; i < age.length; i++) {
            System.out.println("Enter age: ");
            age[i] = sc.nextInt();
            System.out.println("Enter height: ");
            height[i] = sc.nextFloat();
        }
        Arrays.sort(age);
        Arrays.sort(height);
        System.out.println("The youngest of the three friends is: " + age[0] + " and the tallest among them is: " + height[height.length - 1] + " cms");
        sc.close();

    }
}
