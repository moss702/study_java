package lesson06_2;

import java.util.Arrays;

public class ArrEx10_2 {
	public static void main(String[] args) {
		//다차원 배열의 선언
		int[][] matrix = new int [4][3];
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 3;
		matrix[1][0] = 4;
		matrix[1][1] = 5;
		matrix[1][2] = 6;
		matrix[2][0] = 7;
		matrix[2][1] = 8;
		matrix[2][2] = 9;
		
		int[][] matrix2 = {{1,2,3},{4,5,6},{7,8,9}};
		
		int[][] matrix3 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		System.out.println("[첫번째]");
		int count = 1;
		for(int i = 0 ; i < matrix.length ; i++) {
			for(int j = 0 ; j < matrix[i].length ; j++) {
				// System.out.print(matrix[i][j] + " ");
				matrix[i][j] = count++;
			}
			System.out.println();
		}
		
		System.out.println("[두번째]");
		for(int i = 0 ; i < matrix2.length ; i++) {
			for(int j = 0 ; j < matrix2[i].length ; j++) {
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("[세번째]");
		for(int i = 0 ; i < matrix3.length ; i++) {
			for(int j = 0 ; j < matrix3[i].length ; j++) {
				System.out.print(matrix3[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println(Arrays.toString(matrix)); 
		//1차원 배열에서는 잘 보였지만, 다차원 구조에서부터는 이걸로 확인할수 없다.
		System.out.println(Arrays.deepToString(matrix));
		//deepToString 사용해야 내부 배열의 변수들이 보인다.
		
	}
}
