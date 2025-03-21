package JavaArrays;

import java.util.Scanner;

public class MeanHeightOfFootballTeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        double[] heights = new double[11];
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + " : ");
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }
        double meanHeight = sum / 11;
        System.out.println("Mean height of the 11 players in the football team is= " + meanHeight);
        sc.close();
    }
}
