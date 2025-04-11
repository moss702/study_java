package lesson06;

import java.util.Arrays;

public class Ex250411 {
	public static void main(String[] args) {
		//1. 187000원
		//50000 , 10000, 5000, 1000의 돈 단위를 이용해, 사용된 지폐 갯수 계산
		//배열 사용
		int[] units = { 50000, 10000, 5000, 1000 } ;
		int[] count = new int [units.length];
		//이하 코드 작성 후 개수 출력
		
		
		//=============================================
		System.out.println("=============임의의 문자열 10글자 생성하기============");
		//2. 임의의 문자열 생성 CAPTCHA
		//문자열 string 또는 배열 이용
		//문자열의 범위는 숫자, 영대, 영소 (69가지중하나) 10글자
		//=============================================
		System.out.println("=============100개의 공간을 가진 배열에 1~9 숫자 랜덤으로 넣기============");
		//3-1. 배열에 임의 값 채우기
		// 100개의 공간을 가지는 배열(0~9사이의 아무 값)
		// [0, 1, 1, 9, 7, 9, 2 ...]
		int[] namu = new int [99]; //100개의 빈공간 생성

		for(int index = 0 ; index < 99; index++) {
			int dotori = (int)(Math.random() * 9 + 1);
//			System.out.println(dotori); // 1~9 숫자 출력 확인용
			
			namu[index] = dotori; // 뽑은 난수를 배열에 하나씩 넣기
//			System.out.print(dotori+"도토리 ");
//			System.out.println(index+"인덱스 "); //각 공간에 잘 들어갔나 체크용
		}		
		System.out.println(Arrays.toString(namu)); //배열 출력
		//=============================================
		//3-2. 빈도 수 구하기
		//배열의 길이는 10
		//3번에서 나온 코드를 바탕으로 3은 몇개 나왔는지, 1은 몇개나왔는지
		//허프만 코딩..? 무손실 압축의 기반
		
		//=============================================

		
		
	}
}
