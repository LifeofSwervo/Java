// @author: Clarence Thomas
// CLASS: Info 1521 WA
// ASSIGMENT: Assignment 6
// @version: October 16th, 2023
/* RESOURCES: Referenced examples provided in assignment, referenced book */

/* EXPLANATION: This is app estimating the details regarding a paint job for "Happy Accidents Paint Company". */

public class CardDeckApp {

    public static void main(String[] args) {
        System.out.println("DECK");
        String[] deck = getDeck();
        displayCards(deck);

        System.out.println("SHUFFLED DECK");
        shuffleDeck(deck);
        displayCards(deck);

        int count = 2;
        System.out.println("HAND OF " + count + " CARDS");
        String[] hand = dealCards(deck, count);
        displayCards(hand);
    }

    private static String[] getDeck() {
        String[] deck = new String[52]; //
        String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"}; // All 4 suits
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"}; // All 13 ranks

        int counter = 0;
        for (String suit : suits) // Loop through suits
        {
            for (String rank : ranks) // Loop through ranks
            {
                deck[counter] = rank + " of " + suit; // Title (Ex: Ace of Spades)
                counter++; // Increase counter by one
            }
        }
        return deck;
    }

    private static void displayCards(String[] cards) { // Function displaying cards
        System.out.print("|");
        for (String card : cards) // Loop through cards
        {
            System.out.print(card + "|"); // Display deck, "|" separates the cards.
        }
        System.out.println(); // Separates deck from next section
    }

    private static void shuffleDeck(String[] deck) {
        int randomIndex = (int) (Math.random() * deck.length-1);
        for (int i = 0; i < deck.length; i++)
        {
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    private static String[] dealCards(String[] deck, int count) {
        String[] hand = new String[count];
        System.arraycopy(deck, 0, hand, 0, count);
        return hand;
    }
}