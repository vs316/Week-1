package practiceprograms;

import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args){
        int a,b,c,op1,op2,op3,op4;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 3 integers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        op1=a+b*c;
        op2=a*b+c;
        op3=c+a/b;
        op4=a%b+c;
        System.out.println("Results: \n"+op1+"\n"+op2+"\n"+op3+"\n"+op4);

    }
}
