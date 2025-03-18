package practiceprograms;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    // F=(C*9/5)+32
    public static void main(String[] args) {
        float temp, result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius: ");
        temp=scanner.nextFloat();
        result=(temp*9/5)+32;
        System.out.println("Temperature in Fahrenheit: "+ result);
    }
}
