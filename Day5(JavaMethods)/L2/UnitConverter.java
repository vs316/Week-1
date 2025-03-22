package JavaMethods;

public class UnitConverter {
    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCm(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        System.out.println("1 Kilometer = " + convertKmToMiles(1) + " Miles");
        System.out.println("1 Mile = " + convertMilesToKm(1) + " Kilometers");
        System.out.println("1 Meter = " + convertMetersToFeet(1) + " Feet");
        System.out.println("1 Foot = " + convertFeetToMeters(1) + " Meters");
        System.out.println("1 Yard = " + convertYardsToFeet(1) + " Feet");
        System.out.println("1 Foot = " + convertFeetToYards(1) + " Yards");
        System.out.println("1 Meter = " + convertMetersToInches(1) + " Inches");
        System.out.println("1 Inch = " + convertInchesToMeters(1) + " Meters");
        System.out.println("1 Inch = " + convertInchesToCm(1) + " Centimeters");
        System.out.println("32°F = " + convertFahrenheitToCelsius(32) + "°C");
        System.out.println("0°C = " + convertCelsiusToFahrenheit(0) + "°F");
        System.out.println("1 Pound = " + convertPoundsToKilograms(1) + " Kilograms");
        System.out.println("1 Kilogram = " + convertKilogramsToPounds(1) + " Pounds");
        System.out.println("1 Gallon = " + convertGallonsToLiters(1) + " Liters");
        System.out.println("1 Liter = " + convertLitersToGallons(1) + " Gallons");
    }
}
