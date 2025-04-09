package lesson01;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello world"); 
		String name = "현정";
		System.out.println(name.lastIndexOf("현"));
		//라스트인덱스오프? 이 글자가 문자열 내에서 몇번째에 있냐
		// 0 1 2 순 . 못찾으면 -로 나온다
	}
}
