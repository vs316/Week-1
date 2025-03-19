package practiceprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DistInYardsAndMiles {
    public static void main(String[] args) throws IOException {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the distance in feet: ");
        int feet= Integer.parseInt(reader.readLine());
        float yards, miles;
        yards=feet/3f;
        miles=yards/1760f;
        System.out.println("The distance in feet is "+feet+" while in yards is "+ yards+ " and miles is "+miles);
    }
}
