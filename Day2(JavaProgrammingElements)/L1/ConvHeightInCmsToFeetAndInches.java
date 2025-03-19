package practiceprograms;

import java.util.Scanner;

public class ConvHeightInCmsToFeetAndInches {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double heightincm,totalinches;
        int feet;
        double inches;
        System.out.println("Enter your height in cms: ");
        heightincm=sc.nextDouble();
        // Convert centimeters to total inches.
        totalinches=heightincm/2.54;
        // Extract the whole number of feet.
        feet=(int)(totalinches/12);
        // Calculate the remaining inches.
        inches=totalinches-(feet*12);
        System.out.println("Your Height in cm is "+heightincm+" while in feet is "+feet+" and in inches is "+inches);
    }
}
