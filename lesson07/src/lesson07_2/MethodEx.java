package lesson07_2;

public class MethodEx {
	public static void main(String[] args) {

		add(0, 0);
		// add(a,b)

		int result = add(10, 20);
		// add를 바로 출력하는게 아니고, 같은 타입의 변수에 담을수있다.

		System.out.println(result);
		// [출력] 30

		print("Hello");
		// Hello를 print 문자열로 가져간다.
		//print의 실행문은 문자열 출력.
		
		System.out.println(addAll(1,2,3));
		
		//main에서도 return;<이 있지만 생략되어있는 상태
		
	}
	// add 메소드 이름 (a,b 파라미터)
	static int add(int a, int b) {
	return a+ b ;
	//현재 a, b는 0(기본값
	}
	
	static int addAll(int... nums) {
		int ret = 0 ; 
		for(int n : nums) {
			ret += n ;
		}
		return ret ;
	}
	
	// void = 딱히 리턴할 타입을 명명하지않는다.
	static void print(String s) {
		System.out.println(s); 
	}
	
}