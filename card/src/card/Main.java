package card;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		play();
	}
	
	static void play() {
		ArrayList<Player> players = new ArrayList<Player>(); //임의의 플레이어 수 고정
		Deck deck = new Deck();
		deck.shuffle();
	
		players.add(new Player("새똥이"));
		players.add(new Player("개똥이"));
		players.add(new Player("소똥이"));
		players.add(new Player("말똥이"));
		
		for(int i = 0; i < players.size() ; i++) {
			for (int j = 0 ; j < 5 ; j++) {
				players.get(i).cards.add(deck.pick());
			}
		}
		
		for ( Player p : players) {
			System.out.println(p);
		}
	}
}
