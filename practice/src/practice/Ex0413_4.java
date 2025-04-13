package practice;

public class Ex0413_4 {
	public static void main(String[] args) {
	//string 관련
		String s = "I like Java and Python and C.";
		System.out.println(s);
		
		//문자열의 길이
		System.out.println(s.length());
		//활용하기 : 리뷰 10글자 이상 작성하세요.
		
		//대소문자 변환
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		//문자열 속 문자가 포함되어 있는지 확인
		System.out.println(s.contains("Java"));
		System.out.println(s.contains("C++"));
		
		//문자열 속 문자의 위치 확인
		System.out.println(s.indexOf("a")); //해당하는 가장 처음의 위치를 알려줌
		System.out.println(s.lastIndexOf("a")); //해당하는 가장 마지막의 위치를 알려줌
		//없을 시에는 -1이 출력됨 
		
		System.out.println(s.startsWith("I ")); //이 문자열로 시작하는게 맞는지 확인
		System.out.println(s.endsWith(".")); //이 문자열로 끝나는게 맞는지 확인
		
		//문자열 변환
		System.out.println(s.replace("and", ",")); // 특정 문자를 다른 새로운 문자로 변환
		
		//일부 문자만 출력
		System.out.println(s.substring(7)); // 특정 문자부터 출력 시작
		System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); //특정 문자부터 특정 문자 직전까지 출력
		
		
		
	}
}
