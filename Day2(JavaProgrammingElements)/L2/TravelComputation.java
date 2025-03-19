package practiceprograms;


// Create TravelComputation Class to compute the Distance and Travel Time

import java.util.Scanner;

class TravelComputation {

    public static void main(String[] args) {

        // Create a variable name to indicate the person traveling
        String name ;

        // Create a variable fromCity, viaCity and toCity to indicate the city
        // from city, via city and to city the person is travelling
        String fromCity , viaCity , toCity ;

        // Create a variable distanceFromToVia to indicate the distance
        // between the fromCity to viaCity
        double distanceFromToVia;

        // Create a variable timeFromToVia to indicate the time taken to
        // travel from fromCity to viaCity in minutes
        int timeFromToVia ;

        // Create a variable distanceViaToFinalCity to indicate the distance
        // between the viaCity to toCity
        double distanceViaToFinalCity ;

        // Create a variable timeViaToFinalCity to indicate the time taken to
        // travel from viaCity to toCity in minutes
        int timeViaToFinalCity ;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Details: Your name, from which city, via which city and to which city that you are travelling to (all separated by a space):");
        name=sc.next();
        fromCity=sc.next();
        viaCity=sc.next();
        toCity=sc.next();
        System.out.println("Enter the distances from the city which you will start and the city via which you will go through and also between the city via which you will go through and the final city: ");
        distanceFromToVia=sc.nextDouble();
        distanceViaToFinalCity=sc.nextDouble();
        System.out.println("Enter the time taken to travel from the starting city to the intermediate city and form that to the final city: ");
        timeFromToVia=sc.nextInt();
        timeViaToFinalCity=sc.nextInt();
        // Create a variable totalDistance to indicate the total distance
        // between the fromCity to toCity
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;

        // Create a variable totalTime to indicate the total time taken to
        // travel from fromCity to toCity in minutes
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // Print the travel details
        System.out.println("The Total Distance travelled by " + name + " from " +
                fromCity + " to " + toCity + " via " + viaCity +
                " is " + totalDistance + " km and " +
                "the Total Time taken is " + totalTime + " minutes");
    }
}
