package lesson06_2;

import java.util.Arrays;

public class ArrEx16 {
	public static void main(String[] args) {
		
		//index for
		//배열 내부의 값을 변경 가능
		int[] arrInt = {1,2,3,4,5};
		for(int i = 0 ; i < arrInt.length; i++) {
			arrInt[i] = arrInt.length - arrInt[i]; 
			System.out.println(arrInt[i]);
		}
		System.out.println(Arrays.toString(arrInt));
		
		//향상된 for문 (Enhanced for)
		// ; 이 아니라 : 사용
		// 좌 : 순회시 나오게 될 데이터타입 변수
		// 우 : 순회시 대입할 데이터타입 변수
		// 값 변경 불가 . 읽기 전용
		for(int number : arrInt){
			number = 10;
			System.out.println(number);
		}
		System.out.println(Arrays.toString(arrInt));
		//향상for문의 목적 : 순회
		//인덱스보다 조금더 짧다
		
		int[][] arr = {{1,2,3},{4,5}} ;
		for(int i = 0; i < arr.length ; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		//arr을 탐색할거임.
		//arr은? int 1차원배열로 이뤄져있다. > int 1차원배열의 tmp로 순회
		//tmp는? int n으로 순회
		for ( int[] tmp : arr ) {
			for(int n : tmp) {
				System.out.println(n);
			}
			
		}
		
		System.out.println(Arrays.deepToString(arr));
		
		
		int age = 30 ;
		String name = "1234";
		String name2 = "1234";
		String n = new String("1234");
		System.out.println("==============");
		System.out.println(name);
		System.out.println(name2);
		System.out.println(n);
		System.out.println(name == name2);
		System.out.println(name == n);
		
		System.out.println(n.intern() == name);
		
	}
}
