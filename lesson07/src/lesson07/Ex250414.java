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
		  //fibo[0]->[1]의 규칙은 뭘까요..? 일단 수동으로 변수 채워넣기....
		
		for (int i = 2 ; i < fibo.length ; i++) {
				fibo[i] = fibo[i-2] + fibo[i-1];		
		};	
		System.out.println(Arrays.toString(fibo));
		
		int a = 1;
		int b = 1;
		for(int i = 0 ; i < 20; i++) {
			int c = a + b; //2
			System.out.print(c + " ");
			a = b; //1
			b = c; //2
		}
		
/*		c = a + b; //3
		
		a = b; //2
		b = c; //3
		c = a + b; //5
*/		
		
		
		
		System.out.println("==================================================");
		//=======================================================
		// [2번 문제] 50개의 길이를 가지는 정수 배열 생성.
		// 각 값은 1~20 사이의 숫자로 채우기
		// 이후 중복된 값을 제거한 새로운 배열 생성
		System.out.println("1~ 20 중복 없이 채우기");
		// 결과만 생각하면 배열에 먼저 1~20 순서대로 채우고 섞는게 나은가..
		// 일단 문제대로 해보기
		
/*		int[] num = new int [50];
		
		for ( int i = 0 ; i < num.length ; i++) {
			//1. 각 인덱스에 1~20 사이 숫자 랜덤으로 넣기
			int nansu = (int)(Math.random() * 20 + 1);
			num[i] = nansu ;
		}
		System.out.println(Arrays.toString(num));
		
		
		int[] num2 = new int [20];
		// 2. 중복값 제거하기........
		// 어떻게 중복값을 체크하지? 넣으면서 체크...?
		// num2에는 순서대로 1~20 을 넣고..... 동일한지 체크..?
		// 안에 그 값이 탐색 되었을때 그 자리에 있는지 없는지 
		// num2 각 인덱스 값이 채워지면 0 > 1이 되게끔..?
		
		for (int i = 0 ; i < num2.length ; i++) {
			for (int j = 1 ; j < num.length ; j++) {
				if (num[i] == j) {
					num2[i] = num[i];
					System.out.println(Arrays.toString(num));
				} 
			}
		} */
		//============================================
		
		int[] arr = new int[50];
		for(int i = 0; i < arr.length ; i++) {
			arr[i] = (int)(Math.random() * 20 + 1); //50개의 배열에 난수 만들어 넣기
		}
		System.out.println(Arrays.toString(arr)); 
		
		int[] tmp = new int[20];
		System.out.println(Arrays.toString(tmp)); 
		int length = 0; //arr의 값이 tmp에 없으면 length에 넣는다
		
		for(int n : arr) { // 0~49 arr을 탐색하는 for문. (n이 뭘까? arr의 0번인덱스 속 숫자)
			boolean insert = true ;
			for(int i = 0 ; i < length ; i++) { //탐색하는 도중에 중복유무 체크
				//length = 0이라 처음 한번은 실행안함
				if(n == tmp[i]) { //n과 같은 값이 나올때까지 반복
					//n은 50개를 다 확인한 후 arr[1] 속의 숫자가 되고, 다시 50개 확인
					insert = false;
					break; //한번이라도 같은게 나오면 비교 멈춰!					
				}
			}
			if(insert) {
				tmp[length++] = n;
			}//중복이 아니면 숫자 넣기
		}
		System.out.println(Arrays.toString(tmp));
		tmp = Arrays.copyOf(tmp, length);
		System.out.println(Arrays.toString(tmp));
		
		
		
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
		
	//	System.out.println(Arrays.deepToString(chs));
		
		char[][] result2 = new char[5][5];
		for (int i = 0 ; i < chs.length ; i++) {
			for ( int j = 0; j < chs[i].length ; j++) {
				System.out.print(chs[i][j] + " ");
				result2[j][5-1-i] = chs[i][j];
			}
			System.out.println();
		} //기존 배열 출력
		System.out.println("=====");
		for(char[] t : result2) { //result2는 2차원 배열이기 때문에 1차원 배열 t에 향상for문
			for(char n : t) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		

		
		int[][] val = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
//		7 4 1
//		8 5 2
//		9 6 3  //90도 회전한다면 이렇게
		int[][] result = new int[3][3];
//1		result[0][2] = val[0][0];
//2		result[1][2] = val[0][1];		
//3		result[2][2] = val[0][2];

//4		result[0][1] = val[1][0];
//5		result[1][1] = val[1][1];
//6		result[2][1] = val[1][2];
		
//7		result[0][0] = val[2][0];
//8		result[1][0] = val[2][1];
//9		result[2][0] = val[2][2];
		
//		result[j][길이 3 - 1 - i] = val[i][j];
		
		
		
		for (int i = 0 ; i < val.length ; i++) {
			for ( int j = 0; j < val[i].length ; j++) {
				System.out.print(val[i][j] + " ");
				result[j][3-1-i] = val[i][j];
			}
			System.out.println();
		} //기존 배열 출력
		System.out.println("=====");
		for(int[] t : result) {
			for(int n : t) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		
		//별의 배치를 바꾸는게 아니라 진짜 회전을 시켜야.
		
		
		
		//=======================================================
		
		
	}
}
