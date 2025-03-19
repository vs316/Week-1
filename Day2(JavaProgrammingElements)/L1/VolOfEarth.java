package practiceprograms;

public class VolOfEarth {
    public static void main(String[] args) {
        double pi = Math.PI, radiusOfEarthInKms = 6378.0, radiusOfEarthInMiles = 1.6 * radiusOfEarthInKms, volOfEarthInKms, volOfEarthInMiles;
        volOfEarthInKms=(double)4/3*pi*radiusOfEarthInKms;
        volOfEarthInMiles=(double)4/3*pi*radiusOfEarthInMiles;
        System.out.println("The volume of earth in cubic kilometers is "+volOfEarthInKms+" and cubic miles is "+volOfEarthInMiles );
    }
}
