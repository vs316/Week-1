package practiceprograms;

import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        float salary, bonus;
        System.out.println("Enter your salary and bonus separated by a space:");
        salary=sc.nextFloat();
        bonus=sc.nextFloat();
        float totalincome=salary+bonus;
        System.out.println("The salary is INR "+ salary+" and bonus is INR "+bonus+".Hence, total income is INR "+totalincome);
    }
}
