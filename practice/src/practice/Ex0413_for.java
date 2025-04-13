package practice;

public class Ex0413_for {
	public static void main(String[] args) {
		//홀수만 출력
		for (int i = 1 ; i <= 10 ; i+=2) {
			System.out.println("환영합니다. 타코야끼입니다." + i);
		}
		// =======================================================
		//거꾸로 출력
		for (int i = 5 ; i > 0 ; i--) {
			System.out.println("환영합니다. 타코야끼입니다!" + i);
		}
		// =======================================================
		//1부터 10까지의 숫자를 전부 더한 합계 출력
		int sum = 0 ;
		for (int i = 1 ; i <= 10; i++) {
			sum += i;
			System.out.print(" " + sum);
		}
		//========================================================
	}
}
