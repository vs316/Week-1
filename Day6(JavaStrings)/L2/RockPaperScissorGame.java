package JavaStrings;

import java.util.Random;
import java.util.Scanner;


public class RockPaperScissorGame {

    // Method to get the computer's choice (Rock, Paper, or Scissors)
    public static String getComputerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        int randomIndex = new Random().nextInt(3); // Generates 0, 1, or 2
        return choices[randomIndex];
    }

    // Method to determine the winner
    public static String determineWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equalsIgnoreCase(computerChoice)) {
            return "Draw";
        } else if (
                (playerChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissors")) ||
                        (playerChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Paper")) ||
                        (playerChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock"))
        ) {
            return "Player";
        } else {
            return "Computer";
        }
    }

    // Method to calculate stats and return a 2D array with percentages
    public static String[][] calculateStats(int playerWins, int computerWins, int draws, int totalGames) {
        double playerWinPercentage = (playerWins / (double) totalGames) * 100;
        double computerWinPercentage = (computerWins / (double) totalGames) * 100;

        String[][] stats = {
                {"Player Wins", String.valueOf(playerWins)},
                {"Computer Wins", String.valueOf(computerWins)},
                {"Draws", String.valueOf(draws)},
                {"Player Win %", String.format("%.2f%%", playerWinPercentage)},
                {"Computer Win %", String.format("%.2f%%", computerWinPercentage)}
        };

        return stats;
    }

    // Method to display results in a table format
    public static void displayResults(String[][] gameResults, String[][] finalStats) {
        System.out.println("\nGame Results:");
        System.out.println("------------------------------------------------");
        System.out.printf("%-10s %-15s %-15s %-10s\n", "Game", "Player Choice", "Computer Choice", "Winner");
        System.out.println("------------------------------------------------");

        for (String[] row : gameResults) {
            System.out.printf("%-10s %-15s %-15s %-10s\n", row[0], row[1], row[2], row[3]);
        }

        System.out.println("------------------------------------------------");
        System.out.println("\nFinal Statistics:");
        System.out.println("------------------------------");
        System.out.printf("%-15s %-10s\n", "Category", "Value");
        System.out.println("------------------------------");

        for (String[] row : finalStats) {
            System.out.printf("%-15s %-10s\n", row[0], row[1]);
        }

        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for number of games
        System.out.print("Enter the number of games: ");
        int totalGames = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        int playerWins = 0, computerWins = 0, draws = 0;
        String[][] gameResults = new String[totalGames][4];

        for (int i = 0; i < totalGames; i++) {
            System.out.print("\nEnter your choice (Rock/Paper/Scissors): ");
            String playerChoice = scanner.nextLine().trim();

            // Validate input
            if (!playerChoice.equalsIgnoreCase("Rock") &&
                    !playerChoice.equalsIgnoreCase("Paper") &&
                    !playerChoice.equalsIgnoreCase("Scissors")) {
                System.out.println("Invalid choice! Please enter Rock, Paper, or Scissors.");
                i--; // Repeat the iteration
                continue;
            }

            // Get computer choice
            String computerChoice = getComputerChoice();

            // Determine the winner
            String winner = determineWinner(playerChoice, computerChoice);
            if (winner.equals("Player")) {
                playerWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            } else {
                draws++;
            }

            // Store game results
            gameResults[i][0] = "Game " + (i + 1);
            gameResults[i][1] = playerChoice;
            gameResults[i][2] = computerChoice;
            gameResults[i][3] = winner;
        }

        // Calculate and display final stats
        String[][] finalStats = calculateStats(playerWins, computerWins, draws, totalGames);
        displayResults(gameResults, finalStats);

        scanner.close();
    }
}

