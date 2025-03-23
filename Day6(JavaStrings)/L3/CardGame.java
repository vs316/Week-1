package JavaStrings;

import java.util.Random;
import java.util.Scanner;

public class CardGame {

    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int numOfCards = suits.length * ranks.length; //4*13=52 cards
        String[] deck = new String[numOfCards];

        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    //Method to shuffle the deck
    public static void shuffleDeck(String[] deck) {
        Random random = new Random();
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomIndex = i + random.nextInt(n - i);
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    public static String[][] distributeCards(String[] deck, int numPlayers, int numCards) {
        //Check if we can distribute the required number of cards
        if (numPlayers * numCards > deck.length) {
            System.out.println("Not enough cards to distribute!");
            return new String[0][0];//Return empty array
        }
        String[][] players = new String[numPlayers][numCards];
        int cardIndex = 0;

        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < numCards; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        return players;
    }

    public static void printPlayerCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (String card : players[i]) {
                System.out.println("  " + card);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] deck = initializeDeck();
        shuffleDeck(deck);

        System.out.println("Enter number of players: ");
        int numPlayers = sc.nextInt();

        System.out.println("Enter the number of cards per player: ");
        int numCards = sc.nextInt();

        String[][] players = distributeCards(deck, numPlayers, numCards);
        if (players.length > 0) {
            printPlayerCards(players);
        }
        sc.close();


    }
}
