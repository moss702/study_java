package practice;

public class Ex0413_while {
	public static void main(String[] args) {
	
		//while
		int distance = 25 ;
		int move = 0 ;
		
		while ( move < distance ) {
			System.out.println("발차기를 계속 합니다.");
			System.out.println("현재 이동 거리 : " + move);
			move += 3; // 3미터 이동
			//무한루프에 빠지지 않도록 탈출구를 꼭 만들 것. 주의
		}
		System.out.println("도착하였습니다.");
		
		//while2
		
		distance = 25;
		move = 0;
		int height = 2;
		
		while (move +height < distance) {
			System.out.println("발차기를 계속 합니다.");
			System.out.println("현재 이동 거리 : " + move);
			move += 3; // 3미터 이동			
		}
		System.out.println("도착하였습니다.");
		
		//=================================================
		//do~ while
		move = 0;
		height = 25;
	
		do {
			System.out.println("발차기를 계속 합니다.");
			System.out.println("현재 이동 거리 : " + move);
			move += 3; // 3미터 이동			
		} 
		while (move +height < distance) ;
		System.out.println("도착하였습니다.");
		
	}
}
