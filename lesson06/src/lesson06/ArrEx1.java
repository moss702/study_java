package lesson06;

import java.util.Arrays;

public class ArrEx1 {
	public static void main(String[] args) {
		int[] arr = {10,20,30,50} ; //배열 선언 및 값 초기화
//		int[] arr = new int[] {10,20,30,50} ; //값 할당부분의 new int[]를 생략한것
		
		int i = 1 ;
		
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		//배열의 값에 접근하기 위해서는 : index
		
		arr[0] = 60 ;
		//해당 배열의 0번째 인덱스 값에 60을 대입
		System.out.println(arr[0]);
		
		arr[1] = arr[2];
		
		arr[3] = i ;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		int[] arr1 = {1,2,3}; //값
		int[] arr2 = new int[3]; //길이를 통한 초기화
		int[] arr3 = new int[] {5,6,7,8};
		
	
		arr1 = new int[] {10, 20, 30}; //배열의 값 변경
		arr1 = new int[10];//기존 arr1의 값들이 다 없어지고 0만 10개가 생긴다.
		
		System.out.println(Arrays.toString(arr1));
		
		String[] arr4 = new String[3];
		System.out.println(Arrays.toString(arr4));
		
		
		char ch = '가';
		ch = 44032;
		ch = '\uAC00';
		ch = 0xac00 ;  //전부 가를 표현하는것
		
		//char[] ch =
		
		
	}
}
