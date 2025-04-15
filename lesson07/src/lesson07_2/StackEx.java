package lesson07_2;

public class StackEx {
	public static void main(String[] args) {
		System.out.println("main start");
		method1();
		System.out.println("main end");
	}
	static void method1() {
		System.out.println("method 1 start");
		method2();
		System.out.println("method 1 end");
	}
	static void method2() {
		System.out.println("method 2 start");
		method3();
		System.out.println("method 2 end");
	}
	static void method3() {
		System.out.println("method 3 start");
		System.out.println("method 3 end");
	}
}
