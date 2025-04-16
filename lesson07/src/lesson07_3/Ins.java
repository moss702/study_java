package lesson07_3;

public class Ins {
	public static void main(String[] args) {
		String str = new String();
		// String : 클래스(구조) , 데이터타입(문법), 선언
		// str : 이름, 객체(구조), 지역변수(여기는 main이니까)
		// = : 대입 연산자(구조)
		// new : 연산자(형식), 인스턴스 생성 트리거 = 생성자를 필요로 함
		// String() : 생성자 호출문구, 기본 생성자(인자가 없으니까)
		
		// new String() : 새로운 인스턴스 생성
		// 필드 초기화, 참조주소 취득, 대입연산자가 str에게 주소 전달
		
		str.length();
		new String().length();
		//위 2개는 실상 동일한 것
		
		String s;
		String s2 = null;
		//둘다 객체지만, 초기화하지않았기 때문에 [인스턴스화 되지 않은] 객체.
		//인스턴스가 없는 값(null) 할당
		//인스턴스? heap에서 주소를 받은 객체
		
	}
}
