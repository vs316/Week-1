package JavaMethods;

import java.util.Scanner;

public class TriPark {
    public static int numOfRounds(int s1, int s2, int s3) {
        return (s1 + s2 + s3) / 5;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1, s2, s3;
        System.out.println("Enter the 3 sides of the triangle in meters (separated by a space): ");
        s1 = sc.nextInt();
        s2 = sc.nextInt();
        s3 = sc.nextInt();
        System.out.println("The total number of rounds the athlete will run is " + numOfRounds(s1, s2, s3));
    }
}

