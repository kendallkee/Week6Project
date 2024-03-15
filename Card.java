package War;

public class Card {
	
	// fields for value and name
    private int value;
    private String name;
    
    // constructor with two parameters of int and String
    // .this is used to differentiate between the class field and the parameter
    // of "value" and "name"
    public Card(int value, String name) {
        this.value = value;
        this.name = name;
    }
    
    // using getter to get the value of the card
    public int getValue() {
        return value;
    }
  
    
    // using getter to get the name of the card
    // The instructions said setter but I did not need setter for this because the cards cannot be modified
    //  when playing
    public String getName() {
        return name;
    }
    // describe method to SysOut the name of the card
    public void describe() {
        System.out.println(name);
    }
}


