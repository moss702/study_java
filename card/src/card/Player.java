package card;

import java.util.Arrays;

public class Player {
	Card[] cards = new Card[5]; //손패 5장 (null,null.null ...)
	
	String name;
	
	Player(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name + " : " + Arrays.toString(cards);
	}
	
}
