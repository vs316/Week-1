package practiceprograms;

import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
public class VolumeOfCylinder {
    //V=pi*(r^2)*h
    public static void main(String[] args) {
        double v, r, h;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius and height of cylinder separated by a space: ");
        r= scanner.nextFloat();
        h= scanner.nextFloat();
        v=PI*pow(r,2)*h;
        System.out.println("Volume of Cylinder= "+v);
    }
}