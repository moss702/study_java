package lesson04;

public class SpecialNumber {
		public static void main(String[] args) {
			// A / B = C
			// A : 피제수 : 나눠지는 수
			// B : 제수 : 나누는 수
			// C : 몫
			
			System.out.println(3/0d);
			System.out.println(0/0d);
			//왜 0으로 나누면 안될까?
			//말도 안되는 수식 계산시 에러가 난다. 산술예외라고 함
			//실수간 연산에서는 에러 나지않으나 Infinity, NaN 출력
			//NaN : 0/0 : Not a Number
			//Infinity : 3/0
			System.out.println(Double.POSITIVE_INFINITY);
			//자바에서는 실수연산 잘 안해서 자바스크립트에서 더 자주 보게 된다.
			
			System.out.println(false && 3/0 == 1 );
			//&&는 둘다 참이어야 참.
			//앞에서 거짓이라, 어차피 거짓 판정 났기 때문에
			//뒤에는 계산도 안함. 그래서 안터진다.
			
			System.out.println(true || 3/0 == 1 );
			
		}
}
