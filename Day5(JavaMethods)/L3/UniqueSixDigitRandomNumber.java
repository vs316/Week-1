package JavaMethods;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueSixDigitRandomNumber {
    public static int[] GenerateOtpNTimes(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int otp = (int) (Math.random() * 900000) + 100000;
            arr[i] = otp;
        }
        return arr;
    }

    public static boolean UniqueOtps(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of OTPs to generate: ");
        n = sc.nextInt();
        int[] otps = GenerateOtpNTimes(n);
        boolean uniqueOrNot = UniqueOtps(otps);
        System.out.println("Generated OTPS: " + Arrays.toString(otps));
        System.out.println("Whether the otps generated are Unique or not:" + uniqueOrNot);
    }
}

