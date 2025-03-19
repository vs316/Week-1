package practiceprograms;

import java.util.Scanner;

public class BasicCalculator {
    static float add(float a, float b){
        return a+b;
    }
    static float diff(float a, float b){
        return a-b;
    }
    static float mult(float a, float b){
        return a*b;
    }
    static float div(float a, float b){
        return a/b;
    }
    public static void main(String[] args){
        float number1,number2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers separated by a space: ");
        number1=sc.nextFloat();
        number2=sc.nextFloat();
        System.out.println("The addition, subtraction, multiplication and division values of the 2 numbers "+number1+" and "+number2+
        " is "+ add(number1,number2)+", "+ diff(number1,number2)+", "+mult(number1,number2)+", and "+div(number1,number2));
    }
}
