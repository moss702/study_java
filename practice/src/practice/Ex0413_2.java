package practice;

public class Ex0413_2 {
	public static void main(String[] args) {
		//삼항 연산자
		// 결과 = (조건) ?  (참의 경우 결과값) : (거짓의 경우 결과값)
		
		int x =5;
		int y =3;
		
		int max = (x > y)? x : y ;
		int min = (x < y)? x : y ;
		
		System.out.println("더 큰 수 : " + max);
		System.out.println("더 작은 수 : " + min);
		
		boolean b = (x == y) ? true : false ;
		
		String s = (x != y) ? "달라요" : "같아요";
		System.out.println(s);
		
		
		
	}
}
