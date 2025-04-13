package practice;

public class Ex0413_quiz_4 {
	public static void main(String[] args) {
		
		//if문 이용한 주차요금 정산
		
		int hour = 20;
		int hourCost = hour * 4_000;
		int DayCost = 30_000 ;
		
		
		boolean carLight =false ;
		boolean carNormal =false ;
		boolean carDisable = true;
		
		
		if (hourCost > DayCost) {
			hourCost = DayCost ;
		}
		
		if (carDisable || carLight) {
			hourCost /= 2;
			
		}
		System.out.println("주차요금 : " + hourCost);
		
		
		
		
	}
}
