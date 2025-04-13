package practice;

public class Ex0413_6 {
	public static void main(String[] args) {
	//조건문 if
	
		int hour = 10;
		boolean coffee = false ;
		
		if (hour < 14 && coffee) {
			System.out.println("아이스 아메리카노 +1");			
		
		}
		System.out.println("커피 주문 완료");
		
		
	//else if
		
		boolean hanlaAde = true ;
		boolean mangoAde = true ;
		boolean AA = true;
		
		if (hanlaAde) {
			System.out.println("한라봉 에이드 +1");
		} else if (mangoAde) {
			System.out.println("망고 에이드 +1");
		} else {
			System.out.println("아이스아메리카노 +1");
		}
		System.out.println("커피 주문 완료");
		
		
	}
}
