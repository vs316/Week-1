package ControlFlow;//package ControlFlow;
//
//import java.util.Scanner;
//
//public class Factorial {
//    public static void main(String[] args){
//        int n,i=1;
//        long fact=1;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter an integer: ");
//        n=sc.nextInt();
//        sc.close();
//        for(i=1;i<=n;i++){
//            fact=fact*i;
//
//        }
//        System.out.println("Factorial of "+n+" = "+fact);
//
//    }
//}

import java.util.Scanner;
import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] main) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        long factorial = IntStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);// Multiply all numbers from 1 to n
        System.out.println("The factorial of " + n + " is: " + factorial);
    }
}