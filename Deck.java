package War;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	// using an ArrayList here for the cards
    private List<Card> cards = new ArrayList<>();

    	//constructor with not determined parameters
    public Deck() {
    	// using Strings to set the values of both suits and values for the Deck
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] values = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
        // used an enhanced for loop to iterate suit to equal suits
        for (String suit : suits) {
        	// used a for loop to
            for (int i = 0; i < values.length; i++) {
            	// used to create a new card using value and suit
                cards.add(new Card(i + 2, values[i] + " of " + suit));
            }
        }
    }
    	// had to import the collections utility for the shuffle method to shuffle the deck of cards.
    public void shuffle() {
        Collections.shuffle(cards);
    }
    	// this is the draw method that was used to get the card from index 0
    public Card draw() {
        return cards.remove(0);
    }
}


