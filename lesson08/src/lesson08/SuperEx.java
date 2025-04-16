package lesson08;

public class SuperEx {
	public static void main(String[] args) {
		new Child().print();
		// 일회용할거라면 한줄로 출력만하고 끝
		
		// Child child = new Child();
		// child.print();
		// 재사용(연산도하고 추적도하고 변경도하고)할거라면 이렇게
	}
}

class Parent {
	int number = 3;
	
	Parent() { 
		System.out.println("부모 객체 생성");
	}
}

class Child extends Parent {
	int number = 2 ;
	
	Child(){
		System.out.println("자식 객체 생성");
	}
	
	void print() {
		int number = 1;
		System.out.println(number); //메서드지역변수 number
		System.out.println(this.number); //자신 객체의 number
		System.out.println(super.number); //부모 객체의 number
		
	}
}