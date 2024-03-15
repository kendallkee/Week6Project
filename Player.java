package War;

import java.util.ArrayList;
import java.util.List;

public class Player {
	// field for Hand using an ArrayList
		 private List<Card> hand = new ArrayList<>();
		 // Score field with a beginning score of 0
		    private int score = 0;
		    private String name;
		    // constructor that takes a String called name
		    public Player(String name) {
		        this.name = name;
		    }
		    // method used to SysOut the player name
		    public void describe() {
		        System.out.println(name + " has the following cards:");
		        // used an enhanced for loop to SysOut the info about the card
		        for (Card card : hand) {
		            card.describe();
		        }
		    }
		    
		    // method for Flip that removes the card and returns the card at index 0
		    public Card flip() {
		        return hand.remove(0);
		    }
		    
		    // method for drawing a card and "add"ing it to the players hand
		    public void draw(Deck deck) {
		        hand.add(deck.draw());
		    }
		    // method used to keep score with ++ for adding one point each win
		    public void incrementScore() {
		        score++;
		    }
		    // method used to the score when needed 
		    public int getScore() {
		        return score;
		    }
		    // method used to get the name of the player when needed
		    public String getName() {
		        return name;
		    }
}
