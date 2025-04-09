package lesson01;

public class FloatDouble {
	public static void main(String[] args) {
		float f = 3.141592653589793f;
		//소수점 아래 6자리 까지만 정확히 출력됨. 7자리의 정확도는 떨어진다.
		//(float 타입은 f 무조건 기입. double은 d 생략 가능)
		double d = 3.141592653589793d;
		
		
		
		System.out.println("float : " +f);
		System.out.println("double : " +d);
		
		double d2 = 3.141592653589793; //d 생략 가능
		System.out.println("double : " + d2);
		
	}
}
