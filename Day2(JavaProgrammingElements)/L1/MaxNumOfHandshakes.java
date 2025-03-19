package practiceprograms;

import java.util.Scanner;

public class MaxNumOfHandshakes {
    public static void main(String[] args){
        int numberOfStudents, maxNumOfHandshakes;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        numberOfStudents=sc.nextInt();
        maxNumOfHandshakes=(numberOfStudents*(numberOfStudents-1))/2;
        System.out.println("The number of possible handshakes is: "+maxNumOfHandshakes);

    }
}
