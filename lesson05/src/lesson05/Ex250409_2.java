package lesson05;

public class Ex250409_2 {
	public static void main(String[] args) {
		// 교재 연습문제 (p.79~80)		
	System.out.println("[1문] 한반에 27명. 5다스를 모두에게 나눠주면 몇개가 남을까");
	
	int colorPen = 5 * 12 ; // 나눠 줄 펜의 개수
	int studentCount = 27 ; // 한 반에 있는 학생 수
	
	int divColorPen = colorPen / studentCount ;
	System.out.println("학생당 나눠가지는 색연필 수 : " + divColorPen );
	//학생들에게 펜을 나눠주면 각자 갖게되는 색연필의 갯수
	int remainColorPen = colorPen % studentCount ;
	System.out.println("똑같이 나눠가지고 남은 색연필 수 : " + remainColorPen );
	//전부 나눠주고 남은 색연필의 갯수
	System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	System.out.println("[2문] 놀이기구에 탈 수 있을까");

	// 타려는 사람의 스펙
	int age = 4 ;
	int height = 120 ;

	boolean parent = false ; // T : 부모동반, F : 부모동반하지않음
	boolean hearchDease = false ; // T : 심장질환없음, F : 심장질환있음
	//parent랑 hearchDease를 int 1,0로 처리했는데 
	//bool이랑 int랑 용량이 4배 차이 나는군요..?
	//코딩할 때 true랑 false를 T,F처럼 더 줄여서 쓸수있는 방법은 없나요?
	
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
	System.out.println(noru == true ? "탑승가능":"탑승불가");
	System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	System.out.println("[3문] 연도를 입력하면 윤년인지 아닌지 판단");
	
	int year = 2020;
	
//	boolean leapYear  ;
	
	//윤년이면 true, 윤년이 아니면 false
//	System.out.println(leapYear);
	
	System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	System.out.println("[4문] 가게에서 물건 구매");
/*	
	int price = 187000 ;
	
	int oman = price 
	int ilman = 
	int ochun = 
	int ilchun = 
	
	//아 이거 쌤이 십진수를 이진수로 바꿀때 알려준 방법이 있었는데
	// 그 방법을 쓰면 정말 좋을 것 같은데!!! 그 방법이!!
	// 뭐였을까요....... 가장 큰것부터 나누는거였던가.......
	System.out.println(price+"원을 가장 적은 지폐수량으로 지불하려면,");
	System.out.println("5만원권 : " + oman + "장");
	System.out.println("1만원권 : " + ilman + "장");
	System.out.println("5천원권 : " + ochun + "장");
	System.out.println("1천원권 : " + ilchun + "장");
	
*/
	System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	System.out.println("[5문] 십의자리 이하를 버리고 0으로 처리하는 코드");

	int number = 235 ;
	int result = number / 100 * 100 ;
	
	System.out.println(result);	
	}
}
