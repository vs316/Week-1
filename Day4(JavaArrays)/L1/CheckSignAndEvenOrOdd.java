package JavaArrays;

import java.util.Scanner;

public class CheckSignAndEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element: ");
            arr[i] = sc.nextInt();
        }
        for (int j : arr) {
            if (j > 0) {
                if (j % 2 == 0) {
                    System.out.println(j + " is a positive even number.");
                } else {
                    System.out.println(j + " is a positive odd number.");
                }
            } else if (j < 0) {
                System.out.println(j + " is a negative number.");
            } else {
                System.out.println(j + " -> Zero");
            }

        }
        if (arr[0] > arr[arr.length - 1]) {
            System.out.println("The first element " + arr[0] + " is greater than the last element " + arr[arr.length - 1]);
        } else if (arr[0] < arr[arr.length - 1]) {
            System.out.println("The first element " + arr[0] + " is lesser than the last element " + arr[arr.length - 1]);
        } else {
            System.out.println("The first element " + arr[0] + " is equal to the last element " + arr[arr.length - 1]);
        }

        sc.close();
    }
}
