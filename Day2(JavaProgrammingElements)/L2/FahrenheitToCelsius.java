package practiceprograms;

import java.util.Scanner;

public class FahrenheitToCelsius {
        // C=(F-32)*(5/9)
        public static void main(String[] args) {
            float temp, result;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter temperature in Fahrenheit: ");
            temp=scanner.nextFloat();
            result=(temp-32)*(5/9f);
            System.out.println("Temperature in Celsius: "+ result);
        }

}
