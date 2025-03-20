package ControlFlow;

import java.util.Scanner;

public class calcBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double heightInCms, weight;
        System.out.println("Enter your height in cms and your weight in kgs separated by a space: ");
        heightInCms = sc.nextDouble();
        weight = sc.nextDouble();
        double bmi, heightInMeters = heightInCms / 100;
        bmi = weight / (Math.pow(heightInMeters, 2));
        if (bmi >= 40.0) {
            System.out.println("BMI: " + bmi + "\tStatus: Obese");
        } else if (bmi >= 25.0) {
            System.out.println("BMI: " + bmi + "\tStatus: Overweight");
        } else if (bmi >= 18.5) {
            System.out.println("BMI: " + bmi + "\tStatus: Normal");
        } else {
            System.out.println("BMI: " + bmi + "\tStatus: Underweight");
        }
        sc.close();
    }
}
