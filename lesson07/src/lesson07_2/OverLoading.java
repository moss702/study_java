package lesson07_2;

public class OverLoading {
	public static void main(String[] args) {
		Operaitor op = new Operaitor();
		System.out.println(op.multiply(4, 3));
		System.out.println(op.multiply(4.5, 3.5));
		System.out.println(op.multiply(4, 3.5));
		System.out.println(op.multiply(4.5, 3));
	}
}
class Operaitor {
	int multiply(int x , int y) {
		System.out.println("(int, int)");
		return x * y ;
	}
	double multiply(double x , double y) {
		System.out.println("(double, double)");
		return x * y ;
	}
	double multiply(int x , double y) {
		System.out.println("(int, double)");
		return x * y ;
	}
	double multiply(double x , int y) {
		System.out.println("(double, int)");
		return x * y ;
	}
	
	//파라미터의 타입이 다르기 때문에 중복선언이 아니라 오버로딩됐다!
}