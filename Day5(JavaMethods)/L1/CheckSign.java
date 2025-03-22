package JavaMethods;

import java.util.Scanner;

public class CheckSign {
    public static int checksign(int n) {
        if (n < 0)
            return -1;
        else if (n > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Sign: (0- zero, -1 for negative, 1 for positive)" + checksign(num));
        sc.close();
    }
}
