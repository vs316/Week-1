package practiceprograms;

public class UniDiscountFee {
    public static void main(String[] args) {
        int fee = 125000;
        float discountPercent = 10, discount;
        discount = fee*(discountPercent/100);
        float discountedfee= fee-discount;
        System.out.println("The discount amount is INR "+discount+ " and final discounted fee is INR "+discountedfee);
    }
}
