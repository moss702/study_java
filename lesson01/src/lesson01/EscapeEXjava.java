package lesson01;

public class EscapeEXjava {
	public static void main(String[] args) {
		String greet = "안녕하세여, \n저는 \"홍길동\"입니다.";
		String greet2 = "\t반갑습니다";
		
		System.out.println(greet);
		System.out.println(greet2);
		
		
		int i = 10;	
		System.out.println(i);
		double d = 10;
		System.out.println(d);

		byte b = (byte)129;
		//명시적 형변환. 강제로 바이트로 형변환. 
		//(개발자 : 넘는거 알어, 근데 그냥 byte로 해)
		System.out.println(b);
		//-128부터 다시 세기 시작한다.
		
		System.out.println("123456789012345678901234567890");
		System.out.println(Integer.toBinaryString(-1));
		System.out.println(Long.toBinaryString(-1));
		
		
		
		
	}
}
