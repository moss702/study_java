package lesson05;

public class ForMatter {
	public static void main(String[] args) {
		String str = "001 002 003";
		System.out.println(str);
		System.out.printf("%03d %03d %03d\n", 1,2,3);
				
		String str2 = String.format("%03d %03d %03d\n", 1,2,3);
		//스트링 포맷 = str2도 str처럼 표현
		System.out.printf(str2);
		
		//%d 정수 (10진수)
		//%x 정수 (16진수)
		//%o 정수 (8진수)
		//%f 실수
		//%s 문자열
		//%c 문자
		
		//30에 해당하는 숫자들을 각 진법에 맞춰 표현
		System.out.printf("%d %x %o %f\n", 30,30,30,30d);
		//%f는 실수타입이라서 그냥 30 쓰면 안되고
		//실수형 f 하나 붙여준다
		// %.15f ? 소수점 15번째까지 나온다.

		int hex = 0xcafe; //16진수 리터럴
		System.out.println(hex);
		System.out.printf("%x\n" , hex);
		
		int oct = 0777; //8진수 리터럴
		System.out.println(oct);
		System.out.printf("%o\n" , oct);
		
//		int bin = 0b1111; //2진수 리터럴
//		System.out.println(bin);
	//	System.out.printf("%s\n" , bin);
		
		String result = "";
		for(int i = 1 ; i <=100 ; i++) {
			result += String.format("%03d ",i);
		}
		System.out.println(result);
		
		
		for(int i = '가' ; i <'까' ; i++) {
			System.out.print((char)i);
		} //몇개인가? 까-가 하면 됨
		
		// unicode 기반의 한글
		// 초성의 갯수는 19종
		// 받침(종성) 유무의 간격
		
		
		
		
	}
}
