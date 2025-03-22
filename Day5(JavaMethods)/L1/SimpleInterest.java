package JavaMethods;

import java.util.Scanner;

public class SimpleInterest {
    public static double simpleInterest(double p, double r, double t) {
        return p * r * t / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for the Principal, rate and time separated by a space: ");
        double principal, rate, time, si;
        principal = sc.nextDouble();
        rate = sc.nextDouble();
        time = sc.nextDouble();
        si = simpleInterest(principal, rate, time);
        System.out.println("Simple Interest= " + si + " for Principal " + principal + " Rate Of Interest " + rate + " and Time: " + time);

    }
}
