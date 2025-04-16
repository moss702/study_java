package lesson07_3;

import java.nio.file.spi.FileSystemProvider;

public class InitFinal {
	//초기화 순서
	// 1 클래스 변수
	// 2 클래스 초기화블럭
	// 3 인스턴스 변수
	// 4 인스턴스 초기화블럭
	// 5 생성자
	
	static int si =1 ;
	int i;
	static void sm() { //클래스
		//엄청 빠르고 단 한번 실행
		System.out.println(si);
//		System.out.println(i);
//		System.out.println(this);
	}
	void m() {  //인스턴스 메서드
		//인스턴스가 생성 되어야만 사용 가능
		System.out.println(si); 
		System.out.println(i);		
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		InitFinal.sm(); //클래스는 그냥 호출 가능
		new InitFinal().m(); //인스턴스가 생성(new)됐기 때문에 사용 가능
	}
	
}
