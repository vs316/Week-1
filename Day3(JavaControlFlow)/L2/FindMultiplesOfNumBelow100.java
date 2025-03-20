package ControlFlow;

import java.util.Scanner;

public class FindMultiplesOfNumBelow100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter a positive integer less than 100: ");
            n = sc.nextInt();
        } while (n <= 0 || n >= 100);
        System.out.println("Multiples of " + n + " till 100 are:");
//        for(int i=100;i>=1;i--){
//            if(i%n==0){
//                System.out.print(i+" ");
//                continue;
//            }
        int counter = 1;
        while (counter < 100) {
            if (counter % n == 0) {
                System.out.print(counter + " ");
            }
            counter++;
        }
        sc.close();
    }
}
