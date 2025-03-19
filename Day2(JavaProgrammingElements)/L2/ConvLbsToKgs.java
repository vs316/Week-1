package practiceprograms;

import java.util.Scanner;

public class ConvLbsToKgs {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the weight in pounds: ");
        float lbs,kgs;
        lbs=sc.nextFloat();
        kgs=lbs/2.2f;
        System.out.println("The weight of the person in pounds is "+lbs+ " and in kgs is "+ kgs);
    }
}
