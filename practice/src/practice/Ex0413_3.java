package practice;

public class Ex0413_3 {
	public static void main(String[] args) {
		//삼항연산자 이용해서 놀이기구 탑승여부
		
		int height = 120 ;
				
		String ride = height >= 120 ? "탑승 가능" : "탑승 불가" ;
		
		System.out.println("키가 " + height + "cm 이므로 " + ride + "합니다.");
		
	}
}
