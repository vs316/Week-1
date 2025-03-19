package practiceprograms;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int num1, num2, temp;
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter two numbers: ");
        num1=sc.nextInt();
        num2=sc.nextInt();
        //method 1 using temp
//        temp=num1;
//        num1=num2;
//        num2=temp;
        //method 2 using ops
//        num1=num1+num2;
//        num2=num1-num2;
//        num1=num1-num2;
        //method 3 using bitwise XOR (fast and memory-efficient)
        num1=num1^num2;
        num2=num1^num2;
        num1=num1^num2;
        System.out.println("Swapped values are: "+num1+" and "+num2);
    }}
