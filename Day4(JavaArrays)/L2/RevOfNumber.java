//package JavaArrays;
//
//import java.util.Scanner;
//
//public class RevOfNumber {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int num=sc.nextInt();
//        int count=0;
//        int orig=num;
//        while(num!=0){
//            count++;
//            num/=10;
//        }
//        int[] revArray=new int[count];
//        for(int i=0;i<count;i++){
//           int rev=orig%10;
//           revArray[i]=rev;
//           orig/=10;
//        }
//        System.out.println("Reverse Order: ");
//        for(int i=0;i<count;i++){
//            System.out.print(revArray[i]+" ");
//        }
//        sc.close();
//    }
//}
package JavaArrays;

import java.util.Scanner;

public class RevOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        // Temporary storage for digits
        int temp = num;
        int count = 0;

        // Count the number of digits
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        // Initialize array to store digits
        int[] revArray = new int[count];

        // Extract digits and store them in reverse order
        for (int i = 0; i < count; i++) {
            revArray[i] = num % 10; // Store last digit
            num /= 10; // Remove the last digit
        }

        // Display reversed digits
        System.out.println("Reverse Order: ");
        for (int digit : revArray) {
            System.out.print(digit + " ");
        }

        sc.close();
    }
}