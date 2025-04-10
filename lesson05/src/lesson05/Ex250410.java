package lesson05;

public class Ex250410 {
	public static void main(String[] args) {
		// 1. 상자 갯수 세기
		// 사과를 한상자 당 10개씩 담을 수 있다.
		// 사과의 갯수를 123개라고 했을때 필요한 상자의 갯수 구하기
		// 제한 : 연산자만 사용하기 :: if 쓰면 안돼~ 삼항연산자 까지는 사용해도됨.
		// 박스에 담는 갯수가 달라지면 대응 x . 담을수있는 제한< 을 변수하나 하면 좋겟다
		int apple = 123 ;	
		int box = 10;
		
//		System.out.println(apple / box + apple % box == 0 ? 0 : 1);
		// 10의 자리에서 올림처리한것과 동일
		
		System.out.println((apple + 9) / box);
		//9 ? box - 1 이라는 뜻
		
		//	if(apple % 10 != 0) {
		//		box++;
		//	}
			//10개씩 일단 담어. 나머지가 잇다면 상자 +1
				
//		System.out.println("필요한 박스의 수 : " + box);
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// 2. 합계 구하기
		// 1 + (-2) + 3 + (-4) ... (-98) + 99 + (-100)
		// 반복문 사용하기
		int sum = 0 ;
		for(int i = 1 ; i <= 100; i++) {
//			if(i % 2 == 0) {
//				sum -= i ;
//			}
//			else {
//				sum += i ;
//			}
			sum += i % 2 == 0 ? - i : i ;
		}
		System.out.println(sum);
		
		int num = 1 ;
		int sum = 0 ;
		// int buho = -1 ; // 맞네!!! -1 변수를 만들 필요가 없지!!!! 그냥 -num 하면 되네!

		// 계속 1씩증가하고 다 더하는데 짝수일때만 부호 붙여버려..
		for(num = 1 ; num < 101 ; num++) { //num이 100이 될때까지 1씩 증가
			if (num % 2 == 0) { //num이 짝수일때마다 음수 부호를 붙인다
				sum -= num;		//그리고 그걸 다시 sum에 더해..
	//***********************여기 다시읽자 맨정신으로 ^^;
			}
		}
		System.out.println(sum);
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ		
		// 3. 소수판정 (prime number)
		// 지정된 자연수가 소수인지 아닌지를 출력
		// 소수 : 약수를 가지고 있는 숫자 (1,2,3 ...
		// 소수 : 나눠지는 숫자(변수) 1 + 자기
		// 반복문 사용하기
		
		int num1 = 12 ; //임의의 숫자
		int count = 0 ;
		
		for(int i = 1 ; i <= num ; i++) {
			System.out.printf("%d : %d >> %s", i, num % i, num % i == 0 ? "약수" : "약수아님");
			if(num % i == 0) {
				count++;
			}
		}
		System.out.println(count == 2? "소수" : "소수아님");
		
	}
}
