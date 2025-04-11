package lesson05;

public class BreakEx {
	public static void main(String[] args) {
		System.out.println("===============break===============");
		int i ;
		for(i = 0 ; i < 10 ; i++) {
			if (i ==5) {
				break;
				//for문 종료
			}
			System.out.println(i);
		}
		System.out.println(i);
		System.out.println("=============continue===============");
		for( i = 0 ; i < 10 ; i++) {
			if (i ==5) {
				continue; 
				//빠져나오는 순간 반복문(for문)의 증감식 수행. 
				//그리고 다시 반복문의 조건확인 및 실행
			}
			System.out.println(i);
		}
	
	}
}
