package lesson06;

import java.util.Arrays;

public class ShuffleEx { 
	public static void main(String[] args) { 
		//정렬되어있는 숫자를 섞어보자
	
		int[] arr = new int [45]; //45개의 0
		for (int i = 0 ; i < arr.length ; i ++) { 
			arr[i] = i + 1;
			//45개의 0의 위치에 i를 하나씩 증가하면서 채운다!
		}
		
		for(int i = 0 ; i < arr.length ; i++) {
			int idx = (int)(Math.random()* 45); // 0~ 44
			int tmp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = tmp ;
		}
		
		int[] result = new int [6];
		for(int i = 0; i < result.length ; i++) {
			result[i] = arr[i]; // arr의 인덱스를 result의 인덱스에 덮어쓴다
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(result));
	}
}
