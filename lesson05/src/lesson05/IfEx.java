package lesson05;

import java.util.Scanner;

public class IfEx {
		public static void main(String[] args) {
			
			//콘솔을 통한 값 입력
			Scanner scanner = new Scanner(System.in);
			//클래스 변수 ;
			
			System.out.println("시험 점수 입력 > ");
			int score = scanner.nextInt();
					
			System.out.println("시험 시작");
			
			if (score >= 60) {
				System.out.println("합격입니다.");
			}	else {
				System.out.println("불합격입니다.");
			}
			System.out.println("시험 끝");
		}
}
