package practiceprograms;

import java.util.Scanner;

public class DivChocolatesAmongChildren {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int numberOfChocolates,numberOfChildren;
        System.out.println("Enter the number of chocolates and number of children: ");
        numberOfChocolates=sc.nextInt();
        numberOfChildren=sc.nextInt();
        System.out.println("The number of chocolates each child gets is "+numberOfChocolates/numberOfChildren+" and the number of remaining chocolates are "+ numberOfChocolates%numberOfChildren);
    }
}
