package lesson12;

public class WrapperEx {
	public static void main(String[] args) {
		int i = 10;
//		Integer i2 = new Integer(20);
		Integer i2 = 20;
		
		System.out.println( i + i2);
		
		//기본형 > wrapper ( boxing )
		Integer i3 = Integer.valueOf(i);
		//wrapper > 기본형 ( unboxing)
		int i4 = i3.intValue();
		//이게 정식문법인데 이클립스에서 자동으로 해줌 (auto boxing)
		
		Integer i5 = i;
		int i6 = i5;
		//이렇게만 써도 해준다
	
		m(10l); //int리터럴
		m(10L); //long리터럴, 자동형변환
		m(Long.valueOf(10)); //long리터럴
		m((long)i6);
		
		int i7 = Integer.parseInt("1234");
		Integer i8 = Integer.valueOf("1234");
		long l = Long.parseLong("1234");
		System.out.println(i8);
		
		boolean b = Boolean.parseBoolean("true");
		System.out.println(b);
		
	
		
	}
	
	static void m(Long l) {
		
	}
	
}
