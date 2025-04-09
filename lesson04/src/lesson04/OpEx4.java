package lesson04;

public class OpEx4 {
	
	public static void main(String[] args) {
		int a = 10 ;
		int b = 5 ;
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);
		
		boolean c = a == b;
		System.out.println("c : "+c);
		boolean d = c == false;
	//  boolean d = !c; //이렇게 줄일 수 있다.
		System.out.println("d : "+d);
		
		
		// 가 ~ 힣 까지의 개수는 몇개지
		// 가는 몇번이고 힣은 몇번일까
		// 힣 - 가 = 한글의 개수
		
		System.out.println('힣'-'가'+1);
		
		
		boolean e = a > 0 && a < 20 ;
		System.out.println(e);
		// 0 < a < 20 이 안되는 이유?
		// 연산순서상 0 < a 를 먼저 하게 되는데
		// 논리로 답이 나오기 때문에 true < 20은 말이 안됨.
		
		//a의 값이 홀수이거나 5의 배수인가를 e에 저장하기
		// 5의 배수인지 어떻게 알 수 있을까? 
		
		e = a % 2 == 1 || a % 5 == 0 ;
		System.out.println(e);
		
		
		//비트연산
		
		System.out.println(9 & 5); //둘 다 참이어야 참
		System.out.println(9 | 5); //둘 중 하나가 참이면 참
		System.out.println(9 ^ 5); //두개가 서로 다를때만 참
		
		//2진수화 된 숫자로 연산.
		// 9 : 1001
		// 5 : 0101
		
	}

}
