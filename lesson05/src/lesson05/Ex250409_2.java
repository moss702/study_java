package lesson05;

public class Ex250409_2 {
	public static void main(String[] args) { // 교재 연습문제 (p.79~80)		
	System.out.println("[1문] 한반에 27명. 5다스를 모두에게 나눠주면 몇개가 남을까");
	
	int colorPen = 5 * 12 ; // 나눠 줄 펜의 개수
	int studentCount = 27 ; // 한 반에 있는 학생 수
	
	int divColorPen = colorPen / studentCount ;
	System.out.println("학생당 나눠가지는 색연필 수 : " + divColorPen );
	int remainColorPen = colorPen % studentCount ;
	System.out.println("똑같이 나눠가지고 남은 색연필 수 : " + remainColorPen );
	System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	System.out.println("[2문] 놀이기구에 탈 수 있을까");

	int age = 4 ;
	int height = 120 ;
	boolean parent = false ; // T : 부모동반, F : 부모동반하지않음
	boolean hearchDease = false ; // T : 심장질환없음, F : 심장질환있음

	
	boolean noru = false ;
		//기본값 = 탑승불가
	
	if (hearchDease) {
		//심장질환 없다면 참
		if (height >= 120) {
			//키120 넘는다면 참
			if (age >= 6) {
				//6세이상이면 참
				noru = true;
			}
			else if (parent) {
				//6세이상은 아니지만 부모동반함
				noru = true ;
			}
		}	
	}
//	System.out.println(noru == true ? "탑승가능":"탑승불가");
	//이렇게 하면 안된대 왜 안되는지 잘 모루겟오
	System.out.println(noru ? "탑승가능":"탑승불가");
	//등치비교할때 논리타입은 쓰지않는게 좋다
	
	//이거 연산문제래!!!! 어케 연산하는겨!??
	System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

	System.out.println("[3문] 연도를 입력하면 윤년인지 아닌지 판단");
	
	int year = 1988;
	// 윤년 : 1988, 1992, 1996, 2020
	boolean leapYear = false ;
		
			if (year % 4 == 0 || year % 400 == 0) {
				if (year % 100 != 0) {
					// 4나 400으로 나눴을때 똑 떨어지지만
					// 100으로 똑 떨어지지는 않아야 함
					leapYear = true ;
				}
			}
	System.out.println("윤년이면 T, 아니면 F : " + leapYear);	
	System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	System.out.println("[4문] 가게에서 물건 구매");
	
	int price = 187000 ;
	int change = price / 1000 ;
	
	int oman = change / 50 ;
	change = change % 50 ;
	int ilman = change / 10 ;
	change = change % 10 ;
	int ochun = change / 5 ;
	change = change % 5 ;
	int ilchun = change ; 
	//몫과 나머지를 한줄로 쓸수 없을까.
	System.out.println(price+"원을 가장 적은 지폐수량으로 지불하려면,");
	System.out.println("5만원권 : " + oman + "장");
	System.out.println("1만원권 : " + ilman + "장");
	System.out.println("5천원권 : " + ochun + "장");
	System.out.println("1천원권 : " + ilchun + "장");
	
	System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	System.out.println("[5문] 십의자리 이하를 버리고 0으로 처리하는 코드");

	int number = 235 ;
	int result = number / 100 * 100 ;
	
	System.out.println(result);	
	}
}
