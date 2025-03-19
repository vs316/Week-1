package practiceprograms;

import java.util.Scanner;

public class UniDiscountFeeInput {
    public static void main(String[] args) {
        int fee;
        float discountPercent , discount;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the fee and discount percent separated by a space: ");
        fee= sc.nextInt();
        discountPercent=sc.nextFloat();
        discount = fee*(discountPercent/100);
        float discountedfee= fee-discount;
        System.out.println("The discount amount is INR "+discount+ " and final discounted fee is INR "+discountedfee);
    }
}



