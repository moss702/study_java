package practice;

public class Ex0414_dachawon {
	public static void main(String[] args) {
		//다차원 배열
	
		String[] seatA = {"A1", "A2", "A3","A4","A5"};
		String[] seatB = {"B1", "B2", "B3","B4","B5"};
		String[] seatC = {"C1", "C2", "C3","C4","C5"};
		//하지만 만약 Z열까지 있다면? 너무 많은 배열이 필요하다.
		
		String[][] seats = new String[][] {
			{"A1", "A2", "A3","A4","A5"},
			{"B1", "B2", "B3","B4","B5"}, //세미콜론이 아니라 컴마로 구분!
			{"C1", "C2", "C3","C4","C5"}  //3행 5열 크기의 2차원 배열
		}; 
		
		//C5에 접근하려면?
		System.out.println(seats[2][4]);
	
		//2차원 배열도 딱히 행렬 크기가 다 똑같아야 하는건 아니다.
		
		String[][] seat2 = {
				{"A1", "A2", "A3"},
				{"B1", "B2", "B3", "B4"},
				{"C1", "C2", "C3", "C4", "C5"},				
		};
		//단, 없는 인덱스를 찾으려고 하면 오류가 뜬다.
		
		
		
		//======================================
		//3차원 배열 : 업계에서 잘 안쓴다.
		String[][][] marray = new String [3][3][3] ; // 행 렬 높이			
		
	}
}
