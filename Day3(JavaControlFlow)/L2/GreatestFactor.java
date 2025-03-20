//package ControlFlow;
//
//import java.util.Scanner;
//
//public class GreatestFactor {
//    public static void main(String[] args){
//        Scanner sc= new Scanner(System.in);
//        int num, greatestFactor=1;
//        System.out.println("Enter an integer: ");
//        num=sc.nextInt();
//        for(int i=num-1;i>1;i--){
//            if(num%i==0){
//                greatestFactor=i;
//                break;
//            }
//        }
//        System.out.println("The greatest factor of "+num+" besides itself is: "+greatestFactor);
//
//        sc.close();
//    }
//}

package ControlFlow;

import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, greatestFactor = 1;
        System.out.println("Enter an integer: ");
        num = sc.nextInt();
        int counter = num - 1;
        while (counter >= 1) {
            if (num % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter -= 1;
        }
        System.out.println("The greatest factor of " + num + " besides itself is: " + greatestFactor);

        sc.close();
    }
}
