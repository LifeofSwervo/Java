// @author: Clarence Thomas
// CLASS: Info 1521 WA
// ASSIGMENT: Assignment 6
// @version: October 16th, 2023
/* RESOURCES: Referenced examples provided in assignment, referenced book, referenced java docs. */

/* EXPLANATION: This is an app emulating a deck of cards. The app also shuffles the cards and draws a requested amount
* of cards.  */

public class CardDeckApp {

    public static void main(String[] args) {
        System.out.println("DECK");
        String[] deck = getDeck();
        displayCards(deck); // Show Deck

        System.out.println("SHUFFLED DECK");
        shuffleDeck(deck);
        displayCards(deck); // Show shuffled Deck

        int count = 2;
        System.out.println("HAND OF " + count + " CARDS");
        String[] hand = dealCards(deck, count);
        displayCards(hand); // Show counted deck
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
        for (int i = 0; i < deck.length; i++) // Iterate through all cards in the deck
        {
            int randomIndex = (int) (Math.random() * deck.length-1); // Declare variable for a random index
            String temp = deck[i]; // Temp to hold value of deck at current iteration
            deck[i] = deck[randomIndex]; // Assigns the value of the card at the random index to the card at current index
            deck[randomIndex] = temp; // Swaps cards at "i" index and randomIndex
        }
    }

    private static String[] dealCards(String[] deck, int count) {
        String[] hand = new String[count]; // Declare array of strings with size being determined by count.
        System.arraycopy(deck, 0, hand, 0, count); // First 'count' (ex: 2) cards from the deck are dealt
        return hand; // Return hand array holding dealt cards
    }
}