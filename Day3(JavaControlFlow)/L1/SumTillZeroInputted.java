//package ControlFlow;
//
//import java.util.Scanner;
//
//public class SumTillZeroInputted {
//    public static void main(String[] args){
//        double total=0.0, userVal;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a value: ");
//        userVal=sc.nextDouble();
//        while(userVal!=0){
//            total=total+userVal;
//            System.out.print("Enter a value(0 if you want to stop): ");
//            userVal=sc.nextDouble();
//
//        }
//        System.out.println("Total sum= "+total);
//        sc.close();
//    }
//}
package ControlFlow;

import java.util.Scanner;

public class SumTillZeroInputted {
    public static void main(String[] args) {
        double total = 0.0, userVal;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value (enter 0 to stop): ");

        while (true) { // Infinite loop, break when user inputs 0
            // Validate input
            if (sc.hasNextDouble()) {
                userVal = sc.nextDouble();

                if (userVal == 0) {
                    break; // Exit the loop if input is 0
                }

                total += userVal; // Add the value to the total
            } else {
                // Handle invalid input
                System.out.println("Invalid input. Please enter a numeric value.");
                sc.next(); // Consume the invalid input
            }

            System.out.print("Enter a value (0 if you want to stop): ");
        }

        System.out.println("Total sum = " + total);
        sc.close(); // Close the scanner
    }
}