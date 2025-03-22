package JavaMethods;

import java.util.Scanner;

public class maxNumOfHandshakes {
    public static int maxNumOfHandShakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        num = sc.nextInt();
        System.out.println("Max possible number of handshakes for " + num + " students= " + maxNumOfHandShakes(num));
    }
}
