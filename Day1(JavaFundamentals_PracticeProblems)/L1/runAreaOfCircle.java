package practiceprograms;

import java.util.Scanner;

public class runAreaOfCircle {
    public static void main(String[] args){
     double area, radius;
     System.out.println("Enter the radius of the circle: ");
     Scanner scanner=new Scanner(System.in);
     radius=scanner.nextDouble();
     area=AreaOfCircle.area(radius);
     System.out.println("Area of Circle with radius "+ radius+" is= "+ area);
    }
}
