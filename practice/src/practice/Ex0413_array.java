package practice;

public class Ex0413_array {
	public static void main(String[] args) {
/*		String coffeeRose = "아메리카노";
		String coffeeRachel = "카페모카";
		String coffeemonica = "카푸치노";
		String coffeeRix = "라떼";
		
		
		String[] coffee = new String[4];
		
		coffee[0] = "아메리카노";
		coffee[1] = "카페모카";
		coffee[2] = "카푸치노";
		coffee[3] = "라떼";
*/		
		
//		String[] coffee = new String[] {"아메리카노", "카페모카", "라떼", "카푸치노"};
		String[] coffee = {"아메리카노", "카페모카", "라떼", "카푸치노"};
		
		System.out.println("커피 주문하시겠어요?");
		
		for (int i = 0 ; i < coffee.length; i++) {
			System.out.println(coffee[i]);
		}
		//인덱스 요소를 필요로 할때는.
		System.out.println("=============");
		
		for (String coffees : coffee) {
			System.out.println(coffees);
		}
		//배열 순회를 중점으로 할때는.
		
		
	}
}
