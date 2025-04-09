package lesson05;

import java.util.Scanner;

public class StringEx {
	public static void main(String[] args) {
		String str = "1234";
		String str2 = "1234";
		
		//문자열 비교
		// str.equals(str2)
		// 동일한 문자열인지 확인해주는 명령어.
		
		if(str.equals(str2)) {
			System.out.println("같은 문자열");
			
		}
		
		Scanner scanner = new Scanner (System.in);
		String input = scanner.nextLine();
		//사용자의 입력을 문자열로 수집
		
		//로그인할때도 이런 방식 사용
		//동일한 문자열인지 비교함으로써
		//기존에 저장되어있던 비밀번호와의 동일성 체크 가능.
		
	}
}
