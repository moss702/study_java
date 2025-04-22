package card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
//	Card[] cards = new Card[52];
	List<Card> cards = new ArrayList<Card>();
	///길이를 알 필요 없음. = count 알필요 없음.
	{
		for (int i = 0 ; i < 4 ; i ++){ //kind
			for(int j = 0 ; j < 13; j++) { //number
				cards.add(new Card(i,j));				
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
		Collections.shuffle(cards);
		return this;
	}
	
	Card pick() { //카드 나눠주기. 0~4까지
		return cards.remove(cards.size()-1);
	}
	
	public static void main(String[] args) {
		new Deck().shuffle().print();
	}
}
