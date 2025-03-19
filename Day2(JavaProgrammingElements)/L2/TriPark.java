package practiceprograms;

import java.util.Scanner;

public class TriPark {
public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int s1,s2,s3;
    System.out.println("Enter the 3 sides of the triangle in meters (separated by a space): ");
    s1=sc.nextInt();s2=sc.nextInt();s3=sc.nextInt();
    int perimeter=s1+s2+s3, distance=5*1000;//convert 5kms to meters
    System.out.println("The total number of rounds the athlete will run is "+(distance/perimeter));
}
}

