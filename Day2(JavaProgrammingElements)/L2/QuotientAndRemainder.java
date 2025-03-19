package practiceprograms;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args){
        int a,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two integers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        int quotient, remainder;
        quotient=a/b;
        remainder=a%b;
        System.out.println("The quotient is "+quotient+" and remainder is "+ remainder+" of the 2 numbers "+a+" and "+b);
    sc.close();
    }
}
