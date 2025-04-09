package lesson04;

public class OpEx2 {
	public static void main(String[] args) {
		
		int a = 5 + 5;
		System.out.println("5 + 5 = "+a);
		int b = a - 5 ;
		System.out.println("10 - 5 = "+b);
		int c = b * 2;
		System.out.println("5 * 2 = "+c);
		int d = c / 5 ;
		System.out.println("10 / 5 = "+d);
		
		//나머지 연산
		int e = 10 % 3 ;
		System.out.println("10 % 3 = "+e);
		
		// 산술연산 주의 사항
		// int보다 작은 타입들 : byte, short, char
		// 산술연산 하게 되면 int가 된다. * 산술형상성
		
		char ch1 = 'A';
//		ch1 = ch1 + 1 ; // char에 +1 하면 int가 되어버린다..! 문법오류가 난다.
		ch1 = (char)(ch1 + 1); 
		// 괄호 열고(우선순위지정) 결과값을 char로 바꾸라는 재명명 선언

		ch1++;  // 위에서 +1, 여기서 한번더 +1 했기 때문에 C가 된다.
		
		
		//실습  연산자 형변환 사용해서 소수점 아래 2자리에서 컷
		double val = 241.234567;
		// 오른쪽 두번 가서 인트형으로 바꾸고 다시 왼쪽으로 두번 가서 더블 만들기
		val = (int) (val *100) ;
		// val = (int) val * 100 이 안되는 이유는? 
		// val이 인트가 된 순간부터 정수만 남기때문에, 정수 *100이 되어버린다
		// ㄴ괄호를 넣어서 우선순위지정.
		// 또는 두번에 나눠서 곱하기 한줄, 형변환 한줄
		val = val / 100 ; 
		System.out.println(val);
		
	}
}
