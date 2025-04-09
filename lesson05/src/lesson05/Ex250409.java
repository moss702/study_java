package lesson05;
import java.util.Scanner;

public class Ex250409 {
	public static void main(String[] args) {
		//1번 문제 : 로그인 인증
		// 사용자로부터 아이디와 비밀번호를 입력받고
		// 그 아이디가 admin, 비밀번호가 1234일때 로그인 성공
		// 단, 아이디가 admin , 비밀번호 틀렸을때 로그인 실패 > 잘못된 비밀번호 출력
		// 단2, 아이디가 admin이 아니면 없는 계정 메시지 출력
		String admin = "admin";
		String password = "1234";
		System.out.println("[1문] 로그인 인증하기");
		System.out.print("아이디를 입력 > ");
		Scanner scanAdmin = new Scanner (System.in);
		String inputAdmin = scanAdmin.nextLine();
		System.out.print("비밀번호를 입력 > ");
		Scanner scanPassword = new Scanner (System.in);
		String inputPassword = scanPassword.nextLine();
		//사용자의 입력을 문자열로 만들어 주는 변수가 반드시 필요한가?
		//바로 scanAdmin, scanPassword에 대입시키면 안되는건가?
		//없으면 안됨.. 입력받은거 문자취급안해줘서 비교를 못함..
		
		if(admin.equals(inputAdmin)) {
			if(password.equals(inputPassword)) {
				System.out.println("로그인 성공!");
			}
			else {
				System.out.println("비밀번호가 틀렸습니다");
			}
		}
		else {
		System.out.println("존재하지 않는 계정입니다");
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//2번 문제 : 3의 배수이면서 짝수인가?
		// 숫자 하나를 입력 받아서
		// 3의 배수 그리고 짝수 여부를 동시에 판별
		// 3의 배수, 짝수, 3의 배수이면서 짝수, 둘다 아닌 경우
		
		// 입력받은 숫자 % 3이 0인경우 3의 배수.
		// 입력받은 숫자 % 2가 0이어야 짝수.
	
		System.out.print("[2문] 입력한 숫자가 3의 배수인지 짝수인지 알려줍니다. >");				
		Scanner scanNumthr = new Scanner (System.in);
		int numthr = scanNumthr.nextInt();
		//nextInt : 입력값을 인트로 저장
		//nextLine : 스트링으로 저장		
		
		//*** 만약 음수의 경우에는? 0의 경우에는? 예외처리 해줘야 함.
		if (numthr > 0) {
			if (numthr % 3 == 0) {
				if (numthr % 2 == 0) {
					System.out.println("3의 배수이자 짝수입니다.");
				}
				else {
					System.out.println("3의 배수입니다.");
				}
			} //3의 배수인가? 짝수인가?
			else if (numthr % 2 == 0) {
				System.out.println("짝수입니다.");
			}//3의 배수가 아님. 그럼 짝수인가?
				else {
					System.out.println("3의 배수도 아니고 짝수도 아닙니다.");
				}//3의 배수도 짝수도 아님. 문구 출력
		}
		else {
			System.out.println("잘못된 입력입니다.");
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//3번 문제 : 월(month)을 입력 받아서 계절을 출력 * 각 계절은 3개월씩
		System.out.print("[3문] 입력한 숫자에 맞는 계절을 알려줍니다 >");				
		Scanner scanSeason = new Scanner (System.in);
		int season = scanSeason.nextInt();
		
		if (season > 0 && season < 13) { //예외처리 먼저 해줍니다.
			switch (season) {
				case 3 : case 4 : case 5 :
					System.out.println(season+"월은 봄입니다.");
					break ;
				case 6 : case 7 : case 8 :
					System.out.println(season+"월은 여름입니다.");
					break ;
				case 9 : case 10 : case 11 :
					System.out.println(season+"월은 가을입니다.");
					break ;
				case 1 : case 2 : case 12 :
					System.out.println(season+"월은 겨울입니다.");
					break ;
			}
		} 
		else {
			System.out.println("잘못된 입력입니다.");
		} 
		// if 아래에 스위치랑 case 써도 되나..? 에러 안났으니까 된거같음..
		// 잘못된 입력 범위 설정하기에 가장 편한건 if 같아서 사용해봤습니다.
	}		
}