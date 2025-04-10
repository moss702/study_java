package lesson05;

import java.util.Scanner;

public class UpDown {
	public static void main(String[] args) {
		// 랜덤값 배정 (1~100)
		int value = (int)(Math.random() * 100 +1 );
		
	
		Scanner scanner = new Scanner(System.in);
		int input = 0 ;
		int count = 0 ;

		do { 
			//다르면 계속 반복, 같으면 반복종료
			System.out.print("1~100 사이의 숫자를 입력하세요 > ");
			input = scanner.nextInt();
			//크다 작다를 알려줘야 함
			if (value < input) {
				System.out.println("다운입니다");
			}
			else if (value > input) {
				System.out.println("업입니다");
			}
			count++;
			//도전 횟수 카운트
		} 
		while(value != input);
		 // 조건 랜덤수value가 입력값input과 다를때 do 반복.	
		
		System.out.println(count + " 번째에 당첨");
		
	}

}
