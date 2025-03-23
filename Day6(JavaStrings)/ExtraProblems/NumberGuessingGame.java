package JavaStrings;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = 1, high = 100;
        boolean correct = false;

        System.out.println("Think of a number between 1 and 100.");

        while (!correct) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "?");
            System.out.println("Enter 'high' if the guess is too high, 'low' if it's too low, or 'correct' if it's right:");
            String feedback = scanner.nextLine();

            if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            } else if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Hooray! The computer guessed your number.");
                correct = true;
            } else {
                System.out.println("Invalid input. Please enter 'high', 'low', or 'correct'.");
            }
        }

        scanner.close();
    }

    public static int generateGuess(int low, int high) {
        return low + (high - low) / 2; // Binary search approach
    }
}