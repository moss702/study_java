package practice;

import java.util.Iterator;

public class Ex0414_dachawon_loop {
	public static void main(String[] args) {
	//다차원배열 순회
		String[][] seats = new String[][] {
			{"A1", "A2", "A3","A4","A5"},
			{"B1", "B2", "B3","B4","B5"}, //세미콜론이 아니라 컴마로 구분!
			{"C1", "C2", "C3","C4","C5"}  //3행 5열 크기의 2차원 배열
		}; 
		
		for (int i = 0; i < 3 ; i++) { //행(세로)
			for (int j =0; j < 5; j++) { //열(가로)
				System.out.print(seats[i][j]+" ");
			}
			System.out.println();
		}
		
		//==========================================
		//행과 열의 갯수가 다른 2차원 배열의 호출
		String[][] seat2 = {
				{"A1", "A2", "A3"},
				{"B1", "B2", "B3", "B4"},
				{"C1", "C2", "C3", "C4", "C5"},				
		};
		for (int i = 0; i < seat2.length ; i++) { //행(세로)
			for (int j =0; j < seat2[i].length; j++) { //열(가로)
				System.out.print(seat2[i][j]+" ");
			}
			System.out.println();
		}
		//==========================================
		//값 자동으로 넣어보기
		String[][] seat3 = new String[10][15];
		String[] eng = {"A","B","C","D","E","F","G","H","I","J"};
		
		
		for (int i = 0; i < seat3.length; i++) {
			for (int j =0; j < seat3[i].length; j++) {
				seat3[i][j] = eng[i]+(j+1);
					
			}
		}
		//만약 표를 구매했다면?
		seat3[7][8] = "__";
		//해당 인덱스를 찾아가서 다른 표기로 수정할수있다.
		
		for (int i = 0; i < seat3.length ; i++) { //행(세로)
			for (int j =0; j < seat3[i].length; j++) { //열(가로)
				System.out.print(seat3[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}
