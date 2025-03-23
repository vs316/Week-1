package JavaMethods;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature:");
        double temp = scanner.nextDouble();

        System.out.println("Convert to (1) Celsius or (2) Fahrenheit?");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(temp));
        } else if (choice == 2) {
            System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(temp));
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
