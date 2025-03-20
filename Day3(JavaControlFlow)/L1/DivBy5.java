package ControlFlow;

import java.util.Scanner;

public class DivBy5 {
  public static void main(String[] main){
      System.out.println("Enter a number: ");
      float num;
      Scanner sc=new Scanner(System.in);
      num=sc.nextFloat();
      if ((num % 5 == 0)) {
          System.out.println("The number entered "+num+" is divisible by 5.");
      }else{
          System.out.println("The number entered "+num+" is not divisble by 5");
      }
  }
}
