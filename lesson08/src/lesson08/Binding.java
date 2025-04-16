package lesson08;

public class Binding {
	public static void main(String[] args) {
		A obj = new B();
		System.out.println(obj);
		System.out.println(obj.si);//선언된 당시의 A 조상님꺼가 나옴
		System.out.println(obj.i); //선언된 당시의 A 조상님꺼가 나옴
		obj.sm(); //선언된 당시의 A 조상님꺼가 나옴
		obj.m(); //실행 시점의 B것이 나온다
		//===========================================================
		A a = new A();  //부모자식이
		B b = new B();  //각자의 타입으로 자신의 인스턴스 생성
		
		A c = b ; //조상타입A로 선언했기 때문에 b가 들어갈 수 있다.
		System.out.println(c); //B주소가 나온다!
		
//		B e = c ; 
		//e의 타입은 B, c는 인스턴스는 b지만 조상인 A로 선언했기 때문에 문법상 안받아준다.
		//하지만 c에는 사실 Bb가 들어있기 때문에, 
		B e = (B)c ; //로 형변환 하면 들어간다.
	
//		B d = a ; //하지만 이 a는 사실 조상타입A라서 강제 형변환해도 안됨. 형변환 이슈 발생.
		
		//===========================================================
	}
}
class A {
	static int si = 1;
	int i = 2;
	static void sm() { System.out.println("A.sm()"); }
	void m() { System.out.println("A.m()"); }
}
class B extends A {
	static int si = 3 ;
	int i = 4;
	static void sm() { System.out.println("B.sm()"); }
	void m() { System.out.println("B.m()"); }	
}