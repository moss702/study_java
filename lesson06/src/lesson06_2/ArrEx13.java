package lesson06_2;

import java.util.Arrays;

public class ArrEx13 {
	public static void main(String[] args) {
		//초기의 배열
		//5개의 int 배열 생성
		int[] arr = { 10, 20, 30, 40, 50};
		//기존 배열의 2배의 길이를 가지는 배열을 생성
		int[] tmp = new int[arr.length *2]; //10개짜리 배열이 됨
		//tmp[] {0,0,0,0,
		
		for(int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i] ;
		}//tmp[]{10,20, ... 0,0}
		
		//배열의 참조값 복사
		arr = tmp ;
		System.out.println(Arrays.toString(arr));
		
		//for문을 이용한 복사, arraycopy를 이용한 복사는 복사될 대상을 미리 생성
		int[] arr2 = Arrays.copyOf(arr, 20);
		System.out.println(Arrays.toString(arr2));
		
		int[] result = {1,2,3};
		result = Arrays.copyOf(result, result.length *2);

		System.out.println(Arrays.toString(result));
		
	}
}
