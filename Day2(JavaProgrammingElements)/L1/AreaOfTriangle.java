package practiceprograms;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args){
        float b,h, areaOfTriInCms, areaOfTriInInches;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the base and height of the triangle separated by a space: ");
        b=sc.nextFloat();
        h=sc.nextFloat();
        areaOfTriInCms=0.5f*b*h;
        areaOfTriInInches=areaOfTriInCms/(2.54f*2.54f);
        System.out.println("Area of the Triangle in sq.cm is "+areaOfTriInCms+" while in sq.inches is "+areaOfTriInInches);
    }
}
