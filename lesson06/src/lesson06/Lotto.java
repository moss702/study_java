package lesson06;

import java.util.Arrays;

public class Lotto {
	public static void main(String[] args) {
	
		int[] lotto = new int[6];
		int idx = 0 ; //index 넘버 체크할 녀석
		while(true) { //무한루프 구간 : 항상 참이다! , break가 없으면 탈출불가
			int number = (int)(Math.random() * 45 +1); //1~45중 하나의 수가 나온다
			
			boolean insert = true; //중복체크 역할을 할 bool 변수선언
			
			for(int i = 0 ; i <= idx ; i++) { //배열에 들어가는 숫자가 중복인지 체크
				if(lotto[i] == number) { // i 는 배열의 인덱스 순서를 판단하는것
					insert = false;
					break; //for의 브레이크
				}
			}
			
			if(insert) { //뽑은 숫자를 idx에 넣는다!
				lotto[idx] = number;
				idx++;
			}
			if (idx == 6) break;		//while문의 브레이크
		}
		System.out.println(Arrays.toString(lotto));
		
		
		//로또 번호를 오름차순으로 정렬해보자
		int[] arr = lotto;
		for (int i = 0 ; i < arr.length; i++) { //회차
			System.out.println(i + 1 + "회차");
			for(int j = 0 ; j < arr.length -1 - i; j++) { //회수
				// * - i ? 변동없는 회수 삭제
				//arr[j]와 arr[j+1]를 비교하는것
				if (arr[j] > arr[j+1]) { //변수의 크기 비교.
					//변수의 값 서로 변환 필요. 임시 int 선언
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
				System.out.println(Arrays.toString(arr));
			}
		}
		
		// 한번에 오름차순으로 정리하는게 있긴하다. sort
		int[] arr2 = {5,2,3,4,1};
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
		// 역순(내림차순) 정렬하려면 조금 손봐야하는데?
		Integer[] arr3 = {5,2,3,4,1};
		Arrays.sort(arr3, (a,b) -> b - a); //람다식???
		System.out.println(Arrays.toString(arr3));
		
		
	}
}
