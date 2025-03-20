//package ControlFlow;
//
//import java.util.Scanner;
//
//public class SumOfNaturalNum {
//    public static void main(String[] args){
//        Scanner sc= new Scanner(System.in);
//        double num;
//        System.out.println("Enter a positive integer: ");
//        num= sc.nextDouble();
//        if(num==(int)num &&num>=1){
//            int sum=(int)(num*(num+1))/2;
//            System.out.println("The sum of "+num+ " natural numbers is "+sum);
//        }else{
//            System.out.println(num+" is not a natural number;");
//
//        }
//
//    }
//}
package ControlFlow;

import java.util.Scanner;

public class SumOfNaturalNum {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double num;
        System.out.println("Enter a positive integer: ");
        num= sc.nextDouble();
        System.out.print("The sum of " + (int) num + " natural numbers is ");
        if(num==(int)num &&num>=1){
            int sum = 0, sumFormula = (int) (num * (num + 1)) / 2;
            while (num > 0) {
                sum = sum + (int) num;
                num = num - 1;
            }
            System.out.println(sumFormula + " using the n*(n+1)/2 formula and the sum using a while loop is also " + sum);
        }else{
            System.out.println(num+" is not a natural number;");

        }

    }
}
