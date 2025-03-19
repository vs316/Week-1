package practiceprograms;

import java.util.Scanner;

public class SideOfSquareFromPeri {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the perimeter of the square: ");
        float side,peri;
        peri=sc.nextFloat();
        side=peri/4f;
        System.out.println("The length of the side is "+ side+" whose perimeter is "+ peri);
    }
}
