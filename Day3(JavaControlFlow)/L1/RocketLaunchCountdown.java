//package ControlFlow;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class RocketLaunchCountdown {
//public static void main(String[] args)throws IOException {
//    int counter;
//    BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
//    System.out.print("Enter the number: ");
//    String input=reader.readLine();
//    counter=Integer.parseInt(input);
//    while(counter>=1){
//        System.out.println(counter);
//        try {
//            Thread.sleep(1000);
//        }catch (InterruptedException e){
//            System.err.println("Countdown Interrupted");
//        }
//        counter=counter-1;
//    }
//    System.out.println("Blast off!");
//}
//}
package ControlFlow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RocketLaunchCountdown {
    public static void main(String[] args) throws IOException {
        int counter;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number: ");
        String input = reader.readLine();
        counter = Integer.parseInt(input);
        for (int i = counter; i >= 1; i--) {
            System.out.println(counter);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Countdown Interrupted");
            }
            counter = counter - 1;
        }
        System.out.println("Blast off!");
    }
}
