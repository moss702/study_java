package lesson07;

import java.util.Arrays;

public class Ex250414 {
	public static void main(String[] args) {
		// 피보나치 수열 출력하기		
		// 반복문 관련
		// 피보나치 수열 숫자 20개 출력하기
		// 규칙 : 첫 두자리 숫자의 합이 다음 숫자의 합
		// 그 다음 숫자는 이전 두 숫자의 합의 연속
		// 1 1 2 3 5 8 13 21 . . . 20개까지 나오게
		System.out.println("피보나치 수열");
		
		int[] fibo = new int [20];
			fibo[0] = 1;
			fibo[1] = 1;
//			fibo[2] = fibo[0]+[1];
//			fibo[3] = fibo[1]+[2];
//			fibo[4] = fibo[3]+[4];		
		  //fibo[0]->[1]의 규칙 정의가 어렵습니다.. 일단 수동으로 변수 채워넣기....
		
		for (int i = 2 ; i < fibo.length ; i++) {
				fibo[i] = fibo[i-2] + fibo[i-1];		
		};	
		System.out.println(Arrays.toString(fibo));
		System.out.println("==================================================");
		//=======================================================
		// [2번 문제] 50개의 길이를 가지는 정수 배열 생성.
		// 각 값은 1~20 사이의 숫자로 채우기
		// 이후 중복된 값을 제거한 새로운 배열 생성
		System.out.println("1~ 20 중복 없이 채우기");
		// 결과만 생각하면 배열에 먼저 1~20 순서대로 채우고 섞는게 나은가..
		// 일단 문제대로 해보기
		
		int[] num = new int [50];
		
		for ( int i = 0 ; i < num.length ; i++) {
			//1. 각 인덱스에 1~20 사이 숫자 랜덤으로 넣기
			int nansu = (int)(Math.random() * 20 + 1);
			num[i] = nansu ;
		}
		System.out.println(Arrays.toString(num));
		
		
		int[] num2 = new int [50];
		// 2. 중복값 제거하기........
		// 어떻게 중복값을 체크하지? 넣으면서 체크...?
		// num2에는 순서대로 1~20 을 넣고..... 동일한지 체크..?
		// 안에 그 값이 탐색 되었을때 그 자리에 있는지 없는지 
			for (int i = 0 ; i < num2.length ; i++) {
				num[i] = num2[i] ; //
			}
			//실패하면서 얻는것들~~~~~~~~~~~~~~~~~~~~
		
		System.out.println("==================================================");
		//=======================================================
		// [3번 문제] 2차원 배열			
		char[][] chs = {
				{'*','*',' ',' ',' '},
				{'*','*',' ',' ',' '},
				{'*','*',' ',' ',' '},
				{'*','*','*','*','*'},
				{'*','*','*','*','*'},
		};
		
//90도 시계방향 회전 결과를 result에 담기. 이중for문 사용
		
//				{'*','*','*','*','*'},
//				{'*','*','*','*','*'},
//				{'*','*',' ',' ',' '},
//				{'*','*',' ',' ',' '},
//				{'*','*',' ',' ',' '},
// chs의 [4][5]를 [1][2]로 바꾸는것도 괜찮겟는디? 근데 그럼 결과물은 동일한데 회전하는건 아님..
		
		System.out.println(Arrays.deepToString(chs));
		
		
		char[][] result = new char[5][5];
		
		for (int i = 0 ; i < result.length ; i++) {
			for ( int j = 0; j < result.length ; j++) {
				result[i][j] = chs[i][j];
				System.out.println(Arrays.deepToString(result));
			}
		}
		//=======================================================
		
		
	}
}
