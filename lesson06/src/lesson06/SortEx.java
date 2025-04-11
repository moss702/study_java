package lesson06;

import java.util.Arrays;

public class SortEx {
	public static void main(String[] args) {
	//정렬
		//버블정렬
		
		//{3,4,1,5,2}을 오름차순 정렬해보자
		//{3,1,4,5,2} [1] [2]를 대소비교. 큰놈을 뒤로 보낸다.
		//{3,1,4,5,2} [2] [3]을 대소비교. 동일. 자리이동 x
		//{3,1,4,2,5} [3] [4]를 비교.
		// 1회차 비교를 했다. 5가 최대값인게 확정.
		// 1회차 : 비교회수 4번
		// 회차가 갈수록 비교 회수가 줄어든다
		
		//2회차 : 비교회수 3번
		//{1,3,4,2,5} [1] [2]를 비교.
		//{1,3,4,2,5}
		//{1,3,2,4,5} 4의 위치가 확정
		
		//3회차 : 비교회수 2번
		//{1,3,2,4,5}
		//{1,2,3,4,5} 3의 위치가 확정
		
		//4회차 : 비교회수 1번
		//{1,2,3,4,5} 2의 위치가 확정
		
		
		int[] arr = {5,4,3,2,1};
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
	}
}
