package JavaMethods;

import java.util.Scanner;

public class WindChillTemp {
    // Method to calculate wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature +
                (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Temperature and wind speed
        System.out.println("Enter the temperature (in Fahrenheit): ");
        double temperature = sc.nextDouble();
        System.out.println("Enter the wind speed (in miles per hour): ");
        double windSpeed = sc.nextDouble();

        if (windSpeed >= 0) {
            // Call the method to calculate wind chill
            double windChill = calculateWindChill(temperature, windSpeed);

            // Display result
            System.out.printf("The wind chill temperature is: %.2f°F%n", windChill);
        } else {
            System.out.println("Wind speed must be non-negative.");
        }

        sc.close();
    }
}



