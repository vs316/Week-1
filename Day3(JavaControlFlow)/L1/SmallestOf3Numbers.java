package ControlFlow;

import java.util.Scanner;

public class SmallestOf3Numbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float n1,n2,n3;
        System.out.println("Enter the three numbers separated by a space: ");
        n1=sc.nextFloat();n2=sc.nextFloat();n3=sc.nextFloat();
        if((n1<=n2)&&(n1<=n3)){
            System.out.println("Is the first number the smallest? True");
        }else{
            System.out.println("Is the first number the smallest? False");
        }
    }
}
