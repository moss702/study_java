package lesson11;

public class ExceptionEx3 {
	public static void main(String[] args) {
		try {			
			m();
		}
		catch (Exception e) {
			System.out.println("main catch");
		}
		
	}
	static void m() {
		try { //혼자서는 못쓰고 catch 1개이상 또는 finally와 함께
			System.out.println(1);
			System.out.println(2/0); 
			System.out.println(3);
		}
		finally {
			System.out.println(4);
		}
		System.out.println(5);
	}
}
