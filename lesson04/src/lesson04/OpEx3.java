package lesson04;

public class OpEx3 {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		++a ; 
		b++ ;
		//전위, 후위 혼자 있을때는 둘이 별 차이가 없음.
		//하지만 다른것과 있을때 차이가 있다!
		
		System.out.println(++a); //증가 후 출력
		System.out.println(b++); //먼저 출력 후 증가

	}
}
