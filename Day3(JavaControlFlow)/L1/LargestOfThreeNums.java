package ControlFlow;

import java.util.Scanner;

public class LargestOfThreeNums {
    public static void main(String[] main){
        Scanner sc=new Scanner(System.in);
        float n1,n2,n3, largest;
        System.out.println("Enter the three numbers separated by a space: ");
        n1=sc.nextFloat();n2=sc.nextFloat();n3=sc.nextFloat();
        if((n1>=n2)&&(n1>=n3)){
            largest=n1;
        }else if((n2>=n1)&&(n2>=n3)){
            largest=n2;
        } else {
            largest=n3;
        }

        if(largest==n1){
            System.out.println(" Is the first number the largest? True");
            System.out.println(" Is the second number the largest? False");
            System.out.println(" Is the third number the largest? False");
        }else if(largest==n2){
            System.out.println(" Is the first number the largest? False");
            System.out.println(" Is the second number the largest? True");
            System.out.println(" Is the third number the largest? False");
        }else{
            System.out.println(" Is the first number the largest? False");
            System.out.println(" Is the second number the largest? False");
            System.out.println(" Is the third number the largest? True");
        }
    }
}
