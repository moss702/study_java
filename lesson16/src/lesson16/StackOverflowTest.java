package lesson16;

public class StackOverflowTest {
	public static void main(String[] args) throws Exception {
//		// main(args);
//		new Data();
//		Class.forName("lesson16.Data");
		//클래스를 메모리에 로드될때 한번수행. 끝날때 사라짐.
		
		Data.print(10);
		Data.print(10);
		
	}
}

class Data {
	int i = print(1);
	static int si = print(2);
	
	{
		System.out.println("초기화블럭");		
	}
	static {
		System.out.println("클래스 초기화블럭");
	}
	public Data() {
		System.out.println("생성자");
	}
	static int print(int i) {
		System.out.println("print호출 : " + i);
		return i;
	}
}
