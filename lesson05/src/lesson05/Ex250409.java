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
		System.out.println("아이디를 입력 > ");
		Scanner scanAdmin = new Scanner (System.in);
		String inputAdmin = scanAdmin.nextLine();
		System.out.println("비밀번호를 입력 > ");
		Scanner scanPassword = new Scanner (System.in);
		String inputPassword = scanPassword.nextLine();
		//사용자의 입력을 문자열로 만들어 주는 변수가 반드시 필요한가?
		//바로 scanAdmin, scanPassword에 대입시키면 안되는건가?
		//ㄴ 안됨.. 입력받은거 문자취급안해줘서 비교를 못함..
		
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
		
		//입력받은 숫자 % 3이 0인경우 3의 배수.
		//입력받은 숫자 % 2가 0이어야 짝수.
	
		System.out.println("[2문] 입력한 숫자가 3의 배수인지 짝수인지 알려줍니다. >");				
		//입력받은 숫자 담아둘 변수 하나 만들기
		Scanner scanNumthr = new Scanner (System.in);
		//스캔으로 받은 string 어떻게 int형으로 바꾸지..

		int scanNumthr = Scanner.nexInt() ;
		
		if (numthr % 3 == 0) {
			System.out.println("3의 배수입니다.");
			if (numthr % 2 == 0) {
				System.out.println("3의 배수이자 짝수입니다.");
			}
		}
			else if {
				
		if (numthr % 2 == 0) {
			System.out.println("짝수입니다.");
			
		}
				
			}
		}
		
		System.out.println("3의 배수도 아니고 짝수도 아닙니다.");
		
		
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//3번 문제 :
		// 월(month)을 입력 받아서 계절을 출력
		// 봄(3 4 5), 여름(6 7 8) ... 3개월씩
		
		
		}
	}


