package lesson05;

public class SwitchEx {
		public static void main(String[] args) {
			//요일 계산하기
			// 0 : 일요일, 6 : 토요일
			
			int day = 30;
			switch(day) {
			case 0 : 
				System.out.println("일요일");
				break ;
			case 1 : 
				System.out.println("월요일");
				break ;
			case 2 : 
				System.out.println("화요일");
				break ;
			case 3 : 
				System.out.println("수요일");
				break ;
			case 4 : 
				System.out.println("목요일");
				break ;
			case 5 : 
				System.out.println("금요일");
				break ;
			case 6 : 
				System.out.println("토요일");
				break ;
				
			default :
				System.out.println("유효하지않는 요일");
			
			}
			
		}
}
