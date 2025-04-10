package lesson05;

import java.util.Scanner;

public class Han {
	public static void main(String[] args) {
		// 한글의 갯수
		System.out.println('힣' - '가'+1); // 11172
		
		// 초성당 글자개수
		System.out.println('힣' - '하'+1); // 588
	
		// 초성의 갯수
		System.out.println(11172 / 588); //19
		System.out.println(19 * 588); //11172
	
		//종성간 거리 : 이 갯수만큼 받침이 있다
		System.out.println('개' - '가'); //28
		//받침이 없는 간격이 28 : 순환
		
		// 특정 글자가 받침이 있는가 없는가 boolean으로
		char ch = '각';
		System.out.println((ch - '가') % 28 != 0);
		// '가'의 코드는 44032라서 먼저 '가'-'가'를 해줌으로 0으로 만든다.
		// 0이 아닌 결과값이 나오면 전부 받침있음(true) 처리
		// (가-가 = [44032 - 44032 = 0]) % 28 == 0 이기 때문에 받침이없음
		// (각-가 = [44033 - 44032 = 1]) % 28 == 1 이기 때문에 받침이있음
		
		// 입력값의 받침에 맞는 [은는이가을를] 출력하기
		Scanner scanner = new Scanner(System.in);
		System.out.print("단어를 입력하세요 > ");		
		String inputStr = scanner.nextLine();
		
		//문자열 내의 특정위치의 글자 하나만 char로 변환
		char cha = inputStr.charAt(inputStr.length()-1);
		boolean hasLast = (cha -'가') % 28 != 0;
		
		String output = "사용단어의 예시는 아래와 같습니다.\n";
		output += inputStr + (hasLast ? "은" : "는") + "\n";	
		output += inputStr + (hasLast ? "이" : "가") + "\n";	
		output += inputStr + (hasLast ? "을" : "를") + "\n";	

		System.out.println(output);
		
		//여기에 반복문을 붙인다면 ?
		//종료하려면 종료를 입력하세요.
		//이 글자가 참이라면 반복종료
	}

}
