package practice;

public class Ex0413_5 {
	public static void main(String[] args) {
		//특정 글자까지만 출력하기
		
		String num = "123456-1234567";
		System.out.println(num.substring(0, num.indexOf("-") +2));
		
	}
}
