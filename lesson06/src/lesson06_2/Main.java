package lesson06_2;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
	
		int a = 10 ;
		int c = a;
		int[] arr = {1,2,3};
		int[] arr2 = arr;
		//main이 관리하는 지역변수는 4개.
		
		
		int[][] arr3 = {{1,2},{3}};
		
//		arr3[1] : int 1차원 배열
		arr3[1] = arr3[0];
		
		System.out.println(Arrays.deepToString(arr3));
		
		arr3[0][0] = 10;
		System.out.println(Arrays.deepToString(arr3));
		//안쓰는(참조하지않고있는) 가비지는 자바가 알아서 특정주기마다 삭제해준다!
		
		arr3[0] = arr;
		System.out.println(Arrays.deepToString(arr3));
		
		
		
	}
}
