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
        String[] deck = new String[52];
        // add code that creates deck here
        return deck;
    }

    private static void displayCards(String[] cards) {
        // add code that displays cards here
    }

    private static void shuffleDeck(String[] deck) {
        int randomIndex = (int) (Math.random() * deck.length-1);
        
        // add code that shuffles the deck here
    }

    private static String[] dealCards(String[] deck, int count) {
        String[] hand = new String[count];
        return hand;
    }
}


