package practice;

public class Ex0413_switch {
	public static void main(String[] args) {
	
		int ranking = 1;
		
		if (ranking == 1) {
			System.out.println("전액 장학금");
		} else if (ranking ==2 || ranking == 3) {
			System.out.println("반액 장학금");
		} else {
			System.out.println("장학금 대상 아님");
		}
		System.out.println("조회완료 #1");
		
		//=========================================
		
		ranking = 4 ;
		switch (ranking) {
			case 1 :
				System.out.println("전액 장학금");
				break;
			case 2 : case 3 :
				System.out.println("반액 장학금");
				break;
			default :
				System.out.println("장학금 대상 아님");	
		}
		System.out.println("조회완료 #2");
		
		
	}
}
