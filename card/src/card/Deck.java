package card;

public class Deck {
	Card[] cards = new Card[52];
	int count = 0 ;
	
	{
		int c = 0;
		for (int i = 0 ; i < 4 ; i ++){ //kind
			for(int j = 0 ; j < 13; j++) { //number
				cards[c++] = new Card(i,j);
				
			}
		}
	}
	
	Deck print() {
		for(Card c : cards) {
			System.out.println(c);
		}
		return this; //메서드 체인(연속으로 이어붙임)하려고 this사용
	}
	
	Deck shuffle() {
		for(int i = 0 ; i < cards.length ; i++) {
			int r = (int)(Math.random() * 52);
			Card tmp = cards[i];
			cards[i] = cards[r];
			cards[r] = tmp;
		}
		return this;
	}
	
	Card pick() { //카드 나눠주기. 0~4까지
		return cards[count++];
	}
	
	public static void main(String[] args) {
		new Deck().shuffle().print();
	}
}
