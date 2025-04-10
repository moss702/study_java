package lesson05;

import java.util.Scanner;

public class ForEx3 {
	public static void main(String[] args) {
		//숫자 하나를 입력받고 그 숫자의 약수들 출력하기
		// 12 입력 > 1 2 3 4 6 12
		// for문 사용하기
		
		Scanner scanner = new Scanner (System.in);
		int number = scanner.nextInt();
		
		int i = 1 ;
		while (i <= number) {
			if (number % i == 0) {
			System.out.println(i);
			}
			i++;
		}
		/*
		for ( int i = 1 ; i <=number && number % i == 0 ; i++) {
			{
			System.out.println(i);
			}
		} //이거 왜 4까지밖에 안나오는지,,?
		//12 나누기 5가 소수점이 나와서 조건중 하나가 참이 아니라 넘어간다..
		*/
		
	}
}
