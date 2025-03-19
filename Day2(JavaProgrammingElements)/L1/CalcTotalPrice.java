package practiceprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalcTotalPrice {
public static void main(String[] args) throws IOException {
    float unitPrice, quantity;
    BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the unit price of the item and quantity to be bought: ");
    String input= reader.readLine();
    String[] parts= input.split(",");
    unitPrice=Float.parseFloat(parts[0].trim());
    quantity=Float.parseFloat(parts[1].trim());
    float total=unitPrice*quantity;
    System.out.println("The total purchase price is INR "+total+" if the quantity is "+quantity+" and unit price is INR "+unitPrice);
}
}
