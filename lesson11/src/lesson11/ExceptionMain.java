package lesson11;

public class ExceptionMain {
	public static void main(String[] args) {
		// try, catch, finally, throw, throws
		
		System.out.println(1); 
		try {
			System.out.println(2);
			System.out.println(args[0]);//exception
			System.out.println(3/0); //exception
			System.out.println(4); //try 예외발생 이후는 안함. catch로 바로 이동
		}
		catch (NullPointerException e) {
			System.out.println(5);
		}
		catch (ArithmeticException e) {
			System.out.println("a");
		}
		catch (RuntimeException e) {
			System.out.println("b");
		}
		
		finally { //어떤 상황이 오더라도 무조건 처리
			
		}
		
		System.out.println(6);
	}
}
