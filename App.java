package War;

public class App {
		
		public static void main(String[] args) {
			// instantiating the deck here
			Deck deck = new Deck();
	        deck.shuffle();
	        //instantiating the players (1 & 2)
	        Player player1 = new Player("Kendall");
	        Player player2 = new Player("Atlas");
	        // using a for loop to iterate 52 times while calling the Draw method
	        for (int i = 0; i < 52; i += 2) {
	            player1.draw(deck);
	            player2.draw(deck);
	        }
	        
	        // used this below just to see if it worked 
	        //player1.describe();
	        //player2.describe();
	        
	        // using a for loop to iterate 26 times and calling the Flip method
	        for (int i = 0; i < 26; i++) {
	            Card player1Card = player1.flip();
	            Card player2Card = player2.flip();
	            // SysOut to reveal the cards drawn and using the getName to get the Name of the players
	            // and Card describe method to get the card drawn for comparison
	            System.out.print(player1.getName() + " has a ");
	            player1Card.describe();
	            System.out.print(player2.getName() + " has a ");
	            player2Card.describe();
	            // if else statements and calling the incrementScore method to get the score 
	            // if player 1 is greater than player 2 and vice versa
	            if (player1Card.getValue() > player2Card.getValue()) {
	                player1.incrementScore();
	                // During SysOut used New Line for distinction of games played
	                System.out.println(player1.getName() +" Wins | new score: " + player1.getScore() + "\n**************");
	            } else if (player1Card.getValue() < player2Card.getValue()) {
	                player2.incrementScore();
	                System.out.println(player2.getName() + " Wins | new score: " + player2.getScore() + "\n**************");
	            } else {
	            	System.out.println("Tied!" + "\n**************");
	            }
	            	// Attempted to try to make it to where when the players tie, they draw three cards and flip the last one to see who wins
	            	// ** I can work on it
	            	 //	List<Card> player1Cards = new ArrayList<>();
	            	// List<Card> player2Cards = new ArrayList<>();
	            //		for (int i = 0; i < 3; i++) {
	            	//		player1Cards.add(player1.flip());
	            //			player2Cards.add(player2.flip());
	            			      
	            
	        }
	        // Used New Line with asterisks to create distinction and SysOut the final score
	        System.out.println("\n****************\n" + 
	        	"Final Score: " + player1.getName() + ": " + player1.getScore() + "| " + player2.getName() + ": " + player2.getScore() + 		"\n****************\n");
	     	// using a loop to gather the final score of the game and determine the winner, or if it's a draw
	        if (player1.getScore() > player2.getScore()) {
	            System.out.println(player1.getName() + " WINS AT WAR!");
	        } else if (player1.getScore() < player2.getScore()) {
	            System.out.println(player2.getName() + " WINS AT WAR!");
	        } else {
	            System.out.println("Draw! Play Again and see who WINS!!");
	        }
	    
		

	}

}
