package practice;

public class Ex_0413_NestLoop {
	public static void main(String[] args) {
	
		//별 꽉 채워 그리기
		for (int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		//별 좌하 삼각형
		for (int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//별 좌상 삼각형
		for (int i = 5 ; i > 0 ; i--) {
			for(int j = 0 ; j < i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

	
		//별 우하
		for (int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 4 - i ; j++) {
				System.out.print(" ");
			}
			for(int k = 0 ; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		//별 우상
		for (int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < i ; j++) {
				System.out.print(" ");
			}
			for(int k = 5 ; k > i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

	
	    //별 트리
		int oddNum = 1 ; //소수만 출력하는 변수
		
		for (int i = 0 ; i < 5 ; i++) { // 행표시 
			for(int j = 4 ; j > i ; j--) { //열표시 = 근데 공백을 표현함. 변수 j
				System.out.print(" "); 
			}
			for(int k = 0 ; k < oddNum ; k++) { //열표시 = 근데 별을 찍음. 변수 k 
				System.out.print("*"); 
			}
			oddNum += 2;
			System.out.println();
		}

	
		
		
		
	}
}
