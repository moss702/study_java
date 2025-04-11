package lesson06;

public class ArrEx2 {
	public static void main(String[] args) {
		
		String[] arrStr = {"홍길동", "이순신", "김유신"};
		System.out.println("배열의 길이 : "+arrStr.length);
		
		for(int i = 0 ; i < arrStr.length ; i++) {
			System.out.println(arrStr[i]);
			//i가 3번 인덱스에 도달하는 순간 for 종료
			
		}
	}
}
