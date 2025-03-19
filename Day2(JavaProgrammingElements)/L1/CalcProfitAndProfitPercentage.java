package practiceprograms;

public class CalcProfitAndProfitPercentage {
    public static void main(String[] args) {
        int cp = 129, sp = 191, profit = sp - cp;
        float profitpercentage = (float) profit / cp * 100;
        System.out.println("The Cost Price is INR " + cp + " and the Selling Price is INR " +sp+
                "\nThe Profit is INR "+profit+" and the Profit Percentage is "+profitpercentage);
    }
}
