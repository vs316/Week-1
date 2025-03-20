package ControlFlow;

import java.util.Scanner;

public class LeapYear {
//    public static void main(String[] args){
//        Scanner sc= new Scanner(System.in);
//        int year;
//        do{System.out.println("Enter a year: ");
//            year=sc.nextInt();
//        }while(year<=1582);
//        boolean leapyear=false;

    /// /        Further, the Leap Year is a Year divisible by 4 and not 100 unless it is divisible by 400.
    /// /    E.g. 1800 is not a Leap Year and 2000 is a Leap Year.
//        if(year%4==0) {
//            if (year%100==0){
//                if(year%400==0){
//                    leapyear=true;
//                }else{
//                    leapyear=false;
//                }
//            }else {
//                leapyear=true; //because if year%4==0 and year%100!=0 then it is still a leapyear
//            }
//        }else{//Not divisible by 4
//            leapyear=false;
//        }
//        System.out.println(year+" is a leapyear or not: "+leapyear);
//        sc.close();
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        do {
            System.out.println("Enter a year: ");
            year = sc.nextInt();
        } while (year <= 1582);
        boolean leapyear = false;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0 && year % 100 == 0)) {
            leapyear = true;
        } else {
            leapyear = false;
        }
        System.out.println(year + " is a leap year or not: " + leapyear);
        sc.close();
    }


}
