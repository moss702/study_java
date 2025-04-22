package card;

import java.util.ArrayList;
import java.util.List;

public class Player {
	List<Card> cards = new ArrayList<Card>(); //손패 5장 (null,null.null ...)
	
	String name;
	
	Player(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name + " : " + cards;
	}
}
