package JavaArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.exit;

public class FizzBuzzArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Prompt the user to input a number
        System.out.println("Enter a number: ");
        String input = reader.readLine();
        int n = Integer.parseInt(input);

        // Validate that the number is a positive integer
        if (n <= 0) {
            System.err.println("Please enter a positive integer.");
            exit(0);
        }

        // Create a String array to save the results
        String[] fizzbuzz = new String[n];

        // Populate the array with FizzBuzz logic
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzbuzz[i - 1] = "FizzBuzz"; // Both 3 and 5
            } else if (i % 3 == 0) {
                fizzbuzz[i - 1] = "Fizz"; // Multiple of 3 only
            } else if (i % 5 == 0) {
                fizzbuzz[i - 1] = "Buzz"; // Multiple of 5 only
            } else {
                fizzbuzz[i - 1] = String.valueOf(i); // Neither 3 nor 5
            }
        }

        // Display the results
        for (int j = 0; j < fizzbuzz.length; j++) {
            System.out.println("Position " + (j + 1) + " = " + fizzbuzz[j]);
        }
    }
}