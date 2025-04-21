package card;

public class Card {
	int number;
	int kind; // spade > dia > heart > clover
	//왜 int? 높낮이 계산을 위해
	
	Card(int kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		// 10, 2 : Q, dia
		String numbers = "23456789XJQKA";
		String kinds = "♣♥◆♠";
		return "[" + kinds.charAt(kind) + "," + numbers.charAt(number) + "]";
		
	}
}
